/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.dao;

import br.com.unipampa.model.ItemConsignado;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gabrielbmoro // netoiung
 */
public class DAOItemConsignado extends DAO{
 
    @Override
    public boolean salvar(Object objeto) {
        try {
            Session sessao = HibernateUtil.openSession();

            if (objeto instanceof ItemConsignado) {
                ItemConsignado itemConsignado = (ItemConsignado) objeto;
                sessao.saveOrUpdate(itemConsignado);
                Transaction transacao = sessao.beginTransaction();
                transacao.commit();
                sessao.clear();
            }
            return true;
        } catch (Exception erro) {
            return false;
        }
    }

    @Override
    public boolean alterar(Object objeto) {
        try {
            Session sessao = HibernateUtil.openSession();

            if (objeto instanceof ItemConsignado) {
                ItemConsignado itemcons = (ItemConsignado) objeto;
                sessao.update(itemcons);
                Transaction transacao = sessao.beginTransaction();
                transacao.commit();
                sessao.close();
            }
            return true;
        } catch (Exception erro) {
            return false;
        }
    }
    
    @Override
    public List<Object> recuperarRegistros() {
        Query query = null;
        query = HibernateUtil.openSession().createQuery("from ItemConsignado");
        List<Object> itensDoMuseu = query.list();
        return itensDoMuseu;
    }

    @Override
    public Object recuperarPorID(Long ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    @Override
    public boolean deletar(Object objeto) {
      try {
            Session sessao = HibernateUtil.openSession();

            if (objeto instanceof ItemConsignado) {
                ItemConsignado itemcons = (ItemConsignado) objeto;
                sessao.delete(itemcons);
                Transaction transacao = sessao.beginTransaction();
                transacao.commit();
                sessao.close();
            }
            return true;
        } catch (Exception erro) {
            return false;
        }}

    @Override
    public List<Object> recuperarRegistros(Object parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
