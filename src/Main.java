public class Main {
    public static void main(String[] args) {

        Bus liaz = new Bus("Лиаз", "ЛиАЗ-5256", 3.5, 5.6, 136);
        Bus paz = new Bus("ПАЗ", "Вектор", 1.8, 5.4, 128);
        Bus gaz = new Bus("Газ", "Газель Next A63R42", 3.5, 5, 128.2);
        Bus paz320412 = new Bus("ПАЗ", "ЯМ353423", 3.5, 4.9, 128.2);
        System.out.println(liaz);
        liaz.getPitStop();
        liaz.getBestLapTime();
        liaz.getTopSpeed();
        System.out.println(paz);
        paz.getPitStop();
        paz.getBestLapTime();
        paz.getTopSpeed();
        System.out.println(gaz);
        gaz.getPitStop();
        gaz.getBestLapTime();
        gaz.getTopSpeed();
        System.out.println(paz320412);
        paz320412.getPitStop();
        paz320412.getBestLapTime();
        paz320412.getTopSpeed();
        System.out.println();

        PassengerCar lada = new PassengerCar("Lada", "Granta", 1.7, 3.6, 145);
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3, 3.4, 144);
        PassengerCar bmv = new PassengerCar("BMW", "Z8", 3, 2.9, 145.1);
        PassengerCar kia = new PassengerCar("Kia", "Sportage 4-го поколения", 2.4, 3.3, 147.2);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmv);
        System.out.println(kia);
        System.out.println();

        Truck kamaz = new Truck("Камаз", "Мастер", 12.5, 2.3, 120.56);
        Truck maz = new Truck("МАЗ", "6440 RR", 12, 2.54, 120.1);
        Truck mercedes = new Truck("Мерседес", "Zetros", 11.5, 2.1, 125);
        Truck renault = new Truck("Рено", "Riwald", 12, 1.9, 125);
        System.out.println(kamaz);
        System.out.println(maz);
        System.out.println(mercedes);
        System.out.println(renault);


    }
}
