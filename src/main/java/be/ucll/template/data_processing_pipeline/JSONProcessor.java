package be.ucll.template.data_processing_pipeline;

public class JSONProcessor extends DataProcesser {
    @Override
    void loadData() {
        System.out.println("Loading data from JSON...");
    }

    @Override
    void transform() {
        System.out.println("Adding timestamps to each record...");
    }

    @Override
    void save() {
        System.out.println("Saving data to new CSV file...");
    }
}
