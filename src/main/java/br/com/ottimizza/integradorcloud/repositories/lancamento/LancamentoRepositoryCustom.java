package br.com.ottimizza.integradorcloud.repositories.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;

import br.com.ottimizza.integradorcloud.domain.dtos.lancamento.LancamentoDTO;
import br.com.ottimizza.integradorcloud.domain.models.Lancamento;

public interface LancamentoRepositoryCustom { // LancamentoRepositoryImpl

    Page<Lancamento> fetchAll(LancamentoDTO filter, Pageable pageRequest);

    @Modifying
    @javax.transaction.Transactional
    long deleteAll(LancamentoDTO filter);

}