public class Orange extends Fruits {
    private String color;
    private String sort;
    Banana banana;

    public Orange(String type, double gram, String taste, String color, String sort, Banana banana) {
        super(type, gram, taste);
        this.color = color;
        this.sort = sort;
        this.banana = banana;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Banana getBanana() {
        return banana;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    @Override
    public String toString() {
        return
                "type: " + getType() + "\n" +
                "gram: " + getGram() + "\n" +
                "taste: " + getTaste() + "\n" +
                "color: " + color + "\n" +
                "sort: " + sort + "\n" +
                "banana=" + banana;
    }
}
