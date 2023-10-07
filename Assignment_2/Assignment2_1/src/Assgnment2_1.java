import invoice.Invoice;

public class Assignment2_1 {
	public static int menu() {
	
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String partNo;
		String partDesc;
		int qty;
		double price;
		Invoice invoice=new Invoice("p1","wheel",1,20);
		System.out.println(invoice.getPartNo());
		System.out.println(invoice.getPartDesc());
		System.out.println(invoice.getPrice());
		System.out.println(invoice.getQty());
		System.out.println(invoice.calcAmount());
		
		
		
		}

}
