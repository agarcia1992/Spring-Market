package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra,Integer> {
    Optional<List<Compra>> findByIdCliente(String idClinete);
}
