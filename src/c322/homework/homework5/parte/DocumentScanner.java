package c322.homework.homework5.parte;

public class DocumentScanner {
    private Document document;

    public void DocumentProcessor(Document document) {
        this.document = document;
    }

    public void processData() {
        document.extractData();
    }
}
