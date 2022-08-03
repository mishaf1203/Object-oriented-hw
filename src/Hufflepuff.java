public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magic, int apparition, int diligence, int loyalty, int honesty) {
        super(name, magic, apparition);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public void hufflepuffsStudents() {
        int hufflepuffsStudent1 = hufflepuffs[1].getDiligence() + hufflepuffs[1].getLoyalty() + hufflepuffs[1].getHonesty();
        int hufflepuffsStudent2 = hufflepuffs[2].getDiligence() + hufflepuffs[2].getLoyalty() + hufflepuffs[2].getHonesty();
        if (hufflepuffsStudent1 > hufflepuffsStudent2) {
            System.out.println(hufflepuffs[1].getName() + " лучший студент, чем " + hufflepuffs[2].getName());
        } else {
            System.out.println(hufflepuffs[2].getName() + " лучший студент, чем " + hufflepuffs[1].getName());
        }
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
