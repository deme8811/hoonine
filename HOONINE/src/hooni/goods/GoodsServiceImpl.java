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
	

	@Override
	public ArrayList<Goods> goodsList() {
		
		return dao.goodsList();
	}

}
