package mysql1;

import java.util.List;

public class AmountAndMeasuringsystem {
	
	private Ingredient ingredient;
	
	private int amount;
	
	private Measuringsystem measuringsystem;
	
	private List<Receipt> receipts; //для того щоб не дублювались обєкти рецепт - треба додатково прописувати щоб обэкти там не дублювались
	//тут список рецептів по обкту відноситься до тих рецептів де присутній наприклад (440грам картошки)
}
