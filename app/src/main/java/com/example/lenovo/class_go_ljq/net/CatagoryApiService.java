package com.example.lenovo.class_go_ljq.net;

import com.example.lenovo.class_go_ljq.bean.CatagoryBean;

import io.reactivex.Observable;
import retrofit2.http.GET;


public interface CatagoryApiService {

    @GET("product/getCatagory")
    Observable<CatagoryBean> getCatagory();

}
