package com.example.tubespbol_finance.Dao;

import com.example.tubespbol_finance.Entitas.CategoryEntity;
import com.example.tubespbol_finance.Entitas.PembukuanEntity;
import com.example.tubespbol_finance.Util.DaoServicce;
import com.example.tubespbol_finance.Util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class PembukuanDaoImpl implements DaoServicce<PembukuanEntity> {
    @Override
    public int addData(PembukuanEntity object) {
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
    public int deleteData(PembukuanEntity object) {
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
    public int updateData(PembukuanEntity object) {
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
    public List<PembukuanEntity> fetchall() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<PembukuanEntity> criteriaQuery = criteriaBuilder.createQuery(PembukuanEntity.class);
        criteriaQuery.from(PembukuanDaoImpl.class);
        List<PembukuanEntity> pembukuan = session.createQuery(criteriaQuery).getResultList();
        session.close();
        return pembukuan;
    }
}
