public class Gryffindor extends  Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int nobility, int honor, int bravery, String name, int magic, int apparition) {
        super(name, magic, apparition);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }
}
