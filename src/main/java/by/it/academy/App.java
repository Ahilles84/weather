package by.it.academy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try(InputStream stream = App.class.getClassLoader().getResourceAsStream("config.properties")){
            properties.load(stream);
            for (Map.Entry<Object, Object> property: properties.entrySet()) {
                System.out.println("property: " + property);
                System.out.println("my name is Oleg");
                System.out.println("I'm Sergey");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
