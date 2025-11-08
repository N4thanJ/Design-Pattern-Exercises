package be.ucll.template.data_processing_pipeline;

public class Main {
    public static void main(String[] args) {
        CSVProcessor csv = new CSVProcessor();
        JSONProcessor json = new JSONProcessor();
        XmlProcessor xml = new XmlProcessor();

        csv.process();
        json.process();
        xml.process();
    }
}
