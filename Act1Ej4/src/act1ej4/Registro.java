//datos leidos
package act1ej4;

/**
 * @author vxndett
 */
public class Registro {
    private String username;
    private String password;
    
    public Registro(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
}
