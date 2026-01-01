package model.entities;

public class ConvertToCSV {

    private String source;

    public ConvertToCSV(String source) {
        this.source = source;
    }

    public void parseToCSV(String out) {
        ReadFile rf = new ReadFile(source);
        rf.readFile();
        FileWrite fw = new FileWrite(rf.getItens(), out);
        fw.writerFile();
    }
}
