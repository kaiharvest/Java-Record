package indradwiprabowo.records;

import indradwiprabowo.records.data.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {

    @Test
    void generic() {
        var data1 = new Data<>("Indra");
        assertEquals("Indra", data1.data());

        Data<Integer> data2 = new Data<>(100);
        assertEquals(100, data2.data());
    }
}
