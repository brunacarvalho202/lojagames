package com.lojadegames.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.lojadegames.lojadegames.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository <ProdutoModel, Long>{
	public List<ProdutoModel> findAllByPrecoBetween(@Param("inicio") BigDecimal inicio, @Param("fim") BigDecimal fim);

	public List<ProdutoModel> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}