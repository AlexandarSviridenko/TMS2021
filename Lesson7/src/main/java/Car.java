import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Car {
    //Марка машины, год выпуска, пройденное расстояние
//    public static final engineVolume; // В ЧЕМ ОШИБКА? Не понимаю как вынести глобальную переменную
    private final Gastank gastank;
    private final Engine engine;
    private String brand;
    private int yearOfIssue;
    private int mileage;


    public Car(Gastank gastank, Engine engine, String brand, int yearOfIssue, int mileage) {
        this.gastank = gastank;
        this.engine = engine;
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
        this.mileage = mileage;
    }

    static final class Engine {

        private int engineVolume;

        public Engine(int engineVolume) {
            this.engineVolume = engineVolume;
        }
    }

    static class Gastank {
        private int fuel;
        private int gasTankVolume;


        public Gastank(int fuel, int gasTankVolume) {
            this.fuel = fuel;
            this.gasTankVolume = gasTankVolume;
        }
    }

    public void infoStart() {
        System.out.println("Модель" + brand + "Год выпуска" + yearOfIssue + "Километраж" + mileage);
    }

    public void on() {
        System.out.println("Заведите машину. Для этого нажмите 1");
        Scanner console = new Scanner(System.in);
        int oncar = console.nextInt();
        if (oncar == 1 && gastank.fuel > 0) {
            System.out.println("Машина завелась");
            drive();
        } else if (gastank.fuel == 0) {
            buyFuel();
            on();
        } else {
            System.out.println("Выбрано неверное число");
            on();
        }
    }

    public void drive() {
        System.out.println("Машина едет");
        off();
    }

    public void off() {
        System.out.println("Заглушите машину. Для этого нажмите 0");
        Scanner console = new Scanner(System.in);
        int offcar = console.nextInt();
        if (offcar == 0) {
            System.out.println("Машина заглушена");
            mileage++;
            gastank.fuel = gastank.fuel - 1;
            on();
        } else {
            System.out.println("Выбрано неверное число");
            off();
        }
    }

    public void buyFuel() {
        System.out.println("Ваш объем бака:" + gastank.gasTankVolume + "  На данный момент в баке находится:" + gastank.fuel + "Выбирите сколько топлива залить:");
        Scanner console = new Scanner(System.in);
        int buyFuel = console.nextInt();
        if (buyFuel <= gastank.gasTankVolume - gastank.fuel) {
            gastank.fuel = gastank.fuel + buyFuel;
            System.out.println("Вы залили в бак:" + buyFuel + " В баке теперь:" + gastank.fuel);
        } else {
            System.out.println("Вы не можете столько залить");
            buyFuel();
        }
    }

    public void infoEnd() {
        System.out.println(brand + yearOfIssue + "Пройдено километров за все время" + mileage + "Объем бензобака" + gastank.gasTankVolume + "Осталось топлива" + gastank.fuel);
    }
}


//нужно ли что-то вводить как статик
//После создания поменять двигатель машине нельзя. Я это сделал?



  /*
 Напишите структуру классов и продемонстрируйте работу
 - Машина имеет двигатель, бензобак (реализуйте класс для каждой сущности).
 - Чтобы поехать, машину необходимо завести, т.е. включить двигатель.
 - Реализуйте методы включения машины, который в свою очередь включает её двигатель.
 - Реализуйте метод езды на машине (например просто печатаем на консоль, что машина поехала)
 - Если машина не заведена, ехать она не может.
 - Машину можно заглушить.
 - После каждой поездки считаем, что машина прошла фиксированное расстояние.
 - Реализовать возможность посмотреть, какое расстояние машина прошла за все время.
 - Чтобы создать машину обязательно нужно иметь двигатель и бензобак.
 - Марка машины, год выпуска, пройденное расстояние - не обязательны при создании машины и могут быть выставлены потом.
 (не обязательно задавать в конструкторе)
 - После создания поменять двигатель машине нельзя.
 - Чтобы машина завелась, у неё должно быть топливо в бензобаке, если топлива нет, машина не может завестись.
 - Машину можно дозаправить, можно проверить сколько топлива осталось.
 - Реализуйте пару полей для двигателя и бензобака, например: тип двигателя, общий объем бензобака,
 сколько бензина сейчас и т.д.
     */