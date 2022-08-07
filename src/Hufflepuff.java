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
    public void hufflepuffsStudents(Hufflepuff SedrickDiggori, Hufflepuff ZakhariaSmith) {
        int hufflepuffsStudent1 = SedrickDiggori.getDiligence() + SedrickDiggori.getLoyalty() +SedrickDiggori.getHonesty();
        int hufflepuffsStudent2 = ZakhariaSmith.getDiligence() + ZakhariaSmith.getLoyalty() + ZakhariaSmith.getHonesty();
        if (hufflepuffsStudent1 > hufflepuffsStudent2) {
            System.out.println(SedrickDiggori.getName() + " лучший студент, чем " + ZakhariaSmith.getName());
        } else {
            System.out.println(ZakhariaSmith.getName() + " лучший студент, чем " + SedrickDiggori.getName());
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
