/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author manue
 */
//Service Endpoint Interface  
@WebService  
@SOAPBinding(style = Style.RPC)  
public interface HelloWorld{  
    @WebMethod String getHelloWorldAsString(String name);  
}  
