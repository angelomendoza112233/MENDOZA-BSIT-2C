import java.util.Arrays;
public class fitness

{
      int id,age;
    String name,fg;
   double bmi;
    public void addprogram(int id, int age,String name,double bmi,String fg){
        
        
        this.id=id;
        this.age=age; 
        this.name=name;
        this. bmi=bmi;
        this.fg=fg;
      
    }
    public void viewfitness (){
    
     System.out.printf("%-10d %-10d %-10s %-10f %-10s",this.id, this.age, this.name, this.bmi, this.fg );
   
    }
    public boolean checker(String g){
        
        
         String[] validGoals = {"weight loss", "Muscle Gain", "General Fitness"};
        
        if(this.age > 65){
            System.out.println("Not eligible (age to high) ");
            return false;
        }
        if(this.age < 18){
            System.out.println("Not Eligible (Age to low) ");
            return false;
        }
        if (this.bmi < 18.5 || this.bmi > 30.0){
            return false;
        }
        if(Arrays.asList(validGoals).contains(fg)){
            return true;
        }
        return true;
        
}
        
 
    
    
    
    
    
}
