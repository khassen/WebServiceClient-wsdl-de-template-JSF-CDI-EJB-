package fr.treeptik.clientservice.runtime;

import fr.treeptik.clientservice.wsimport.Employe;
import fr.treeptik.clientservice.wsimport.ManagerWebService;
import fr.treeptik.clientservice.wsimport.ManagerWebServiceService;
import fr.treeptik.clientservice.wsimport.ServiceException_Exception;

public class Main {


	public static void main(String[] args) {

		ManagerWebServiceService service = new ManagerWebServiceService();
		ManagerWebService managerWebService = service.getManagerWebServicePort();
		
		
		Employe e = new Employe();
		e.setNom("NomService");
		e.setPrenom("PrenomService");
		e.setLogin("LoginService");
		e.setPassword("PasswordService");
		e.setDepartment(null);
		
		
		try {
			managerWebService.register(e);
		} catch (ServiceException_Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
