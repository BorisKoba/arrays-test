package telran.shapes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class Canvas implements Shape, Iterable<Shape> {
    private Shape[] shapes = new Shape[0];
	
      
    private class CanvasIterator implements Iterator<Shape> {
    	int current = 0;
    	boolean flNext = false;
		@Override
		public boolean hasNext() {
			
			return current < shapes.length;
		}

		@Override
		public Shape next() {
			if(!hasNext()) {
				throw new NoSuchElementException();
			}
				flNext = true;
				return shapes[current++]  ;
		}
//		@Override
//		public void remove() {
//			if(!flNext) {
//				 throw new IllegalStateException();
//			}
//			flNext = false;
//			Shape[]remove = new Shape[shapes.length - 1];
//			current--;
//		}
    	
    }
	@Override
	public int perimeter() {
		int res = 0;
		for(Shape shape : this) {
		 res +=shape.perimeter();
			
			
		}
		return res;
	}

	@Override
	public int square() {
		int res = 0;
		for(Shape shape : this) {
			res += shape.square(); 
		}
		return res;
	}

	@Override
	public Iterator<Shape> iterator() {
		
		return new CanvasIterator();
	}
	public void addShape(Shape shape) {
		shapes = Arrays.copyOf(shapes, shapes.length + 1);
		shapes[shapes.length - 1] = shape;
		
	}
    public boolean removeIf(Predicate<Shape> predicate) {
    	int oldLength = shapes.length;
		Iterator<Shape> it = iterator();
		while(it.hasNext()) {
			Shape num = it.next();
			if(predicate.test(num)) {
				it.remove();
			}
		}
		return oldLength > shapes.length;
    }
    public boolean removeNestedCanvases() {
    	return removeIf(shape -> shape instanceof Canvas);
    }

}