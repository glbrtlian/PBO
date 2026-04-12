# Posttest3

## Tujuan
- Lanjutkan project Posttest 2.
- Terapkan konsep inheritance.
- Minimal memiliki 2 subclass dari superclass.

## Struktur
- `Posttest3/pom.xml`
- `Posttest3/src/main/java/com/posttest3/MenuApp.java`
- `Posttest3/src/main/java/com/posttest3/Kendaraan.java`
- `Posttest3/src/main/java/com/posttest3/Mobil.java`
- `Posttest3/src/main/java/com/posttest3/Motor.java`
- `Posttest3/src/main/java/com/posttest3/Sepeda.java`
- `Posttest3/src/main/java/com/posttest3/Mahasiswa.java`

## Cara menjalankan
```powershell
cd Posttest3
mvn compile
java -cp target/classes com.posttest3.MenuApp
```

## Keterangan
- Superclass `Kendaraan` digunakan bersama oleh beberapa subclass.
- `Mahasiswa` tetap dikelola sebagai data terpisah.
