package dwa;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class mian {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("D:\\1.txt"));   
        //��ȡ�õ�ַ�µ�input.txt�ļ�  
       
        PrintWriter out = new PrintWriter(new File("D:\\result.txt"));   
        //���������ļ�output.txt�������õ�ַ��  

        while(in.hasNext()){  
             String str = in.nextLine();   
             //���ж�ȡ���������з�ֹͣ������ȡ�������ݸ�ֵ��str��
       
             //���ã����ı��еĿո�ȥ����������������css���룬�����еĿո�Ǳ�Ҫ���ʿ�ȥ��
       
             String []ss = str.split("��");//����ָ���ַ����ַ����ָ�����ָ����ַ�������������
             for(String s:ss)
                  out.write(s+"\r\n");//�����ַ�������ϡ�}���ͻ��з�������ı�
        }  
        in.close();
        out.close();
        
        Scanner in1 = new Scanner(new File("D:\\result.txt")); 
        PrintWriter out1 = new PrintWriter(new File("D:\\1.txt"));
        while(in1.hasNext()){  
            String str = in1.nextLine();   
            //���ж�ȡ���������з�ֹͣ������ȡ�������ݸ�ֵ��str��
      
            //���ã����ı��еĿո�ȥ����������������css���룬�����еĿո�Ǳ�Ҫ���ʿ�ȥ��
      
            String []ss = str.split("��");//����ָ���ַ����ַ����ָ�����ָ����ַ�������������
            for(String s:ss)
                 out1.write(s+"\r\n");//�����ַ�������ϡ�}���ͻ��з�������ı�
       }  
        in1.close();
        out1.close(); //�ر�д����ı�  
        
        Scanner in2 = new Scanner(new File("D:\\1.txt")); 
        PrintWriter out2 = new PrintWriter(new File("D:\\result.txt"));
        while(in2.hasNext()){  
            String str = in2.nextLine();   
            //���ж�ȡ���������з�ֹͣ������ȡ�������ݸ�ֵ��str��
      
            //���ã����ı��еĿո�ȥ����������������css���룬�����еĿո�Ǳ�Ҫ���ʿ�ȥ��
      
            String []ss = str.split("��");//����ָ���ַ����ַ����ָ�����ָ����ַ�������������
            for(String s:ss)
                 out2.write(s+"\r\n");//�����ַ�������ϡ�}���ͻ��з�������ı�
       }  
        in2.close();
        out2.close(); //�ر�д����ı�  
        
        Scanner in3 = new Scanner(new File("D:\\result.txt")); 
        PrintWriter out3 = new PrintWriter(new File("D:\\1.txt"));
        while(in3.hasNext()){  
            String str = in3.nextLine();   
            //���ж�ȡ���������з�ֹͣ������ȡ�������ݸ�ֵ��str��
      
            //���ã����ı��еĿո�ȥ����������������css���룬�����еĿո�Ǳ�Ҫ���ʿ�ȥ��
      
            String []ss = str.split("��");//����ָ���ַ����ַ����ָ�����ָ����ַ�������������
            for(String s:ss)
                 out3.write(s+"\r\n");//�����ַ�������ϡ�}���ͻ��з�������ı�
       }  
        in3.close();
        out3.close(); //�ر�д����ı�  
        System.out.println("��ϣ�");
    }
}