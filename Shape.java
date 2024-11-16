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
