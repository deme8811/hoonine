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
	public ArrayList<Cart> cartList() {
		SqlSession session = getSession();
		
		List<Cart> list = session.selectList("hooni.cartList");
		close(session);
		
		return (ArrayList<Cart>) list;
	}
}
