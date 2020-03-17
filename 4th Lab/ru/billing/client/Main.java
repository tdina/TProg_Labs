package ru.billing.client;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import com.sun.jdi.ShortType;
import com.sun.jdi.ShortValue;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, CatalogLoadException, ItemAlreadyExistsException {
        Date dateOfIncome = new Date();
        GenericItem i1 = new GenericItem(1, "ball", 20.0F);
        GenericItem i2 = new GenericItem(2, "doll", 35.0F);
        GenericItem i3 = new GenericItem(3, "rose", 78.0F);
        /*i1.printAll();
        i2.printAll();
        i3.printAll();
        ru.billing.stocklist.FOODItem Fi = new ru.billing.stocklist.FOODItem(56, "banana", 64.0F, dateOfIncome, 13);
        ru.billing.stocklist.TechnicalItem techI = new ru.billing.stocklist.TechnicalItem(57, "phone", 25000.0F, 365);
        ru.billing.stocklist.GenericItem[] gItem = new ru.billing.stocklist.GenericItem[]{Fi, techI};

        for(int i = 0; i < gItem.length; ++i) {
            gItem[i].printAll();
        }

        System.out.println(Fi.toString());
        ru.billing.stocklist.FOODItem Fi1 = new ru.billing.stocklist.FOODItem(59, "apple", 15.0F, dateOfIncome, 20);
        System.out.println(Fi1.equals(Fi));
        ru.billing.stocklist.FOODItem clone = (ru.billing.stocklist.FOODItem)Fi1.clone();
        System.out.println(clone.equals(Fi1));*/

        ItemCatalog cat = new ItemCatalog();
        cat.addItem(i1);
        cat.addItem(i2);
        cat.addItem(i3);
        long begin = new Date().getTime();

        for(int i=0; i<100000;i++)
            cat.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: "+(end-begin)); begin = new Date().getTime();
        for(int i=0; i<100000;i++)
            cat.findItemByIDAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: "+(end-begin));

        CatalogLoader loader = new CatalogStubLoader();
        loader.load(cat);
        cat.addItem(i1);
        cat.printItems();


        /*String line = "Конфеты 'Маска';45;120";
        String[] item_fld = line.split(";");
        ru.billing.stocklist.FOODItem FI = new ru.billing.stocklist.FOODItem(item_fld[0], Integer.valueOf(item_fld[1]), Short.valueOf(item_fld[2]));
        FI.printAll();

    */
        
    }

}
