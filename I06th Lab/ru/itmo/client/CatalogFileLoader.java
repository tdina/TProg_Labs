package ru.itmo.client;

import ru.billing.client.CatalogLoader;
import ru.billing.stocklist.FOODItem;
import ru.billing.stocklist.ItemCatalog;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

class CatalogFileLoader implements CatalogLoader {
    private String fileName;

    public CatalogFileLoader(String fileName) {
        this.fileName = fileName;
    }

    public void load(ItemCatalog cat) throws CatalogLoadException, IOException {
        File f = new File(fileName);
        String line;
        try (FileInputStream fis = new FileInputStream(f)) {
            Scanner s = new Scanner(fis);

            while(s.hasNextLine()){
                line = s.nextLine();
                if(line.length() == 0) break;
                String[] item_fld = line.split(";");
                String name = item_fld[0];
                float price = Float.parseFloat(item_fld[1]);
                short expires = Short.parseShort(item_fld[2]);
                FOODItem item = new FOODItem(name, price, null, new Date(), expires);
                cat.addItem(item);
            }
        } catch (FileNotFoundException | ItemAlreadyExistsException e) {
            e.printStackTrace();
            throw new CatalogLoadException();
        }

    }
