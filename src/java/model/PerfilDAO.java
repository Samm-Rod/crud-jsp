
package model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class PerfilDAO extends DatabaseDAO{
    
    public PerfilDAO() throws Exception{}
    public ArrayList<Perfil> getLista() throws Exception {
        ArrayList<Perfil> lista = new ArrayList<>();

            String SQL = "SELECT * FROM perfil";
            this.conectar();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(SQL);
            while(rs.next()){
                Perfil p = new Perfil();
                p.setIdPerfil(rs.getInt("idPerfil"));
                p.setNome(rs.getString("nome"));
                p.setOpcoes(rs.getString("status"));
                lista.add(p);
            }
            this.desconectar();
            return lista;

    }
}