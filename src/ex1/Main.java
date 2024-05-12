package ex1;
import java.io.*;
import static java.lang.System.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        out.println("Répertoire courant : "+System.getProperty("user.dir"));
        File rep = new File(".");
        out.println("Chemin relatif : "+rep.getPath());
        out.println("Chemin absolu : "+rep.getAbsolutePath());

        for (File élément : File.listRoots())
            out.println("Racine : "+élément);

        for (File élément : rep.listFiles()) {
            if (élément.isDirectory()) {
                out.print(élément.getName()+"\t");
                if (élément.getName().length()<8)
                    out.print("\t");
                out.println("<REP>");
            }
        }

		
		/*
		 * File[] subDirs = rep.listFiles(File::isDirectory);
		 * out.println("Liste des répertoires qui existent dans le répertoire courant:"
		 * ); for (File element : subDirs) { out.println(element.getName()); }
		 * 
		 * File[] files = rep.listFiles(File::isFile);
		 * out.println("Liste des fichiers qui existent dans le répertoire courant:");
		 * for (File element : files) { out.print(element.getName() + "\t"); if
		 * (element.getName().length() < 8) out.print("\t"); out.printf("%tc", new
		 * Date(element.lastModified())); out.printf("\t%10d octets\n",
		 * element.length()); }
		 * 
		 * // Affichage des répertoires qui commencent par la lettre 'b'
		 * out.println("Liste des répertoires qui commencent par la lettre 'b':");
		 * File[] bDirs = rep.listFiles(new Filtre('b')); for (File bDir : bDirs) {
		 * out.println(bDir.getName()); }
		 */


    }
}
