package com.example.promotionengine.service;


import com.example.promotionengine.domain.Promotion;

import java.util.List;
import java.util.Optional;

public interface IPromoService {

    Optional<Promotion> findPromoByProdId(String prod_id, List<Promotion> promotionList);
}
