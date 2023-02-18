package c322.homework.homework5.parte;

import java.io.File;

public class CVSDataMiner extends Document{
    public CVSDataMiner(String path) {
        super();
    }

    public void process() {
        File file = openFile();
        String rawData = extractCsvData(file);
        Analysis analysis = analyzeData(rawData);
        sendReportAnalysis(analysis);
        closeFile(file);
    }

    @Override
    public void extractData() {}

    private String extractCsvData(File file) {
        return "";
    }
}
