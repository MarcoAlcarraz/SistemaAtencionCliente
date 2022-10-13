
package Modelo;

import java.util.List;

public interface CRUD {
    
    public List listar();
    public int add(Object[] o);
    public int actualizar(Object[] o);
    public void elminar(int id);
}
