package drive;

import shop.Product;
import shop.ProductDAO;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDAO dao = new ProductDAO();
		Product product = new Product(7, "고래밥", "고래밥", 1500, 10);
		dao.updateProduct(product);
		System.out.println("수정완료");
	}

}
