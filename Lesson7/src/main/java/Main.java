import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("ford", 1999, 905635);
        Car.Engine engine = new Car.Engine(2);
        Car.Gastank gastank = new Car.Gastank(2, 40);

//Car.Gastank needfuel= new Car.Gastank();
//        Car a = new Car(fuel);

        myCar.on();
        myCar.drive();
        myCar.off();
        myCar.infoStart();
        myCar.buyFuel();
        myCar.infoEnd();
    }
}
