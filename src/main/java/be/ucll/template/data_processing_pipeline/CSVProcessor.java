package be.ucll.template.data_processing_pipeline;

public class CSVProcessor extends DataProcesser {
    @Override
    void loadData() {
        System.out.println("Loading data from CSV...");
    }

    @Override
    void transform() {
        System.out.println("Making all values caps...");
    }

    @Override
    void save() {
        System.out.println("Saving to new CSV file...");
    }
}
