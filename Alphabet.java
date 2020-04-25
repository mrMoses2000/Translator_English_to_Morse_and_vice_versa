package TmpPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

abstract class Alphabet
{
    static String terminator = " ";
    static Properties E_to_M = new Properties();
    static Properties M_to_E = new Properties();
    static {
        FileInputStream in_d = null;
        FileInputStream in_c = null;
        try {
            in_d = new FileInputStream("C:\\Users\\moses\\IdeaProjects\\MORSEMORSE\\src\\TmpPack\\Decode_properties.properties");
            in_c = new FileInputStream("C:\\Users\\moses\\IdeaProjects\\MORSEMORSE\\src\\TmpPack\\Code_properties.properties");
            E_to_M.load(in_c);
            M_to_E.load(in_d);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
