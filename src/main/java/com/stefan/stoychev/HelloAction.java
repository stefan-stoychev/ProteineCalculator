/*
 * Copyright (c) Experian, 2018. All rights reserved.
 */
package com.stefan.stoychev;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {
    private String greetings;
    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }
    public String getGreetings() {
        return greetings;
    }

    @Override
    public String execute() throws Exception {
        this.greetings = "Hello Struts 2.";
        return "success";
    }
}