package zad6_p2;

public class bird extends Animal{
    private String featherColor;
    private boolean latajacy;
    public bird() {
        super();
        latajacy = false;
    }

    public bird(int agejs, int weightjs, String featherColor, boolean latajacy) {
        super(agejs, weightjs);
        this.featherColor = featherColor;
        this.latajacy = latajacy;
    }

    public bird(String namejs, int agejs, int weightjs, String featherColor, boolean latajacy) {
        super(namejs, agejs, weightjs);
        this.featherColor = featherColor;
        this.latajacy = latajacy;
    }

    public bird(String featherColor, boolean latajacy) {
        this.featherColor = featherColor;
        this.latajacy = latajacy;
    }

    public void setLatajacy(boolean latajacy) {
        this.latajacy = latajacy;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
    public boolean isLatajacy() {
        return latajacy;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor +
        ", latajacy=" + latajacy;
    }

    @Override
    void eatjs() {
        System.out.println("BirdEat");
    }

    @Override
    void getVoicejs() {
        System.out.println("BirdVoice");
    }
}

