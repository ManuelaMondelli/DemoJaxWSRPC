/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu;

import javax.jws.WebService;

/**
 *
 * @author manue
 */
//Service Implementation  
@WebService(endpointInterface = "com.acn.manu.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{  
    @Override  
    public String getHelloWorldAsString(String name) {  
        return "Hello World JAX-WS " + name;  
    }  
}  