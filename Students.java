public class Students {
    private String name;
    public String lastname;
    public int age;
    public int groupe;
    public double module;
    public String experience;

    public Students(String name, String lastname, int age, int groupe, double module, String experience) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.groupe = getGroupe();
        this.module = getModule();
        this.experience = getExperience();
    }


    public int getGroupe() {
        groupe = 0;
        return groupe;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }

    public double getModule() {
        module = 0;
        return module;
    }

    public void setModule(double module) {
        this.module = module;
    }

    public String getExperience() {
        experience = "отсутствует";
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}

