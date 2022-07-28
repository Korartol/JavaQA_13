public class Smartphone extends Product {
    private String title;
    private String manufacturer;

    public Smartphone(int id, String name, int price, String title, String manufacturer) {
        super(id, name, price);
        this.title = title;
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        if (getManufacturer().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
