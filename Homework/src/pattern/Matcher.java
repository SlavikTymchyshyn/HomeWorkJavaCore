package pattern;

import java.util.regex.Pattern;

public class Matcher{
	
	public static void main(String[] args) {

//	String regexp = "^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$";
//	String url = "http://habrahabr.ru/post/260767/";
//	Pattern pattern = Pattern.compile(regexp);
//	java.util.regex.Matcher matcher = pattern.matcher(url);

	
//	Pattern pat;
//	java.util.regex.Matcher mat;
//	boolean found;
//	
//	pat=Pattern.compile("Java");
//	mat=pat.matcher ("Java");
//	found = mat.matches();// ��������� �� ����������
//	System.out.println( "�po�ep�a ���������� Java � Java:");
//	if (found) {System.out.println("Co��a�ae�");}
//	else {System.out.println("He ���������");}
//	System.out.println();
//	System.out.println( "�po�ep�a ���������� Java � Java 8:");
//	mat = pat.matcher("Java 8"); // ������� ����� �������������
//									// � ��������
//	found = mat.matches();// ��������� �� ����������
//	if (found) {System.out.println("Co��a�ae�");}
//	else {System.out.println("He ���������");
//	}
		
		String regex="Test";
		Pattern pat=Pattern.compile(regex);
		java.util.regex.Matcher mat=pat.matcher("Test 1 2 3 Test");
		
		while(mat.find()){
			System.out.println("������������������ ���������� � ��������: "+mat.start()+" ����o�-"+mat.group());
		}
	
	
	
	
	
	
	
	
	}
}