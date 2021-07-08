package CarExample;

public class CarBehaviour {
    public static void main(String[] args) {
        Car C1 = new Car(4,"Black");
        C1.drive();
        System.out.println("Model "+C1.Name);
        System.out.println("Car Number "+C1.CarNumber);
        System.out.println("Of Color "+C1.color);
        System.out.println("having "+C1.Seats + " seats");

    }
}
