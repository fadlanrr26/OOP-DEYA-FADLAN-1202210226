public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;

    public Perangkat(String drive, int ram, float processor) {
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi() {
        System.out.println("\tDrive : " + this.drive);
        System.out.println("\tRam : " + this.ram);
        System.out.println("\tProcessor : " + this.processor);
    }
}
