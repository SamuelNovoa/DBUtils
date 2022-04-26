/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUtils;

import java.lang.reflect.Field;

/**
 *
 * @author a21samuelnc
 */
public abstract class Model {
    protected String table;
    protected String primary;
    
    public String id;
    
    public Model(String table, String primary) {
        this.id = "0";
        this.table = table;
        this.primary = primary;
    }
    
    public boolean save() {
        Field[] _fields = this.getClass().getFields();
        
        String[] fields = new String[_fields.length];
        String[] data = new String[_fields.length];
        
        for (int i = 0; i < _fields.length; i++) {
            try {
                fields[i] = _fields[i].getName();
                data[i] = _fields[i].get(this).toString();
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                return false;
            }
            
        }
        
        return SQLMgr.update(table, primary, id, fields, data);
    }
}
