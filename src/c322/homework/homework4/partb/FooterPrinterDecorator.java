package c322.homework.homework4.partb;

public class FooterPrinterDecorator extends PrinterDecorator{
    String footerPrinter;

    public FooterPrinterDecorator(Printer printer, String footerPrinter){
        super(printer);
        this.footerPrinter = footerPrinter;
    }

    @Override
    public void flushBuffer() {
        System.out.println("Footer: " + footerPrinter);
        super.flushBuffer();
    }
}
