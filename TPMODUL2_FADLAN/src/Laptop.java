public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public void informasi() {
        super.informasi();
        if (this.webcam) {
            System.err.println("\tWebcam : ada");
        } else {
            System.err.println("\tWebcam : tidak ada");
        }
    }

    public void BukaGame(String nama_game) {
        System.out.println("\t- Membuka game " + nama_game);
    }

    public void kirimEmail(String email) {
        System.out.println("\t- Mengirim Email ke " + email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.println("\t- Mengirim Email ke " + email1 + " dan ke " + email2);
    }
}
    

