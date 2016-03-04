package snake;

import java.util.Scanner;

public class Snake extends Field{
		
	@Override
	public void moveSnake(){
		String sw=null;
		int x=10;int y=10;
		do{
			System.out.println("enter direction (wasd):");
		sw=typeString();
		switch(sw){
		case "w":{System.out.println(fielD(x, --y));break;}
		case "a":{System.out.println(fielD(--x, y));break;}
		case "s":{System.out.println(fielD(x, ++y));break;}
		case "d":{System.out.println(fielD(++x, y));break;}
		}
		}while(true);
	}
	
	public int randMass(){
		return (int)(Math.random()*18+2);
	}
	
	@Override
	public String[][] fielD(int x, int y) {
		String[][]field=new String[20][20];
		for(int i=0;i<field.length;i++){
			for(int j=0;j<field[i].length;j++){
				if(i==(y)&&j==(x)){field[i][j]="o";}
				else if(y+1==field.length||x+2==field[i].length){field[i][j]="";System.out.println("GameOver");System.exit(0);}
				else if(y==0||x==0){field[i][j]="";System.out.println("GameOver");System.exit(0);}
				else if(i==0||j==0){field[i][j]="*";}
				else if(i==(field.length-1)){field[i][j]="*";}
				else if(j==(field[i].length-1)){field[i][j]="*";}
				else {field[i][j]=" ";}

				while(i==randMass()&&j==randMass()){field[i][j]="O";
					if(x==randMass()&&(y-1)==randMass()){--y;field[x][y]="o";}
					else if(x==randMass()&&(y+1)==randMass()){++y;field[x][y]="o";}
					else if(y==randMass()&&(x-1)==randMass()){--x;field[x][y]="o";}
					else if(y==randMass()&&(x+1)==randMass()){++x;field[x][y]="o";}
					else{field[i][j]="O";}
								
				}
				System.out.print(" "+field[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(field);
		return field;
	}

	@Override
	public int typeInt() {
		Integer i=0;
		String s=null;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		try{
					i=Integer.parseInt(s);	
		}catch(NumberFormatException e){System.out.println("enter int number");}
		return i;
	}
	
	
	

	
	
	
	
	
}