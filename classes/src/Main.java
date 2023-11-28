
public class Main {

    public static void main(String[] args) {
        Car audi=new Car("Audi A4",10,"Red");
        audi.type="Sports";
        audi.increaseSpeed(25);

        audi.printInfo();

        Car bmw=new Car("BMW 320i",30,"black");

        bmw.printInfo();
        // car.java'da tip default olarak sedan
        // seçili olduğu için tekrar girmedik


    }
}