

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.xingkaixin.model.User;
import com.xingkaixin.model.Util_sqlmapper;


public class Testmybatis {
	public static void main(String[] args) {
		SqlSession session = Util_sqlmapper.getSqlSession();
		try {
		//delete user
		/*User u = new User();
		u.setUserName("a1");
		int i = session.delete("delete",u);
		System.out.println(i +" delete "+u.getUserName());
		session.commit();*/
		
		//add user
		/*int ct = 0;
		int allt = 0;
		for(int i=1; i<101; i++) {
			User u = new User();
			u.setUserId(i);
			u.setUserName("a"+i);
			u.setPasswords("p"+i);
			u.setComments("c"+i);
			ct = session.insert("insert",u);
			allt = allt +ct;
			
		}
		System.out.println(allt + " insert");
		session.commit();*/
		
		//find user
		/*List<User> users = new ArrayList<User>();	
		User u = new User();
		u.setUserName("a2");
		users = session.selectList("findByUserName",u);
		System.out.println(users.size());
		for(int i=0,size=users.size();i<size; i++) {
			System.out.println(users.get(i).getUserId()+
					users.get(i).getUserName()+users.get(i).getComments()
					+users.get(i).getPasswords());
			
		}
		*/
		//find alluser
		/*List<User> users = new ArrayList<User>();	
		users = session.selectList("selectAll");
		System.out.println(users.size());
		for(int i=0,size=users.size();i<size; i++) {
			System.out.println(users.get(i).getUserId()+
					users.get(i).getUserName()+users.get(i).getComments()
					+users.get(i).getPasswords());
			
		}	
			*/
			
		//count alluser
		/*int i = session.selectOne("countAll");
		System.out.println(i);*/
		
		//update user
		User u = new User();
		u.setUserName("a2");
		u.setComments("cc2");
		u.setPasswords("pp2");
		int i = session.update("update",u);
		System.out.println(i);
		System.out.println(u.getUserName()+u.getPasswords()+u.getComments());
		session.commit();
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}	
		
		
	}
}
