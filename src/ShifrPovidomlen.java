import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ShifrPovidomlen 
{
	public static void main(String[] args) 
	{
		System.out.print("--->");
		Scanner skan = new Scanner(System.in);
		
		String fileName = "D:\\WhoAmI1100010\\ShifrPovidomlen/��������.txt";
		
		String text = skan.nextLine();
		String newtext = "";
		
		System.out.println("'1' - ���������");
		System.out.println("'2' - English");
		System.out.print("������ ���� ��������� : ");
		String mova = skan.nextLine();
		
		if(mova.equals("1"))
		{
			newtext = Ukr_Eng(text, newtext);		
		}	
		else if(mova.equals("2"))
		{
			newtext = Eng_Ukr(text, newtext);
		}
		else
		{
			System.out.println("������������ ���!");
		}
		Save(fileName,newtext);
	}
	
	public static void Save(String fileName, String newtext) {
	    //���������� ����
	    File file = new File(fileName);
	 
	    try {
	        //���������, ��� ���� ���� �� ���������� �� ������� ���
	        if(!file.exists()){
	            file.createNewFile();
	        }
	 
	        //PrintWriter ��������� ����������� ������ � ����
	        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
	 
	        try {
	            //���������� ����� � ����
	            out.print(newtext);
	        } finally {
	            //����� ���� �� ������ ������� ����
	            //����� ���� �� ���������
	            out.close();
	        }
	    } catch(IOException e) {
	        throw new RuntimeException(e);
	    }
	}
	
	public static String Ukr_Eng(String text, String newtext)
	{
		System.out.println(newtext = text.replace('�','q').replace('�','w')
				.replace('�','e').replace('�','r')
				.replace('�','t').replace('�','y')
				.replace('�','u').replace('�','i')
				.replace('�','o').replace('�','p')
				.replace('�','[').replace('�',']')
				.replace('�','a').replace('�','s')
				.replace('�','d').replace('�','f')
				.replace('�','g').replace('�','h')
				.replace('�','j').replace('�','k')
				.replace('�','l').replace('�',';')
				.replaceAll("�","'").replace('�','z')
				.replace('�','x').replace('�','c')
				.replace('�','v').replace('�','b')
				.replace('�','n').replace('�','m')
				.replace('�',',').replace('�','.'));
		return newtext;
	}
	
	public static String Eng_Ukr(String text, String newtext)
	{
		System.out.println(newtext = text.replace('q','�').replace('w','�')
				.replace('e','�').replace('r','�')
				.replace('t','�').replace('y','�')
				.replace('u','�').replace('i','�')
				.replace('o','�').replace('p','�')
				.replace('[','�').replace(']','�')
				.replace('a','�').replace('s','�')
				.replace('d','�').replace('f','�')
				.replace('g','�').replace('h','�')
				.replace('j','�').replace('k','�')
				.replace('l','�').replace(';','�')
				.replaceAll("'","�").replace('z','�')
				.replace('x','�').replace('c','�')
				.replace('v','�').replace('b','�')
				.replace('n','�').replace('m','�')
				.replace(',','�').replace('.','�'));
		return newtext;
	}
}

