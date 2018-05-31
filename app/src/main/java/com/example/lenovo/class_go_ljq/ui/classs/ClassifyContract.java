package com.example.lenovo.class_go_ljq.ui.classs;

import com.example.lenovo.class_go_ljq.bean.CatagoryBean;
import com.example.lenovo.class_go_ljq.bean.ProductCatagoryBean;
import com.example.lenovo.class_go_ljq.ui.base.BaseContract;

public interface ClassifyContract  {

        interface  View extends BaseContract.BaseView{
            //获取子分类成功
            void getProductCatagorySuccess(ProductCatagoryBean productCatagoryBean);


            void getCatagorySuccess(CatagoryBean catagoryBean);

        }

        interface Presenter extends  BaseContract.BasePresenter<View>{
            //获取子分类成功
            void getProductCatagory(String cid);
            //京东超市
            void getCatagory();

        }
}
