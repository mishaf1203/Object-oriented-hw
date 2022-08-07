public class Gryffindor extends  Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magic, int apparition, int nobility, int honor, int bravery) {
        super(name, magic, apparition);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }



    public void gryffindorStudents(Gryffindor HarryPotter, Gryffindor RonWeasley) {
            int gryffindorStudent1 = HarryPotter.getNobility() + HarryPotter.getHonor() + HarryPotter.getBravery();
            int gryffindorStudent2 = RonWeasley.getNobility() + RonWeasley.getHonor() + RonWeasley.getBravery();
            if (gryffindorStudent1 > gryffindorStudent2) {
                System.out.println(HarryPotter.getName() + " лучший студент, чем " +HarryPotter.getName());
            } else {
                System.out.println(RonWeasley.getName() + " лучший студент, чем " + RonWeasley.getName());
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
