package zad6_p2;

public class fish extends Animal{
    private boolean slodkowodna;
    public fish(){
        super();
        slodkowodna = false;
    }

    public fish(int agejs, int weightjs, boolean slodkowodna) {
        super(agejs, weightjs);
        this.slodkowodna = slodkowodna;
    }

    public fish(String namejs, int agejs, int weightjs, boolean slodkowodna) {
        super(namejs, agejs, weightjs);
        this.slodkowodna = slodkowodna;
    }

    public fish(boolean slodkowodna) {
        this.slodkowodna = slodkowodna;
    }

    public boolean isSlodkowodna() {
        return slodkowodna;
    }

    public void setSlodkowodna(boolean slodkowodna) {
        this.slodkowodna = slodkowodna;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "slodkowodna=" + slodkowodna +
                '}';
    }
    public void doAkwarium() {
        System.out.println("Ryba wlozona do akwarium");
    }

    @Override
    void eatjs() {
        System.out.println("FishEat");
    }

    @Override
    void getVoicejs() {
        System.out.println("FishVoice");
    }
}