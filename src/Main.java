import com.raja.oopslanb.shapes.Rectangle;
import com.raja.oopslanb.shapes.Shape;
import com.raja.oopslanb.shapes.Triangle;
import com.raja.oopslanb.shapes.Circle;

public class Main {
	public static void main(String[] args) {
		Shape r = new Rectangle();
		r.printArea();
		Shape t = new Triangle();
		t.printArea();
		Shape c = new Circle();
		c.printArea();
	}
}
