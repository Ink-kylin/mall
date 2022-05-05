package com.mall.mbg;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Collections;

@SpringBootTest
class MallMbgApplicationTests {

    private static final  String USERNAME = "albert";
    
    private static final  String PASSWORD = "kylin";

    private  String url = "jdbc:mysql://localhost:3306/%s?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";

    
    @Test
    void mallAdmin(){
        String modelName = "mall-admin";
        String substring = modelName.substring(modelName.indexOf("-") + 1);
        url = String.format(url, "mall_admin");
        FastAutoGenerator.create(url,USERNAME,PASSWORD)
                .globalConfig(builder -> {
                    builder.author("kylin") // 设置作者
                            // 开启 swagger 模式
                            .enableSwagger()
                            // 指定输出目录
                            .outputDir("/home/albert/coding/java/mall/"+modelName+"/src/main/java")
                            //时间策略
                            .dateType(DateType.TIME_PACK)
                            //注释日期
                            .commentDate("yyyy-MM-dd");
                })
                .packageConfig(builder -> {
                    // 设置父包名
                    builder.parent("com.mall."+substring)
                            .entity("pojo."+substring)
                            // 设置mapperXml生成路径
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "./src/main/resources/mapper/"+substring));
                })
                .strategyConfig(builder -> builder
                        //实体策略配置
                        .entityBuilder()
                        //启用lombok
                        .enableLombok()
                        //controller策略
                        .controllerBuilder()
                        .enableRestStyle()
                        //service配置
                        .serviceBuilder()
                        .mapperBuilder()
                        .enableMapperAnnotation()
                        .enableBaseResultMap()
                        .enableBaseColumnList()
                        .build())
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

    @Test
    void mallCoupon(){
        String modelName = "mall-coupon";
        String substring = modelName.substring(modelName.indexOf("-") + 1);
        url = String.format(url, "mall_sms");
        FastAutoGenerator.create(url,USERNAME,PASSWORD)
                .globalConfig(builder -> {
                    builder.author("kylin") // 设置作者
                            // 开启 swagger 模式
                            .enableSwagger()
                            // 指定输出目录
                            .outputDir("/home/albert/coding/java/mall/"+modelName+"/src/main/java")
                            //时间策略
                            .dateType(DateType.TIME_PACK)
                            //注释日期
                            .commentDate("yyyy-MM-dd");
                })
                .packageConfig(builder -> {
                    // 设置父包名
                    builder.parent("com.mall."+substring)
                            .entity("pojo."+substring)
                            // 设置mapperXml生成路径
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "./src/main/resources/mapper/"+substring));
                })
                .strategyConfig(builder -> builder
                        //实体策略配置
                        .entityBuilder()
                        //启用lombok
                        .enableLombok()
                        //controller策略
                        .controllerBuilder()
                        .enableRestStyle()
                        //service配置
                        .serviceBuilder()
                        .mapperBuilder()
                        .enableMapperAnnotation()
                        .enableBaseResultMap()
                        .enableBaseColumnList()
                        .build())
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();


    }

    @Test
    void mallMember(){
        String modelName = "mall-member";
        String substring = modelName.substring(modelName.indexOf("-") + 1);
        url = String.format(url, "mall_ums");
        FastAutoGenerator.create(url,USERNAME,PASSWORD)
                .globalConfig(builder -> {
                    builder.author("kylin") // 设置作者
                            // 开启 swagger 模式
                            .enableSwagger()
                            // 指定输出目录
                            .outputDir("/home/albert/coding/java/mall/"+modelName+"/src/main/java")
                            //时间策略
                            .dateType(DateType.TIME_PACK)
                            //注释日期
                            .commentDate("yyyy-MM-dd");
                })
                .packageConfig(builder -> {
                    // 设置父包名
                    builder.parent("com.mall."+substring)
                            .entity("pojo."+substring)
                            // 设置mapperXml生成路径
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "./src/main/resources/mapper/"+substring));
                })
                .strategyConfig(builder -> builder
                        //实体策略配置
                        .entityBuilder()
                        //启用lombok
                        .enableLombok()
                        //controller策略
                        .controllerBuilder()
                        .enableRestStyle()
                        //service配置
                        .serviceBuilder()
                        .mapperBuilder()
                        .enableMapperAnnotation()
                        .enableBaseResultMap()
                        .enableBaseColumnList()
                        .build())
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();

    }

    @Test
    void mallOrder(){
        String modelName = "mall-order";
        String substring = modelName.substring(modelName.indexOf("-") + 1);
        url = String.format(url, "mall_oms");
        FastAutoGenerator.create(url,USERNAME,PASSWORD)
                .globalConfig(builder -> {
                    builder.author("kylin") // 设置作者
                            // 开启 swagger 模式
                            .enableSwagger()
                            // 指定输出目录
                            .outputDir("/home/albert/coding/java/mall/"+modelName+"/src/main/java")
                            //时间策略
                            .dateType(DateType.TIME_PACK)
                            //注释日期
                            .commentDate("yyyy-MM-dd");
                })
                .packageConfig(builder -> {
                    // 设置父包名
                    builder.parent("com.mall."+substring)
                            .entity("pojo."+substring)
                            // 设置mapperXml生成路径
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "./src/main/resources/mapper/"+substring));
                })
                .strategyConfig(builder -> builder
                        //实体策略配置
                        .entityBuilder()
                        //启用lombok
                        .enableLombok()
                        //controller策略
                        .controllerBuilder()
                        .enableRestStyle()
                        //service配置
                        .serviceBuilder()
                        .mapperBuilder()
                        .enableMapperAnnotation()
                        .enableBaseResultMap()
                        .enableBaseColumnList()
                        .build())
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();



    }

    @Test
    void mallProduct(){
        String modelName = "mall-product";
        String substring = modelName.substring(modelName.indexOf("-") + 1);
        url = String.format(url, "mall_pms");
        FastAutoGenerator.create(url,USERNAME,PASSWORD)
                .globalConfig(builder -> {
                    builder.author("kylin") // 设置作者
                            // 开启 swagger 模式
                            .enableSwagger()
                            // 指定输出目录
                            .outputDir("/home/albert/coding/java/mall/"+modelName+"/src/main/java")
                            //时间策略
                            .dateType(DateType.TIME_PACK)
                            //注释日期
                            .commentDate("yyyy-MM-dd");
                })
                .packageConfig(builder -> {
                    // 设置父包名
                    builder.parent("com.mall."+substring)
                            .entity("pojo."+substring)
                            // 设置mapperXml生成路径
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "./src/main/resources/mapper/"+substring));
                })
                .strategyConfig(builder -> builder
                        //实体策略配置
                        .entityBuilder()
                        //启用lombok
                        .enableLombok()
                        //controller策略
                        .controllerBuilder()
                        .enableRestStyle()
                        //service配置
                        .serviceBuilder()
                        .mapperBuilder()
                        .enableMapperAnnotation()
                        .enableBaseResultMap()
                        .enableBaseColumnList()
                        .build())
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();



    }

    @Test
    void mallWare(){
        String modelName = "mall-ware";
        String substring = modelName.substring(modelName.indexOf("-") + 1);
        url = String.format(url, "mall_wms");
        FastAutoGenerator.create(url,USERNAME,PASSWORD)
                .globalConfig(builder -> {
                    builder.author("kylin") // 设置作者
                            // 开启 swagger 模式
                            .enableSwagger()
                            // 指定输出目录
                            .outputDir("/home/albert/coding/java/mall/"+modelName+"/src/main/java")
                            //时间策略
                            .dateType(DateType.TIME_PACK)
                            //注释日期
                            .commentDate("yyyy-MM-dd");
                })
                .packageConfig(builder -> {
                    // 设置父包名
                    builder.parent("com.mall."+substring)
                            .entity("pojo."+substring)
                            // 设置mapperXml生成路径
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "./src/main/resources/mapper/"+substring));
                })
                .strategyConfig(builder -> builder
                        //实体策略配置
                        .entityBuilder()
                        //启用lombok
                        .enableLombok()
                        //controller策略
                        .controllerBuilder()
                        .enableRestStyle()
                        //service配置
                        .serviceBuilder()
                        .mapperBuilder()
                        .enableMapperAnnotation()
                        .enableBaseResultMap()
                        .enableBaseColumnList()
                        .build())
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();


    }
}
