package hooni.cart;

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

	private void close(SqlSession session) {
		session.close();
	}
}
