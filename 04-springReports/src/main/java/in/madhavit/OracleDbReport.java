package in.madhavit;

import org.springframework.stereotype.Repository;

import in.madhav.ReportDao;

@Repository("dao")
public class OracleDbReport implements ReportDao{
	
	public OracleDbReport() {
		// TODO Auto-generated constructor stub
	System.out.println("oracledbreport::constructor");
	}

	public void generate() {
		// TODO Auto-generated method stub
	
		System.out.println("Oracle db reports genetated....");
	}
}
