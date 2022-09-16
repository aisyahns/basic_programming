package OOP.Case5;

public class Perhitungan {

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        Tabung tabung = new Tabung();

        kubus.setSisi(10);
        balok.setPanjang(3);
        balok.setLebar(6);
        balok.setTinggi(10);
        tabung.setJari(7);
        tabung.setTinggi(10);

        System.out.println(kubus.getName() + " " + kubus.volume());
        System.out.println(balok.getName() + " " + balok.volume());
        System.out.println(tabung.getName() + " " + tabung.volume());
    }
}
