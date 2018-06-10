package site.bulibucai.iterator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 * BookshelfList Tester.
 *
 * @author Huan-Rong[https://github.com/Huan-Rong]
 * @since Jun 10, 2018
 */
public class BookshelfListTest {

    private BookshelfList bookshelfList;

    @Before
    public void before() {
        bookshelfList = new BookshelfList(5);
        bookshelfList.appendBook(new Book("JavaScript Design Patterns"));
        bookshelfList.appendBook(new Book("Calculus"));
    }

    /**
     * Method: getBook(int index)
     */
    @Test
    public void testGetBook() {
        Book book = bookshelfList.getBook(0);
        Book book1 = bookshelfList.getBook(1);
        Book book2 = bookshelfList.getBook(4);

        Assert.assertNotNull(book);
        Assert.assertEquals("Book's name", "JavaScript Design Patterns", book.getName());
        Assert.assertNotNull(book1);
        Assert.assertEquals("Book's name", "Calculus", book1.getName());
        Assert.assertNull(book2);
    }

    /**
     * Method: appendBook(Book book)
     */
    @Test
    public void testAppendBook() {
        Assert.assertEquals(2, bookshelfList.getLength());
        bookshelfList.appendBook(new Book("Java SE8"));
        Assert.assertEquals(3, bookshelfList.getLength());
    }

    /**
     * Method: appendBook(Book book)
     */
    @Test
    public void testAppendBook2() {
        Assert.assertEquals(2, bookshelfList.getLength());
        bookshelfList.appendBook(new Book("Java SE8"));
        bookshelfList.appendBook(new Book("Java SE9"));
        bookshelfList.appendBook(new Book("Java SE10"));
        bookshelfList.appendBook(new Book("Java SE12"));
        Assert.assertEquals(6, bookshelfList.getLength());
    }

    /**
     * Method: getLength()
     */
    @Test
    public void testGetLength() {
        Assert.assertEquals(2, bookshelfList.getLength());
    }

    /**
     * Method: iterator()
     */
    @Test
    public void testIterator() throws Exception {
        Iterator iterator = bookshelfList.iterator();
        Assert.assertNotNull(iterator);
        Assert.assertTrue(iterator instanceof BookshelfListIterator);
        while (iterator.hasNext()) {
            Object object = iterator.next();
            Assert.assertNotNull(object);
            Assert.assertTrue(object instanceof Book);
        }
    }
}
