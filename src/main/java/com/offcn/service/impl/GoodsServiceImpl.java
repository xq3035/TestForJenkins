package com.offcn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.offcn.mapper.GoodsDAO;
import com.offcn.po.Goods;
import com.offcn.service.GoodsService;

/**
 * ��Ʒҵ��ʵ��
 * 
 */
// �Զ���ӵ�Spring������
@Service
public class GoodsServiceImpl implements GoodsService {

	// �Զ�װ��
	@Resource
	GoodsDAO goodsdao;

	// ��ҳ
	@Override
	public List<Goods> getGoodsPager(int pageNO, int size) {
		int skip = (pageNO - 1) * size;
		return goodsdao.getGoodsPager(skip, size);
		//�ж�Redis�����Ƿ����
		//1��������治���ڣ����Ǵ����ݿ��ȡ���ݣ��Ѷ�ȡ�������ݻ��浽redis
		
		//2�����������ڣ�ֱ�Ӵӻ����ȡ����

	}

	// ��õ�����Ʒ����
	@Override
	public Goods getGoodsById(int id) {
		return goodsdao.getGoodsById(id);
	}

	// �����Ʒ����
	@Override
	public int getGoodsCount() {
		return goodsdao.getGoodsCount();
	}

	// ���
	@Override
	public int insert(Goods entity) {
		
		return goodsdao.insert(entity);
	}

	// ɾ������
	@Override
	public int delete(int id) {
		
		return goodsdao.delete(id);
	}

	// ɾ�����
	@Override
	public int deletes(int[] ids) {
		int rows = 0;
		for (int id : ids) {
			rows += delete(id);
		}
		return rows;
	}

	// ����
	@Override
	public int update(Goods entity) {
		
		return goodsdao.update(entity);
	}

}
