package data;

import com.mycompany.vehiculos.util.ConnectionUtil;
import domain.Funcionariosiud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionariosiudDAO {
    
    //CRUD CREATE, READ, UPDATE, DELETE
    private static final String GET_FUNCIONARIOSIUD = "select * from funcionariosiud ";

    private static final String CREATE_FUNCIONARIOIUD = "INSERT INTO funcionariosiud\n" +
            "(cedulaf, nombres, apellidos, estadocivil, sexo, direccion, telefono, fnacimiento)\n" +
            "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    
    private static final String GET_FUNCIONARIOIUD_BY_CEDULAF = "select * from funcionariosiud WHERE cedulaf = ? ";
    
    private static final String UPDATE_FUNCIONARIOIUD = "update funcionariosiud set nombres = ?, apellidos = ?,"
            + " estadocivil = ?, sexo = ?, direccion = ?, telefono = ?, fnacimiento = ? WHERE cedulaf = ? ";
    
    private static final String DELETE_FUNCIONARIOIUD = "DELETE FROM funcionariosiud WHERE cedulaf = ? ";
    
    
    public List<Funcionariosiud> obtenerFuncionarios() throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Funcionariosiud> funcionariosiud = new ArrayList<>();
        
        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIOSIUD);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                Funcionariosiud funcionarios = new Funcionariosiud();
                funcionarios.setCedulaf(resultSet.getString("cedulaf"));
                funcionarios.setNombres(resultSet.getString("nombres"));
                funcionarios.setApellidos(resultSet.getString("apellidos"));
                funcionarios.setEstadocivil(resultSet.getString("estadocivil"));
                funcionarios.setSexo(resultSet.getString("sexo"));
                funcionarios.setDireccion(resultSet.getString("direccion"));
                funcionarios.setTelefono(resultSet.getString("telefono"));
                funcionarios.setFnacimiento(resultSet.getString("fnacimiento"));
                funcionariosiud.add(funcionarios);
            }
            return funcionariosiud;
            
        }finally {
            
            if (connection != null) {
                connection.close();
            }
            
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            
            if (resultSet!= null) {
                resultSet.close();
            }
        }
        
        
    }
    public void crear(Funcionariosiud funcionarios) throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
         try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareCall(CREATE_FUNCIONARIOIUD);
            preparedStatement.setString(1, funcionarios.getCedulaf());
            preparedStatement.setString(2, funcionarios.getNombres());
            preparedStatement.setString(3, funcionarios.getApellidos());
            preparedStatement.setString(4, funcionarios.getEstadocivil());
            preparedStatement.setString(5, funcionarios.getSexo());
            preparedStatement.setString(6, funcionarios.getDireccion());
            preparedStatement.setString(7, funcionarios.getTelefono());
            preparedStatement.setString(8, funcionarios.getFnacimiento());
            preparedStatement.executeUpdate();
            
         }finally {
             if (connection != null) {
                connection.close();
            }
            
            if (preparedStatement != null) {
                preparedStatement.close();
            }
         }
    }
    
   public Funcionariosiud obtenerFuncionario(String cedulaf) throws SQLException {     
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Funcionariosiud funcionario = null;
        
         try {
             
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIOIUD_BY_CEDULAF);
            preparedStatement.setString(1, cedulaf);
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                funcionario = new Funcionariosiud();
                funcionario.setCedulaf(resultSet.getString("cedulaf"));
                funcionario.setNombres(resultSet.getString("nombres"));
                funcionario.setApellidos(resultSet.getString("apellidos"));
                funcionario.setEstadocivil(resultSet.getString("estadocivil"));
                funcionario.setSexo(resultSet.getString("sexo"));
                funcionario.setDireccion(resultSet.getString("direccion"));
                funcionario.setTelefono(resultSet.getString("telefono"));
                funcionario.setFnacimiento(resultSet.getString("fnacimiento"));
            
            }
            return funcionario;   
            
         }finally {
             
             if (connection != null) {
                connection.close();
            }
            
            if (preparedStatement != null) {
                preparedStatement.close();
            }
         }
    }
   
   public void actualizarFuncionariosiud(String cedulaf, Funcionariosiud funcionario) throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
         try {
             
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(UPDATE_FUNCIONARIOIUD);
            preparedStatement.setString(1, funcionario.getCedulaf());
            preparedStatement.setString(2, funcionario.getNombres());
            preparedStatement.setString(3, funcionario.getApellidos());
            preparedStatement.setString(4, funcionario.getEstadocivil());
            preparedStatement.setString(5, funcionario.getSexo());
            preparedStatement.setString(6, funcionario.getDireccion());
            preparedStatement.setString(7, funcionario.getTelefono());
            preparedStatement.setString(8, funcionario.getFnacimiento());
            preparedStatement.setString(1, cedulaf);
            preparedStatement.executeUpdate();
            
         }finally {
             if (connection != null) {
                connection.close();
            }
            
            if (preparedStatement != null) {
                preparedStatement.close();
            }
         }
    }
   
   public void eliminarFuncionarioiud(String cedulaf) throws SQLException {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
         try {
             
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_FUNCIONARIOIUD);
            preparedStatement.setString(1, cedulaf);
            preparedStatement.executeUpdate();
            
         }finally {
             if (connection != null) {
                connection.close();
            }
            
            if (preparedStatement != null) {
                preparedStatement.close();
            }
         }
    }   
}
