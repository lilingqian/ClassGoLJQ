package com.example.lenovo.class_go_ljq.ui.base;


//basepresenter 抽取p层页面

public class BasePresenter<T extends BaseContract.BaseView> implements BaseContract.BasePresenter<T> {


    //子类可以调用 view   protected关键字 表示保护类型字段；
    protected T mView;

    //绑定
    @Override
    public void attchView(T view) {

        this.mView = view;


    }

    //解绑
    @Override
    public void detachView() {
        if (mView != null) {
            mView = null;
        }
    }
}
