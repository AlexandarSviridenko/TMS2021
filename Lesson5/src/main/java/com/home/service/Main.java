package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.info();
        while (computer.brooken_flag != true) {
            computer.on();
        }
        computer.info();
    }

}