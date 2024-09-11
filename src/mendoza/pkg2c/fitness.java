package mendoza.pkg2c;

import java.util.Arrays;

public class fitness {
    int id, age;
    String name, fg;
    double bmi;

    public void addprogram(int id, String name, int age, double bmi, String fg) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.bmi = bmi;
        this.fg = fg;
    }


    public void viewfitness() {

        System.out.printf("%-10d %-10d %-20s %-10.2f %-20s%n", this.id, this.age, this.name, this.bmi, this.fg);
    }

    public boolean checker(String goal) {
        String[] validGoals = {"weight loss", "muscle gain", "general fitness"};

        if (!Arrays.asList(validGoals).contains(goal.toLowerCase())) {
            System.out.println("Invalid fitness goal");
            return false;
        }


        if (this.age > 65) {
            System.out.println("Not eligible (age too high)");
            return false;
        }
        if (this.age < 18) {
            System.out.println("Not eligible (age too low)");
            return false;
        }
        if (this.bmi < 18.5 || this.bmi > 30.0) {
            System.out.println("Not eligible (BMI out of range)");
            return false;
        }

        return true;
    }
}
