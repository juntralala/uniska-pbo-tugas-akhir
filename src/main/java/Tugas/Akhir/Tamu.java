package Tugas.Akhir;

public class Tamu extends Pengguna{
    private int sisaMasaAktif;

    public void menambahMasaAktif(int tambahan){
        sisaMasaAktif += tambahan;
    }

    public void hapus(){
        System.out.println("DELETE FROM pengguna WHERE status='Tamu'");
    }

    public void login(){
        System.out.println("Login sebagai tamu");
    }
}
