package Minimarket;

public class Minuman extends Barang {

    public Minuman(String nama, int harga, int jumlah) {
        super(nama, harga, jumlah);
    }

    @Override
    public void tampilInfo() {
        System.out.println("[Minuman] " + getNama());
    }
}