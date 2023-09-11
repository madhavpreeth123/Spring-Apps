package in.madhavit;

import org.springframework.stereotype.Repository;

import in.madhav.ReportDao;

@Repository
public class MysqlDbReport implements ReportDao{

	public MysqlDbReport() {
		// TODO Auto-generated constructor stub
	System.out.println("mysqldb::constructor");
	}
	public void generate() {
		// TODO Auto-generated method stub
	
		System.out.println("Mysql db reports genetated....");
	}
}
