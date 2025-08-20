package FileHandeling;
import java.io.*;

public class FileHandeling {
    public static void main(String[] args) {
        // try(InputStreamReader isr = new InputStreamReader(System.in)){
        //     System.out.print("Enter some letters");
        //   int  letters = isr.read();
        //   while(isr.ready()){
        //     System.out.println((char)letters);
        //     letters = isr.read();
        //   }
        //   System.out.println();
        // }
        // catch(IOException e){
        //     System.out.println(e.getMessage());
        // }
           try(FileReader fr = new FileReader("FileHandeling/note.txt")){
          int  letters = fr.read();
          while(fr.ready()){
            System.out.println((char)letters);
            letters = fr.read();
          }
          System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        try( BufferedReader br =  new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You typed: "+ br.readLine());
        } catch (IOException e) {
                     System.out.println(e.getMessage());

        }
        OutputStream os = System.out;
        System.out.println();
        try(OutputStreamWriter osw =new OutputStreamWriter(System.out)){
            osw.write("Hello world");
            osw.write('\n');
            osw.write(97);
            osw.write('\n');
            char[] arr = "Helo world".toCharArray();
            osw.write(arr);
            osw.write("😂");
            osw.flush();

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
