package edu.eci.cvds.sampleprj.dao;

import java.util.List;
import java.util.Date;


import edu.eci.cvds.samples.entities.Cliente;

public interface ClienteDAO {

   public void save(Cliente c) throws PersistenceException ;

   public Cliente consultarCliente(int id) throws PersistenceException;

   public List<Cliente> consultarClientes() throws PersistenceException;
   
   public void agregarItemRentadoACliente(int idCliente,int idItem,Date fechainiciorenta, Date fechafinrenta) throws PersistenceException;
   public void vetarCliente(long idCliente,int estado) throws PersistenceException;
}