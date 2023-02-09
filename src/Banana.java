public class Banana{
    private String Vitamin;

    public Banana(String vitamin) {
        Vitamin = vitamin;
    }


    @Override
    public String toString() {
        return "Banana  "  +
                "Vitamin:" + Vitamin;
    }
}

