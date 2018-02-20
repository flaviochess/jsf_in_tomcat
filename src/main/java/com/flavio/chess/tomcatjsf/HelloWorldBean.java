package com.flavio.chess.tomcatjsf;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HelloWorldBean {

    private String msg;
    
    @PostConstruct
    public void init() {
        
        msg = "Hello World!! Show JSF content";
    }

    public String getMsg() {
        
        return msg;
    }

    public void setMsg(String msg) {
        
        this.msg = msg;
    }
    
}
