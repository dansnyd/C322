package c322.homework.homework5.parte;

import java.io.File;

public abstract class Document {

    String path = null;

    public Document() {
        this.path = path;
    }

    public abstract void process();

    protected File openFile() {
        // implementation to open file at path
        return new File("");
    }

    protected String extractData(File file) {
        // implementation to extract data from file
        return "";
    }

     protected Analysis analyzeData(String data) {
        // implementation to analyze data
         return new Analysis("","","");
    }

    protected void sendReportAnalysis(Analysis analysis) {
        // implementation to send report of analysis
    }

    protected void closeFile(File file) {
        // implementation to close file
    }

    public abstract void extractData();
}
