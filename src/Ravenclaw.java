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

}

