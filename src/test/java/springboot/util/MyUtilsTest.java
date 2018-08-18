package springboot.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GM on 2018/5/19.
 */
public class MyUtilsTest {

    @Test
    public void testMD5encode() throws Exception {
        String encodePwd = MyUtils.MD5encode("admin" + "123456");
        System.out.println(encodePwd);
    }


}