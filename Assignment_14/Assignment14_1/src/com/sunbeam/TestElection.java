package com.sunbeam;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestElection {
	
	
	public  static int menu() {
		int choice;
		System.out.println("****************** Menu ******************");
		System.out.println("0. EXIT \n"
				+"1. Add new Candidate.\n"
				+ "2. Display all candidates.\n"
				+ "3. Update candidates name and party. \n"
				+ "4. Delete a candidate.\n"
				+ "5. GetPartywise Total Votes\n"
				+ "6. Increment Vote \n"
				);
		System.out.println("******************************************");

		System.out.println("Enter your choice :");
		choice=new Scanner(System.in).nextInt();
		return choice;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:
				//add new candidate -> save()
				try(CandidateDao dao = new CandidateDao()) 
				{   
					Candidate cd=new Candidate();
				    cd.accept(sc);
					int cnt=dao.save(cd);
					System.out.println("Toatal records inserted into candidates : "+cnt);
				}
				catch(Exception e) {
					e.printStackTrace();
				}

				break;
			case 2:
				//display all candidates
				try(CandidateDao dao = new CandidateDao()) {
					List<Candidate> list = dao.findAll();
					list.forEach(c -> System.out.println(c));
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 3 :
				//// modify name and party for the id.
				try(CandidateDao dao = new CandidateDao()) 
				{ 
					int id;
					Candidate cd=new Candidate();
					System.out.println("Enter candidate ID to modify name & party : ");
					id=sc.nextInt();
					cd.setId(id);
					sc.nextLine();
					System.out.println("Enter name : ");
					String name=sc.nextLine();
					cd.setName(name);
					System.out.println("Enter party  : ");
					String party=sc.nextLine();
					cd.setParty(party);
					int cnt=dao.update(cd);
					System.out.println("Total updated records in candidates : "+cnt);	
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 4: 
				//delete candidate
				try(CandidateDao dao = new CandidateDao()) 
				{	
				System.out.print("Enter candidate id to be deleted: ");
				int id = sc.nextInt();
				int cnt = dao.deleteById(id);
				System.out.println("Candidates deleted: " + cnt);
				} // dao.close();
				catch (Exception e) {
				e.printStackTrace();
				}
				break;
			case 5: 
				// get partywise total votes
				try(CandidateDao dao = new CandidateDao()) 
				{ 	
				List<PartyVotes> list=new ArrayList<>();
				list=dao.getPartywiseVotes();
				for(PartyVotes pv:list) 
				{
					System.out.println(pv);
				}
				}catch (Exception e) {
					e.printStackTrace();
				}				
				break;
			case 6:
				//public int incrementVote(int candidateId) throws SQLException {
				System.out.println("Enter Candidate id to increment votes");
				int id=sc.nextInt();
				try(CandidateDao dao = new CandidateDao()) 
				{ 	
				 int cnt=dao.incrementVote(id);
				System.out.println("No. of candidates votes increased : "+cnt);
				}catch (Exception e) {
					e.printStackTrace();
				}				
				break;
			}//switch
		}//while
}
}
