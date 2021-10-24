import java.util.Scanner;

public class Car {
    //Марка машины, год выпуска, пройденное расстояние
    private String brand;
    private int yearOfIssue;
    private int mileage;

    public Car(String brand, int yearOfIssue, int mileage) {
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
        this.mileage = mileage;
    }

    static class Engine {

        private int engineVolume;

        public Engine(int engineVolume) {
            this.engineVolume = engineVolume;
        }

        public void info() {
            System.out.println("Модель" + brand + "Год выпуска" + yearOfIssue + "Километраж" + mileage);
        }

        public void on() {
            Gastank fuel = new Gastank();
            System.out.println("Заведите машину. Для этого нажмите 1");
            Scanner console = new Scanner(System.in);
            int oncar = console.nextInt();
            if (oncar == 1 && fuel.fuel > 0) {
                System.out.println("Машина завелась");
                drive();
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
            Gastank fuel = new Gastank();
            System.out.println("Заглушите машину. Для этого нажмите 0");
            Scanner console = new Scanner(System.in);
            int offcar = console.nextInt();
            if (offcar == 0) {
                System.out.println("Машина заглушена");
            } else {
                System.out.println("Выбрано неверное число");
                off();
            }
            mileage++;
            fuel.fuel--;
        }

    }


    static class Gastank {
        private int fuel;
        private int gasTankVolume;
        private int needfuel;

        public Gastank(int fuel, int gasTankVolume) {
            this.fuel = fuel;
            this.gasTankVolume = gasTankVolume;
        }


        public void buyFuel() {
            System.out.println("Ваш объем бака:" + gasTankVolume + "  На данный момент в баке находится:" + fuel + "Выбирите сколько топлива залить:");
            Scanner console = new Scanner(System.in);
            int buyFuel = console.nextInt();
            if (buyFuel <= gasTankVolume - fuel) {
                fuel = fuel + buyFuel;
                System.out.println("Вы залили в бак:" + buyFuel + "В баке теперь:" + fuel);
            } else {
                System.out.println("Вы не можете столько залить");
                buyFuel();
            }
        }
    }

    public void info1() {
        Gastank fuel = new Gastank;
        System.out.println(brand + yearOfIssue + "Пройдено километров за все время" + mileage + "Объем бензобака" + fuel.gasTankVolume + "Осталось топлива" + fuel.fuel);
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