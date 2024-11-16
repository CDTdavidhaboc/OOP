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
