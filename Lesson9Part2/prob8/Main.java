package Lesson9Part2.prob8;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

public class Main {
	List<OrderItem> orderItems = new ArrayList<>();
	public static void main(String[] args) {
		Main m = new Main();
		m.loadOrderItemData();
		System.out.println("Do any of these Order Items have an order of flowers? " + 
		   m.findProduct("Flowers"));
	}
	
	private Optional<Boolean> findProduct(String prodName) {
//		for(OrderItem item : orderItems) {
//			if(item != null) {
//				Product p=item.getProduct();
//				if(p != null) {
//					String name = p.getProductName();
//					if(name != null) {
//						if(name.equals(prodName)) return true;
//					}
//				}
//			}
//		}
//		return false;
		return findProductFunction.apply(orderItems,prodName);
	}
	//Function Written By Adnan Shehzad
	public BiFunction<List<OrderItem>,String, Optional<Boolean>> findProductFunction=(list, str)->
			Optional.of(list.stream() //stream<String>
					.map(p -> p.getProduct().getProductName())//stream <Product.product name>
					.anyMatch(pname -> pname.equals(str)));   //Matches the product name with the String product name

	private void loadOrderItemData() {
		orderItems.add(new OrderItem(new Product("1016", "Tools", 131.00), 3));
		orderItems.add(new OrderItem(new Product("1017", "Fishing Rod", 111.00), 1));
		orderItems.add(new OrderItem(new Product("1018", "Game of Go",66.00), 2));
		orderItems.add(new OrderItem(new Product("1019", "Flowers", 221.00), 5));
	}
}
