public class Main {
    public static void main(String[] args) {

        Bus liaz = new Bus("Лиаз", "ЛиАЗ-5256", 3.5);
        Bus paz = new Bus("ПАЗ", "Вектор", 1.8);
        Bus gaz = new Bus("Газ", "Газель Next A63R42", 3.5);
        Bus paz320412 = new Bus("ПАЗ", "ЯМ353423", 3.5);
        System.out.println(liaz.toString());
        System.out.println(paz.toString());
        System.out.println(gaz.toString());
        System.out.println(paz320412.toString());
        System.out.println();

        PassengerCar lada = new PassengerCar("Lada", "Granta", 1.7);
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3);
        PassengerCar bmv = new PassengerCar("BMW", "Z8", 3);
        PassengerCar kia = new PassengerCar("Kia", "Sportage 4-го поколения", 2.4);
        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmv.toString());
        System.out.println(kia.toString());
        System.out.println();

        Truck kamaz = new Truck("Камаз", "Мастер", 12.5);
        Truck maz = new Truck("МАЗ", "6440 RR", 12);
        Truck mercedes = new Truck("Мерседес", "Zetros", 11.5);
        Truck renault = new Truck("Рено", "Riwald", 12);
        System.out.println(kamaz.toString());
        System.out.println(maz.toString());
        System.out.println(mercedes.toString());
        System.out.println(renault.toString());



    }
}
