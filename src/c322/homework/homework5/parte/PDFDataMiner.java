package c322.homework.homework5.parte;

import java.io.File;

public class PDFDataMiner extends Document{
    public PDFDataMiner(String path) {
        super();
    }

    public void process() {
        File file = openFile();
        String rawData = extractPdfData(file);
        Analysis analysis = analyzeData(rawData);
        sendReportAnalysis(analysis);
        closeFile(file);
    }

    @Override
    public void extractData() {

    }

    private String extractPdfData(File file) {
        // implementation specific to PdfDocument to extract data
        return "";
    }
}
