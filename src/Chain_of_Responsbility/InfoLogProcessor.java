package Chain_of_Responsbility;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor (LogProcessor nexLogProcessor){

        super(nexLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == INFO) {
            System.out.println("INFO: " + message);
        } else {

            super.log(logLevel, message);
        }
    }
}
