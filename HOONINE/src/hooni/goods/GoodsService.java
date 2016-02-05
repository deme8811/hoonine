package hooni.goods;

import java.util.ArrayList;

public interface GoodsService {

	ArrayList<Goods> goodsList(String category);
	
	ArrayList<Goods> c2GoodsList(String category2);
	
	int goodsInsert(Goods goods);

	Goods goodsDetail(String gId);

	void goodsUpdate(Goods goods);

	void goodsDelete(String gId);
	
	}
	
	
	

