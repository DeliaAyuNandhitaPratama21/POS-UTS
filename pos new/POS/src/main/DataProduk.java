package main;

public class DataProduk {
    private int id;
    private String kode_produk;
    private String nama_produk;
    private String gambar_produk;
    private String kategori_produk;
    private String supplier;
    private String harga_jual;
    private String harga_beli;
    private String stok_produk;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeProduk() {
        return kode_produk;
    }

    public void setKodeProduk(String kode_produk) {
        this.kode_produk = kode_produk;
    }

    public String getNamaProduk() {
        return nama_produk;
    }

    public void setNamaProduk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public String getGambar_Produk() {
        return gambar_produk;
    }

    public void setGambar_Produk(String gambar_produk) {
        this.gambar_produk = gambar_produk;
    }

    public String getKategori_Produk() {
        return kategori_produk;
    }

    public void setKategori_Produk(String kategori_produk) {
        this.kategori_produk = kategori_produk;
    }
    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    public String getHarga_Jual() {
        return harga_jual;
    }

    public void setHarga_Jual(String harga_jual) {
        this.harga_jual = harga_jual;
    }
    public String getHarga_Beli() {
        return harga_beli;
    }

    public void setHarga_Beli(String harga_beli) {
        this.harga_beli = harga_beli;
    }
    public String getStok_Produk() {
        return stok_produk;
    }

    public void setStok_Produk(String stok_produk) {
        this.stok_produk = stok_produk;
    }
}
