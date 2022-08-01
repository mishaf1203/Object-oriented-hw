public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor(7,
                        7,
                        10,
                        "Harry Potter",
                        8,
                        6),
                new Gryffindor(5,
                        7,
                        5,
                        "Ron Weasley",
                        5,
                        4),

                new Gryffindor(8,
                        7,
                        7,
                        "Hermione Granger",
                        8,
                        10)
        };
        Slytherin[] slytherins = {
                new Slytherin("Drako Malfoy",
                        7, 10, 7, 8, 6,
                        9),
                new Slytherin("Graham Montegrue", 7, 5, 3, 5, 4, 3),

                new Slytherin("Gregory Goil",
                        7,
                        7,
                        5,
                        8,
                        10, 4)
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Drako Malfoy",
                        7,
                        10,
                        7,
                        8,
                        6),

                new Ravenclaw("Graham Montegrue",
                        7,
                        5,
                        3,
                        5,
                        4),

                new Ravenclaw("Gregory Goil",
                        7,
                        7,
                        5,
                        8,
                        10)
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zakharia Smith",
                        7, 10, 7, 8, 6),

                new Hufflepuff("Sedrick Diggori",
                        7, 5, 3, 5, 4),

                new Hufflepuff("Justin Finch-Fletchli",
                        7, 7, 5, 8, 10)
        };
    }
}