/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import util.ConectaBD;
import vo.FuncionarioVO;

/**
 *
 * @author Fate
 */
public class FuncionarioDAO {

    private static final String SELECT
            = "SELECT * FROM funcionario WHERE idcliente = ?";

    private static final String SELECTLOGIN
            = "SELECT senha FROM funcionario WHERE cpf = ?";
    
    private static final String INSERT
            = "INSERT INTO cliente (cpf, nome, rg, endereco, cidade, estado, email, fone)"
            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String UPDATE
            = "UPDATE cliente SET cpf = ?, nome = ?, rg = ?, endereco = ?, cidade = ?, estado = ?, email = ?, fone = ?"
            + "WHERE idcliente = ?";

    private static final String DELETE
            = "DELETE from cliente WHERE idcliente = ?";

    public FuncionarioVO buscar(FuncionarioVO vo) throws SQLException, ClassNotFoundException {
        Connection connection = ConectaBD.getConnection();
        
        try (PreparedStatement statement = connection.prepareStatement(SELECT)) {
        statement.setInt(1, vo.getFuncionario_id());
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
     
        vo.setFuncionario_id(resultSet.getInt("idfuncionario"));
        vo.setFuncionario_cpf(resultSet.getString("cpf"));
        vo.setFuncionario_nome(resultSet.getString("nome"));
        vo.setFuncionario_rg(resultSet.getString("rg"));
        vo.setFuncionario_endereco(resultSet.getString("endereco"));
        vo.setFuncionario_cidade(resultSet.getString("cidade"));
        vo.setFuncionario_estado(resultSet.getString("estado"));
        vo.setFuncionario_email(resultSet.getString("email"));
        vo.setFuncionario_fone(resultSet.getInt("fone"));
        vo.setFuncionario_senha(resultSet.getString("senha"));

        resultSet.close();
        statement.close();
        }

        return vo;
    }
    
    public FuncionarioVO buscarLogin(FuncionarioVO vo) throws SQLException, ClassNotFoundException {
        Connection connection = ConectaBD.getConnection();
        
        try (PreparedStatement statement = connection.prepareStatement(SELECTLOGIN)) {
        statement.setString(1, vo.getFuncionario_cpf());
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
     
        vo.setFuncionario_cpf(resultSet.getString("cpf"));
        vo.setFuncionario_senha(resultSet.getString("senha"));

        resultSet.close();
        statement.close();
        }
        return vo;
    }

    public FuncionarioVO criar(FuncionarioVO vo) throws ClassNotFoundException, SQLException {
        Connection connection = ConectaBD.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setString(1, vo.getCliente_cpf());
            statement.setString(2, vo.getCliente_nome());
            statement.setString(3, vo.getCliente_rg());
            statement.setString(4, vo.getCliente_endereco());
            statement.setString(5, vo.getCliente_cidade());
            statement.setString(6, vo.getCliente_estado());
            statement.setString(7, vo.getCliente_email());
            statement.setInt(8, vo.getCliente_fone());
            
            statement.executeUpdate();
        }
        return vo;
    }

    public FuncionarioVO alterar(FuncionarioVO vo) throws ClassNotFoundException, SQLException {
        Connection connection = ConectaBD.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(UPDATE)) {
            
            statement.setString(1, vo.getCliente_cpf());
            statement.setString(2, vo.getCliente_nome());
            statement.setString(3, vo.getCliente_rg());
            statement.setString(4, vo.getCliente_endereco());
            statement.setString(5, vo.getCliente_cidade());
            statement.setString(6, vo.getCliente_estado());
            statement.setString(7, vo.getCliente_email());
            statement.setInt(8, vo.getCliente_fone());
            
            statement.setInt(9, vo.getCliente_id());
            
            statement.executeUpdate();
        }
        return vo;

    }

    public FuncionarioVO excluir(FuncionarioVO vo) throws ClassNotFoundException, SQLException {
        Connection connection = ConectaBD.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(DELETE)) {
            statement.setInt(1, vo.getFuncionario_id());
            
            statement.executeUpdate();
        }
        return vo;
    }
}