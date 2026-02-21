package indradwiprabowo.records;

import indradwiprabowo.records.anotation.Valid;
import indradwiprabowo.records.data.Line;
import indradwiprabowo.records.data.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PointTest {

    @Test
    void annotationTest() throws NoSuchFieldException, NoSuchMethodException {
       assertNotNull(Point.class.getDeclaredField("x").getAnnotation(Valid.class));
       assertNotNull(Point.class.getDeclaredField("y").getAnnotation(Valid.class));

       assertNotNull(Point.class.getDeclaredMethod("x").getAnnotation(Valid.class));
       assertNotNull(Point.class.getDeclaredMethod("y").getAnnotation(Valid.class));

       assertNotNull(Point.class.getConstructors()[0].getParameters()[0].getAnnotation(Valid.class));
       assertNotNull(Point.class.getConstructors()[0].getParameters()[1].getAnnotation(Valid.class));
    }

    public void printObject(Object object) {
        if (object instanceof Line(Point(int startX, int startY), Point(int endX, int endY))) {
            System.out.println(startX);
            System.out.println(startY);
            System.out.println(endX);
            System.out.println(endY);
        } else if (object instanceof Point(int x, int y)) {
            System.out.println(x);
            System.out.println(y);
        } else {
            System.out.println(object);
        }
    }

    @Test
    void beforeRecordPatterns() {
        printObject(new Point(10, 10));
        printObject(new Line(new Point(0,0), new Point(10, 10)));
    }
}
