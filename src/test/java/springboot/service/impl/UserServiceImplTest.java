package springboot.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.modal.vo.UserVo;
import springboot.service.IUserService;


/**
 * Created by GM on 2018/5/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testInsertUser() throws Exception {
        UserVo user = new UserVo();
        user.setUsername("test");
        user.setPassword("123456");
userService.insertUser(user);
    }

    @Test
    public void testQueryUserById() throws Exception {

    }

    @Test
    public void testLogin() throws Exception {

    }

    @Test
    public void testUpdateByUid() throws Exception {

    }
}