package hooni.user;

import java.util.ArrayList;
import java.util.List;

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

	public void close(SqlSession session) {
		session.close();
	}

	@Override
	public int userJoin(User user) {
	 SqlSession session = getSession();
	 int msg = session.insert("hooni.userJoin", user);
	 close(session);
	 return msg;
	}

	@Override
	public User userDetail(String userId) {
		
		SqlSession session = getSession();
		User user = session.selectOne("hooni.userDetail", userId);
		
		close(session);
		return user;
	}

	@Override
	public ArrayList<User> userLsit() {
		// TODO Auto-generated method stub
		SqlSession session = getSession();
		List<User> list = session.selectList("hooni.userList");
		close(session);
		return (ArrayList<User>) list;
	}
	
}
