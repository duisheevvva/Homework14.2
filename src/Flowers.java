public class Flowers {
    private String type;

    public Flowers(String type) {
        this.type = type;
    }

    public Flowers(){

    }

    void  collected(){
        System.out.println("Collected flowers...");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Flowers" +
                "\n type:" + type;
    }
}
