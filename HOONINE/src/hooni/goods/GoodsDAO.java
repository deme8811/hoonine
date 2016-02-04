package hooni.goods;

import java.util.ArrayList;

public interface GoodsDAO {

	ArrayList<Goods> goodsList();

	int goodsInsert(Goods goods);

}
