package gr.aueb.cf.ch15.special_interfaces;

public class CompactDisk implements IProduct {
    private int id;
    private String title;
    private String manufacturer;
    private int capacity;

    public CompactDisk() {

    }

    public CompactDisk(int id, String title, String manufacturer, int capacity) {
        this.id = id;
        this.title = title;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
