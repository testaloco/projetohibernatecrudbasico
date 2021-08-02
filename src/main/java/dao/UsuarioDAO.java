package dao;

import entities.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UsuarioDAO {
    public UsuarioDAO(Usuario user) {

    }

    public static Usuario cadastrar(Usuario user){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        em.persist(user);
        entityTransaction.commit();
        em.close();
        return user;


    }
    public static Usuario pesquisa(Long id){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        Usuario us = em.find(Usuario.class, id);
        em.close();
        return us;
    }
    public static Usuario delete(){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        Usuario us = em.find(Usuario.class, delete().getId());
        us.getId();
        em.getTransaction().commit();
        em.close();
        return us;
    }

}
