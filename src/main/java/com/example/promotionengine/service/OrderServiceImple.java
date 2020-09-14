package com.example.promotionengine.service;

import com.example.promotionengine.domain.Promotion;

import java.util.List;
import java.util.Optional;

public class OrderServiceImple implements IPromoService {
    @Override
    public Optional<Promotion> findPromoByProdId(String prod_id, List<Promotion> promotionList) {
        return Optional.empty();
    }
}
