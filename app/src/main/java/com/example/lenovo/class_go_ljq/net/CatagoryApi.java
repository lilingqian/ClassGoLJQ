package com.example.lenovo.class_go_ljq.net;

import com.example.lenovo.class_go_ljq.bean.CatagoryBean;

import io.reactivex.Observable;

public class CatagoryApi {

    private static  CatagoryApi catagoryApi;
     private CatagoryApiService catagoryApiService;


     public  CatagoryApi(CatagoryApiService catagoryApiService){

         this.catagoryApiService=catagoryApiService;
     }

     public  static CatagoryApi getCatagoryApi(CatagoryApiService catagoryApiService){

         if(catagoryApi==null){

              catagoryApi = new CatagoryApi(catagoryApiService);

         }
         return catagoryApi;

     }

     public Observable<CatagoryBean> getCatagory(){
         return catagoryApiService.getCatagory();
     }
}
