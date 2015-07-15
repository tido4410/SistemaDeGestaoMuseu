/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gabriel B Moro
 */
@Entity
public class ItemConsignado extends ItemTombo implements Serializable {

    private String dataDoEmprestimo;
    private String dataDeDevolucao;
    private String responsavelDaFamilia;

    @Override
    public boolean salvar(Object objeto) {
        if (objeto instanceof ItemConsignado) {
            ItemConsignado item = (ItemConsignado) objeto;
            try {
                Session sessao = HibernateUtil.openSession();
                sessao.saveOrUpdate(item);
                Transaction transacao = sessao.beginTransaction();
                transacao.commit();
                sessao.clear();
                return true;
            } catch (Exception erro) {
                return false;
            }
        } else {
            return false;
        }
    }
 public boolean alterar(Long ID, Object objetoNovo) {
          if (objetoNovo instanceof ItemConsignado) {
            ItemConsignado item = (ItemConsignado) objetoNovo;
            try {
                Session sessao = HibernateUtil.openSession();
                sessao.saveOrUpdate(item);
                Transaction transacao = sessao.beginTransaction();
                transacao.commit();
                sessao.clear();
                return true;
            } catch (Exception erro) {
                return false;
            }
        } else {
            return false;
        }
    }
    @Override
    public Long recuperarID(Object objeto) {
        if (objeto instanceof ItemConsignado) {
            ItemConsignado item = (ItemConsignado) objeto;
            Query query = null;
            query = HibernateUtil.openSession().createQuery("from ItemConsignado i where "
                    + "i.outroCodigo=" + item.getOutroCodigo() + " and i.materiaPrima=\'" + item.getMateriaPrima() + "\'"
                    + " and i.dataDeDevolucao=\'" + item.getDataDeDevolucao() + "\' and i.responsavelDaFamilia=\'" + item.getResponsavelDaFamilia() + "\' and "
                    + "i.tipoObjeto=\'" + item.getTipoObjeto() + "\'");
            List<Object> resultado = query.list();
            if (!resultado.isEmpty()) {
                ItemConsignado itemRecuperado = (ItemConsignado) resultado.get(0);
                return itemRecuperado.getID();
            } else {
                return null;
            }
        }
        return null;
    }
    public List recuperarTodos() {
         Query query = null;
            query = HibernateUtil.openSession().createQuery("from ItemConsignado ");
            List<Object> resultado = query.list();
            if (!resultado.isEmpty()) {
                return resultado;
            } else {
                return null;
            }
    }
    @Override
        public Object recuperarPeloID(Long id) {
            Query query = null;
            query = HibernateUtil.openSession().createQuery("from ItemConsignado i where "
                    + "i.ID=" + id);
            List<Object> resultado = query.list();
            if (!resultado.isEmpty()) {
                return (ItemConsignado) resultado.get(0);
            } else {
                return null;
            }
        }
    @Override
     public boolean deletar(Object objeto) {
         try{
             Session sessao = HibernateUtil.openSession();
                sessao.delete(objeto);
                Transaction transacao = sessao.beginTransaction();
                transacao.commit();
                sessao.clear();
             return true;
         }catch(Exception erro){
             return false;
         }
         
     }
    
    public String getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(String dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public String getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(String dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public String getResponsavelDaFamilia() {
        return responsavelDaFamilia;
    }

    public void setResponsavelDaFamilia(String responsavelDaFamilia) {
        this.responsavelDaFamilia = responsavelDaFamilia;
    }
}
