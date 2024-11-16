public class Activity4 {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", true, 55);

            System.out.println("Student Name: " + circle.getColor()); 
            System.out.println("Student Addres: " + circle.isFilled());
            System.out.println("Student Program: " + circle.getArea());
            System.out.println("Student Year: " + circle.getPerimeter());
            System.out.println(circle.toString()); 

            System.out.println();

        Rectangle rectangle = new Rectangle("Red", true, 1.4,  1.0);
        System.out.println("Student Name: " + rectangle.getColor()); 
        System.out.println("Student Addres: " + rectangle.isFilled());
        System.out.println("Student Program: " + rectangle.getArea());
        System.out.println("Student Year: " + rectangle.getPerimeter());
        System.out.println(rectangle.toString()); 

        System.out.println();

        Square square = new Square("Green", true, 41,  41);
        System.out.println("Student Name: " + square.getColor()); 
        System.out.println("Student Addres: " + square.isFilled());
        System.out.println("Student Program: " + square.getArea());
        System.out.println("Student Year: " + square.getPerimeter());
        System.out.println(square.toString()); 

    }    
    }