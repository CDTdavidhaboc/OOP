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