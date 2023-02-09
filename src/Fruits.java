public class Fruits {
private String type;
private  double gram;
private String taste;

    public Fruits(String type, double gram, String taste) {
        this.type = type;
        this.gram = gram;
        this.taste = taste;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getGram() {
        return gram;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String  toString() {
        return "Fruits{" +
                "type='" + type + '\'' +
                ", gram=" + gram +
                ", taste='" + taste + '\'' +
                '}';
    }
}
