package c322.homework.homework4.partb;

public class HeaderPrinterDecorator extends PrinterDecorator{
    String headerPrinter;

    public HeaderPrinterDecorator(Printer printer, String headerPrinter){
        super(printer);
        this.headerPrinter = headerPrinter;
    }

    @Override
    public void flushBuffer() {
        System.out.println("Header: " + headerPrinter);
        super.flushBuffer();
    }
}
