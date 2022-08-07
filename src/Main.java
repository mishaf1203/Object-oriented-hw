public class Main {
    public static void main(String[] args) {

        Gryffindor HarryPotter = new Gryffindor("Harry Potter",7,7,9,8,9);
        Gryffindor RonWeasley = new Gryffindor("Ron Weasley", 5,6,7,7,6);
        Gryffindor HermioneGranger = new Gryffindor("Hermione Granger",9,8,8,7,7);

        Slytherin DrakoMalfoy = new Slytherin("Drako Malfoy", 8,7,6,8,8,9);
        Slytherin GrahanMontegrue = new Slytherin("Graham Montegrue", 5,3,5,4,4,2);
        Slytherin GregoryGoil = new Slytherin("Gregory Goil", 4,5,6,4,3,2);

        Ravenclaw ChouJang = new Ravenclaw("Chou Jang",5,5,6,5,6);
        Ravenclaw PadmePatil = new Ravenclaw("Padme Patil", 5,6,6,7,6);
        Ravenclaw MarcusBelby = new Ravenclaw("Marcus Belby", 6,5,7,6,5);

        Hufflepuff ZakhariaSmith = new Hufflepuff("Zakharia Smith",7,6,6,5,7);
        Hufflepuff SedrickDiggori = new Hufflepuff("Sedrick Diggori", 8,7,8,8,8);
        Hufflepuff JustinFinchFletchli = new Hufflepuff("Justin Finch-Fletchli", 6,5,7,6,7);

        new Hogwarts("h", 0,0).randomStudentBest(ZakhariaSmith, DrakoMalfoy);

        new Gryffindor("a",0,0,0,0,0).gryffindorStudents(HarryPotter, RonWeasley);
        new Ravenclaw("b",0,0,0,0,0).ravenclawStudents(PadmePatil, MarcusBelby);
        new Slytherin("c", 0,0,0,0,0,0).slytherinStudents(DrakoMalfoy, GrahanMontegrue);
        new Hufflepuff("d",0,0,0,0,0).hufflepuffsStudents(SedrickDiggori, ZakhariaSmith);


    }
}