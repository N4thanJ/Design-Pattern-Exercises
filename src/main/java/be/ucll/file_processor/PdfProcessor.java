package be.ucll.file_processor;

public class PdfProcessor implements FileProcessorStrategy {

    @Override
    public void process(String fileName) {
        System.out.println("Step 1: Opening file " + fileName);
        System.out.println("Step 2: Extracting text from PDF using OCR...");
        System.out.println("Step 3: Analyzing layout for PDF tables...");
        System.out.println("Step 4: Saving data to database...");
        System.out.println("Step 5: Closing file stream.");
    }

}
