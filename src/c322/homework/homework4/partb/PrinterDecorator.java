package c322.homework.homework4.partb;

abstract class PrinterDecorator implements Printer {
    Printer printer;

    public PrinterDecorator(Printer printer){
        this.printer = printer;
    }

    public void flushBuffer(){
        printer.flushBuffer();
    }
}
