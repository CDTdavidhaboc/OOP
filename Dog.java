class Dog {
    String name;
    boolean isMale;
    int numPuppies;
    Dog puppies[] = new Dog[4];
    Dog aso;

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
public void setPuppies(Dog puppiesSet[]){
    puppies = puppiesSet;
}
public void showPuppies(){
   System.out.print(" ");
   for(int i = 0; i <= puppies.length; i++){
    System.out.print(puppies[i].name + ", ");
   }
}
}