package zad6_p2;

public class mammal extends Animal{
    private boolean oswojony;
    public mammal(){
        super();
        oswojony = false;
    }

    public mammal(int agejs, int weightjs, boolean oswojony) {
        super(agejs, weightjs);
        this.oswojony = oswojony;
    }

    public mammal(String namejs, int agejs, int weightjs, boolean oswojony)
    {
        super(namejs, agejs, weightjs);
        this.oswojony = oswojony;
    }

    public boolean isOswojony() {
        return oswojony;
    }

    public void setOswojony(boolean oswojony) {
        this.oswojony = oswojony;
    }

    public void oswoicjs(){
        oswojony = true;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "oswojony=" + oswojony +
                '}' + super.toString();
    }

    @Override
    void eatjs() {
        System.out.println("MammalEat");
    }

    @Override
    void getVoicejs() {
        System.out.println("MammalVoice");
    }

}