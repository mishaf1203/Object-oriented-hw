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
    public void slytherinStudents() {
        int slytherinStudents1 = GregoryGoil.getCunning() +GregoryGoil.getDetermination() + GregoryGoil.getAmbition()+ GregoryGoil.getLust4Power();
        int slytherinStudents2 = GrahanMontegrue.getCunning() + GrahanMontegrue.getDetermination() + GrahanMontegrue.getAmbition()+ GrahanMontegrue.getLust4Power();
        if (slytherinStudents1 > slytherinStudents2) {
            System.out.println(GregoryGoil.getName() + " лучший студент, чем " + GrahanMontegrue.getName());
        } else {
            System.out.println(GrahanMontegrue.getName() + " лучший студент, чем " +GregoryGoil.getName());
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getLust4Power() {
        return lust4Power;
    }
}
