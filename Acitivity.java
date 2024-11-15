

public class Activity {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("Harry");

        System.out.println(dog.showName());
        System.out.println(dog.bark());

        dog.setNumber(3);
        System.out.println("Number of Dogs is: " + dog.showNum());
        
        dog.pupGender(false);

        Dog dog1 = new Dog();
        dog1.name = "Dave";
        Dog dog2 = new Dog();
        dog2.name = "Emann";
        Dog dog3 = new Dog();
        dog3.name = "Marriam";

        Dog[] animal = {dog1, dog2, dog3};
        dog.setPuppies(animal);
            
        for(int i = 0; i < dog.showPuppies().length; i++) {
            System.out.println(dog.showPuppies()[i].name);
        }
    }
}
    

