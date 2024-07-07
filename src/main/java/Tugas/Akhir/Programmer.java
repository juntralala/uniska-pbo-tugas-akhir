package Tugas.Akhir;

import java.util.LinkedHashMap;
import java.util.Map;

public class Programmer {
    private int id;
    private String name;
    private String[] skils;
    private String pavoritProgrammingLanguage;
    private Map<String, String> laptopSpecs = new LinkedHashMap<>(5);

    public Programmer() {
        System.out.println("Membuat object Programmer");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkils() {
        return skils;
    }

    public void setSkils(String[] skils) {
        this.skils = skils;
    }

    public String getPavoritProgrammingLanguage() {
        return pavoritProgrammingLanguage;
    }

    public void setPavoritProgrammingLanguage(String pavoritProgrammingLanguage) {
        this.pavoritProgrammingLanguage = pavoritProgrammingLanguage;
    }

    public void addSpec(String key, String value){
        this.laptopSpecs.put(key, value);
    }

    public String getSpec(String key){
        return this.laptopSpecs.get(key);
    }

    public void removeSpec(String key){
        this.laptopSpecs.remove(key);
    }
}
