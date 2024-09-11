package mendoza.pkg2c;

import java.util.Scanner;

public class MENDOZA2C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define a reasonable size for the array or use ArrayList if dynamic size is needed
        fitness[] ft = new fitness[100];
        
        System.out.print("Enter number of applicants: ");
        int app = sc.nextInt();

        for (int i = 0; i < app; i++) {
            ft[i] = new fitness();
            
            System.out.println("Enter details of application: " + (i + 1) + ": ");
            boolean idExists;
            int id;
            
            do {
                System.out.print("ID: ");
                id = sc.nextInt();
                idExists = false;
                
                // Check if ID already exists
                for (int x = 0; x < i; x++) {
                    if (ft[x] != null && ft[x].id == id) {
                        idExists = true;
                        break;
                    }
                }
                
                if (idExists) {
                    System.out.println("- ID Already Exists - Try Again");
                } else {
                    ft[i].id = id;
                }
                
            } while (idExists);

            System.out.print("Name: ");
            String name = sc.next();
            
            System.out.print("Age: ");
            int age = sc.nextInt();
            
            System.out.print("BMI: ");
            double bmi = sc.nextDouble();

            boolean validGoal;
            
            do {
                System.out.print("Fitness Goals: ");
                String goals = sc.next();
                
                validGoal = ft[i].checker(goals);
                
                if (validGoal) {
                    ft[i].addprogram(ft[i].id, name, age, bmi, goals);
                } else {
                    System.out.println("- Invalid Fitness Goal - Try Again");
                }
                
            } while (!validGoal);
        }
        
        // Display fitness details
        for (int i = 0; i < app; i++) {
            if (ft[i] != null) {
                ft[i].viewfitness();
            }
        }

        sc.close();
    }
}
