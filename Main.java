package TmpPack;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Coder coder = null;
        File Source = null;
        File Output = null;
        Scanner user_input = new Scanner(System.in);

        if(user_input.nextInt() == 1)
        {
            coder = new En_to_Morse();
            Source = new File("C:\\Users\\moses\\IdeaProjects\\MORSEMORSE\\English_input.txt");
            Output = new File("C:\\Users\\moses\\IdeaProjects\\MORSEMORSE\\Morse_output.txt");
        }
        else
            {
            coder = new Morse_to_En();
            Source = new File("C:\\Users\\moses\\IdeaProjects\\MORSEMORSE\\Morse_input.txt");
            Output = new File("C:\\Users\\moses\\IdeaProjects\\MORSEMORSE\\English_output.txt");
            }
        StringBuilder CodedString = coder.handle(Source);
        FileOutputStream WriteToFile = new FileOutputStream(Output);
        WriteToFile.write(CodedString.toString().getBytes());
        Statistics statistics = new Statistics('h');
        statistics.equals(new Object());

    }
}


