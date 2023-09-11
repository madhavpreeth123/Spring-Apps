package in.madhavit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.madhav.ReportDao;

@Service
public class ServiceRepo {

	
	private ReportDao dao;
	
//	public void meth(ReportDao dao) {
//		this.dao=dao;
//		System.out.println("setter injection happens");
//		
//	}
	@Autowired
	public ServiceRepo(ReportDao dao) {
		// TODO Auto-generated constructor stub
		this.dao=dao;
		System.out.println("constructor injection happens");
		
	}
	public void infoGenereate() {
		
		dao.generate();
		System.out.println("reports generated....");
	}
	
	
}
