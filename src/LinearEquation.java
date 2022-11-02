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
    //slope method which finds the slope of the line as a decimal
    public double slope(){
        return roundedToHundredth((y2-0.0-y1)/(x2-0.0-x1));
    }
    //y-intercept method which finds the y-intercept of the line
    public double yIntercept(){
        return roundedToHundredth(y1-(slope()*x1));
    }


    // Returns a String that represents the linear equation of the line in slope-intercept (y = mx + b) form
    public String equation() {

        if (y1 == y2) { //checks if the line is horizontal, prints a simplified equation if so
            return "y = " + yIntercept();

        } else {
            String b, m;

            if (slope() == 1 || slope() == -1) { //checks if the slope is 1 or -1, and removes the m value in the final equation if so
                m = "";
            } else {

                int slopeY = (int) (slope() * 100);
                int slopeX = 100;
                int repeat = Math.max(slopeX, slopeY);
                int gcf = 1;
                int test = 1;

                while (repeat > 0) { //this is used to calculate gcf, which later simplifies the slope fraction
                    if (slopeX % test == 0 && slopeY % test == 0) {
                        gcf = test;
                    }
                    test++;
                    repeat--;
                }
                if (slopeX / gcf == 1) {
                    m = String.valueOf((slopeY / gcf));
                } else {
                    m = (slopeY / gcf) + "/" + (slopeX / gcf);
                }
            }
            if (yIntercept() == 0) { // checks if the y-intercept is 0, if so it removes it from the final equation
                b = "";
            } else {
                if (yIntercept() < 0) { //this rewrites the y intercept for the equation, so that it ends up with 1 sign
                    b = "- " + Math.abs(yIntercept());
                } else {
                    b = "+ " + yIntercept();
                }
            }
            return "y = " + m + "x " + b;
        }
    }




    /* Returns a String of the coordinate point on the line that has the given x value, with
       both x and y coordinates as decimals to the nearest hundredth*/
    public String coordinateForX(double xValue) {
        double yValue = roundedToHundredth(slope()*xValue+yIntercept());
        return "(" + xValue + ", " + yValue + ")";
    }

    //returns the value toRound rounded to the nearest hundredth
    public double roundedToHundredth(double toRound){
        return Math.round(toRound*100.0)/100.0;
    }

    /* Returns a string that includes all information about the linear equation, each on
       separate lines
      */
    public String lineInfo(){
        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\nThe equation of the line between these points is: " + equation() +"\nThe slope of this line is: " + slope() + "\nThe y-intercept of this line is: " + yIntercept() + "\nThe distance between the two points is: " + distance();
    }
}