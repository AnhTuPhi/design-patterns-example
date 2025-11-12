package vn.com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 12/11/2025
 */
public class MenuCollection<T> implements IteratorCollection<T> {

    private List<T> items = new ArrayList<>();

    public MenuCollection(List<T> items) {
        this.items = items;
    }

    @Override
    public void addItems(T item) {
        items.add(item);
    }

    @Override
    public ItemIterator<T> iterator() {
        return new MenuItemIterator();
    }

    public class MenuItemIterator implements ItemIterator<T> {
        private int currentIndex = 0;


        @Override
        public boolean hasNext() {
            return currentIndex < items.size();
        }

        @Override
        public T next() {
            return items.get(currentIndex++);
        }
    }
}
