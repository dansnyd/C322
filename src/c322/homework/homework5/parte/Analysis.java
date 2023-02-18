package c322.homework.homework5.parte;
//NOTE: This is a template of part E as I
// thought it would be too much to create a data mining
// application as I have no knowledge of how to do this.
// Instead I made an outline of what I thought it should be.

public class Analysis {
    private String documentType;
    private String rawData;
    private String analysisResult;

    public Analysis(String documentType, String rawData, String analysisResult) {
        this.documentType = documentType;
        this.rawData = rawData;
        this.analysisResult = analysisResult;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getRawData() {
        return rawData;
    }

    public String getAnalysisResult() {
        return analysisResult;
    }
}
