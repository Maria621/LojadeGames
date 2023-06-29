package com.games.loja_de_games.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.games.loja_de_games.model.Categoria;

public interface CategoriaRepository extends JpaRepository< Categoria, Long> {

	   public List<Categoria> findAllByTipoContainingIgnoreCase(@Param("Tipo") String Tipo);

}
