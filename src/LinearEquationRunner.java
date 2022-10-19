import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
    //user input
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome!");
    System.out.println("Enter coordinate 1: ");
    String cords1 = input.nextLine();
    int x1 = Integer.parseInt(cords1.substring(0, cords1.indexOf(",")).replace("(", " ").trim());
    int y1 = Integer.parseInt(cords1.substring(cords1.indexOf(",")).replace(")", " ").replace(",", " ").trim());
    boolean repeat = true;
    while (repeat) {
        System.out.println("Enter coordinate 2: ");
        String tempCords2 = input.nextLine();
        int tempX2 = Integer.parseInt(tempCords2.substring(0, tempCords2.indexOf(",")).replace("(", " ").trim());
        if (tempX2 = x1){
            System.out.println("");
        }
    }

    LinearEquation temp = new LinearEquation("(1,-5)","(17,21)");
    System.out.println(temp.distance());
    System.out.println(temp.slope());
    System.out.println(temp.yIntercept());
    }
}



                x2 = Integer.parseInt(cords2.substring(0, cords2.indexOf(",")).replace("(", " ").trim());
                y2 = Integer.parseInt(cords2.substring(cords2.indexOf(",")).replace(")", " ").replace(",", " ").trim());