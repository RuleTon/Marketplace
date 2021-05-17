package com.example.eureka_oauth2;

import com.flamexander.cloud.common.CloudPacket;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "statistic-chain-service", configuration = StatisticFeignClientConfiguration.class)
public interface StatisticFeignClient {
    @GetMapping("/simple")
    CloudPacket findOnePacketPlease();
}
