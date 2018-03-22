package class_practice3.model;

public class Olive {

    //In example have replaced use of constant with enum class

//    public static final String KALAMATA = "Kalamata";
//    public static final String LIGURIAN = "Ligurian";

    private OliveName name;
    private long color; //indigo
    private  int oil; //amount of oil from a single olive

    public Olive() {
    }

    public Olive(OliveName name, long color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public Enum getName() {
        return name;
    }


    public int getCrush() {
        System.out.println("You crushed me!");
        return oil;
    }


}
