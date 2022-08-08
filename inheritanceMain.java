public class Main {


    public static void main(String[] args) {

        Animal animal = new Animal(100,"Black","Wuff wuff",2,true,4);
        BritishCat britCatOne = new BritishCat(10,"white","Tuna",4,true,8);
        Cat regularCatOne = new Cat(10,"white","Tuna",4,true,8);

        regularCatOne.iAmEating();
        britCatOne.iAmEating();
        animal.iAmEating();

//        Cat catOne = new Cat();
//        Cat catTwo = new Cat();

//        System.out.println(catOne.age);
//        System.out.println(catTwo.age);
//
//        System.out.println(catOne.weight);
//        System.out.println(catTwo.weight);


//        System.out.println("My weight is "+animal.weight);
//        Cat cat = new Cat(5,"blacK","NUM NUM",10,true,15);
//        cat.iAmEating();
//        animal.iAmEating();
//        cat.sayMeowMeow();


    }


}
