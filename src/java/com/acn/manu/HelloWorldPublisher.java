/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu;

import javax.xml.ws.Endpoint;

/**
 *
 * @author manue
 */
//Endpoint publisher  
public class HelloWorldPublisher{  
    public static void main(String[] args) {  
       Endpoint.publish("http://localhost:8080/ws/hello", new HelloWorldImpl());  
        }  
}  