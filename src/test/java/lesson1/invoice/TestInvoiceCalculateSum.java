package lesson1.invoice;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class TestInvoiceCalculateSum {

    @Test
    public void testInvoiceCalculate() {
        InvoiceItem [] i = new InvoiceItem[]{
                new InvoiceItem("1230", "Гвозди  ", 12, 0.02),
                new InvoiceItem("2220", "Молоток ", 1, 4.5),
                new InvoiceItem("2222", "Изолента", 3, .5)
        };

        Invoice inv = new Invoice(i);

        assertEquals(
                6.24,
                inv.calculate(),
                0.1);
    }
}
