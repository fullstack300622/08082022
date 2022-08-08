public class Cat extends Animal {
    int tail;
    int ears;
    int eyes;

    public Cat(int weight, String color, String eating, int age, boolean haveBrain, int tail) {
        super(weight, color, eating, age, haveBrain, 4);
        this.eyes = 2;
        this.ears = 2;
        this.tail = tail;
    }

//    public Cat() {
//        super(5, "Red","Cat eating", 2, true, 4);
//        this.eyes = 2;
//        this.ears = 2;
////        this.tail = tail;
//    }



    public void sayMeowMeow() {
        System.out.println("Meow Meow");
    }

    public void sayMeowAndEat(){

    }

    @Override
    public void iAmEating() {

        System.out.println("Num Num, eating very cute and moving legs ^^  ");
        super.iAmEating();
    }


}
