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
    public void ravenclawStudents(Ravenclaw PadmePatil, Ravenclaw MarcusBelby) {
        int ravenclawStudent1 = PadmePatil.getIntelligence() + PadmePatil.getCreativity() + PadmePatil.getIngenuity();
        int ravenclawStudent2 = MarcusBelby.getIntelligence() + MarcusBelby.getCreativity() + MarcusBelby.getIngenuity();
        if (ravenclawStudent1 > ravenclawStudent2) {
            System.out.println(PadmePatil.getName() + " лучший студент, чем " + MarcusBelby.getName());
        } else {
            System.out.println(MarcusBelby.getName() + " лучший студент, чем " + PadmePatil.getName());
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

