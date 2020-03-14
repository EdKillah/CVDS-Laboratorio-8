package edu.eci.cvds.sampleprj.dao;

import java.awt.List;
import java.util.Date;
import java.util.ArrayList;

import edu.eci.cvds.sampleprj.dao.PersistenceException;

import edu.eci.cvds.samples.entities.Cliente;

public interface ClienteDAO {

   public void save(Cliente c) throws PersistenceException ;

   public Cliente consultarCliente(int id) throws PersistenceException;

   public java.util.List<Cliente> consultarClientes() throws PersistenceException;
   
   public void agregarItemRentadoACliente(int idCliente,int idItem,Date fechainiciorenta, Date fechafinrenta) throws PersistenceException;
}