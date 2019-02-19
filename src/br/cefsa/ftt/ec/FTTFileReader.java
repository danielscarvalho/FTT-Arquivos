import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FTTFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path path = Paths.get("c:\\users\\pro14533\\Desktop\\jdados.tsv");
		    
		try {		    
		
				BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset()); 
		        String line = null;
		    
		        while ((line = reader.readLine()) != null) 		        			        
		            System.out.println(line);
		        
		    } catch(Exception e) {
		    	e.printStackTrace();
		    }		
		}
}
