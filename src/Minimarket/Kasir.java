package Minimarket;

public class Kasir {

    public void cetakStruk(Barang[] barang, int jumlahBarang) {

        int total = 0;

        System.out.println("\n===== STRUK BELANJA =====");

        for (int i = 0; i < jumlahBarang; i++) {

            System.out.println(
                    barang[i].getNama()
                    + " x "
                    + barang[i].getJumlah()
                    + " = Rp"
                    + barang[i].hitungTotal());

            total += barang[i].hitungTotal();
        }

        // Seleksi
        int diskon = 0;

        if (total >= 100000) {
            diskon = total * 10 / 100;
        }

        int bayar = total - diskon;

        System.out.println("------------------------");
        System.out.println("Total : Rp" + total);
        System.out.println("Diskon : Rp" + diskon);
        System.out.println("Bayar : Rp" + bayar);
    }
}