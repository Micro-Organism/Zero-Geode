package com.zero.apache.geode;

import com.zero.apache.geode.domain.entity.SystemUserEntity;
import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.cache.config.EnableGemfireCaching;
import org.springframework.data.gemfire.config.annotation.EnableCachingDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnablePdx;

@SpringBootApplication
@EnableEntityDefinedRegions(basePackageClasses = SystemUserEntity.class, clientRegionShortcut = ClientRegionShortcut.PROXY ) // 只是当代理转发的操作
@EnablePdx
@EnableCachingDefinedRegions
@EnableGemfireCaching
public class ZeroApacheGeodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeroApacheGeodeApplication.class, args);
    }

}
