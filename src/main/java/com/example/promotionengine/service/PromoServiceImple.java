package com.example.promotionengine.service;


import com.example.promotionengine.domain.Promotion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromoServiceImple implements IPromoService {

    public Optional<Promotion> findPromoByProdId(String prod_id, List<Promotion> promotionList) {

        Optional<Promotion> mappedPromotion = promotionList.stream().filter(promotion ->
                promotion.getProductInfo().containsKey(prod_id)).findAny();

        return mappedPromotion;
    }
}
