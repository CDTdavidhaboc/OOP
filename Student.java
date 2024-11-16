class Student extends Person{
    private String Program;
    private int Year;

    public Student (String Name, String Address, String Program, int Year) {
        this.Name = Name;
        this.Address = Address;
        this.Program = Program;
        this.Year = Year;
}
    public void setProgram (String Program) {
        this.Program = Program;
}
    public void setYear(int Year)  {
        this.Year = Year;
}

    public String getProgram() {
        return Program;
    }
    public int getYear() {
        return Year;
        
    }
}
