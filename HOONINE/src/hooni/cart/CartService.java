package hooni.cart;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

public interface CartService {

	ArrayList<Cart> cartList(String userId);

	int cart(HttpSession session);

	int addCart(Cart cart);

	void deleteCart(Cart cart);

	void deleteCartByCheckbox(String userId, int[] gIds);

	void addCartByCheckbox(String userId, int[] gIds);

}
