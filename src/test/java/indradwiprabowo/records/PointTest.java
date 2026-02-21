package indradwiprabowo.records;

import indradwiprabowo.records.anotation.Valid;
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
}
