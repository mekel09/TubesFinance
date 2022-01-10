package com.example.tubespbol_finance.Dao;

import com.example.tubespbol_finance.Entitas.CategoryEntity;
import com.example.tubespbol_finance.Entitas.TipeuserEntity;
import com.example.tubespbol_finance.Util.DaoServicce;
import com.example.tubespbol_finance.Util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class TipeUserDaoImpl implements DaoServicce<TipeuserEntity> {
    @Override
    public int addData(TipeuserEntity object) {
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
    public int deleteData(TipeuserEntity object) {
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
    public int updateData(TipeuserEntity object) {
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
    public List<TipeuserEntity> fetchall() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<TipeuserEntity> criteriaQuery = criteriaBuilder.createQuery(TipeuserEntity.class);
        criteriaQuery.from(TipeUserDaoImpl.class);
        List<TipeuserEntity> tipe = session.createQuery(criteriaQuery).getResultList();
        session.close();
        return tipe;
    }
}
