public class Activity1 {
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
    abstract class Shape {
        protected String Color;
        protected Boolean Filled;
    
        public void setColor (String Color) {
            this.Color = Color;
    }
        public void setFilled(boolean Filled) {
            this.Filled = Filled; 
    }
        public String getColor() {
            return Color;
    }
    public String isFilled() {
        if (Filled) {
            return "Filled";
        } else {
            return "Not filled.";
        }
    }
        abstract double getArea();
        abstract double getPerimeter();
        public String toString(){
            return "The color if the shape is " + Color + " and " + "it is " + isFilled();
    }
    }
    class Circle extends Shape {
        protected Double Radius;
        
        public Circle(String Color, Boolean Filled, double Radius){
                this.Color = Color;
                this.Filled = Filled;
                this.Radius = Radius;
        }
    
        public void setRadius(double Radius) {
            this.Radius = Radius; 
    }
        public double getRadius() {
            return Radius;
    }
        @Override
        public double getArea() {
            return Math.PI * Radius * Radius;
        }
        @Override
        public double getPerimeter() {
            return 2 * Math.PI * Radius;  
        }
        @Override
        public String toString(){
            return "The color if the shape is " + Color + " and " + "it is " + isFilled()+ ". The Circle has the area of " + getArea() + " and the perimeter of " + getPerimeter() + ".";
        }
    }
    
    class Rectangle extends Shape {
        protected double  Length;
        protected double Width;
        
        public Rectangle(String Color, Boolean Filled, double Length, double Width){
            this.Color = Color;
            this.Filled = Filled; 
            this.Length = Length;
            this.Width = Width;   
    }

        public void setLength(double Length) {
            this.Length = Length; 
    }
        public void setWidth(double Width) {
            this.Width = Width; 
    }
        public double getWidth() {
            return Width;
    }
        public double getLength() {
            return Length;
    }
    @Override
    public double getArea() {
        return Length * Width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (Length + Width) ;
    }
        @Override
        public String toString(){
            return "The color if the shape is " + Color + " and " + "it is " + isFilled()+ ". The circle thas the area of " + getArea() + " and the perimeter of " + getPerimeter() + ".";
        }
    }
    
    class Square extends Rectangle {
        public Square(String Color, Boolean Filled, double Length, double Width) {
            super(Color, Filled, Length, Width);
        }
    
        public void setSide(double Side) {
            this.Length = Side;
            this.Width = Side;
        }
    
        public double getSide() {
            return Length;
        }
    
        @Override
        public double getArea() {
            return Length * Length;
        }
    
        @Override
        public double getPerimeter() {
            return 4 * Length;
        }
    
        @Override
        public String toString() {
            return "The color if the shape is " + Color + " and " + "it is " + isFilled() + " The square has an area of " + getArea() + " and a perimeter of " + getPerimeter() + ".";
        }
    }