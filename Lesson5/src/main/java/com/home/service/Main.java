package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(false, "процессор", "оперативка", "жесткий диск", 0);
        computer.info();
        while (computer.brookenFlag != true) {
            computer.on();
        }
        computer.info();
    }

}