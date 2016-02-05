package hooni.goods;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsDAO dao;
	
	
	//============================================ goodsList
	
	
	@Override
	public ArrayList<Goods> goodsList(String category) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public ArrayList<Goods> c2GoodsList(String category2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//============================================ goodsInsert

	
	@Override
	public int goodsInsert(Goods goods) {
		
		return dao.goodsInsert(goods);
	}

	
	
	
	//============================================
	
	

}
