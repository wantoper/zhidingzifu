package dwa;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class mian {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("D:\\1.txt"));   
        //读取该地址下的input.txt文件  
       
        PrintWriter out = new PrintWriter(new File("D:\\result.txt"));   
        //将处理后的文件output.txt创建到该地址下  

        while(in.hasNext()){  
             String str = in.nextLine();   
             //按行读取，遇到换行符停止。将读取到的内容赋值到str中
       
             //慎用！将文本中的空格去掉，本例操作的是css代码，单句中的空格非必要，故可去掉
       
             String []ss = str.split("。");//按照指定字符将字符串分割，并将分割后的字符串放入数组中
             for(String s:ss)
                  out.write(s+"\r\n");//在子字符串后加上‘}’和换行符并输出文本
        }  
        in.close();
        out.close();
        
        Scanner in1 = new Scanner(new File("D:\\result.txt")); 
        PrintWriter out1 = new PrintWriter(new File("D:\\1.txt"));
        while(in1.hasNext()){  
            String str = in1.nextLine();   
            //按行读取，遇到换行符停止。将读取到的内容赋值到str中
      
            //慎用！将文本中的空格去掉，本例操作的是css代码，单句中的空格非必要，故可去掉
      
            String []ss = str.split("，");//按照指定字符将字符串分割，并将分割后的字符串放入数组中
            for(String s:ss)
                 out1.write(s+"\r\n");//在子字符串后加上‘}’和换行符并输出文本
       }  
        in1.close();
        out1.close(); //关闭写入的文本  
        
        Scanner in2 = new Scanner(new File("D:\\1.txt")); 
        PrintWriter out2 = new PrintWriter(new File("D:\\result.txt"));
        while(in2.hasNext()){  
            String str = in2.nextLine();   
            //按行读取，遇到换行符停止。将读取到的内容赋值到str中
      
            //慎用！将文本中的空格去掉，本例操作的是css代码，单句中的空格非必要，故可去掉
      
            String []ss = str.split("、");//按照指定字符将字符串分割，并将分割后的字符串放入数组中
            for(String s:ss)
                 out2.write(s+"\r\n");//在子字符串后加上‘}’和换行符并输出文本
       }  
        in2.close();
        out2.close(); //关闭写入的文本  
        
        Scanner in3 = new Scanner(new File("D:\\result.txt")); 
        PrintWriter out3 = new PrintWriter(new File("D:\\1.txt"));
        while(in3.hasNext()){  
            String str = in3.nextLine();   
            //按行读取，遇到换行符停止。将读取到的内容赋值到str中
      
            //慎用！将文本中的空格去掉，本例操作的是css代码，单句中的空格非必要，故可去掉
      
            String []ss = str.split("：");//按照指定字符将字符串分割，并将分割后的字符串放入数组中
            for(String s:ss)
                 out3.write(s+"\r\n");//在子字符串后加上‘}’和换行符并输出文本
       }  
        in3.close();
        out3.close(); //关闭写入的文本  
        System.out.println("完毕！");
    }
}