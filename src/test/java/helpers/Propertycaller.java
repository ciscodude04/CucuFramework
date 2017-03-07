package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Cisco on 3/6/2017.
 */
public class Propertycaller {

    protected Properties prop = null;
    protected InputStream input = new FileInputStream("src/test/java/resources/Config.properties");

    public Propertycaller() throws IOException {
        prop = new Properties();
        prop.load(input);
    }

    public String gettestUrl() {
        return prop.getProperty("testurl");
    }

    public String getbrowser(){
        return prop.getProperty("browser");
    }
}
