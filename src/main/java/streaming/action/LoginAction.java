/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.action;

import com.opensymphony.xwork2.ActionSupport;
import streaming.dto.Util;

/**
 *
 * @author IB
 */
public class LoginAction {
    
    private Util util;

    public String execute(){
        
        if( util!=null && "admin".equals(util.getLogin()) && "admin".equals(util.getMdp()) ){
            return "success";
        }
        
        return "show_form";
    }
    
    public Util getUtil() {
        return util;
    }

    public void setUtil(Util util) {
        this.util = util;
    }
    
    
}
