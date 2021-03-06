package cn.meilituibian.api.service;

import cn.meilituibian.api.domain.Product;
import cn.meilituibian.api.mapper.ProductMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public Page<Product> list(int pageNo, int pageSize){
        PageHelper.startPage(pageNo, pageSize);
        return productMapper.list();
    }

    public Product getProductById(Long id) {
        return productMapper.getProductById(id);
    }

    public int getQuantityById(Long id) {
        return productMapper.getQuantityById(id);
    }

    public void substractStock(Long id, int quantity) {

    }
}
