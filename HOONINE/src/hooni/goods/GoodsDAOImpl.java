package hooni.goods;

import java.util.ArrayList;
import java.util.List;

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

	//============================================  goodsList
	
	@Override
	public ArrayList<Goods> goodsList() {
		
		SqlSession session = getSession();
		List<Goods> list = session.selectList("goods.goodsList");
		
		close(session);
		
		return (ArrayList<Goods>) list;
	}

	//============================================ goodsInsert
	
	@Override
	public int goodsInsert(Goods goods) {
		
		SqlSession session = getSession();
		int msg = session.insert("goods.goodsInsert", goods);
		
		return msg;
	}

	//============================================ goodsDetail
	
	@Override
	public Goods goodsDetail(int gId) {

		SqlSession session = getSession();
		Goods goods = session.selectOne("user.detail", gId);
		
		close(session);
		
		return goods;
	}

	//============================================ goodsUpdate
	
	@Override
	public void goodsUpdate(Goods goods) {
		
		SqlSession session = getSession();
		
		session.update("goods.goodsUpdate", goods);
		
		close(session);
		
	}
	
	//============================================ goodsDelete

	@Override
	public void goodsDelete(String gId) {
		
		SqlSession session = getSession();
		session.delete("goods.goodsDelete", gId);
		
		close(session);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
