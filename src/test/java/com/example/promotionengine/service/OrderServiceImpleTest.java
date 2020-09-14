package com.example.promotionengine.service;

import com.example.promotionengine.domain.Promotion;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
public class OrderServiceImpleTest {

    @InjectMocks
    IOrderService iOrderService = new OrderServiceImple();
    @Mock
    PromoServiceImple promoServiceImpl;

    private List<Promotion> promotions;

    @Before
    public void setup() {
        HashMap<String, Integer> promo_product_map1 = new HashMap<String, Integer>();
        promo_product_map1.put("A", 3);

        HashMap<String, Integer> promo_product_map2 = new HashMap<String, Integer>();
        promo_product_map2.put("B", 2);

        HashMap<String, Integer> promo_product_map3 = new HashMap<String, Integer>();
        promo_product_map3.put("C", 1);
        promo_product_map3.put("D", 1);

        promotions = new ArrayList<Promotion>();
        promotions.add(new Promotion(1, 130.0, "Fixed Price", promo_product_map1));
        promotions.add(new Promotion(2, 45.0, "Fixed Price", promo_product_map2));
        promotions.add(new Promotion(3, 30.0, "Fixed Price", promo_product_map3));

    }


}
