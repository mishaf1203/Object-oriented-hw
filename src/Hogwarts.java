import java.util.Arrays;

public class Hogwarts {
    private String name;
    private int magic;
    private int apparition;

    public Hogwarts(String name, int magic, int apparition) {
        this.name = name;
        this.magic = magic;
        this.apparition = apparition;
    }

    static Gryffindor HarryPotter = new Gryffindor("Harry Potter",7,7,9,8,9);
    static Gryffindor RonWeasley = new Gryffindor("Ron Weasley", 5,6,7,7,6);
    static Gryffindor HermioneGranger = new Gryffindor("Hermione Granger",9,8,8,7,7);

    static Slytherin DrakoMalfoy = new Slytherin("Drako Malfoy", 7,7,6,8,8,9);
    static Slytherin GrahanMontegrue = new Slytherin("Graham Montegrue", 5,3,5,4,4,2);
    static Slytherin GregoryGoil = new Slytherin("Gregory Goil", 4,5,6,4,3,2);

    static Ravenclaw ChouJang = new Ravenclaw("Chou Jang",5,5,6,5,6);
    static Ravenclaw PadmePatil = new Ravenclaw("Padme Patil", 5,6,6,7,6);
    static Ravenclaw MarcusBelby = new Ravenclaw("Marcus Belby", 6,5,7,6,5);

    static Hufflepuff ZakhariaSmith = new Hufflepuff("Zakharia Smith",7,6,6,5,7);
    static Hufflepuff SedrickDiggori = new Hufflepuff("Sedrick Diggori", 8,7,8,8,8);
    static Hufflepuff JustinFinchFletchli = new Hufflepuff("Justin Finch-Fletchli", 6,5,7,6,7);



   public void randomStudentBest() {
        int randomStudent1Magic = Hufflepuff.ZakhariaSmith.getMagic();
        int randomStudent2Magic = Slytherin.DrakoMalfoy.getMagic();
       int randomStudent1Apparatition =ZakhariaSmith.getApparition();
       int randomStudent2Apparatition = DrakoMalfoy.getApparition();
       if (randomStudent1Magic > randomStudent2Magic) {
           System.out.println(ZakhariaSmith.getName() + " обладает бОльшей мощностью магии, чем " +DrakoMalfoy.getMagic());
           System.out.println(DrakoMalfoy.getMagic() + " обладает бОльшей мощностью магии, чем " + ZakhariaSmith.getName());
       }else if (randomStudent1Magic > randomStudent2Magic) {
           System.out.println(ZakhariaSmith.getName() + " обладает бОльшей дальностью трансгрессии, чем  " + DrakoMalfoy.getName());
       } else {
           System.out.println(DrakoMalfoy.getName() + " обладает бОльшей дальностью трансгрессии, чем  " +ZakhariaSmith.getName());
       }
   }


    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magic=" + magic +
                ", apparition=" + apparition +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getApparition() {
        return apparition;
    }

    public Gryffindor getHarryPotter() {
        return HarryPotter;
    }

    public Gryffindor getRonWeasley() {
        return RonWeasley;
    }

    public Gryffindor getHermioneGranger() {
        return HermioneGranger;
    }

    public Slytherin getDrakoMalfoy() {
        return DrakoMalfoy;
    }

    public Slytherin getGrahanMontegrue() {
        return GrahanMontegrue;
    }

    public Slytherin getGregoryGoil() {
        return GregoryGoil;
    }

    public Ravenclaw getChouJang() {
        return ChouJang;
    }

    public Ravenclaw getPadmePatil() {
        return PadmePatil;
    }

    public Ravenclaw getMarcusBelby() {
        return MarcusBelby;
    }

    public Hufflepuff getZakhariaSmith() {
        return ZakhariaSmith;
    }

    public Hufflepuff getSedrickDiggori() {
        return SedrickDiggori;
    }

    public Hufflepuff getJustinFinchFletchli() {
        return JustinFinchFletchli;
    }
}
