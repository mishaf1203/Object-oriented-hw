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
        int slytherinStudents1 = slytherins[0].getCunning() + slytherins[0].getDetermination() + slytherins[0].getAmbition()+ getLust4Power();
        int slytherinStudents2 = slytherins[2].getCunning() + slytherins[2].getDetermination() + slytherins[2].getAmbition()+ getLust4Power();
        if (slytherinStudents1 > slytherinStudents2) {
            System.out.println(slytherins[0].getName() + " лучший студент, чем " + slytherins[2].getName());
        } else {
            System.out.println(slytherins[2].getName() + " лучший студент, чем " + slytherins[0].getName());
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
