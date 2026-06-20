package Minimarket;

public class Makanan extends Barang {

    public Makanan(String nama, int harga, int jumlah) {
        super(nama, harga, jumlah);
    }

    @Override
    public void tampilInfo() {
        System.out.println("[Makanan] " + getNama());
    }
}