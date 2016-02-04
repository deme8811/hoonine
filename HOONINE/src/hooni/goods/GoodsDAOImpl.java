package hooni.goods;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GoodsDAOImpl implements GoodsDAO {
	@Autowired
	private SqlSessionFactory factory;

	public SqlSession getSession() {
		return factory.openSession();
	}

	public void close(SqlSession session) {
		session.close();
	}
}
