package site.bulibucai.iterator; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
 * Bookshelf Tester. 
 * 
 * @author  Huan-Rong[https://github.com/Huan-Rong]
 * @since Jun 9, 2018
 */ 
public class BookshelfTest {

    private Bookshelf bookshelf;

    @Before
    public void before() {
        bookshelf = new Bookshelf(5);
        bookshelf.appendBook(new Book("Thinking in Java"));
        bookshelf.appendBook(new Book("Design Patterns"));
    } 

    /** 
     * 
     * Method: getBook(int index) 
     * 
     */ 
    @Test
    public void testGetBook() {
        Book book = bookshelf.getBook(0);
        Book book1 = bookshelf.getBook(1);
        Book book2 = bookshelf.getBook(4);

        Assert.assertNotNull(book);
        Assert.assertEquals("Book's name", "Thinking in Java", book.getName());
        Assert.assertNotNull(book1);
        Assert.assertEquals("Book's name", "Design Patterns", book1.getName());
        Assert.assertNull(book2);
    }

    /** 
     * 
     * Method: appendBook(Book book) 
     * 
     */ 
    @Test
    public void testAppendBook() {
        Assert.assertEquals(2, bookshelf.getLength());
        bookshelf.appendBook(new Book("Java Multi-thread"));
        Assert.assertEquals(3, bookshelf.getLength());
    }

    /** 
     * 
     * Method: getLength() 
     * 
     */ 
    @Test
    public void testGetLength() {
        Assert.assertEquals(2, bookshelf.getLength());
    }

    /** 
     * 
     * Method: iterator() 
     * 
     */ 
    @Test
    public void testIterator() {
        Iterator iterator = bookshelf.iterator();
        Assert.assertNotNull(iterator);
        while (iterator.hasNext()) {
            Object object = iterator.next();
            Assert.assertNotNull(object);
            Assert.assertTrue(object instanceof Book);
        }
    }
}
