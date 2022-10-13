package Database.concretes;

import Database.abstracts.MemberDao;
import Entities.concretes.Member;

public class Hibernateproductdao implements MemberDao{
     public void  add(Member member) {
    	 System.out.println(" üye Hibernate veritabanına eklendi");
    	 
     }
}
