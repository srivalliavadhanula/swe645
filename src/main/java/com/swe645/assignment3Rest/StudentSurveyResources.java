package com.swe645.assignment3Rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.dao.tables.StudentSurveyFormTable;

@Path("studentSurvey")
public class StudentSurveyResources {

	@GET
	@Path("records")
	@Produces(MediaType.APPLICATION_JSON)
	public List<StudentSurveyFormTable> getStudentSurveyRecords() {

		Session session = getSession();
		Transaction tx = session.beginTransaction();

		Query q = session.createQuery("from StudentSurveyFormTable order by DateOfSurvey");
		@SuppressWarnings("unchecked")
		List<StudentSurveyFormTable> listOfRecords = q.list();

		tx.commit();

		return listOfRecords;
	}

	@POST
	@Path("surveyEntry")
	public StudentSurveyFormTable createStudentSurveyEntry(StudentSurveyFormTable s1) {
		try {
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			session.save(s1);
			tx.commit();
		} catch (Exception e) {
			System.out.println(e+"error");
			return null;
		}
		return s1;
	}

	/**
	 * 
	 * Creates session for database transaction
	 * 
	 * @return session
	 */
	private Session getSession() {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(StudentSurveyFormTable.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();

		SessionFactory sf = cfg.buildSessionFactory(reg);

		Session session = sf.openSession();

		return session;
	}

}
