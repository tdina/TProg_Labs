package ru.billing.client;
import ru.billing.client.CatalogLoader;
import ru.billing.stocklist.Category;
import ru.billing.stocklist.FOODItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;


import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {
    public void load(ItemCatalog cat) throws CatalogLoadException {
        GenericItem item1 = new GenericItem("Sony TV",23000, Category.GENERAL);
        FOODItem item2 = new FOODItem("Bread",12,null,new Date(),(short)10);
        try {
            cat.addItem(item1);
            cat.addItem(item2); }
        catch (ItemAlreadyExistsException e) { // TODO Auto-generated catch block
            e.printStackTrace();
            throw new CatalogLoadException();
        }

        /*cat.addItem(item1);
        cat.addItem(item2);*/
    }
}
