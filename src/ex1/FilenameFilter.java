package ex1;
import java.io.File;

public interface FilenameFilter {
	
	public boolean accept(File repFiltre, String nom);
}
