package com.how2java.tmall.service;

import com.how2java.tmall.dao.ProductImageDA0;
import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.pojo.ProductImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImageService {
    public static final String type_single ="single";
    public static final String type_detail ="detail";

    @Autowired
    ProductImageDA0 productImageDA0;

    @Autowired
    ProductService productService;

    public void add(ProductImage bean){
        productImageDA0.save(bean);
    }
    public void delete(int id){
        productImageDA0.delete(id);
    }
    public ProductImage get(int id){
        return  productImageDA0.findOne(id);
    }
    public List<ProductImage> listSingleProductImages(Product product){
        return productImageDA0.findByProductAndTypeOrderByIdDesc(product,type_single);
    }
    public List<ProductImage> listDetailProductImages(Product product){
        return productImageDA0.findByProductAndTypeOrderByIdDesc(product,type_detail);
    }
    public void setFirstProdutImage(Product product) {
        List<ProductImage> singleImages = listSingleProductImages(product);
        if(!singleImages.isEmpty())
            product.setFirstProductImage(singleImages.get(0));
        else
            product.setFirstProductImage(new ProductImage()); //这样做是考虑到产品还没有来得及设置图片，但是在订单后台管理里查看订单项的对应产品图片。

    }
    public void setFirstProdutImages(List<Product> products) {
        for (Product product : products)
            setFirstProdutImage(product);
    }
}

