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
	public ArrayList<Cart> cartList(String userId) {
		ArrayList<Cart> list = cdao.cartList(userId);
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
	public int addCart(Cart cart) {
		ArrayList<Cart> cartList = cdao.cartList(cart.getUserId());
		Goods goods = gdao.goodsDetail(cart.getgId());

		if (goods.getgCount() < 1) {
			return 0;
		} else {
			for (Cart dbCart : cartList) {
				if (dbCart.getgId() == cart.getgId()) {
					cart.setCount(dbCart.getCount() + 1);
				} else {
					cart.setCount(1);
				}
			}
			cdao.addCart(cart);
		}
		return 1;
	}

	@Override
	public void deleteCart(Cart cart) {
		cdao.deleteCart(cart);

	}

	@Override
	public void deleteCartByCheckbox(String userId, int[] gIds) {

	}

	@Override
	public void addCartByCheckbox(String userId, int[] gIds) {
		ArrayList<Cart> cartList = new ArrayList<Cart>();
		ArrayList<Cart> dbCartList = cdao.cartList(userId);

		for (int gId : gIds) {
			Goods goods = gdao.goodsDetail(gId);
			if (goods.getgCount() < 1) {
				continue;
			} else {
				for (Cart cart : dbCartList) {
					if (cart.getgId() == goods.getgId()) {
						cartList.add(new Cart(userId, gId, goods.getgPrice(), goods.getgName(), cart.getCount()+1, goods.getGsUrl()));
					} else {
						cartList.add(new Cart(userId, gId, goods.getgPrice(), goods.getgName(), 1, goods.getGsUrl()));
					}
				}
			}
		}
	cdao.addCartByCheckbox(cartList);
	}

}