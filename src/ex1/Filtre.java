package ex1;
import java.io.File;

import java.io.*;

class Filtre implements FilenameFilter {
    private char lettre;

    public Filtre(char lettreDebut) {
        lettre = lettreDebut;
    }

    public boolean accept(File repFiltre, String nom) {
        return nom.startsWith(String.valueOf(lettre));
    }
}
