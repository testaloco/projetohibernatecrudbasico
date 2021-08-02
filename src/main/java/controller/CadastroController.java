package controller;


import dao.UsuarioDAO;
import entities.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.awt.event.ActionEvent;
import java.io.IOException;

public class CadastroController {
    @FXML
    TextField txtID, txtUser, txtPassword, txtEndereco;
    @FXML
    Button btCadastro,btPesquisa;

    public void cadastro(javafx.event.ActionEvent event)throws IOException {
        Usuario user = new Usuario();
        user.setUsuario(txtUser.getText().toString());
        user.setSenha(txtPassword.getText().toString());
        user.setEndereco(txtEndereco.getText().toString());
        Long idCadastrado = UsuarioDAO.cadastrar(user).getId();
        System.out.println("Id usuario cadastrado: " + idCadastrado);

    }
    public void pesquisar(javafx.event.ActionEvent event){
        Long id = Long.parseLong(txtID.getText().toString());
        Usuario usua = UsuarioDAO.pesquisa(id);
        txtUser.setText(usua.getUsuario());
        txtPassword.setText(usua.getSenha());
        txtEndereco.setText(usua.getEndereco());
        System.out.println("ok");

    }
    public void deletar(){

        Usuario usu = UsuarioDAO.delete();
        usu.getId();


    }




}
