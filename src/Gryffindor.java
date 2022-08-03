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

    public void gryffindorStudents() {
            int gryffindorStudent1 = gryffindors[0].getNobility() + gryffindors[0].getHonor() + gryffindors[0].getBravery();
            int gryffindorStudent2 = gryffindors[1].getNobility() + gryffindors[1].getHonor() + gryffindors[1].getBravery();
            if (gryffindorStudent1 > gryffindorStudent2) {
                System.out.println(gryffindors[0].getName() + " лучший студент, чем " + gryffindors[1].getName());
            } else {
                System.out.println(gryffindors[1].getName() + " лучший студент, чем " + gryffindors[0].getName());
            }
        }


    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }


}
