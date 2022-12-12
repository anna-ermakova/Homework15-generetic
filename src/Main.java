public class Main {
    public static void main(String[] args) {

        DriverD<Bus> bob = new DriverD<>("Bob");
        DriverD<Bus> tom = new DriverD<>("Tom");
        Mechanic<Bus> john = new Mechanic<>("Джон", "Black", "AAA");
        Mechanic<Truck> dima = new Mechanic<>("Дмитрий", "Иванов", "");
        Mechanic<PassengerCar> sofa = new Mechanic<>("Софья", "Гаврилова", "BMV");
        Mechanic<Transport> all = new Mechanic<>("Иван", "Иванов", "ALL");
        Sponsor selmash = new Sponsor("РостСельМаш", 2_000_000);
        Sponsor vova = new Sponsor("Владимир Владимиров", 100_000_000);
        Bus liaz = new Bus("Лиаз", "ЛиАЗ-5256", 3.5, 5.6, 136, Capacity.AVERAGE, bob, john, vova);
        Bus paz = new Bus("ПАЗ", "Вектор", 1.8, 5.4, 128, Capacity.BIG, tom, john, selmash);
        //Bus gaz = new Bus("Газ", "Газель Next A63R42", 3.5, 5, 128.2, Capacity.SMALL, );
        //Bus paz320412 = new Bus("ПАЗ", "ЯМ353423", 3.5, 4.9, 128.2, Capacity.EXTRA_SMALL);
        System.out.println(liaz);
        System.out.println(paz);
        System.out.println(bob.getCarMessage(liaz));
        System.out.println(tom.getCarMessage(paz));
        liaz.addMechanic();
        liaz.addSponsor();
        paz.addMechanic();
        paz.addSponsor();

        PassengerCar lada = new PassengerCar("Lada", "Granta", 1.7, 3.6, 145, TypeOfBody.KOUPE);
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3, 3.4, 144, TypeOfBody.FOURGON);
        PassengerCar bmv = new PassengerCar("BMW", "Z8", 3, 2.9, 145.1, TypeOfBody.PIKAP);
        PassengerCar kia = new PassengerCar("Kia", "Sportage 4-го поколения", 2.4, 3.3, 147.2,
                TypeOfBody.FOURGON);
        System.out.println(lada);
        /*System.out.println(audi);
        System.out.println(bmv);
        System.out.println(kia);
        kia.printType();*/
        System.out.println();

        DriverB<PassengerCar> kurt = new DriverB<>("Kurt");
        System.out.println(kurt.getCarMessage(lada));
        DriverB<PassengerCar> iv = new DriverB<>("Iv");
        System.out.println(iv.getCarMessage(audi));
        System.out.println();

        DriverC<Truck> alex = new DriverC<>("Alex");
        Truck kamaz = new Truck("Камаз", "Мастер", 12.5, 2.3, 120.56, Weight.N3, alex);
        /*Truck maz = new Truck("МАЗ", "6440 RR", 12, 2.54, 120.1, Weight.N2);
        Truck mercedes = new Truck("Мерседес", "Zetros", 11.5, 2.1, 125, Weight.N2);
        Truck renault = new Truck("Рено", "Riwald", 12, 1.9, 125, Weight.N1);
        System.out.println(maz);
        System.out.println(mercedes);
        System.out.println(renault);*/
        System.out.println(kamaz);
        System.out.println();


        /*System.out.println(alex.getPCarMessage(kamaz));
        DriverC<Truck> steve = new DriverC<>("Steve");
        System.out.println(steve.getPCarMessage(paz));
        System.out.println();

        DriverC<Truck> john = new DriverC<>("John");
        System.out.println(john.isValidDriverLicense);
        System.out.println(maz.isDiagnosticsPassed());
        Transport.checkTransport(maz, audi, liaz);*/


    }
}
