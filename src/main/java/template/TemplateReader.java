package template;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class TemplateReader {
    public String reader(String path){
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader(path);){
            char[] ch = new char[128];
            int length = 0;
            while ((length = reader.read(ch)) != -1){
                sb.append(new String(ch,0,length));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

}
