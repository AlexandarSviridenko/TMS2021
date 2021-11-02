public class Main {
    public static void main(String[] args) {
        CargoEarth cargoEarth = new CargoEarth(500, 90, 15000, "Scania", 18, 20, 22, 21);
        PassengerEarth passengerEarth = new PassengerEarth(250, 299, 1500, "Porshe", 4, 15, "Джип", 4, 3);
        СivilAir civilAir = new СivilAir(5000, 1000, 50000, "Boing", 50, 5, 100, false, 89);
        MilitaryAir militaryAir = new MilitaryAir(7000, 2000, 5000, "истребитель", 10, 1, true, 8);

        cargoEarth.cargoEarthInfo();
        cargoEarth.capacity();
        passengerEarth.passengerEarthInfo();
        passengerEarth.drive();
        militaryAir.militaryAirInfo();
        militaryAir.shot();
        militaryAir.catapult();
        civilAir.civilAirInfo();
        civilAir.capacity();
    }
}
