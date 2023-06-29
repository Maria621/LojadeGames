package com.games.loja_de_games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.games.loja_de_games.model.Produto;

public interface ProdutoRepository extends JpaRepository < Produto, Long >{
	
	public List <Produto> findAllByNomeContainingIgnoreCase(@Param("Nome") String Nome);

}
