/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class PersonalInformation {

	private String dateOfBirth = null;

	private String gender = null;

	private PersonalName name = null;

	/**
	 * The date of birth of the consumer<br>
	 * Format: YYYYMMDD
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * The date of birth of the consumer<br>
	 * Format: YYYYMMDD
	 */
	public void setDateOfBirth(String value) {
		this.dateOfBirth = value;
	}

	/**
	 * The gender of the consumer, possible values are:
	 * <ul>
	 * <li>male
	 * <li>female
	 * <li>unknown or empty
	 * </ul>
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * The gender of the consumer, possible values are:
	 * <ul>
	 * <li>male
	 * <li>female
	 * <li>unknown or empty
	 * </ul>
	 */
	public void setGender(String value) {
		this.gender = value;
	}

	/**
	 * Object containing the name details of the consumer
	 */
	public PersonalName getName() {
		return name;
	}

	/**
	 * Object containing the name details of the consumer
	 */
	public void setName(PersonalName value) {
		this.name = value;
	}
}
