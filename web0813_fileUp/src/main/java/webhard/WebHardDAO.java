package webhard;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class WebHardDAO {

	// SqlSessionFactory를 SqlMapConfig를 통하여 생성한다.
	SqlSessionFactory sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession session;

	public WebHardDAO() {
		// SqlSessionFactory에서 session을 할당받는다.
		// 이 때 openSession에 true를 주어야 자동 커밋이 된다.
		// default는 false이다.
		session = sqlsession_f.openSession(true);
	}

	public List<WebHard> selectWebHard() {
		// session을 통해 쿼리를 실행하고 값을 받아온다.
		return session.selectList("WebhardMapper.viewWebhard");
	}

//	public int countProduct(int id) {
//		return session.selectOne("CartMapper.countProducts", id);
//	}
	public void addWebHard(WebHard webHard) {
		session.insert("WebhardMapper.addWebhard", webHard);
	}

	public WebHard getWebHardByNum(int id) {
		return session.selectOne("WebhardMapper.selectWebhardByNum", id);
	}
//
//	public void updateProduct(Product product) {
//		session.update("ProductMapper.updateProduct", product);
//	}
//
	public void deleteWebHard(int id) {
		session.delete("WebhardMapper.deletewebhard", id);
	}
}