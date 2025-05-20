package com.revisao.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revisao.ecommerce.entities.ItemDoPedido;
import com.revisao.ecommerce.entities.ItemDoPedidoPK;

public interface ItemDoPedidoRepository extends JpaRepository<ItemDoPedido, ItemDoPedidoPK> {

}
