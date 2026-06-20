package Minimarket;

public class Barang {

    // Encapsulation
    private String nama;
    private int harga;
    private int jumlah;

    // Constructor
    public Barang(String nama, int harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    // Accessor
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Polymorphism
    public int hitungTotal() {
        return harga * jumlah;
    }

    public void tampilInfo() {
        System.out.println(nama + " = Rp" + harga);
    }
}