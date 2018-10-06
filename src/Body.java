import java.util.Scanner;

public class Body {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bmi, weight, height;
        System.out.print("Input weight (in kilogram):");
        weight = scanner.nextDouble();
        System.out.print("Input height (in metters):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "BMI index", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}