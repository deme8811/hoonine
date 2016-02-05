package hooni.cart;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;


public interface CartService {

	ArrayList<Cart> cartList();

	int cart(HttpSession session);

	void addCart(HttpSession session, Cart cart);

	

}
