


import java.util.Collection;
import java.util.LinkedList;

public class GroceryStoreApplication {
    static Collection<Fruit> goodsForSale= new LinkedList<Fruit>();
	public static void main(String[] args) {
		for(String nameOfFruit : args) {
			goodsForSale.add(Fruit.build(nameOfFruit));
		}
		System.out.println("Goods for Sale =" + goodsForSale.toString());
	}
}
