package indradwiprabowo.records;

import indradwiprabowo.records.data.Customers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PropertyTest {

    @Test
    void create() {
        Customers customers = new Customers("1", "Indra", "indra@localhost","088888");
        assertNotNull(customers);

        System.out.println(customers);
    }

    @Test
    void getProperty() {
        Customers customers = new Customers("1", "Indra", "indra@localhost","088888");
        assertNotNull(customers);
        assertEquals("1", customers.id());
        assertEquals("Indra", customers.name());
        assertEquals("indra@localhost", customers.email());
        assertEquals("088888", customers.phone());

        System.out.println(customers);
    }

    @Test
    void constructor() {
        Customers customers = new Customers("1", "Indra", "indra@localhost");
        assertNotNull(customers);
        assertEquals("1", customers.id());
        assertEquals("Indra", customers.name());
        assertEquals("indra@localhost", customers.email());
        assertNull(customers.phone());

        System.out.println(customers);
    }

    @Test
    void canonicalConstructor() {
        Customers customers = new Customers("1", "Indra", "INDRA@LOCALHOST");
        assertNotNull(customers);
        assertEquals("1", customers.id());
        assertEquals("Indra", customers.name());
        assertEquals("indra@localhost", customers.email());

        System.out.println(customers);
    }

    @Test
    void recordMethod() {
        Customers customers = new Customers("1", "Indra", "indra@localhost");
        assertEquals("Hello Budi, my Name is Indra", customers.sayHello("Budi"));
    }

    @Test
    void recordEquals() {
        Customers customers1 = new Customers("1", "Indra", "indra@localhost");
        Customers customers2 = new Customers("1", "Indra", "indra@localhost");

        assertTrue(customers1.equals(customers2));
        assertEquals(customers1.hashCode(), customers1.hashCode());
        assertEquals(customers1.toString(), customers1.toString());
    }
}
