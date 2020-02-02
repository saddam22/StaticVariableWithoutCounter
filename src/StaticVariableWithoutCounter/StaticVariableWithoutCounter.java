
package StaticVariableWithoutCounter;

public class StaticVariableWithoutCounter {
    
    int count = 0; //will get memory when instance is created
    
    StaticVariableWithoutCounter(){
    
      count++;
        System.out.println(count);
    }
    
    public static void main(String[] args) {
      
        StaticVariableWithoutCounter c1 = new StaticVariableWithoutCounter();
        StaticVariableWithoutCounter c2 = new StaticVariableWithoutCounter();
        StaticVariableWithoutCounter c3 = new StaticVariableWithoutCounter();
    }
 
}
