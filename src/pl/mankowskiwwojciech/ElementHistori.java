package pl.mankowskiwwojciech;

public class ElementHistori {
    private String name;
    private Object value;

    public ElementHistori(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
