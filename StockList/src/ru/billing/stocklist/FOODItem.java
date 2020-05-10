package ru.billing.stocklist;

import java.util.Date;

public class FOODItem extends GenericItem {
    private Date dateOfIncome;
    private int expires;

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    Date df = new Date();

    public FOODItem(int ID, String name, float price, Date dateOfIncome, int expires) {
        super(ID, name, price);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

   public FOODItem(String name, float price, FOODItem analog, Date date, short expires) {
        super(name, price, analog);
        this.dateOfIncome = date;
        this.expires = expires;
    }
    public FOODItem(String name, float price, short expires) {
        this.expires = expires;
    }
    public FOODItem(String name) {
        
    }


    void printAll() {
        System.out.println("Date of Income: " + this.df);
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f, Expires: %d \n", this.getID(), this.getName(), this.getExpires(), this.expires);
    }
    
     @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getID();
        result = prime * result + getName().hashCode();
        result = prime * result + (String.valueOf(getPrice()).hashCode());
        result = prime * result + getCat().hashCode();
        result = prime * result + expires;
        return result;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null) {
            return false;
        } else if (this.getClass() != o.getClass()) {
            return false;
        } else {
            FOODItem object = (FOODItem)o;
            return this.getID() == object.getID() && this.getName().equals(object.getName()) && this.getPrice() == object.getPrice() && this.expires == object.expires && this.dateOfIncome.equals(this.dateOfIncome);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        String str = "ID: " + this.getID() + ", Name: " + this.getName() + ", price: " + this.getPrice() + ", Date of Income:" + this.df + ", Expires: " + this.expires;
        return str;
    }
}
