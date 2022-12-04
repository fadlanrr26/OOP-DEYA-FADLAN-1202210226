public class MainApp {
    public static void main(String[] args) {
        Perangkat p = new Perangkat("Adata", 2, 1);
        Handphone hp = new Handphone("Sandisk", 4, 2, true);
        Laptop lp = new Laptop("Robot", 8, 4, false);

        System.out.println("Perangkat : ");
        p.informasi();
        System.out.println("\nHandphone : ");
        hp.informasi();
        hp.telfon(62812993);
        hp.kirimSMS(628610100);
        hp.kirimSMS(628199921, 62911038);
        System.out.println("\nLaptop : ");
        lp.informasi();
        lp.BukaGame("Mobile Legend");
        lp.kirimEmail("Alucard@gmail.com");
        lp.kirimEmail("Layla@gmail.com", "Balmon@gmail.com");
    }
}
