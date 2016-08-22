package com.taotao.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.taotao.pojo.TbItemCat;

public interface ItemCatService {
	public List<TbItemCat> getItemCatList(Long parentId);
}
