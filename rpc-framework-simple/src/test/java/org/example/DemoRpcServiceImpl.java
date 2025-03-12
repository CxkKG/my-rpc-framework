package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.annotation.RpcService;

@Slf4j
@RpcService(group = "test1", version = "version1")
public class DemoRpcServiceImpl implements DemoRpcService {

    @Override
    public String hello() {
        return "hello";
    }
}