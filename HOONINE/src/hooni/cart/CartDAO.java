package hooni.cart;

import java.util.ArrayList;

public interface CartDAO {

	ArrayList<Cart> cartList(String userId);

	void addCart(Cart cart);

	void deleteCart(Cart cart);

	void addCartByCheckbox(ArrayList<Cart> cartList);

}
