package pc.procesors;

import pc.Procesors;
import pc.TextReader;
import pc.TextReaderArr;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class I5 implements Procesors {
    public String getName() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("I5.txt");
        return data.get(0);
    }
    public String getClock() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("I5.txt");
        return data.get(1);
    }
    public String getGeneration() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("I5.txt");
        return data.get(2);
    }
}
