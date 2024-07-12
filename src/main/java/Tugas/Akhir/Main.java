package Tugas.Akhir;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        String variableString;
        Pengguna pengguna = new Pengguna();
        Buku buku = new Buku();

        Programmer programmer = new Programmer(1, "UJUN", new String[]{}, "Java", new LinkedHashMap<>());

        programmer.addSkill("Git");
        programmer.addSkill("Java");
        programmer.addSkill("PHP");
        programmer.addSkill("Dart");
        programmer.addSkill("Javascript");
        programmer.addSkill("Pascal");
        programmer.addSkill("MySQL");

        programmer.addSpec("Brand", "Dell");
        programmer.addSpec("Processor", "Intel I 8365U");
        programmer.addSpec("RAM", "16GB");
        programmer.addSpec("SSD", "256GB");

        System.out.println(programmer);
    }
}
