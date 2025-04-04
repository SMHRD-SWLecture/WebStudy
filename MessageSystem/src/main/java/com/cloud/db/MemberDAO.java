package com.cloud.db;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.cloud.model.MemberVO;

public class MemberDAO {

    // 1. Field
    private SqlSessionFactory factory = MySqlSessionManager.getFactory();

    // MyBatis 방식으로 DB 연결
    // 1. 회원가입 메소드
    public int join(MemberVO member) {

        // 1. 동적로딩 --> mybatis-config.xml
        // 2. 연결 --> MySqlSessionManager
        // 3. sql 구문 준비 --> MemberMapper.xml
        
        // 4. 실행
        // 4-1) factory에서 sqlSession 빌려오기
        // factory.openSession(true) --> AutoCommit 형태로 코드를 작동시키겠다.
        SqlSession sqlsession = factory.openSession(true);

        // 4-2) 사용
        // sqlsession.insert("태그의 id값", 매개변수)
        int row = sqlsession.insert("join", member);

        // 4-3) 반납
        sqlsession.close();

        return row;

    }
    
}
