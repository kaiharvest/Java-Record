package indradwiprabowo.records;

import indradwiprabowo.records.data.Customers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PropertyTest {

    @Test
    void create() {
        Customers customers = new Customers("1", "Indra", "indra@localhost","088888");
        assertNotNull("1", customers.id());
        assertNotNull("name", customers.name());
        assertNotNull("email", customers.email());
        assertNotNull("phone", customers.phone());

        System.out.println(customers);
    }
}
