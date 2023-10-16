
import Person.Employee;

public class Box <T >   //Simple generic template of type T
{
	
        private T obj;
        
       public void set(T obj) {
    	   this.obj=obj;
        }

     public T  get() {
    	 return this.obj;
     }
     

}
