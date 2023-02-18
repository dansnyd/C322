package c322.homework.homework5.parte;

import java.io.File;

public class DocDataMiner extends Document{

    public DocDataMiner(String path) {
        super();
    }

    public void process() {
        File file = openFile();
        String rawData = extractDocData(file);
        Analysis analysis = analyzeData(rawData);
        sendReportAnalysis(analysis);
        closeFile(file);
    }

    @Override
    public void extractData() {

    }


    private String extractDocData(File file) {
        return "";
    }
}
