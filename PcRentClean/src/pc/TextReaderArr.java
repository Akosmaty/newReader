package pc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextReaderArr {



    public ArrayList<String> getTextOut(String textIn) throws FileNotFoundException {

        File tekst = new File(textIn);
        Scanner snak = new Scanner(tekst);

        ArrayList<String> print = new ArrayList<String>();
        for (int i=0;i<4;i++) {
            print.add(snak.nextLine());
        }









        return print;
    }


}



