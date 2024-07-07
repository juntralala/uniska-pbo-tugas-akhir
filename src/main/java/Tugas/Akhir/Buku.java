package Tugas.Akhir;

public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halaman;
    private int harga;

    public Buku() {
        System.out.println("Object buku relah dibuat, constractor buku berjalan");
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJumlah_halaman() {
        return jumlah_halaman;
    }

    public void setJumlah_halaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void baca(){
        System.out.println("membaca isi buku");
    }

    public void menulis(String teks){
        teks = teks.isBlank() ? "Teks":teks;
        System.out.printf("menuliskan %s ke dalam buku\r\n", teks); // user windows 😁
    }

    public void beriMasukan(String masukan){
        System.out.println("memberi masukan : " + masukan);
    }

    public void naikkanHarga(){
        harga += 1_000;
    }

    public void naikkanHarga(int hargaTambahan){
        harga += hargaTambahan;
    }
}
