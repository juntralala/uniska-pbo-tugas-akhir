package Tugas.Akhir;

import java.util.*;

public class Programmer {
    private int id;
    private String name;
    private String[] skils;
    private String pavoritProgrammingLanguage;
    private Map<String, String> laptopSpecs = new LinkedHashMap<>(5);

    public Programmer(int id, String name, String[] skils, String pavoritProgrammingLanguage, Map<String, String> laptopSpecs) {
        this.id = id;
        this.name = name;
        this.skils = skils;
        this.pavoritProgrammingLanguage = pavoritProgrammingLanguage;
        this.laptopSpecs = laptopSpecs;

        System.out.println("Membuat object Programmer berhasil");
    }

    public String toString(){
        return String.format("""
                {
                    class: %s,
                        properties : {
                        id: %d,
                        name: %s,
                        skils: %s,
                        PavoritProgrammingLanguange: %s,
                        laptopSpecs: %s
                    }
                }""",this.getClass().getName(),
                    this.id,
                    this.name,
                    Arrays.toString(this.skils),
                    this.getPavoritProgrammingLanguage(),
                    this.laptopSpecs);
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

    public void addSkill(String skill){ // ternyata susah bikin operasi kumpulan data pakai array, bukan pake Collection
        var newSkillSet = new String[this.skils.length + 1];
        for(int i = 0 ; i < this.skils.length ; i++){
            newSkillSet[i] = this.skils[i];
        }
        newSkillSet[this.skils.length] = skill;
        this.skils = newSkillSet;
    }

    public void removeSpec(String key){
        this.laptopSpecs.remove(key);
    }
}
