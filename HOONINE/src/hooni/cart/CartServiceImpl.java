package hooni.cart;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hooni.goods.Goods;
import hooni.goods.GoodsDAO;
import hooni.user.UserDAO;

@Service
@Transactional
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDAO cdao;
	private UserDAO udao;
	private GoodsDAO gdao;

	@Override
	public ArrayList<Cart> cartList() {
		ArrayList<Cart> list = cdao.cartList();
		return list;
	}

	@Override
	public int cart(HttpSession session) {

		@SuppressWarnings("unchecked")
		ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cartList");

		if (cartList == null) {
			return -1;
		}

		int totalMoney = 0;
		int money = 0;

		for (int i = 0; i < cartList.size(); i++) {
			money = cartList.get(i).getgPrice() * cartList.get(i).getCount();
			totalMoney += money;
		}

		return totalMoney;
	}

	@Override
	public void addCart(Cart cart, Goods goods) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	
	
}