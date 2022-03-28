import java.util.Scanner;

/**
 * CircleWithException
 */
public class CircleWithException {
    private Double radius;
    private final static Double MAXAREA = 1000.0;

    public CircleWithException(Double r) throws Exception{
        this.radius = r;
        if (r<0){
            throw new IllegalArgumentException("Radius cannot be negative!");
        }
    }

    public void setRadius(Double r) throws Exception{
        this.radius = r;
        if (r<0){
            throw new IllegalArgumentException("Radius cannot be negative!");
        }
    }
    
    public Double getRadius(){
        return radius;
    }

    public Double getArea() throws Exception{
        Double Area = Math.PI * Math.pow(radius, 2);
        if (Area > MAXAREA){
            throw new Exception("Area cannot be more than 1000!");
        }
        else{
            return Area;
        }
    }

    public Double getDiameter(){
        return radius * 2;
    }
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the radius of circle: ");
            Double radius = input.nextDouble();
            CircleWithException circle = new CircleWithException(radius);
            System.out.println("Area of circle: " + String.format("%.2f",circle.getArea()));
            System.out.println("Diameter of circle: " + circle.getDiameter());
            input.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}