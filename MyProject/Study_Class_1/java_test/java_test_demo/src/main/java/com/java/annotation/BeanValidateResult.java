package com.java.annotation;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.ConstraintViolation;
import java.util.Set;

/**
 * @author ShenTeng
 */
public class BeanValidateResult<T> {

    private boolean isSuccess;

    private Set<ConstraintViolation<T>> constraintViolations;

    public BeanValidateResult(Set<ConstraintViolation<T>> constraintViolations) {
        this.isSuccess = CollectionUtils.isEmpty(constraintViolations);
        this.constraintViolations = constraintViolations;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public Set<ConstraintViolation<T>> getConstraintViolations() {
        return constraintViolations;
    }

    public String getFirstMsg() {
        if (CollectionUtils.isEmpty(constraintViolations)) {
            return "";
        } else {
            ConstraintViolation<T> next = constraintViolations.iterator().next();
            return getMsg(next);
        }
    }

    public void failThrow() {
        if (!isSuccess()) {
            throw new IllegalArgumentException(getFirstMsg());
        }
    }

    public void failThrow(String extMsg) {
        if (!isSuccess()) {
            throw new IllegalArgumentException(getFirstMsg() + ". " + extMsg);
        }
    }

    private String getMsg(ConstraintViolation<T> violation) {
        return violation.getPropertyPath() + " " + violation.getMessage();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("isSuccess", isSuccess)
                .append("constraintViolations", constraintViolations)
                .toString();
    }
}
