public class Mobil {
    String merek;
    String ban;
    String warna;

    Mobil(String merek, String ban, String warna){
        System.out.println("mobil dibangun");
        System.out.println("merek = " + merek);
        this.merek = merek;
        System.out.println("ban = " + ban);
        this.ban = ban;
        System.out.println("warna = " + warna);
        this.warna = warna;
    }

    void akselerasi(String merek){
        System.out.println(merek + " accelerated");
    }
    void rem(String merek){
        System.out.println(merek + " ngerem");
    }
    void klakson(){
        System.out.println("beeped");
    }
}
