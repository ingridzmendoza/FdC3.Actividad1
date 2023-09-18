//contenedor de registros
package act1ej3;

/**
 * @author vxndett
 */
public class Registro {
    private int id;
    private String password;
    private String userName;
    
    public Registro(int id, String psswrd, String user){
        this.id = id;
        this.password = psswrd;
        this.userName = user;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void setPassword(String psswrd){
        this.password = psswrd;
    }
    
    public void setUserName(String user){
        this.userName = user;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getUserName(){
        return this.userName;
    }
    
}
