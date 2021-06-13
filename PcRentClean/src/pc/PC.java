package pc;

import java.io.FileNotFoundException;

public interface PC {
    public String getModel() throws FileNotFoundException;
    public String getClock() throws FileNotFoundException;
    public String getGeneration() throws FileNotFoundException;
    public String getPrice() throws FileNotFoundException;
}
