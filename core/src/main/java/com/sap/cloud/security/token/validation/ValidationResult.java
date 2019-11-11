package com.sap.cloud.security.token.validation;

import javax.annotation.Nullable;

/**
 * Captures the result of a validation. Normally created by validators that
 * implement the {@link Validator} interface.
 */
public interface ValidationResult {

	/**
	 * Returns true if there is no validation error, false otherwise.
	 * 
	 * @return true if there is no validation error.
	 */
	boolean isValid();

	/**
	 * Returns true if there is a validation error, false otherwise.
	 *
	 * @return true if there is a validation error.
	 */
	boolean isErronous();

	/**
	 * The validation error that have been found.
	 *
	 * @return the error description or null in case the validation was valid.
	 */
	@Nullable
	String getErrorDescription();
}