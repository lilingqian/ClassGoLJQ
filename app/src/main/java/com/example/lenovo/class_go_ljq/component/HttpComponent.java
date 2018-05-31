package com.example.lenovo.class_go_ljq.component;


import com.example.lenovo.class_go_ljq.module.HttpModule;
import com.example.lenovo.class_go_ljq.ui.ClassifyFragment;

import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {

    void inject(ClassifyFragment classifyFragment);

}
