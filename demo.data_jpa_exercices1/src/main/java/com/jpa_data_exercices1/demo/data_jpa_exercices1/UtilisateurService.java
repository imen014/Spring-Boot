package com.jpa_data_exercices1.demo.data_jpa_exercices1;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Service
@Transactional
public class UtilisateurService {
	
	@PersistenceContext
    private EntityManager entityManager;

    public void creerUtilisateur(User utilisateur) {
        entityManager.persist(utilisateur);
    }

    public User obtenirUtilisateurParId(Long userId) {
        return entityManager.find(User.class, userId);
    }

    public void mettreAJourUtilisateur(User utilisateur) {
        entityManager.merge(utilisateur);
    }

    public void supprimerUtilisateur(Long userId) {
        User utilisateur = obtenirUtilisateurParId(userId);
        if (utilisateur != null) {
            entityManager.remove(utilisateur);
        }
    }

    public List<User> trouverUtilisateursParNom(String nom) {
        return entityManager.createQuery("SELECT u FROM Utilisateur u WHERE u.nom = :nom", User.class)
                .setParameter("nom", nom)
                .getResultList();
    }

}
