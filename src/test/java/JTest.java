/**
 * @(#)JTest, 2021/2/7.
 * <p>
 * <p>
 * Copyright 2021 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import ppa.MyException;
import vo.MyVo;
import vo.MyVo1;

/**
 * @author zhuwentao1@corp.netease.com
 */
@RunWith(JUnit4.class)
public class JTest {

    @Test
    public void test1() {

    }

    @Test(expected = MyException.class)
    public void test2() throws Exception {
        throw new MyException("1");
    }

    @Test(timeout = 1000)
    public void test3() throws Exception {
        Thread.sleep(1500);
    }
}
