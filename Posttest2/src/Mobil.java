public class Mobil {
    private String merek;
    private String ban;
    private String warna;

    public Mobil(String merek, String ban, String warna){
        System.out.println("mobil dibangun");
        System.out.println("merek = " + merek);
        this.merek = merek;
        System.out.println("ban = " + ban);
        this.ban = ban;
        System.out.println("warna = " + warna);
        this.warna = warna;
    }

    public String getMerek() { return merek; }
    public void setMerek(String merek) { this.merek = merek; }

    public String getBan() { return ban; }
    public void setBan(String ban) { this.ban = ban; }

    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }

    public void akselerasi(String merek){
        System.out.println(merek + " accelerated");
    }
    public void rem(String merek){
        System.out.println(merek + " ngerem");
    }
    public void klakson(){
        System.out.println("beeped");
    }

    protected void service() {
        System.out.println("Mobil sedang diservis");
    }

    void info() {
        System.out.println("Info mobil: " + merek + ", " + ban + ", " + warna);
    }
}
