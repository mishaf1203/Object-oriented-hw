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
}
