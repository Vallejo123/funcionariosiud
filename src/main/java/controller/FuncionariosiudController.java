package controller;

import data.FuncionariosiudDAO;
import domain.Funcionariosiud;
import java.sql.SQLException;
import java.util.List;

public class FuncionariosiudController {
    
    private FuncionariosiudDAO funcionariosiudDAO;
    
    public FuncionariosiudController() {
        funcionariosiudDAO = new FuncionariosiudDAO();   
    }
    
    public List<Funcionariosiud> obtenerFuncionariosiud() throws SQLException {
        return funcionariosiudDAO.obtenerFuncionarios();
    }
    
    public void crear(Funcionariosiud funcionariosiud) throws SQLException {
        funcionariosiudDAO.crear(funcionariosiud);
    }
    
    public Funcionariosiud obtenerFuncionarios(String cedulaf) throws SQLException {
        return funcionariosiudDAO.obtenerFuncionario(cedulaf);
    }
    
    public void actualizarFuncionariosiud(String cedulaf, Funcionariosiud funcionariosiud) throws SQLException {
        funcionariosiudDAO.actualizarFuncionariosiud(cedulaf, funcionariosiud);
    }
    
    public void eliminarFuncionariosiud(String cedulaf) throws SQLException {
        funcionariosiudDAO.eliminarFuncionarioiud(cedulaf);
    }
    
}
