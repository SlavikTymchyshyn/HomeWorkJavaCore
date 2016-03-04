package systemF;

public class Example{

public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i < 40; i += 2) {
            String count = "%s%" + i + "d%n";//это передаётся в printf
            char star = '*';
            num *= 2;
            System.out.printf(count, star, num);
        }
    
//int spaces = 45;
//int d = 2016;
//System.out.printf(String.format("%%%ds%d", spaces, d), "");






	}
}