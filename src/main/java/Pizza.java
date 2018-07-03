public class Pizza {
   private String dough;
    private String topping;
    private String sauce;

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", topping='" + topping + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setSauce(String sauce) {
        this.sauce =  sauce;
    }
}
