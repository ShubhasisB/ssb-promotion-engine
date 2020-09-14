package com.example.promotionengine.service;

import com.example.promotionengine.domain.Promotion;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
public class OrderServiceImpleTest {

    @InjectMocks
    IOrderService iOrderService = new OrderServiceImple();
    @Mock
    PromoServiceImple promoServiceImpl;

    private List<Promotion> promotions;


}
