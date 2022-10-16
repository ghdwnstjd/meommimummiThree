package com.meommi.app.user.vo;

public class UserVO {
	private int userNumber;
	private String userId;
	private String userPassword;
	private String userName;
	private String userNickName;
	private int userAge;
	private String userGender;
	private String userPhotoPath;
	private String userIntroduce;
	private String userLoginMethod;
	
	public UserVO() {;}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserPhotoPath() {
		return userPhotoPath;
	}

	public void setUserPhotoPath(String userPhotoPath) {
		this.userPhotoPath = userPhotoPath;
	}

	public String getUserIntroduce() {
		return userIntroduce;
	}

	public void setUserIntroduce(String userIntroduce) {
		this.userIntroduce = userIntroduce;
	}

	public String getUserLoginMethod() {
		return userLoginMethod;
	}

	public void setUserLoginMethod(String userLoginMethod) {
		this.userLoginMethod = userLoginMethod;
	}

	@Override
	public String toString() {
		return "UserVO [userNumber=" + userNumber + ", userId=" + userId + ", userPassword=" + userPassword
				+ ", userName=" + userName + ", userNickName=" + userNickName + ", userAge=" + userAge + ", userGender="
				+ userGender + ", userPhotoPath=" + userPhotoPath + ", userIntroduce=" + userIntroduce
				+ ", userLoginMethod=" + userLoginMethod + "]";
	}
	
	
	
}
