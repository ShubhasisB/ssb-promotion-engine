package com.example.promotionengine.service;


import com.example.promotionengine.domain.Promotion;

import java.util.List;
import java.util.Optional;

public class PromoService implements IPromoService {


    public Optional<Promotion> findPromoByProdId(String prod_id, List<Promotion> promotionList) {

        Optional<Promotion> mappedPromotion = promotionList.stream().filter(promotion ->
                promotion.getProductInfo().containsKey(prod_id)).findAny();

        return mappedPromotion;
    }
}
