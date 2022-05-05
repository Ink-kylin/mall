import com.mall.admin.MallAdminApp;
import com.mall.admin.mapper.SysMenuMapper;
import com.mall.admin.mapper.SysRoleMapper;
import com.mall.mbg.pojo.admin.SysRole;
import com.mall.mbg.pojo.admin.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author kylin
 */
@SpringBootTest(classes = MallAdminApp.class)
public class SQLTest {

    @Autowired
    private SysRoleMapper roleMapper;

    @Autowired
    private SysMenuMapper menuMapper;

    @Test
    void test(){
        SysUser user = new SysUser();
        user.setUserId(2L);
        List<SysRole> roleList = roleMapper.selectRolesByUser(user);
        System.out.println("12");

    }

    @Test
    void test1(){
        SysUser user = new SysUser();
        user.setUserId(1L);
        System.out.println("12");

    }

}
