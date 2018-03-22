package class_practice3.model;

public enum OliveName {
    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    private String name;

    //enum Constructor can only be used in enum so no need for public
    OliveName(String name) {
        this.name = name;
    }

    //See below. Whenever the object is passed to a method that's expecting a string, this version of toString will be called instead.

    @Override
    public String toString() {
        return name;
    }
}
