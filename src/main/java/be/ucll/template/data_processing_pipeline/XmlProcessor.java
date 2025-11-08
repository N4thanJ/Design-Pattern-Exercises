package be.ucll.template.data_processing_pipeline;

public class XmlProcessor extends DataProcesser {

    @Override
    void loadData() {
        System.out.println("Loading data from XML...");
    }

    @Override
    void transform() {
        System.out.println("Transforming XML...");
    }

    @Override
    void save() {
        System.out.println("Saving data to new XML file...");
    }

    @Override
    boolean validateData() {
        return false;
    }
}
