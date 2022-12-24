package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Pessoa;

public class InserirDados {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Carlos", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim", "joaqum@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ronald", "ronald@gmail.com");
		Pessoa p4 = new Pessoa(null, "Agatha", "agatha@gmail.com");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p4);
		em.getTransaction().commit();
		System.out.println("Ok");
		em.close();
		emf.close();

	}

}
