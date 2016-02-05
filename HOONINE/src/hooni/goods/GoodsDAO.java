package hooni.goods;

import java.util.ArrayList;

public interface GoodsDAO {

	ArrayList<Goods> goodsList();

	int goodsInsert(Goods goods);

	Goods goodsDetail(String gId);

	void goodsUpdate(Goods goods);

	void goodsDelete(String gId);

}
