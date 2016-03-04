package homeSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class Main {

	public static void main(String[] args) throws SQLException {
		Connection conn;
		conn=DriverManager.getConnection("jdbc:mysql://localhost/myBD", "root", "fleshnfs01");
		
		Statement statement = conn.createStatement();
//		statement.execute("create table if not exists `buy`"
//				+ " (`customers_id` int, `id_tovar` int, `amount` int,`dateBuy` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP)");

//		statement.execute("create table if not exists `tovar`"
//				+ " (`id_tovar` int auto_increment primary key,`id_category` int,`id_vyrobnyk` int,`model_name` varchar(40),"
//				+ " `detail_id` int,`price` double(7,2), `amountSklad` int)"); 

//		statement.execute("create table if not exists `customers`(`customers_id` int auto_increment primary key,`name_id`int,`family_id`int)");

//		statement.execute("create table if not exists `named`(`name_id` int auto_increment primary key,`named` varchar(20))");
//		statement.execute("create table if not exists `family`(`family_id` int auto_increment primary key,`family` varchar(20))");
//	
//		statement.execute("create table if not exists `detail`(`detail_id` int auto_increment primary key,`detail` text)");
//		
//		statement.execute("create table if not exists `Category`(`id_Category` int auto_increment primary key,`Category` varchar(40))");
		
//		statement.execute("drop table if exists `Category`");
	
//		statement.execute("create table if not exists `vyrobnyk`(`id_vyrobnyk` int auto_increment primary key,"
//				+ "`vyrobnyk` varchar(30),`id_Location` int)");
//		
//		statement.execute("create table if not exists `Location`(`id_Location` int auto_increment primary key,"
//				+ " `id_adress` int,  `id_phone` int, `id_site` int, `id_kraina` int)");
//	
//		statement.execute("create table if not exists `adress`(`id_adress` int auto_increment primary key, `adress` varchar(100))");
//	
//		statement.execute("create table if not exists `phone`(`id_phone` int auto_increment primary key, `phone` varchar(45))");
//	
//		statement.execute("create table if not exists `site`(`id_site` int auto_increment primary key, `site` varchar(60))");
//	
//		statement.execute("create table if not exists `country`(`id_kraina` int auto_increment primary key, `name_Country` varchar(20))");
	
		//���������� ����� ���������� ������� �� ���� ������
//		PreparedStatement ps = conn.prepareStatement("insert into `country`(`country_name`) values(?)");
//		ps.setString(1,"ͳ��������");
//		ps.execute();		//����� ���� ��������� ����� �� ������, ������ ����� ������ ����� ���
//		ps.setString(1,"������");  	//����� ��� ������� ��� ��� ���� ��������� �� ���� ����� � ��������� ����� ��������� ������� ���� �� ������  //JDBC -java dataBase connection ������ �� Hibernate � ���� ��������������� � android
//		ps.execute();		//����� ���� ��������� ����� �� ������, ������ ����� ������ ����� ���
//		ps.setString(1,"�����");  	
//		ps.execute();		//����� ���� ��������� ����� �� ������, ������ ����� ������ ����� ���
//		ps.setString(1,"������");  	
//		ps.execute();		//����� ���� ��������� ����� �� ������, ������ ����� ������ ����� ���
//		ps.setString(1,"���");  	
//		ps.execute();		//����� ���� ��������� ����� �� ������, ������ ����� ������ ����� ���
//		ps.setString(1,"�����");  	
//		ps.execute();		//����� ���� ��������� ����� �� ������, ������ ����� ������ ����� ���
//		ps.setString(1,"�����");  	
//		ps.execute();		//����� ���� ��������� ����� �� ������, ������ ����� ������ ����� ���
//		ps.setString(1,"�����");  	
//		ps.execute();		//����� ���� ��������� ����� �� ������, ������ ����� ������ ����� ���
			
//		statement.execute("drop table if exists `family`");
//		statement.execute("drop table if exists `named`");
//		statement.execute("drop table if exists `category`");
//		statement.execute("drop table if exists `country`");
		
		
		PreparedStatement ps = conn.prepareStatement("select * from myBD");
		
		//������� ����� ���������� ������� ����� ������� ��������
		ps.addBatch("insert into `country`(`country_name`) values('ͳ��������'), ('�����'), ('������'),"
				+ " ('���'), ('�����'),('�����'), ('�����'), ('������')");
		ps.addBatch("insert into `family`(`surname`) values('ѳ����'), ('������'),('�������'),"
				+ "('��������'),('������')");
		ps.addBatch("insert into `named`(`firstname`) values('������'), ('������'),('�������'),('�����'),"
				+ "('�������'),('������'),('�����������'),('�������'),('������'),('������'),('����'),"
				+ "('������'),('�����'),('������')");
		ps.addBatch("insert into `category`(`category_name`) values('HDD'), ('SDD'), ('ODD'), ('CPUs'),"
				+ " ('MotherBoards'), ('Memory_Modules'), ('Videocards'), ('Monitors'), ('SoundCards'),"
				+ " ('PowerSupply'), ('UPS'), ('Cases'), ('NetworkCards')");
		ps.executeBatch();		
				
				
				
//				PreparedStatement ps2 = conn.prepareStatement("select * from `country`"); //��������� ������ ������ ��i� �����i�
//		ResultSet resSet = ps2.executeQuery();	//����������� ���������� � �������� resSet
//		while(resSet.next()){		//��� ���������� ���� �� �������� ������� ���� ���� �
//			int id=resSet.getInt(1);// � ������ �� ����� ��������� sql ���� � 1
//			String name_Country=resSet.getString(2);
//			
//			System.out.println(id+" "+name_Country);
//		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
