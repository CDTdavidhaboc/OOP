class Activity {
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.setName("Harry");

        System.out.println(dog.showName());
        System.out.println(dog.bark());
        
        dog.setNumber(4);
        System.out.println(dog.showNumber());

        Dog dog1 = new Dog();
        dog1.name = "Maxx";
        Dog dog2 = new Dog();
        dog2.name = "Snow";
        Dog dog3 = new Dog();
        dog3.name = "Minx";
        Dog dog4 = new Dog();
        dog4.name = "Olivia";

        Dog aso[] = {dog1, dog2, dog3, dog4};
        dog.setPuppies(aso);

        System.out.println(" ");
        
        dog.showPuppies(); 
        }
    }

