class Dog {
    String name;
    boolean isMale;
    int numPuppies;
    Dog puppies[] = new Dog[4];
    Dog animal;

public void setName(String dogName){
name = dogName;
}
public String showName(){
    return name;
}
public String bark(){
    return "Woof! Woof!";
}
public void setNumber(int numOfPuppies){
    numPuppies = numOfPuppies;
}
public int showNumber(){
    return numPuppies;
}
public void setPuppies(String[] puppiesSet){
    puppies = puppiesSet;
}
public String [] showPuppies(){
    return puppiesSet;
}
}