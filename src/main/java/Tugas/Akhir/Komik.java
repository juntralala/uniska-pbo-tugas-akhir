package Tugas.Akhir;

public class Komik extends Buku{
    private int volume;

    public int getVolume(){
        return volume;
    }

    public void naikkanHarga(){
        this.setHarga(this.getHarga() + 2000);
    }
}
