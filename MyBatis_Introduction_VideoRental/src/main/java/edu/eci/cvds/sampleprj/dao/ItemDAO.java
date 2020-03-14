package edu.eci.cvds.sampleprj.dao;

import java.awt.List;
import java.util.ArrayList;

import edu.eci.cvds.sampleprj.dao.PersistenceException;

import edu.eci.cvds.samples.entities.Item;

public interface ItemDAO {

   public void save(Item it) throws PersistenceException;

   public Item consultarItem(int id) throws PersistenceException;

  public List consultarItems() throws PersistenceException;


}