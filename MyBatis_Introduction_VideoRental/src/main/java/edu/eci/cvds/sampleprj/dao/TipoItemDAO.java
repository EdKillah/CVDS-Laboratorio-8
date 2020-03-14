package edu.eci.cvds.sampleprj.dao;

import java.awt.List;



import edu.eci.cvds.sampleprj.dao.PersistenceException;

import edu.eci.cvds.samples.entities.Item;

public interface TipoItemDAO {

   public Item consultarItem (int id) throws PersistenceException;

   public java.util.List<Item> consultarItems() throws PersistenceException;
   
   public void insertarItem(Item it) throws PersistenceException;
}