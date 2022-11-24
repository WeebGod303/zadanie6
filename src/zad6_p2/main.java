package zad6_p2;

public class main {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        animal[0] = new mammal("janek", 2, 8, true);
        animal[1] = new dog ("jarek", 8, 15, true,"maltanczyk");
        animal[2] = new bird("jaro", 2, 5, "brązowy", true);
        animal[3] = new pigeon("sQubany__", 4,3,"szary",true,"grzywacz");
        animal[4] = new fish("imie", 2, 1, true);
        animal[5] = new blowfish("Rozdymka", 7, 2, true, true);

        animal[3].getVoicejs();
        animal[1].eatjs();
        System.out.println(animal[2].namejs);
    }
}

