public class LinearEquation {
    //instance variables
    private int x1, x2, y1, y2;
    //constructor

    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    //distance method which uses the distance formula and returns a decimal to the nearest hundredths
    public double distance(){
        return roundedToHundredth(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
    public double slope(){
        return roundedToHundredth((y2-0.0-y1)/(x2-0.0-x1));
    }
    public double yIntercept(){
        return roundedToHundredth(y1-(slope()*x1));
    }


    /* Returns a String that represents the linear equation of the line through points
       (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5".*/
    public String equation(){
        int m;
        String b;
        if(slope()>=1){
            m = (int) ((slope() - 1) * 100 + 100) ;
        } else {
            m = (int) (slope() * 100);
        }
        if(yIntercept() < 0){
            b = "- " + Math.abs(yIntercept());
        } else {
            b = "+ " + yIntercept();
        }
        return "y = " + m + "/100x " + b;
    }




    /* Returns a String of the coordinate point on the line that has the given x value, with
       both x and y coordinates as decimals to the nearest hundredth, e.g (-5.0, 6.75) */
    public String coordinateForX(double xValue) {
        double yValue = roundedToHundredth(slope()*xValue+yIntercept());
        return "(" + xValue + ", " + yValue + ")";
    }





    /* "Helper" method for use elsewhere in your methods; returns the value toRound rounded
        to the nearest hundredth

        HINT:  the Math.round method can help with this!
     */
    public double roundedToHundredth(double toRound){
        return Math.round(toRound*100.0)/100.0;
    }



    /* Returns a string that includes all information about the linear equation, each on
       separate lines:
         - The original points: (x1, y1) and (x2, y2)
         - The equation of the line in y = mx + b format (using equation() method)
         - The slope of the line, as a decimal (using slope() method)
         - The y-intercept of the line (using yIntercept() method)
         - The distance between the two points (using distance() method)

      This method should call all other appropriate methods to get the info it needs:
      equation(), slope(), yIntercept(), distance().

      */
    public String lineInfo(){
        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\nThe equation of the line between these points is: " + equation() +"\nThe slope of this line is: " + slope() + "\nThe y-intercept of this line is: " + yIntercept() + "\nThe distance between the two points is: " + distance();
    }


}

