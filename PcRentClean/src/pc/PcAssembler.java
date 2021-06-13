package pc;

import java.io.File;
import java.io.FileNotFoundException;

public class PcAssembler implements PC {
    public Procesors procesors;

    public PcAssembler(Procesors procesors) {
        this.procesors = procesors;
    }


    public String getModel() throws FileNotFoundException{
       return procesors.getName();
    }
    public String getClock() throws FileNotFoundException{
        return procesors.getClock();
    }
    public String getGeneration() throws FileNotFoundException{
        return procesors.getGeneration();
    }
}
