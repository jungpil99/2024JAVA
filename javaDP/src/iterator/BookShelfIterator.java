package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book>{
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) { //생성자
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {  //다음책이 있나
		// TODO Auto-generated method stub
		if(index < bookShelf.getLength()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Book next() {// 다음책을 가져올 때
		if(!hasNext()) {
			throw new NoSuchElementException(); //예외를 발생시키는 방법
		}
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
