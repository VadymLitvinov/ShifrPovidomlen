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
		
		String fileName = "D:\\WhoAmI1100010\\ShifrPovidomlen/Переклад.txt";
		
		String text = skan.nextLine();
		String newtext = "";
		
		System.out.println("'1' - Українська");
		System.out.println("'2' - English");
		System.out.print("Вкажіть мову написання : ");
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
			System.out.println("Неправильний ввід!");
		}
		Save(fileName,newtext);
	}
	
	public static void Save(String fileName, String newtext) {
	    //Определяем файл
	    File file = new File(fileName);
	 
	    try {
	        //проверяем, что если файл не существует то создаем его
	        if(!file.exists()){
	            file.createNewFile();
	        }
	 
	        //PrintWriter обеспечит возможности записи в файл
	        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
	 
	        try {
	            //Записываем текст у файл
	            out.print(newtext);
	        } finally {
	            //После чего мы должны закрыть файл
	            //Иначе файл не запишется
	            out.close();
	        }
	    } catch(IOException e) {
	        throw new RuntimeException(e);
	    }
	}
	
	public static String Ukr_Eng(String text, String newtext)
	{
		System.out.println(newtext = text.replace('й','q').replace('ц','w')
				.replace('у','e').replace('к','r')
				.replace('е','t').replace('н','y')
				.replace('г','u').replace('ш','i')
				.replace('щ','o').replace('з','p')
				.replace('х','[').replace('ї',']')
				.replace('ф','a').replace('і','s')
				.replace('в','d').replace('а','f')
				.replace('п','g').replace('р','h')
				.replace('о','j').replace('л','k')
				.replace('д','l').replace('ж',';')
				.replaceAll("є","'").replace('я','z')
				.replace('ч','x').replace('с','c')
				.replace('м','v').replace('и','b')
				.replace('т','n').replace('ь','m')
				.replace('б',',').replace('ю','.'));
		return newtext;
	}
	
	public static String Eng_Ukr(String text, String newtext)
	{
		System.out.println(newtext = text.replace('q','й').replace('w','ц')
				.replace('e','у').replace('r','к')
				.replace('t','е').replace('y','н')
				.replace('u','г').replace('i','ш')
				.replace('o','щ').replace('p','з')
				.replace('[','х').replace(']','ї')
				.replace('a','ф').replace('s','і')
				.replace('d','в').replace('f','а')
				.replace('g','п').replace('h','р')
				.replace('j','о').replace('k','л')
				.replace('l','д').replace(';','ж')
				.replaceAll("'","є").replace('z','я')
				.replace('x','ч').replace('c','с')
				.replace('v','м').replace('b','и')
				.replace('n','т').replace('m','ь')
				.replace(',','б').replace('.','ю'));
		return newtext;
	}
}

