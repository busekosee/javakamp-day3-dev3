package Database.concretes;

import Database.abstracts.MemberDao;
import Entities.concretes.Member;

public class Jdbcproductdao implements MemberDao {
    public void add(Member member) {
    	System.out.println("Üye jdbc veritabanına eklendi");
    }
}
