

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TransportTest.
 *
 * @author  POO
 * @version 03/2024
 */


public class TransportTest {
    
    private Transport transport;

    @BeforeEach
    public void setUp() {
        transport = new Transport();
    }

    @Test
    public void testDefaultValues() {
        assertEquals("", transport.getOrigin());
        assertEquals("", transport.getDestination());
        assertEquals(0.0, transport.getPrice(), 0.001);
        assertEquals(0.0, transport.getFees(), 0.001);
        assertTrue(transport.isAvailable());
    }

    @Test
    public void testSetOrigin() {
        transport.setOrigin("Origin");
        assertEquals("Origin", transport.getOrigin());
    }

    @Test
    public void testSetDestination() {
        transport.setDestination("Destination");
        assertEquals("Destination", transport.getDestination());
    }

    @Test
    public void testSetPrice() {
        transport.setPrice(50.0);
        assertEquals(50.0, transport.getPrice(), 0.001);
    }

    @Test
    public void testSetFees() {
        transport.setFees(5.0);
        assertEquals(5.0, transport.getFees(), 0.001);
    }

    @Test
    public void testSetAvailable() {
        transport.setAvailable(false);
        assertFalse(transport.isAvailable());
    }

    @Test
    public void testResetValues() {
        transport.resetValues();
        assertEquals("", transport.getOrigin());
        assertEquals("", transport.getDestination());
        assertEquals(0.0, transport.getPrice(), 0.001);
        assertTrue(transport.isAvailable());
    }

    @Test
    public void testSetValues() {
        transport.setValues("Origin", "Destination", 50.0);
        assertEquals("Origin", transport.getOrigin());
        assertEquals("Destination", transport.getDestination());
        assertEquals(50.0, transport.getPrice(), 0.001);
        assertFalse(transport.isAvailable());
    }

    @Test
     public void testToString() {
        String expected = "\nTipo Transporte: Transporte genérico\n" +
                          "             ID: " + transport.getId() + "\n" +
                          "         Origem: \n" +
                          "        Destino: \n" +
                          "          Preço:  0,00€\n" +
                          "     Honorarios: 0,00%\n" +
                          "    Preço Final: 0,00€\n";
        assertEquals(expected, transport.toString());
    }

    @Test
    public void testGetPriceWithFees() {
        transport.setPrice(100.0);
        transport.setFees(10.0);
        assertEquals(110.0, transport.getPriceWithFees(), 0.001);
    }

    @Test
    public void testGetTransportType() {
        assertEquals("Transporte genérico", transport.getTransportType());
    }
}
