package com.chenm.gms.gmspro.service;

import com.chenm.gms.gmspro.domain.Items;
import com.chenm.gms.gmspro.exception.ProException;
import com.chenm.gms.gmspro.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired(required = false)
    private ProductMapper productMapper;

    @Override
    public boolean decrease(String itemId, int count) {
        Items param=new Items();
        param.setId(itemId);
        Items item=productMapper.selectOne(param);
        if(item!=null){
            int counts=item.getNum();
            if(counts<count){
                throw new ProException("商品id="+itemId+"不足");
            }else{
                item.setNum(counts-count);
                return productMapper.updateByPrimaryKey(item)>0;
            }
        }
        return false;
    }

}
