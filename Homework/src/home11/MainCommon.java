package home11;

import java.util.ArrayList;
import java.util.List;

public class MainCommon {
	
//	FunctionCommodity functionCommodity;
//	
//	public MainCommon(){
//		functionCommodity=new FunctionCommodity();
//		List<Commodity> commodities = new ArrayList<>();
//		functionCommodity.menuAll(commodities);
//	}
	

	public static void main(String[] args) {
//		new MainCommon();

		FunctionCommodity f=new FunctionCommodity();
		List<Commodity> commodities = new ArrayList<>();
		commodities.add(new Commodity("Girnjak", "Dypa", 125, 2016));
		commodities.add(new Commodity("Bayron", "Zbirka", 225, 1880));
		
		f.menuAll(commodities);
		
		

	}

}
