package com.hotelchemin.repositorio;
import com.hotelchemin.modelo.Pasajero;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IRepositorioPass extends CrudRepository<Pasajero,Integer> {

}
