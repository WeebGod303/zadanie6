package zad6_p2;

public class Animal {
    String namejs;
    int agejs;
    int weightjs;


    public Animal(int agejs, int weightjs) {
        this.agejs = agejs;
        this.weightjs = weightjs;
    }

    public Animal(String namejs, int agejs, int weightjs) {
        this.namejs = namejs;
        this.agejs = agejs;
        this.weightjs = weightjs;
    }

    public Animal() {
        namejs = "Animal";
        agejs = 0;
        weightjs = 0;
    }

    public String getNamejs() {
        return namejs;
    }

    public void setNamejs(String namejs) {
        this.namejs = namejs;
    }

    public int getAgejs() {
        return agejs;
    }

    public void setAgejs(int agejs) {
        this.agejs = agejs;
    }

    public int getWeightjs() {
        return weightjs;
    }

    public void setWeightjs(int weightjs) {
        this.weightjs = weightjs;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "namejs='" + namejs +
        ", agejs='" + agejs  +
        ", weightjs='" + weightjs ;
    }

    void eatjs(){
        System.out.println("Jedzenie");
    }
    void getVoicejs(){
        System.out.println("Glos");
    }

}