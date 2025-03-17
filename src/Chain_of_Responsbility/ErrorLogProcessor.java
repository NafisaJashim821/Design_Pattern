package Chain_of_Responsbility;

public class ErrorLogProcessor extends LogProcessor {
    ErrorLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel==ERROR) {
            System.out.println("Error" + message);
        } else {
            super.log(logLevel, message);
        }

    }
}
