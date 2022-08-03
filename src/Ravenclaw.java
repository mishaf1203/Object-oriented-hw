public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int creativity;
    private int ingenuity;

    public Ravenclaw(String name, int magic, int apparition, int intelligence, int creativity, int ingenuity) {
        super(name, magic, apparition);
        this.intelligence = intelligence;
        this.creativity = creativity;
        this.ingenuity = ingenuity;
    }
    public void ravenclawStudents() {
        int ravenclawStudent1 = ravenclaws[1].getIntelligence() + ravenclaws[1].getCreativity() + ravenclaws[1].getIngenuity();
        int ravenclawStudent2 = ravenclaws[2].getIntelligence() + ravenclaws[2].getCreativity() + ravenclaws[2].getIngenuity();
        if (ravenclawStudent1 > ravenclawStudent2) {
            System.out.println(ravenclaws[1].getName() + " лучший студент, чем " + ravenclaws[2].getName());
        } else {
            System.out.println(ravenclaws[2].getName() + " лучший студент, чем " + ravenclaws[1].getName());
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCreativity() {
        return creativity;
    }

    public int getIngenuity() {
        return ingenuity;
    }
}

