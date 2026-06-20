# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Barang`, `Makanan`,`Minuman`,`Kasir`, dan `Main` adalah contoh dari class.

```bash
public class Barang {

}

public class Makanan extends Barang {

}

public class Minuman extends Barang {

}

public class Kasir {

}

public class Main {

}
```

2. **Object** Object merupakan hasil instansiasi dari sebuah class.

Pada program ini object dibuat menggunakan keyword new.

```bash
daftarBarang[jumlahBarang] =
new Makanan(namaMakanan, hargaMakanan, jumlahMakanan);

daftarBarang[jumlahBarang] =
new Minuman(namaMinuman, hargaMinuman, jumlahMinuman);

Kasir kasir = new Kasir();
```

3. **Atribut** Atribut merupakan variabel yang dimiliki oleh sebuah class.

Pada class Barang terdapat atribut:

```bash
private String nama;
private int harga;
private int jumlah;
```
nama = digunakan untuk menyimpan nama barang.
harga = digunakan untuk menyimpan harga barang.
jumlah = digunakan untuk menyimpan jumlah pembelian.

4. **Constructor** Constructor merupakan method yang dijalankan ketika object dibuat.

Pada program ini constructor terdapat pada class Barang.

```bash
public Barang(String nama, int harga, int jumlah) {

    this.nama = nama;

    this.harga = harga;

    this.jumlah = jumlah;
}
```
Constructor juga terdapat pada class Makanan dan Minuman.

```bash
public Makanan(String nama, int harga, int jumlah) {

    super(nama, harga, jumlah);
}

public Minuman(String nama, int harga, int jumlah) {

    super(nama, harga, jumlah);
}
```


5. **Mutator** Mutator atau setter digunakan untuk mengubah nilai atribut.

```bash
public void setNama(String nama) {

    this.nama = nama;
}

public void setHarga(int harga) {

    this.harga = harga;
}

public void setJumlah(int jumlah) {

    this.jumlah = jumlah;
}
```

6. **Accessor** Accessor atau getter digunakan untuk mengambil nilai atribut.
```bash
public String getNama() {

    return nama;
}

public int getHarga() {

    return harga;
}

public int getJumlah() {

    return jumlah;
}
```

7. **Encapsulation** Encapsulation merupakan konsep menyembunyikan data agar tidak dapat diakses secara langsung.

Pada program ini atribut dibuat menggunakan private.

```bash
private String nama;

private int harga;

private int jumlah;
```
Data hanya dapat diakses menggunakan getter dan setter.

8. **Inheritance** Inheritance merupakan pewarisan sifat dari class induk ke class turunan.

Pada program ini Makanan dan Minuman mewarisi class Barang.

```bash
public class Makanan extends Barang {

}

public class Minuman extends Barang {

}
```

9. **Polymorphism** Polymorphism merupakan konsep dimana method yang sama dapat memiliki perilaku yang berbeda.

Pada program ini digunakan method overriding.

```bash
@Override

public void tampilInfo() {

    System.out.println("[Makanan] " + getNama());
}
```
```bash
@Override

public void tampilInfo() {

    System.out.println("[Minuman] " + getNama());
}
```
Walaupun method yang digunakan sama, hasil yang ditampilkan berbeda sesuai jenis objeknya.

10. **Seleksi** Seleksi digunakan untuk mengambil keputusan berdasarkan kondisi tertentu.

Pada program ini digunakan if.
```bash
if(total >= 100000){

    diskon = total * 10 / 100;
}
```
Jika total belanja lebih dari Rp100.000 maka pelanggan mendapatkan diskon 10%.

11. **Perulangan** Perulangan digunakan untuk menjalankan blok kode secara berulang.

Program ini menggunakan for dan do while.

Perulangan for

```bash
for(int i = 0; i < jumlahBarang; i++){

    total += barang[i].hitungTotal();
}
```
12. **Perulangan do while**

```bash
do{

   ...

}while(pilihan != 4);
```
Perulangan ini digunakan agar menu terus berjalan sampai pengguna memilih keluar.

13. **Input Output Sederhana** Input Output sederhana digunakan untuk menerima input dan menampilkan output.

Program ini menggunakan class Scanner.

```bash
Scanner input = new Scanner(System.in);

System.out.print("Nama Makanan : ");

String namaMakanan = input.nextLine();

System.out.println("===== STRUK BELANJA =====");
```

14. **Array** Array digunakan untuk menyimpan banyak data dalam satu variabel.

Pada program ini digunakan array bertipe Barang.

```bash
Barang[] daftarBarang = new Barang[10];
```


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   0    |
|     | **TOTAL**      | **85** |

## Pembuat Muhammad Isra Maulana

Nama: Muhammad Isra Maulana
NPM: 2410010458
