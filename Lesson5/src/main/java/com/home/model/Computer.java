package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    public boolean brookenFlag;
    private String processor;
    private String ram;
    private String hdd;
    private int resource;

    public Computer(boolean brookenFlag, String processor, String ram, String hdd, int resource) {
        this.brookenFlag = brookenFlag;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    public void info() {
        System.out.println("комплектующие " + processor);
        System.out.println("комплектующие " + ram);
        System.out.println("комплектующие " + hdd);
        System.out.println("комплектующие " + resource);
    }

    public void on() {
        System.out.println("Внимание! Введите 0 или 1");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        Random random = new Random();
        int i = random.nextInt(2);
        System.out.println(i);
        if (value != i) {
            off();
            resource++;
        } else {
            System.out.println("Компьютер сгорел");
            brookenFlag = true;
            //сгорел
        }
    }


    public void off() {
        System.out.println("Компьютер выключен");
    }
}


//как и где прописать условие повторного включения

//1) класс Computer будет содержать следующие поля:
//            - процессор
//- оперативка
//- жесткий диск
//- ресурс полных циклов работы (включений/выключений)
//
//2) класс Computer будет содержать следующие методы:
//            - метод описание(вывод всех полей)
//- метод включить (on())
//            - при включении может произойти сбой, поэтому при вызове метода on() необходимо написать
//            следующую логику:
//    на консоль вывести сообщение (Внимание! Введите 0 или 1)
//    создать экземпляр класса Random, который будет генерировать число 0 или 1.
//    если введенное вами число совпадет с рандомным, то компьютер выключается, вызывается метод off().
//    если введенное вами число не совпадет с рандомным, то компьютер сгорает.
//            - при повторном включении компьютера, если он сгорел необходимо выдать сообщение "Компьютер
//            сгорел!"
//            - выключить (off()) (аналогично включению)
//            - при превышении лимита ресурса комп сгорает. Пишем сообщение "Компьютер сгорел!"
//
//            3) создать пакет com.home.service
//    создать класс Main создать метод main
//    создать экземпляр класса Computer или реальный объект, через конструктор передать значение полей класса,
//    т.е необходимо сгенерировать конструктор с полями класса перечисленными в 1 пункте
//    Далее у объекта Computer вызвать его методы, в которых будет реализована логика по включению, выключению
//    и выводу информации про него.



