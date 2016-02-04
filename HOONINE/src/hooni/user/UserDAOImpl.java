package hooni.user;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SqlSessionFactory factory;

	public SqlSession getSession() {
		return factory.openSession();
	}

	private void close(SqlSession session) {
		session.close();
	}
}
