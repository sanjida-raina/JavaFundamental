public class chapter6 {
    
    public static void main(String[] args){

        System.out.println("Chapter 6");
        double myDistance = distance(1,2,3,8);
        double myDistance2 = distance(3,4,7,8);
        System.out.println(myDistance +" | "+ myDistance2);
        
        //Redious 
        double myRadius = distance(1,2,3,8);
        double myCircleArea = calculateArea(myRadius);
    
        System.out.println("Circle Area is "+ Math.round(myCircleArea));   
    }

/**
 * This program will give the distance between two points
 * @param x1 this is a double
 * @param y1
 * @param x2
 * @param y2
 * @return
 */
    public static double distance(double x1, double y1, double x2, double y2){
    
        double dx = x2-x1;
        double dy = y2-y1;
        double dsquared = dx * dx + dy * dy;
        double result = Math.sqrt(dsquared);

        return result;
    }


    public static double calculateArea(double radius){

        double CircleArea = 3.14 * radius * radius;


        return CircleArea;

    
    }

}

