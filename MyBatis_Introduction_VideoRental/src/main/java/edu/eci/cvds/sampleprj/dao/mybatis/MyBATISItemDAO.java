package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.eci.cvds.sampleprj.dao.ItemDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ItemMapper;
import edu.eci.cvds.samples.entities.TipoItem;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MyBATISItemDAO implements ItemDAO{

  @Inject
  private ItemMapper itemMapper;    

  @Override
  public void save(Item it) throws PersistenceException{
  try{
      itemMapper.insertarItem(it);
  }
  catch(org.apache.ibatis.exceptions.PersistenceException e){
      throw new PersistenceException(PersistenceException.ITEM);
  }        

  }

  @Override
  public Item consultarItem(int id) throws PersistenceException {
  try{
      return itemMapper.consultarItem(id);
  }
  catch(org.apache.ibatis.exceptions.PersistenceException e){
      throw new PersistenceException(PersistenceException.C_ITEM);
  }
  
  }
 @Override
  public java.awt.List consultarItems() throws PersistenceException{
  try{
	  return (java.awt.List) itemMapper.consultarItems();
  }
  catch(org.apache.ibatis.exceptions.PersistenceException e){
      throw new PersistenceException(PersistenceException.L_ITEM);
  }    


  }

  }