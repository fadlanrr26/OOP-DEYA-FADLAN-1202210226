public class Handphone extends Perangkat {

    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    public void informasi() {
        super.informasi();
        if (this.fingerprint) {
            System.err.println("\tFingerprint : ada");
        } else {
            System.err.println("\tFingerprint : tidak ada");
        }
    }

    public void telfon(int no_hp) {
        System.out.println("\t- Menelfon ke nomor " + no_hp);
    }

    public void kirimSMS(int no_hp) {
        System.out.println("\t- Mengirim SMS ke nomor " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("\t- Mengirim SMS ke nomor " + no_hp1 + " dan ke nomor " + no_hp2);
    }
}