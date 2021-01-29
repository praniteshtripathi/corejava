package rnd.program;

import java.io.IOException;

public class ChromeUtil {
	public static Process executeCommands(String... commandAndArgs){
        if(commandAndArgs.length==0){return null;}
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(commandAndArgs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return process;
}
}
