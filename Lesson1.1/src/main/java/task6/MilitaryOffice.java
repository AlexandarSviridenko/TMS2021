package task6;

public class MilitaryOffice {

    public static void PersonRegistry() {

        int ageSolders1 = 18;
        int ageSolders2 = 27;
        String genderSolders = "man";
        String adressSolders = "Minsk";
        int ageSolders3 = 25;
        int ageSolders4 = 27;
        String nameSolders = "Саша";


        public void solders1 () {
            Person solders1 = new Person();
            if (Person.age >= ageSolders1 && Person.age <= ageSolders2 && Person.gender == genderSolders) {
                System.out.println(Person.name);
            }
        }
        public void solders2 () {
            Person solders2 = new Person();
            if (Person.adress == adressSolders) {
                System.out.println(Person.name)
            }
        }
        public void solders3 () {
            Person solders3 = new Person();
            if (Person.age >= ageSolders3 && Person.age <= ageSolders4 && Person.gender == genderSolders) {
                System.out.println(Person.name);
            }
        }
        public void solders4 () {
            Person solders4 = new Person();
            if (Person.name == nameSolders) {
                System.out.println(Person.name)


//            //не понимаю, почему возникает ошибка когда ссылаюсь на переменные? Как решить?
            }
        }
    }
}
////        Домашка: 6 урок
////        Необходимо написать военкомат.
////        1) Создаем класс военкомат MilitaryOffice
////        2) Создать в классе MilitaryOffice конструктор, который принимает PersonRegistry
////        3) PersonRegistry содержит список людей (Person), которые могут быть призваны в армию
////        4) Создать класс Person, который будет содержать следующие поля имя, возраст, пол, адрес(страна, город)
////
////        Военкомат должен уметь:
////        a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
////        T.е нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годных к службе призывников
////        (годными считать мущин от 18 до 27 лет, проверяем пол и возраст)
////        б) вывести количество годных призывников в городе Минске.
////        в) вывести количество призывников от 25 до 27 лет
////        г) вывести количество призывников у которых имя Александр.
////
////        5) Создать класс Main, наполнить PersonRegistry людьми, по желанию можно создавать людей через консоль
//
//
//}
//}
