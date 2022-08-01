public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int lust4Power;

    public Slytherin(String name, int magic, int apparition, int cunning, int determination, int ambition, int lust4Power) {
        super(name, magic, apparition);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.lust4Power = lust4Power;
    }
}
