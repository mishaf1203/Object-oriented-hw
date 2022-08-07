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

   public void randomStudentBest(Hufflepuff ZakhariaSmith, Slytherin DrakoMalfoy) {
        int randomStudent1Magic = ZakhariaSmith.getMagic();
        int randomStudent2Magic = DrakoMalfoy.getMagic();
       int randomStudent1Apparatition =ZakhariaSmith.getApparition();
       int randomStudent2Apparatition = DrakoMalfoy.getApparition();

       if (randomStudent1Magic > randomStudent2Magic) {
           System.out.println(ZakhariaSmith.getName() + " обладает бОльшей мощностью магии, чем " +DrakoMalfoy.getName());

       }if (randomStudent2Magic > randomStudent1Magic) {
           System.out.println(DrakoMalfoy.getName() + " обладает бОльшей мощностью магии, чем " + ZakhariaSmith.getName());
       }
       if (randomStudent1Apparatition> randomStudent2Apparatition) {
           System.out.println(ZakhariaSmith.getName() + " обладает бОльшей дальностью трансгрессии, чем  " + DrakoMalfoy.getName());
       }else if (randomStudent2Apparatition > randomStudent1Apparatition) {
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


}
