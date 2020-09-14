package com.example.promotionengine.service;

import com.example.promotionengine.domain.Order;
import com.example.promotionengine.domain.Product;
import com.example.promotionengine.domain.Promotion;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
public class OrderServiceImpleTest {

    @InjectMocks
    IOrderService iOrderService = new OrderServiceImple();

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

    @Test
    public void test_first_use_case() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("A", 50.0, 1));
        products.add(new Product("B", 30.0, 1));
        products.add(new Product("c", 20.0, 1));
        Order order = new Order(1, products);
        Double price = iOrderService.getTotalPrice(products, promotions);
        Assertions.assertEquals(100, price);
    }


    @Test
    public void test_second_use_case() {
        List<Product> products2 = new ArrayList<Product>();
        products2.add(new Product("A", 50.0, 5));
        products2.add(new Product("B", 30.0, 5));
        products2.add(new Product("c", 20.0, 1));
        Order order2 = new Order(2, products2);


        //Mockito.when(promoServiceImpl.findPromoByProdId("A", promotions)).thenReturn(Optional.of(promotions.get(1)));
        Double price = iOrderService.getTotalPrice(products2, promotions);
        Assertions.assertEquals(370, price);
    }


}
