/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dede;

import java.util.Date;

/**
 *
 * @author Jarod United
 */
public class HelloBean implements java.io.Serializable {
         private String Param1;
    private Date param2 = new Date();
    
    public String getParam1(){
        return Param1;
    }
    public void setParam1(String param1){
        this.Param1 = param1;
    }
    
    public Date getParam2(){
        return param2;
    }
    
    public void setParam2(Date param2){
        this.param2 = param2;
    }
    
    public String toString(){
        return "SampleBean [param1=" + Param1 + ", param2=" + param2 + "]";

    }
}
