package be.ucll.template.data_processing_pipeline;

public abstract class DataProcesser {
    final void process() {
        loadData();
        if (validateData()) {
            transform();
            save();
        } else {
            System.err.println("Data validation failed. Processing aborted");
        }

    }

    boolean validateData() {
        return true;
    }

    abstract void loadData();

    abstract void transform();

    abstract void save();
}
