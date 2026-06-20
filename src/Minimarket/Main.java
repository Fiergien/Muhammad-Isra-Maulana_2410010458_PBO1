package Minimarket;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Barang[] daftarBarang = new Barang[10];

        int jumlahBarang = 0;
        int pilihan;

        do {

            System.out.println("\n===== KASIR MINIMARKET =====");
            System.out.println("1. Tambah Makanan");
            System.out.println("2. Tambah Minuman");
            System.out.println("3. Tampilkan Struk");
            System.out.println("4. Keluar");

            System.out.print("Pilih : ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:

                    input.nextLine();

                    System.out.print("Nama Makanan : ");
                    String namaMakanan = input.nextLine();

                    System.out.print("Harga : ");
                    int hargaMakanan = input.nextInt();

                    System.out.print("Jumlah : ");
                    int jumlahMakanan = input.nextInt();

                    daftarBarang[jumlahBarang] =
                            new Makanan(
                                    namaMakanan,
                                    hargaMakanan,
                                    jumlahMakanan);

                    jumlahBarang++;

                    break;

                case 2:

                    input.nextLine();

                    System.out.print("Nama Minuman : ");
                    String namaMinuman = input.nextLine();

                    System.out.print("Harga : ");
                    int hargaMinuman = input.nextInt();

                    System.out.print("Jumlah : ");
                    int jumlahMinuman = input.nextInt();

                    daftarBarang[jumlahBarang] =
                            new Minuman(
                                    namaMinuman,
                                    hargaMinuman,
                                    jumlahMinuman);

                    jumlahBarang++;

                    break;

                case 3:

                    Kasir kasir = new Kasir();

                    kasir.cetakStruk(
                            daftarBarang,
                            jumlahBarang);

                    break;

                case 4:

                    System.out.println("Program selesai.");

                    break;

                default:

                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 4);
    }
}