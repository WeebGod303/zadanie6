package zad6_p2;

public class blowfish extends fish{
    private boolean nadmuchana;
    public blowfish(){
        super();
        nadmuchana = false;
    }

    public blowfish(int agejs, int weightjs, boolean slodkowodna, boolean nadmuchana) {
        super(agejs, weightjs, slodkowodna);
        this.nadmuchana = nadmuchana;
    }

    public blowfish(String namejs, int agejs, int weightjs, boolean slodkowodna, boolean nadmuchana) {
        super(namejs, agejs, weightjs, slodkowodna);
        this.nadmuchana = nadmuchana;
    }

    public blowfish(boolean nadmuchana) {
        this.nadmuchana = nadmuchana;
    }

    public boolean isNadmuchana() {
        return nadmuchana;
    }

    public void setNadmuchana(boolean nadmuchana) {
        this.nadmuchana = nadmuchana;
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "nadmuchana=" + nadmuchana +
                '}';
    }
    public void straszycRozdymke() {
        nadmuchana = true;
    }

    @Override
    void eatjs() {
        System.out.println("Slimaki");
    }

    @Override
    void getVoicejs() {
        System.out.println("Dzwiek ryby");
    }
}
