import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        //Welcome!
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        //this chunk parses out the parentheses and spaces to easily find the x and y values
        System.out.println("Enter coordinate 1: ");
        String cords1 = input.nextLine();
        int x1 = Integer.parseInt(cords1.substring(0, cords1.indexOf(",")).replace("(", " ").trim());
        int y1 = Integer.parseInt(cords1.substring(cords1.indexOf(",")).replace(")", " ").replace(",", " ").trim());
        //same as before but instead for the second coordinate
        System.out.println("Enter coordinate 2: ");
        String cords2 = input.nextLine();
        int x2 = Integer.parseInt(cords2.substring(0, cords2.indexOf(",")).replace("(", " ").trim());
        int y2 = Integer.parseInt(cords2.substring(cords2.indexOf(",")).replace(")", " ").replace(",", " ").trim());

        //this prints if the line is undefined
        if (x2 == x1) {
            System.out.println("You have entered 2 points of an undefined line. Your line is x = " + x1);

        //and this runs if it is a defined line
        } else {
            LinearEquation line = new LinearEquation(x1,y1,x2,y2);
            //prints all info using the lineInfo() method
            System.out.println(line.lineInfo());

            //this finds another point on the line as per user input
            System.out.println("Please enter an x value: ");
            Double xTest = input.nextDouble();
            System.out.println("The point on this line is: " + line.coordinateForX(xTest));
        }
    }
}