package be.ucll.file_processor;

public class FileProcessorContext {
    private FileProcessorStrategy fileProcessorStrategy;

    public FileProcessorContext(FileProcessorStrategy fileProcessorStrategy) {
        this.fileProcessorStrategy = fileProcessorStrategy;
    }

    public void process(String fileName) {
        if (this.fileProcessorStrategy == null) {
            throw new IllegalStateException("No file processor strategy selected");
        }

        fileProcessorStrategy.process(fileName);
    }
}
