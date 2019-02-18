package testp;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import shopping.Book;
import shopping.Cshopping;

class Testc {
	Cshopping c;
@BeforeEach public void initiate() {
	c = new Cshopping();
}
	@Test
	public void test1() {
		assertTrue(c.pcount==0);
		
	}
	@Test
	public void test2() {
		Book book=new Book();
		book.price=127;
		book.name="javeBook";
		book.amount=1;
		c.add(book);
		assertTrue(c.pcount==1&&c.totalcount==127);
	}
	@Test 
	public void test3() {
		Book book=new Book();
		book.price=127;
		book.name="javeBook";
		book.amount=1;
		c.add(book);
		/////////////////////////
		
	Book book2=new Book();
	book2.price=100;
	book2.name="Web design book";
	book2.amount=1;
	c.add(book2);
	assertTrue(c.pcount==2&&c.totalcount==227);
	
	}

}
