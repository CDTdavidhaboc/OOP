class Person{
    protected String Name;
    protected String Address;

    public void setName (String Name) {
        this.Name = Name;

}
    public void setAddress (String Address) {
        this.Address = Address; 
}
    public String getName() {
        return Name;
}
    public String getAddress() {
        return Address; 
}
@Override
    public String toString(){
        return "Hello I am" + Name + "and" + "I live in" + Address;
}
}