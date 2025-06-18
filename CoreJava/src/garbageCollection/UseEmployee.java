package garbageCollection;

public class UseEmployee {
    public static void main(String[] args) {
      
        Employee E = new Employee("GFG1", 56);
        E.show();
        E.showNextId();
      
        System.out.println();

        System.out.println("----------------making reference value null-------------------");
        {  
        	Employee X = new Employee("GFG4", 23);
            X.show(); 
            X.showNextId();
            X = null;  // making reference value null
            System.gc();
            System.runFinalization();  
        }
       
        E.showNextId();
        System.out.println();

        System.out.println("----------using anonymous object-----------");
        new Employee("GFG1", 56).showNextId(); // using anonymous object
        System.gc();
        System.runFinalization();
        
        new Employee("GFG5", 21).showNextId();
        System.out.println();
        
        System.out.println("----------assigning reference to another-----------------");     
        {
        	Employee A = new Employee("GFG4", 23);
            Employee B = new Employee("GFG5", 21);
            A.show();
            B.show();
            A.showNextId();
            B.showNextId();
            A = B;  // assigning reference to another
            System.gc();
            System.runFinalization();
        }
        E.showNextId();
    }
}