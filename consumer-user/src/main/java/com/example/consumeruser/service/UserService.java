package com.example.consumeruser.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.example.providerticket.service.TicketService;
import org.springframework.stereotype.Service;

@Service//spring提供的service注解
public class UserService {

    @Reference//dubbo的reference,引用dubbo发布的服务
    TicketService ticketService;

    public void hello(){
        String ticket=ticketService.getTicket();
        System.out.println("买到票了:"+ticket);
    }
}
