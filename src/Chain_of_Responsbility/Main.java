package Chain_of_Responsbility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logobject = new InfoLogProcessor(new DebugLogProcessor(new  ErrorLogProcessor(null)));
        logobject.log(LogProcessor.ERROR,"exception happens");
        logobject.log(LogProcessor.INFO,"just for info ");
        logobject.log(LogProcessor.DEBUG,"need to debug this ");
    }
}
