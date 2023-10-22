package com.sunbeam;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao implements AutoCloseable
{
		private Connection con;
		
		public CandidateDao() throws SQLException
		{
			con=DbUtil.getConnection();
		}
		
	@Override
	public void close() throws Exception
	{
		try 
		{
			if(con!=null) //if there's a connection
				con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	// add new candidate
	public int save(Candidate cd) throws SQLException
	{
		//id name party votes 
		int cnt=0;
		String sql="Insert into candidates (id,name, party,votes)values(default,?,?,?)";
		try(PreparedStatement stmt= con.prepareStatement(sql)){
			stmt.setString(1, cd.getName());
			stmt.setString(2, cd.getParty());
			stmt.setInt(3, cd.getVotes());
          cnt =stmt.executeUpdate();
          
		}//stmt.close();
		catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	} //Add candidate
	
	// get all candidates
		public List<Candidate> findAll() throws SQLException {
			List<Candidate> list = new ArrayList<>();
			String sql = "SELECT * FROM candidates";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String party = rs.getString("party");
						int votes = rs.getInt("votes");
						Candidate c = new Candidate(id, name, party, votes);
						list.add(c);
					}
				} // rs.close();
			} // stmt.close();
			return list;
		}
		
	//modify name and party for the id.
	int update(Candidate cd) 
	{
		int cnt=0;
		String sql="update candidates  set name=?, party=? where id=?";
		try(PreparedStatement stmt= con.prepareStatement(sql))
		{
			stmt.setString(1, cd.getName());
			stmt.setString(2, cd.getParty());
			stmt.setInt(3, cd.getId());
			cnt =stmt.executeUpdate();
          
		}//stmt.close();
		catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;	
	}
	
	
	// delete given candidate
		public int deleteById(int id) throws SQLException {
			String sql = "DELETE FROM candidates WHERE id=?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setInt(1, id);
				int cnt = stmt.executeUpdate();
				return cnt;
			} //stmt.close();
		}
		
	// increment candidate vote
		public int incrementVote(int candidateId) throws SQLException {
			String sql = "UPDATE candidates SET votes=votes+1 WHERE id=?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setInt(1, candidateId);
				int cnt = stmt.executeUpdate();
				return cnt; 
			} //stmt.close();
		}
	
	List<PartyVotes> getPartywiseVotes() throws SQLException // get partywise total votes.
	{
		List<PartyVotes> list=new ArrayList<PartyVotes>();
		String sql="select party,sum(votes) total from candidates group by party";
		try(PreparedStatement stmt=con.prepareStatement(sql))
		{
			try(ResultSet rs = stmt.executeQuery())
			{
			while(rs.next())
			{
				String party = rs.getString("party");
				int votes = rs.getInt("total");
				PartyVotes pv = new PartyVotes(party, votes);
				list.add(pv);
			}
		} // rs.close();
	} // stmt.close();	
		return list;
	}//getPartywiseVotes

}
	
	
	
	

