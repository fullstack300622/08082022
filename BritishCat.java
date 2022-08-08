public class BritishCat extends Cat{
    String hairColor;

    public BritishCat(int weight, String color, String eating, int age, boolean haveBrain, int tail) {
        super(weight, color, eating, age, haveBrain, tail);
        this.hairColor="Grey";
    }

    @Override
    public void iAmEating() {
        System.out.println("I am fat cat and I am eating to much :( ");
    }
}
