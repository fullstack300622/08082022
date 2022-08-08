public class Animal {

    //Instance variables
    String name;
    int weight;
    String color;
    String eating;
    int age;
    boolean haveBrain;

    int legs;

    public void iAmEating() {
        System.out.println("I am Animal I am Eating");
    }

    public Animal(int weight, String color, String eating, int age, boolean haveBrain, int legs) {

        this.weight = weight;
        this.color = color;
        this.eating = eating;
        this.age = age;
        this.haveBrain = haveBrain;
        this.name = name;
        this.legs = legs;
    }


}
