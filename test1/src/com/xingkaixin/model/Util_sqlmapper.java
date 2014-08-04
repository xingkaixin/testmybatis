package com.xingkaixin.model;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Util_sqlmapper {

public static SqlSessionFactory sqlmapper = null;
public static SqlSession sqlSession=null;
static {
String rs = "com/xingkaixin/model/mybatis-config.xml";// 为第二步中的配置文件名
Reader reader = null;
try {
reader = Resources.getResourceAsReader(rs);
if(sqlmapper==null){
sqlmapper = new SqlSessionFactoryBuilder().build(reader);
}
} catch (IOException e) {
e.printStackTrace();
}
}
public static SqlSession getSqlSession() {
sqlSession = sqlmapper.openSession();
return sqlSession;
}
}