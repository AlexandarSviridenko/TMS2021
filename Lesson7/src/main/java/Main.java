public class Main {
    public static void main(String[] args) {
        Car workCarr = new Car("ford", 1999, 905635);
        Car.Engine insideCar = new Car.Engine(2);
        Car.Gastank gascar = new Car.Gastank(2, 40);

//Car.Gastank needfuel= new Car.Gastank();
//        Car a = new Car(fuel);

        insideCar.on();
        insideCar.drive();
        insideCar.off();
        insideCar.info();
        gascar.buyFuel();
        workCarr.info();
    }
}
