/*
 interface Dao_List
 */
package dp.dao;

import java.util.List;

/**
 *
 * @author hishamls
 */
public interface Dao_List<T>{
    public List<T> load_all () throws Exception;
    public String insert()throws Exception; // = add
    public String update()throws Exception;
    public String delete()throws Exception;
    public T get_data(T t)throws Exception;
    
}
