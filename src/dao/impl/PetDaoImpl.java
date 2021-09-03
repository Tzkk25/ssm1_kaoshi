package dao.impl;


import dao.PetDao;
import entity.Pet;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.JdbcUtil;

import java.sql.SQLException;
import java.util.List;

public class PetDaoImpl implements PetDao {
    QueryRunner qr = JdbcUtil.getQueryRunner();
    @Override
    public List<Pet> getPet() {
         List<Pet>list = null;
         String sql = "select * from pets";
         try{
             list = qr.query(sql,new BeanListHandler<>(Pet.class));
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return list;
    }
}