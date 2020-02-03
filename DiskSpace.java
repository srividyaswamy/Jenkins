import java.io.*; 
  
public class DiskSpace 
{ 
    public static void main(String[] args) 
    { 
        double size =  
              new File("/home/ubuntu").getUsableSpace() / (1024.0 * 1024 * 1024); 
        System.out.printf( "%.3f GB\n", size);     
    } 
} 
