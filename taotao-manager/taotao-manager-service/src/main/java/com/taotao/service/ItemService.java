package com.taotao.service;

import com.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	TbItem getItemById(long itemId);
	
	EUDataGridResult getItemList(int page,int rows);
	
	void saveItem(TbItem item);
}
