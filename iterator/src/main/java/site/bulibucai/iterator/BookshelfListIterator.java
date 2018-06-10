package site.bulibucai.iterator;

/**
 * @author HuanRong[https://github.com/Huan-Rong]
 */
public class BookshelfListIterator implements Iterator {

    private BookshelfList bookshelfList;
    private int index = 0;

    public BookshelfListIterator(BookshelfList bookshelfList) {
        this.bookshelfList = bookshelfList;
    }

    public boolean hasNext() {
        if (index < bookshelfList.getLength()) {
            return true;
        }
        return false;
    }

    public Object next() {
        return bookshelfList.getBook(index++);
    }
}
