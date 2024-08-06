package com.webapi.br.validation.campoEmail;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidarEmailUnico implements ConstraintValidator<EmailUnico, Object>{
	
	 private String field;
    private Class<?> entity;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void initialize(EmailUnico constraintAnnotation) {
        this.field = constraintAnnotation.field();
        this.entity = constraintAnnotation.entity();
    }
    
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        String queryStr = String.format("SELECT COUNT(e) FROM %s e WHERE e.%s = :value", entity.getSimpleName(), field);
        Query query = entityManager.createQuery(queryStr);
        query.setParameter("value", value);

        Long count = (Long) query.getSingleResult();
        return count == 0;
    }
}
