package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 12/11/2025
 */
public interface IteratorCollection<T> {

    void addItems(T item);

    ItemIterator<T> iterator();

}
