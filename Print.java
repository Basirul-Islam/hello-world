package textmanipulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Print {
    
    FileOutputStream fout=null;
    FileInputStream fin = null;
    public static ArrayList arraylist = new ArrayList();
    public static void filter(String msg){
        char[] stringToCharArray = msg.toCharArray();
       
        for(int i =0;i<msg.length();i++){
            if(stringToCharArray[i]=='('){
                String var=""; 
                while(true){
                  i++;
                 
                  if(stringToCharArray[i]==')'){
                        arraylist.add(var);
                        var = "";
                        break;
                    }
                   if(!(stringToCharArray[i]=='(' || stringToCharArray[i]==')'))
                       
                   var = var + stringToCharArray[i];
                }   
                
            }
        }
    }/*
     public static void main(String[] args) throws FileNotFoundException, IOException {
         System.out.println("Enter the text");
         Scanner sc = new Scanner(System.in);
         String msg = sc.nextLine();
         filter(msg);
         
             System.out.println("   "+arraylist.toString());
         
         
     }
    */
    /*
    
    public void print(String msg) throws FileNotFoundException, IOException
    {
        int tmp;
        String addit = "";
        fin = new FileInputStream(new File("main.c"));

        while(fin.available()!=0)
        {
            tmp = fin.read();
            addit = addit+(char)tmp;
        }




        String print = "printf(" + '"' + msg + '"' + ");\n" ;
        char additara[] = new char[addit.length()+print.length()+10];
        int pos = addit.indexOf("return 0;");

        for(int i=0; i<pos; i++) additara[i] = addit.charAt(i);
        for(int i=pos,j=0; i<print.length()+pos; i++,j++) additara[i] = print.charAt(j);
        for(int i=print.length()+pos+1,j=pos; j<addit.length(); i++,j++) additara[i] = addit.charAt(j);

        String finaladdit = "";
        for(int i=0; i<additara.length; i++) finaladdit = finaladdit + additara[i];

        char finalfinal[] = finaladdit.toCharArray();

        fout.close();
        fout = new FileOutputStream(new File("main.c"));

        for(int i=0; i<finalfinal.length; i++)
        {
            fout.write(finalfinal[i]);
        }

    }
  */  
}

    
