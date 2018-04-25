package classes;

import javafx.scene.control.TextField;

public class User {
	
	private static TextField socialSecurity = new TextField();
	private static TextField tfFirstName = new TextField();
	private static TextField tfLastName = new TextField();
	private static TextField tfEmail = new TextField();
	private static TextField tfAddress = new TextField();
	private static TextField tfState = new TextField();
	private static TextField tfZipCode = new TextField();
	private static TextField tfUsername = new TextField();
	private static TextField tfPassword = new TextField();
	private static TextField tfnewUsername = new TextField();
	private static TextField tfnewPassword = new TextField();
	private static TextField tfSecurityQuestion = new TextField();
	private static TextField tfSecurityAns = new TextField();
	
	public static TextField getTfFirstName() {
		return tfFirstName;
	}
	public void setTfFirstName(TextField tfFirstName) {
		this.tfFirstName = tfFirstName;
	}
	public static TextField getTfLastName() {
		return tfLastName;
	}
	public void setTfLastName(TextField tfLastName) {
		this.tfLastName = tfLastName;
	}
	public static TextField getTfEmail() {
		return tfEmail;
	}
	public void setTfEmail(TextField tfEmail) {
		this.tfEmail = tfEmail;
	}
	public static TextField getTfAddress() {
		return tfAddress;
	}
	public void setTfAddress(TextField tfAddress) {
		this.tfAddress = tfAddress;
	}
	public static TextField getTfState() {
		return tfState;
	}
	public void setTfState(TextField tfState) {
		this.tfState = tfState;
	}
	public static TextField getTfZipCode() {
		return tfZipCode;
	}
	public void setTfZipCode(TextField tfZipCode) {
		this.tfZipCode = tfZipCode;
	}
	public static TextField getTfUsername() {
		return tfUsername;
	}
	public void setTfUsername(TextField tfUsername) {
		this.tfUsername = tfUsername;
	}
	public static TextField getTfPassword() {
		return tfPassword;
	}
	public void setTfPassword(TextField tfPassword) {
		this.tfPassword = tfPassword;
	}
	public static TextField getTfSecurityQuestion() {
		return tfSecurityQuestion;
	}
	public void setTfSecurityQuestion(TextField tfSecurityQuestion) {
		this.tfSecurityQuestion = tfSecurityQuestion;
	}
	public static TextField getTfSecurityAns() {
		return tfSecurityAns;
	}
	public void setTfSecurityAns(TextField tfSecurityAns) {
		this.tfSecurityAns = tfSecurityAns;
	}
	public static TextField getTfnewUsername() {
		return tfnewUsername;
	}
	public static void setTfnewUsername(TextField tfnewUsername) {
		User.tfnewUsername = tfnewUsername;
	}
	public static TextField getTfnewPassword() {
		return tfnewPassword;
	}
	public static void setTfnewPassword(TextField tfnewPassword) {
		User.tfnewPassword = tfnewPassword;
	}
	public static TextField getSocialSecurity() {
		return socialSecurity;
	}
	public static void setSocialSecurity(TextField socialSecurity) {
		User.socialSecurity = socialSecurity;
	}

}
