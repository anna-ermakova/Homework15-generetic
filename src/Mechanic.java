enum MechanicQualification{
    PASS("легковые автомобили"),
    TRACK("грузовые автомобили"),
    BUS("автобусы"),
    ALL("все виды транспорта");


    MechanicQualification(String mechanicQualification) {
    }
}

public class Mechanic <T extends Transport>{
    private final String name;
    private final String surName;

    private final String company;

    public Mechanic(String name,String surName, String company) {
        this.name = name;
        this.surName=surName;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public void carryOutMaintenance(T transport) {
        transport.isDiagnosticsPassed();
        System.out.println("Провожу техническое обслуживание");
    }
    public  void fixTransport(T transport) {
        transport.repair();
        System.out.println("Чиню машину");
    }
    public String getName() {
        return name;
    }


    public String getCompany() {
        return company;
    }

}
