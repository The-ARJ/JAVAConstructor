package CarExample;

public class Car {
    String Name = "Tesla";
    int CarNumber = 210021;

    int Seats;
    String color;

    public Car(int seats, String color) {
        Seats = seats;
        this.color = color;
    }

    void drive(){
        System.out.println("Car is Moving");
    }

}
