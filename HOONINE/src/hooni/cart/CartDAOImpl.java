package hooni.cart;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAOImpl implements CartDAO {
	@Autowired
	private SqlSessionFactory factory;

	public SqlSession getSession() {
		return factory.openSession();
	}

	public void close(SqlSession session) {
		session.close();
	}

	@Override
	public ArrayList<Cart> cartList(String userId) {
		SqlSession session = getSession();
		List<Cart> list = session.selectList("hooni.cartList", userId);
		close(session);

		return (ArrayList<Cart>) list;
	}

	@Override
	public void addCart(Cart cart) {
		SqlSession session = getSession();
		session.insert("hooni.addCart", cart);
		close(session);

	}

	@Override
	public void deleteCart(Cart cart) {
		SqlSession session = getSession();
		session.delete("hooni.deleteCart", cart);
		close(session);
	}

	@Override
	public void addCartByCheckbox(ArrayList<Cart> cartList) {
		SqlSession session = getSession();
		for (Cart cart : cartList) {
			session.insert("hooni.addCartByCheckbox", cart);
		}
		close(session);
	}
}
