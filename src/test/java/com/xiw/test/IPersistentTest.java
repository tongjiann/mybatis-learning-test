package com.xiw.test;

import com.xiw.io.Resources;
import com.xiw.pojo.User;
import com.xiw.sqlSession.SqlSession;
import com.xiw.sqlSession.SqlSessionFactory;
import com.xiw.sqlSession.SqlSessionFactoryBuilder;
import org.dom4j.DocumentException;
import org.junit.Test;

import java.beans.IntrospectionException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class IPersistentTest {

    /**
     * 传统方式
     */
    @Test
    public void test() throws DocumentException, IOException, SQLException, IntrospectionException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException {
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setId(1);
        user.setUsername("Judy");
        User u = sqlSession.selectOne("user.selectOne", user);
        System.out.println(u);

        List<User> list = sqlSession.selectList("user.selectList", null);
        System.out.println(list);

        sqlSession.close();
    }

}
