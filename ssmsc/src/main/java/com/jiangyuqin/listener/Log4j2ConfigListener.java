package com.jiangyuqin.listener;

import org.apache.logging.log4j.core.config.Configurator;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * log4j2 启动时，动态设置xml配置文件的路径
 * @Author jiangyuqin
 */
public class Log4j2ConfigListener implements ServletContextListener {

    public static final String KEY = "log4j2.configurationFile";
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String xmlPath = String.valueOf(servletContextEvent.getServletContext().getInitParameter(KEY));
        System.out.println("Log4j2已加载配置文件："+xmlPath);
        Configurator.initialize("log4j2",xmlPath);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
