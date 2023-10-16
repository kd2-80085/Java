
package Box;
// Import the 'Employee' class from the 'person' package
import person.Employee;

// Define a generic class 'Box' with a type parameter 'T' that extends 'Employee'
public class Box<T extends Employee> {
    //field to hold an object of type 'T'
    private T obj;
    
    // Method to set the object of type 'T' in the 'Box'
    public void set(T obj) {
        this.obj = obj;
    }

    // Method to get the object of type 'T' from the 'Box'
    public T get() {
        return this.obj;
    }

    // Method to calculate and return the total salary of the stored 'Employee' object
    public float getTotalSal() {
        return obj.calculateSal();
    }
}
