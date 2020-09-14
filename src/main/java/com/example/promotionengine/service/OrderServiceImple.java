package com.example.promotionengine.service;

import com.example.promotionengine.domain.Product;
import com.example.promotionengine.domain.Promotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImple implements IOrderService {

        @Autowired
        private IPromoService promoService;


        public Double getTotalPrice (List < Product > products, List < Promotion > promotions){
            Double total_price = 0.0;

            for (Product product : products) {
                Integer ordered_qnty = product.getQuantity();
                Double promo_price = 0.0;
                Double product_price = 0.0;
                Optional<Promotion> applied_promo = promoService.findPromoByProdId(product.getId(), promotions);
                if (applied_promo.isPresent()) {
                    Promotion promo = applied_promo.get();
                    Integer promo_qnty = promo.getProductInfo().get(product.getId());
                    while (promo_qnty <= ordered_qnty) {
                        promo_price += promo.getPromoPrice();
                        ordered_qnty -= promo_qnty;
                    }

                }
                if (ordered_qnty > 0) {
                    product_price = ordered_qnty * product.getUnitPrice();
                }

                total_price = total_price + product_price + promo_price;
            }


            return total_price;

        }
    }