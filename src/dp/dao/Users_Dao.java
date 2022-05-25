/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.dao;

import dp.vo.User_VO;
import java.util.List;

/**
 *
 * @author hishamls
 */
public class Users_Dao extends Dao implements Dao_List<User_VO>{
    private static Users_Dao usersDao;

    private Users_Dao() {
    }
    
    public static Users_Dao getInstance(){
        if (usersDao == null) {
            usersDao = new Users_Dao();
        }
        return usersDao;
    
    }

    @Override
    public List<User_VO> load_all() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User_VO get_data(User_VO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
