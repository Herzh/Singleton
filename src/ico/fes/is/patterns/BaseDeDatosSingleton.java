/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.patterns;

/**
 *
 * @author ALUCI
 */
public class BaseDeDatosSingleton {
    String url;
    String user;
    String password;
    String nombreBd;
    String port;
    private static BaseDeDatosSingleton _instance;
    
    private  BaseDeDatosSingleton (){
        System.out.println("Conextando a la BD");
    }

    private BaseDeDatosSingleton(String url, String user, String password, String nombreBd, String port) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.nombreBd = nombreBd;
        this.port = port;
    }
    
    public static BaseDeDatosSingleton getInstance(){
        //implementa Singleton
        if(_instance == null){
            _instance = new BaseDeDatosSingleton();
        }else{
            System.out.println("Ya fue instanciado");
        }
        
        return _instance;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreBd() {
        return nombreBd;
    }

    public void setNombreBd(String nombreBd) {
        this.nombreBd = nombreBd;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
    
    public void consultarClientes(){
        //simular consulta Sql
        System.out.println("id\tnombre\ttelefono");
        System.out.println("1\tJose\t5544332211");
        System.out.println("2\tdiana\t7766554433");
        System.out.println(this);
    }
    
}
