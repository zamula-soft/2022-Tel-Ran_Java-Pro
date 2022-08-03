package lesson1.invoice;

import java.util.Arrays;

public class Invoice {
    private InvoiceItem [] items;

    public Invoice(InvoiceItem[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
//        String result="";
//        for (int i = 0; i < items.length; i++) {
//           result += items[i].toString()+"\n";
//        }
//        return result;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            builder.append(items[i]);
            builder.append("\n");
        }
        return builder.toString();

    }

    public double calculate(){
        double sum = 0.0;
        for (int i = 0; i < items.length; i++) {
            sum += items[i].getUnitPrice() * items[i].getCount();
        }
        return sum;
    }

    public static void main(String[] args) {
        InvoiceItem [] i = new InvoiceItem[]{
                new InvoiceItem("1230", "Гвозди  ", 12, 0.02),
                new InvoiceItem("2220", "Молоток ", 1, 4.5),
                new InvoiceItem("2222", "Изолента", 3, .5)
        };

        Invoice invoice = new Invoice(i);
        System.out.println(invoice);
        System.out.println(invoice.calculate());
    }

}
