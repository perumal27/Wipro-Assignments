package testmap;

public class filereader {
	public static void main(String[] args)
	{
	try{    
        FileWriter fw=new FileWriter("/Users/ashujauhari/a.txt");    
        fw.write("Welcome to IT.");    
        fw.close();    
        }catch(Exception e){System.out.println(e);}    
        System.out.println("Success...");
       
       
       
       
        //FileReader fr=new FileReader("D:\\testout.txt");
        FileReader fr=new FileReader("/Users/ashujauhari/a.txt");
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();   
  }    
}
