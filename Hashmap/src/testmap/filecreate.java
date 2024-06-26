package testmap;

public class filecreate {
    public static void main(String[] args) {
    	
    	FileOutputStream fos =null;
    	File file;
    	String mycontent ="This is my Data which needs" +" to be written into the file";
    	
    	try {
    		file = new File("D:/myfile.txt");
    		fos = new FileOutputStream(file);
    		
    	}
    }
}
