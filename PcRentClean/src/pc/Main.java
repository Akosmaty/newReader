package pc;

import pc.procesors.I3;
import pc.procesors.I5;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {



        PC nowyKomp = new PcAssembler(new I5());
        System.out.println(nowyKomp.getModel());
        System.out.println(nowyKomp.getClock());
        System.out.println(nowyKomp.getGeneration());
        System.out.println(nowyKomp.getPrice());

    }






}


