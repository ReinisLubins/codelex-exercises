package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting
{
    public static void main(String[] args)
    {
        String Name;
        String Eyes;
        String Teeth;
        String Hair;
        int Age;
        int Height;
        int Weight;

        Name = "Zed A. Shaw";
        Age = 35;
        Height = 74;  // inches
        Weight = 180; // lbs
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";
        double HeightToCm = Height * 2.54;
        double WeightToKg = Weight * 0.453592;
        HeightToCm = Math.round(HeightToCm * 100.0) / 100.0;
        WeightToKg = Math.round(WeightToKg * 100.0) / 100.0;

        System.out.println("Let's talk about " + Name + ".");
        System.out.println("He's " + HeightToCm + " inches tall.");
        System.out.println("He's " + WeightToKg + " pounds heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");

        System.out.println("If I add " + Age + ", " + HeightToCm + ", and " + WeightToKg + " I get " + (Age + HeightToCm + WeightToKg) + ".");
    }
}