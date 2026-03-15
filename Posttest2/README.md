# Posttest2 - Laporan

Deskripsi singkat:
- Program Java ini menyediakan operasi CRUD (Create, Read, Update, Delete) pada data yang disimpan di dalam `ArrayList`.
- Terdapat tiga kelas data yang dikelola: `Mobil`, `Motor`, dan `Mahasiswa`.
- Menu interaktif menggunakan konsol memungkinkan pengguna menambah, melihat, mengubah, dan menghapus data.
- Menerapkan konsep Encapsulation dengan access modifiers: private, public, protected, dan default (package-private).
- Menggunakan setter dan getter methods.
- Menggunakan Maven sebagai build tool dengan dependency eksternal (Apache Commons Lang 3).

Cara menjalankan dengan Maven:
1. Pastikan Maven terinstall.
2. Di folder Posttest2, jalankan:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.posttest2.MenuApp"
```

Atau compile manual:
1. Kompilasi semua file sumber:

```powershell
javac -cp "path\to\commons-lang3.jar" -d bin src\main\java\com\posttest2\*.java
```

2. Jalankan program utama `MenuApp`:

```powershell
java -cp "bin;path\to\commons-lang3.jar" com.posttest2.MenuApp
```

Catatan tugas:
- Program memenuhi syarat CRUD menggunakan `ArrayList`.
- Program berjalan berulang-ulang sampai pengguna memilih exit.
- Menerapkan encapsulation dengan minimal 2 access modifiers (private dan public).
- Menggunakan setter dan getter.
- Laporan ini bersifat individu.

Nilai tambah:
- Menerapkan semua 4 jenis access modifier (private, public, protected, default).
- Menggunakan Maven dengan dependency dari luar modul (Apache Commons Lang 3).

## Files
- `src/main/java/com/posttest2/MenuApp.java` — program utama dan menu CRUD
- `src/main/java/com/posttest2/Mobil.java` — class data Mobil dengan encapsulation
- `src/main/java/com/posttest2/Motor.java` — class data Motor dengan encapsulation
- `src/main/java/com/posttest2/Mahasiswa.java` — class data Mahasiswa dengan encapsulation
- `pom.xml` — Maven configuration

---
_Laporan dan kode dibuat untuk keperluan Posttest praktikum._
# Posttest1 - Laporan

Deskripsi singkat:
- Program Java ini menyediakan operasi CRUD (Create, Read, Update, Delete) pada data yang disimpan di dalam `ArrayList`.
- Terdapat tiga kelas data yang dikelola: `Mobil`, `Motor`, dan `Mahasiswa`.
- Menu interaktif menggunakan konsol memungkinkan pengguna menambah, melihat, mengubah, dan menghapus data.

Cara menjalankan:
1. Kompilasi semua file sumber di folder `Posttest1/src`:

```powershell
javac -d bin Posttest1\src\*.java
```

2. Jalankan program utama `MenuApp`:

```powershell
java -cp bin MenuApp
```

Catatan tugas:
- Program memenuhi syarat CRUD menggunakan `ArrayList`.
- Program berjalan berulang-ulang sampai pengguna memilih exit.
- Laporan ini bersifat individu.

Nilai tambah:
- Program mengelola lebih dari 2 class (`Mobil`, `Motor`, `Mahasiswa`) untuk nilai tambah.
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
