/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class UsuarioDao {

    public Usuario read(String id) throws Exception {
        String sql = "select * from Usuario where id=?";
        PreparedStatement stm = DataBase.instance().prepareStatement(sql);
        stm.setString(1, id);
        ResultSet rs = DataBase.instance().executeQuery(stm);
        if (rs.next()) {
            return from(rs);
        } else {
            throw new Exception("Usuario no Existe");
        }
    }

    public Usuario from(ResultSet rs) {
        try {
            Usuario r = new Usuario();
            r.setId(rs.getString("id"));
            r.setNombre(rs.getString("nombre"));
            r.setPassword(rs.getString("password"));
            return r;
        } catch (SQLException ex) {
            return null;
        }
    }    
    
            /*id; nombre; host;password;this.ListaContactos;*/
    
    public void create(Usuario o) throws Exception {
        String sql = "insert into Usuario (id, nombre, password) "
                + "values(?,?,?,?)";
        PreparedStatement stm = DataBase.instance().prepareStatement(sql);
        stm.setString(1, o.getId());
        stm.setString(2, o.getNombre());
        stm.setString(4, o.getPassword());
        int count = DataBase.instance().executeUpdate(stm);
        if (count == 0) {
            throw new Exception("Usuario ya existe");
        }
    }

    public void update(Usuario o) throws Exception {
        String sql = "update Usuario set nombre=?, set password=? "
                + "where id=?";
        PreparedStatement stm = DataBase.instance().prepareStatement(sql);
        stm.setString(1, o.getNombre());
        stm.setString(2, o.getId());
        stm.setString(4, o.getPassword());
        int count = DataBase.instance().executeUpdate(stm);
        if (count == 0) {
            throw new Exception("Usuario no existe");
        }
    }

    public void delete(Usuario o) throws Exception {
        String sql = "delete from Usuario where id=?";
        PreparedStatement stm = DataBase.instance().prepareStatement(sql);
        stm.setString(1, o.getId());
        int count = DataBase.instance().executeUpdate(stm);
        if (count == 0) {
            throw new Exception("Usuario no existe");
        }
    }

    public List<Usuario> findAll() {
        List<Usuario> r = new ArrayList<>();
        String sql = "select * from Usuario";
        try {
            PreparedStatement stm = DataBase.instance().prepareStatement(sql);
            ResultSet rs = DataBase.instance().executeQuery(stm);
            while (rs.next()) {
                r.add(from(rs));
            }
        } catch (SQLException ex) {
        }
        return r;
    }

    public List<Usuario> findByNombre(Usuario o) {
        List<Usuario> r = new ArrayList<>();
        String sql = "select * from Usuario where nombre like ?";
        try {
            PreparedStatement stm = DataBase.instance().prepareStatement(sql);
            stm.setString(1, "%" + o.getNombre() + "%");
            ResultSet rs = DataBase.instance().executeQuery(stm);
            while (rs.next()) {
                r.add(from(rs));
            }
        } catch (SQLException ex) {
        }
        return r;
    }

    public void close() {
    }
}
