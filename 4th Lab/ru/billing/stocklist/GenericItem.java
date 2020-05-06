package ru.billing.stocklist;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class GenericItem implements Cloneable {
    private int ID ;
    private String name;
    private float price;
    private Category cat;
    private GenericItem analog = null;
    private static int currentID = 1;

    public String getName() {
        return name;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(int currentID) {
        GenericItem.currentID = currentID;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    public Category getCat() {
        return cat;
    }

    public void setCat(Category cat) {
        this.cat = cat;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public GenericItem(int ID, String name, float price) {
        this.cat = Category.GENERAL;
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.currentID = ++ID;
    }

    public GenericItem(String name, float price, Category category) {
        this.name = name;
        this.price = price;
        this.cat = category;
        this.ID = currentID++;
    }
    public GenericItem(String name, float price, GenericItem analog) {
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.ID = currentID++;
        this.cat = Category.GENERAL;
    }
    public GenericItem() {
        this.name = null;
        this.price = 0;
        this.ID = currentID++;
        this.cat = Category.GENERAL;

    }

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f \n", this.ID, this.name, this.price);
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ID;
        result = prime * result + name.hashCode();
        result = prime * result + (String.valueOf(price)).hashCode();
        result = prime * result + cat.hashCode();
        return result;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null) {
            return false;
        } else if (this.getClass() != o.getClass()) {
            return false;
        } else {
            GenericItem object = (GenericItem)o;
            return this.ID == object.ID && this.name.equals(object.name) && this.price == object.price;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        String str = "ID: " + this.ID + ", Name: " + this.name + ", price: " + this.price;
        return str;
    }
}
