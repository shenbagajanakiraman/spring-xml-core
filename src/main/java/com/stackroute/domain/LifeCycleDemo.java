package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleDemo implements InitializingBean, DisposableBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("In after Properties Set");
    }

    public void customInit(){
        System.out.println("Inside customInit....");
    }

    public void destroy() throws Exception {
        System.out.println("Inside Destroy method..");
    }

    public void customDestroy() {
        System.out.println("Inside Custom Destroy...");
    }
}
