
package ru.billing.stocklist;


public class TechnicalItem extends GenericItem {
    private int warrantyTime;

    public int getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(int warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    public TechnicalItem(int ID, String name, float price, int warrantyTime) {
        super(ID, name, price);
        this.warrantyTime = warrantyTime;
    }


    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null) {
            return false;
        } else if (this.getClass() != o.getClass()) {
            return false;
        } else {
            TechnicalItem object = (TechnicalItem)o;
            return this.getID() == object.getID() && this.getName().equals(object.getName()) && this.getPrice() == object.getPrice() && this.warrantyTime == object.warrantyTime;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        String str = "ID: " + this.getID() + ", Name: " + this.getName() + ", price: " + this.getPrice() + ", Warranty Time:" + this.warrantyTime;
        return str;
    }

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , WarrantyTime: %d  \n", this.getID(), this.getName(), this.getPrice(), this.warrantyTime);
    }
}
