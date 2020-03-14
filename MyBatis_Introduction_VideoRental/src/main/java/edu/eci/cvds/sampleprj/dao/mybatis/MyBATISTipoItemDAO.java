package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.eci.cvds.sampleprj.dao.ItemDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ItemMapper;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.TipoItemMapper;
import edu.eci.cvds.samples.entities.TipoItem;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyBATISTipoItemDAO implements ItemDAO{

  @Inject
  private TipoItemMapper tipoItemMapper;    
 

  @Override
  public Item consultarItem(int id) throws PersistenceException {
  try{
     // return tipoItemMapper.consultarItem(id);
  }
  catch(org.apache.ibatis.exceptions.PersistenceException e){
      throw new PersistenceException(PersistenceException.C_ITEM);
  }
return null;
  
  }
  @Override
  public java.awt.List consultarItems() throws PersistenceException{
  try{
	  //return (java.awt.List) tipoItemMapper.consultarItems();
  }
  catch(org.apache.ibatis.exceptions.PersistenceException e){
      throw new PersistenceException(PersistenceException.L_ITEM);
  }
return null;    

  }
@Override
public void save(Item it) throws PersistenceException {
	// TODO Auto-generated method stub
	
}


  }