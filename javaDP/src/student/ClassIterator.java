package student;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ClassIterator implements Iterator<Student>{
	private StudentClass studentclass;
	private int index;
	
	public ClassIterator(StudentClass studentclass) {
		this.studentclass = studentclass;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		if(index < studentclass.getLength()) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public Student next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		Student student = studentclass.getStudentAt(index);
		index++;
		return student;
	}
}
