// Import the necessary classes from their respective packages
package Box;
import person.*;

// A class to test the 'Box' generic class with different types of employees
public class TestBox {

    public static void main(String[] args) {

        // Create a 'Box' instance that can hold objects of type 'Employee' or its subclasses
        Box<Employee> m1 = new Box<>();

        // Create an instance of 'Employee'
        Employee e = new Employee();
        e.accept();
        e.display(); 
        m1.set(e);  
        System.out.println("Total salary is " + m1.getTotalSal()); // Calculate and display total salary

        // Create an instance of 'Manager' (a subclass of 'Employee')
        Employee e1 = new Manager();
        e1.accept();
        e1.display();
        m1.set(e1);
        System.out.println("Manager's Total salary is " + m1.getTotalSal());

        // Create an instance of 'Salesman' (a subclass of 'Employee')
        Employee s1 = new Salesman();
        s1.accept(); 
        m1.set(s1);
        System.out.println("Salesman's Total salary is " + m1.getTotalSal());

        // Create an instance of 'SalesManager' (a subclass of 'Employee')
        Employee sm = new SalesManager();
        sm.accept(); 
        m1.set(sm); //set an object of type 'T' (or a subclass of 'T') in the 'Box'
    
        System.out.println("SalesManager's Total salary is " + m1.getTotalSal());

    }
}
