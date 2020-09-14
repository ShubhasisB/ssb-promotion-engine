package com.example.promotionengine.service;




import com.example.promotionengine.domain.Product;
import com.example.promotionengine.domain.Promotion;

import java.util.List;

public interface IOrderService {
    Double getTotalPrice(List<Product> products, List<Promotion> promotions);

    //Optional<Promotion> findProductByPromoId(String prod_id, List<Promotion> promotionList);
}
