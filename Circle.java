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
