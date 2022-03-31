package io.codelex.oop.summary.OrdersAndInvoices;

import org.apache.commons.lang3.StringUtils;

public class Invoice {
    private Order order;
    private String invoiceNumber;
    private InvoiceStatus status = InvoiceStatus.APPROVED;

    public Invoice(Order order, String invoiceNumber) throws WrongOrderException {
        this.order = order;
        if (order.displayOrder().length == 0) {
            throw new WrongOrderException("Order is empty!");
        }
        this.invoiceNumber = invoiceNumber;
    }

    public void send() {
        status = InvoiceStatus.SENT;
    }

    public void displayInvoice() {
        System.out.println("==============================================");
        System.out.printf("= INVOICE NUMBER: %s %21s\n", invoiceNumber, "=");
        System.out.printf("= STATUS: %s  %26s\n", status, "=");
        for (int i = 0; i < order.displayOrder().length; i++) {
            int spaces = 41 - order.displayOrder()[i].length();
            System.out.println("= " + (i + 1) + "." +
                    order.displayOrder()[i] +
                    StringUtils.repeat(" ", spaces) + "=");
        }
        System.out.printf("= SUM: %.2f EUR %29s\n", order.sumOfItems(), "=");
        System.out.printf("= VAT (21%%): %.2f EUR %24s\n", order.vatValue(), "=");
        System.out.printf("= TOTAL: %.2f EUR %27s\n", order.totalValue(), "=");
        System.out.println("==============================================");
    }
}
