class Activity {
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.setName("Harry");

        System.out.println(dog.showName());
        System.out.println(dog.bark());
        
        Dog dog1 = new Dog();
        dog1.name = "SS";
        Dog dog2 = new Dog();
        dog2.name = "FF";
        Dog dog3 = new Dog();
        dog3.name = "DD";
        Dog dog4 = new Dog();
        dog4.name = "fd";

        dog.animal[] = {dog1, dog2, dog3, dog4};
        dog.setPuppies(animal);

        System.out.println("");
        
        for(int i = 0; i <= dog.showPuppies().length; i++){
            System.out.print(dog.showPuppies()[i].name + "");  
        }
    }
}
