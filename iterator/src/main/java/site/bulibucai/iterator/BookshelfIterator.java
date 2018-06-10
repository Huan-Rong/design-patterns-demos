package site.bulibucai.iterator;

import site.bulibucai.iterator.Bookshelf;

/**
 * @author HuanRong[https://github.com/Huan-Rong]
 */
public class BookshelfIterator implements Iterator {

    private Bookshelf bookshelf;
    private int index = 0;

    public BookshelfIterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
    }

    public boolean hasNext() {
        if (index < bookshelf.getLength()) {
            return true;
        }
        return false;
    }

    public Object next() {
        return bookshelf.getBook(index++);
    }
}
