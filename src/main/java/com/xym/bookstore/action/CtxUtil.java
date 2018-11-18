package com.xym.bookstore.action;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @ClassName CtxUtil
 * @Description TODO
 * @Author ak
 * @Date 2018/11/18 下午1:15
 * @Version 1.0
 **/
public class CtxUtil implements ApplicationContextAware {

    public static ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }

    public static <T> T getBean(Class<T> clazz) {
        return ctx.getBean(clazz);
    }

    public static Object getBean(String name) {
        return ctx.getBean(name);
    }
}