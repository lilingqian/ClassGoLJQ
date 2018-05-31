package com.example.lenovo.class_go_ljq.net;

import com.example.lenovo.class_go_ljq.bean.ProductCatagoryBean;

import io.reactivex.Observable;

public class ProductCatagoryApi {

    private static  ProductCatagoryApi productCatagoryApi;
    private ProductCatagoryApiService productCatagoryApiService;

    public ProductCatagoryApi(ProductCatagoryApiService productCatagoryApiService){
        this.productCatagoryApiService=productCatagoryApiService;
    }

    public  static  ProductCatagoryApi getProductCatagoryApi(ProductCatagoryApiService productCatagoryApiService){

        if (productCatagoryApi==null){

            productCatagoryApi=new ProductCatagoryApi(productCatagoryApiService);

        }
        return  productCatagoryApi;

    }

    public Observable<ProductCatagoryBean> getProductCatagory(String cid){
        return productCatagoryApiService.getProductCatagory(cid);

    }
}
