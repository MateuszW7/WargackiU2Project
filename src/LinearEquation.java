public class LinearEquation {
    //instance variables
    int x1, x2, y1, y2;

    public LinearEquation(String cords1, String cords2) {
        x1 = Integer.parseInt(cords1.substring(0, cords1.indexOf(",")).replace("(", " ").trim());
        y1 = Integer.parseInt(cords1.substring(cords1.indexOf(",")).replace(")", " ").replace(",", " ").trim());
        x2 = Integer.parseInt(cords2.substring(0, cords2.indexOf(",")).replace("(", " ").trim());
        y2 = Integer.parseInt(cords2.substring(cords2.indexOf(",")).replace(")", " ").replace(",", " ").trim());
    }
}

