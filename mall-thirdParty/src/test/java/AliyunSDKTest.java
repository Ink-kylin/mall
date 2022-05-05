import com.alibaba.cloud.context.AliCloudAuthorizationMode;
import com.alibaba.cloud.spring.boot.oss.env.OssProperties;
import com.aliyun.oss.*;
import com.mall.third.ThirdPartyApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author kylin
 */
@SpringBootTest(classes = ThirdPartyApplication.class)
class AliyunSDKTest {

    @Autowired
    OssProperties ossProperties;

    @Autowired
    private OSS ossClient;

    @Test
    void getOssProperties(){

        System.out.println("ossProperties = " + ossClient);


    }

    @Test
    void currentDIr(){
        String property = System.getProperty("user.dir");
        System.out.println("property = " + property);

    }



    @Test
    void context(){
        String bucketName = "kylin01";
        // 填写Object完整路径，例如exampledir/exampleobject.txt。Object完整路径中不能包含Bucket名称。
        String objectName = "bootstrap.yml";
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/main/resources/config/bootstrap.yml");
            ossClient.putObject(bucketName, objectName, inputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
