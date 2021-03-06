package data.exchange.center.service.huayu.xfbg.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import data.exchange.center.common.log.LoggerService;

@FeignClient(value="service-log")
public interface LogService extends LoggerService {
    
}
