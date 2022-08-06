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

   public void randomStudentBest() {
        int randomStudent1Magic = .ZakhariaSmith.getMagic();
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
