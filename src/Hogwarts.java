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
    static Gryffindor[] gryffindors = {
            new Gryffindor(7,
                    7,
                    10,
                    "Harry Potter",
                    8,
                    6),
            new Gryffindor(5,
                    7,
                    5,
                    "Ron Weasley",
                    5,
                    10),

            new Gryffindor(8,
                    7,
                    7,
                    "Hermione Granger",
                    8,
                    6)
    };
    static Slytherin[] slytherins = {
            new Slytherin("Drako Malfoy",
                    7, 10, 7, 8, 6,
                    9),
            new Slytherin("Graham Montegrue", 7, 5, 3, 5, 4, 3),

            new Slytherin("Gregory Goil",
                    3,
                    5,
                    5,
                    3,
                    4, 0)
    };
   static Ravenclaw[] ravenclaws = {
            new Ravenclaw("Chou Jang",
                    7,
                    10,
                    7,
                    8,
                    6),

            new Ravenclaw("Padme Patil",
                    7,
                    5,
                    3,
                    5,
                    4),

            new Ravenclaw("Marcus Belby",
                    7,
                    7,
                    5,
                    8,
                    10)
    };
   static Hufflepuff[] hufflepuffs = {
            new Hufflepuff("Zakharia Smith",
                    7, 10, 7, 8, 6),

            new Hufflepuff("Sedrick Diggori",
                    7, 8, 6, 8, 7),

            new Hufflepuff("Justin Finch-Fletchli",
                    5, 4, 5, 5, 10)
    };

   public void randomMagicBest() {
        int randomStudent1Magic = ravenclaws[2].getMagic();
        int randomStudent2Magic = hufflepuffs[2].getMagic();
       if (randomStudent1Magic > randomStudent2Magic) {
           System.out.println(ravenclaws[1].getName() + " обладает бОльшей мощностью магии, чем " + hufflepuffs[2].getName());
       }else {
           System.out.println(hufflepuffs[2].getName() + " обладает бОльшей мощностью магии, чем " + ravenclaws[1].getName());
       }
   }
    public void randomApparitionBest() {
        int randomStudent1Magic = ravenclaws[2].getApparition();
        int randomStudent2Magic = hufflepuffs[2].getApparition();
        if (randomStudent1Magic > randomStudent2Magic) {
            System.out.println(ravenclaws[1].getName() + " обладает бОльшей дальностью трансгрессии, чем  " + hufflepuffs[2].getName());
        } else {
            System.out.println(hufflepuffs[2].getName() + " обладает бОльшей дальностью трансгрессии, чем  " + ravenclaws[1].getName());
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magic=" + magic +
                ", apparition=" + apparition +
                ", gryffindors=" + Arrays.toString(gryffindors) +
                ", slytherins=" + Arrays.toString(slytherins) +
                ", ravenclaws=" + Arrays.toString(ravenclaws) +
                ", hufflepuffs=" + Arrays.toString(hufflepuffs) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getApparition() {
        return apparition;
    }

    public void setApparition(int apparition) {
        this.apparition = apparition;
    }

    public Gryffindor[] getGryffindors() {
        return gryffindors;
    }

    public void setGryffindors(Gryffindor[] gryffindors) {
        this.gryffindors = gryffindors;
    }

    public Slytherin[] getSlytherins() {
        return slytherins;
    }

    public void setSlytherins(Slytherin[] slytherins) {
        this.slytherins = slytherins;
    }

    public Ravenclaw[] getRavenclaws() {
        return ravenclaws;
    }

    public void setRavenclaws(Ravenclaw[] ravenclaws) {
        this.ravenclaws = ravenclaws;
    }

    public Hufflepuff[] getHufflepuffs() {
        return hufflepuffs;
    }

    public void setHufflepuffs(Hufflepuff[] hufflepuffs) {
        this.hufflepuffs = hufflepuffs;
    }

}
