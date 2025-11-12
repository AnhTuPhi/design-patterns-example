package vn.com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 12/11/2025
 */
public class Demo {

    public static void main(String[] args) {
        List<Item> list = new ArrayList<>();
        list.add(new Item("Phuc",18));
        list.add(new Item("An",19));
        list.add(new Item("Nam",20));
        list.add(new Item("Bang",21));


        IteratorCollection collection = new MenuCollection(list);
        collection.addItems(new Item("Nick",10));
        collection.addItems(new Item("Tick", 20));

        ItemIterator itemIterator = collection.iterator();

        while (itemIterator.hasNext()) {
            Item item = (Item) itemIterator.next();
            System.out.println(item.toString());
        }
    }
}
