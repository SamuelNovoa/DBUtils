/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUtils;

/**
 *
 * @author a21samuelnc
 */
public class SQLMgr {  
    public static Object[][] read(String table, String field, String data, String op) {
        return null;
    }
    
    public static boolean update(String table, String primary, String id, String[] fields, String[] data) {
        if (exists(table, primary, id))
            delete(table, primary, id);
        
        System.out.println("tabla: " + table + "; primary: " + primary);
        for (int i = 0; i < data.length; i++) {
            System.out.println(fields[i] + ": " + data[i]);
        }
        
        return true;
    }
    
    public static boolean delete(String table, String primary, String id) {
        return true;
    }
    
    public static boolean exists(String table, String primary, String id) {
        return true;
    }
}
