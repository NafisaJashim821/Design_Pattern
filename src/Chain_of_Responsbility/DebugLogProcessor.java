package Chain_of_Responsbility;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {

        if(logLevel==DEBUG){
            System.out.println("Debug"+message);
        }else {
            super.log(logLevel, message);
        }
    }
}
