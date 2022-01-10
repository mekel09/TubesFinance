package com.example.tubespbol_finance.Dao;

import com.example.tubespbol_finance.Entitas.SaldoEntity;
import com.example.tubespbol_finance.Util.DaoServicce;
import com.example.tubespbol_finance.Util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class SaldoDaoImpl implements DaoServicce<SaldoEntity> {
    @Override
    public int addData(SaldoEntity object) {
        int result = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(object);
            transaction.commit();
            result = 1;
        }catch (HibernateException ex){
            transaction.rollback();
        }
        session.close();
        return result;
    }

    @Override
    public int deleteData(SaldoEntity object) {
        int result = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.delete(object);
            transaction.commit();
            result = 1;
        }catch (HibernateException ex){
            transaction.rollback();
        }
        session.close();
        return result;
    }

    @Override
    public int updateData(SaldoEntity object) {
        int result = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.update(object);
            transaction.commit();
            result = 1;
        }catch (HibernateException ex){
            transaction.rollback();
        }
        session.close();
        return result;
    }

    @Override
    public List<SaldoEntity> fetchall() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<SaldoEntity> criteriaQuery = criteriaBuilder.createQuery(SaldoEntity.class);
        criteriaQuery.from(SaldoDaoImpl.class);
        List<SaldoEntity> saldo = session.createQuery(criteriaQuery).getResultList();
        session.close();
        return saldo;
    }
}
