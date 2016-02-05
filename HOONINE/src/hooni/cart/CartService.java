package hooni.cart;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import hooni.goods.Goods;


public interface CartService {

	ArrayList<Cart> cartList();

	int cart(HttpSession session);

	void addCart(Cart cart, Goods goods);


}
