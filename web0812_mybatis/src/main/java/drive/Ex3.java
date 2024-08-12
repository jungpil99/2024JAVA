package drive;

import shop.Cart;
import shop.CartDAO;
import shop.CartProducts;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartDAO dao = new CartDAO();
		for(CartProducts cartProducts : dao.viewCart()) {
			System.out.println(cartProducts);
		}
	}

}
