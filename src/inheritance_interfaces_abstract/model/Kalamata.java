package inheritance_interfaces_abstract.model;

import class_practice3.model.OliveName;

public class Kalamata extends Olive {

    //Need a constructor matching superclass constructor
    public Kalamata() {
        super(inheritance_interfaces_abstract.model.OliveName.KALAMATA, OliveColor.PURPLE, 3);
    }

    @Override
    public String getOrigin() {
        return "Greece";
    }
}
