
public class Main {
    public static void main(String[] args) {
        String s = "ASd";
        Person p1 = new Person("Moshe", 20);
        Person p2 = p1;



//        int x = 5;
//        int y =x;
//        y = 10;
//        System.out.println(y);
//        System.out.println(x);
//        System.out.println(p2.name);
////        p2.name="Beni";
//        System.out.println(p2.name);
//        System.out.println(p1.name);

        printPerson(p1);
        System.out.println(p1.name);
    }

//    public static String returnString(){
//        return "asd";
//    }

    public static void printPerson(Person p){
        p.name="Yoni";
        System.out.println(p.name);
    }



}
