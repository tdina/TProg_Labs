package ru.billing.stocklist;

import ru.billing.stocklist.GenericItem;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {
    private Map<Integer,GenericItem> catalog = new HashMap<Integer,GenericItem>;
    private List<GenericItem> ALCatalog = new ArrayList<GenericItem>;

    //public void addItem(ru.billing.stocklist.GenericItem item) добавляет товар в каталог
    public void addItem(GenericItem item) throws ItemAlreadyExistsException {
        if (this.catalog.containsKey(item.getID()) || this.ALCatalog.contains(item)) {
            throw new ItemAlreadyExistsException();
        }
        catalog.put(item.getID(), item); // Добавляем товар в HashMap
        ALCatalog.add(item); // Добавляем тот же товар в ArrayList
    }

    //	public void printItems() : распечатывает товары из каталога на экране. Распечатку следует производить с использованием метода toString класса ru.billing.stocklist.GenericItem.
    public void printItems() {
        for(GenericItem i : ALCatalog){
            System.out.println(i);
        }
    }

    //public ru.billing.stocklist.GenericItem findItemByID(int id) : производит поиск в каталоге по переданному id товара. Поиск следует производит в коллекции catalog типа HashMap
    public GenericItem findItemByID(int id) {
//Если нет такого ID, возвращаем пустое значение
        if(!catalog.containsKey(id)) {
            return null;
        } else{
            return catalog.get(id);
        }
    }
//	public ru.billing.stocklist.GenericItem findItemByIDAL(int id) : производит поиск в каталоге по переданному id товара. Поиск следует производит в коллекции ALCatalog типа ArrayList
    public GenericItem findItemByIDAL(int id){
        for(GenericItem i : ALCatalog){
            if(i.getID() == id) return i;
        }
        return null;
    }




}
