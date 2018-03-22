package inheritance_interfaces_abstract.model;

public class Ligurian extends Olive {

    //Need a constructor matching superclass constructor
    public Ligurian() {
        super(OliveName.LIGURIAN, OliveColor.BLACK, 5);
    }

    @Override
    public String getOrigin() {
        return "Italy";
    }
}
