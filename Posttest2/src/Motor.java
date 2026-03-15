public class Motor {
    private String platNomor;
    private String merkMotor;
    private String namaPemilik;

    public Motor(String platNomor, String merkMotor, String namaPemilik) {
        this.platNomor = platNomor;
        this.merkMotor = merkMotor;
        this.namaPemilik = namaPemilik;
    }

    public String getPlatNomor() { return platNomor; }
    public void setPlatNomor(String platNomor) { this.platNomor = platNomor; }

    public String getMerkMotor() { return merkMotor; }
    public void setMerkMotor(String merkMotor) { this.merkMotor = merkMotor; }

    public String getNamaPemilik() { return namaPemilik; }
    public void setNamaPemilik(String namaPemilik) { this.namaPemilik = namaPemilik; }

    public void tampilData() {
        System.out.println("Plat Nomor : " + platNomor);
        System.out.println("Merk Motor : " + merkMotor);
        System.out.println("Nama Pemilik : " + namaPemilik);
        System.out.println("-------------------------");
    }
}
