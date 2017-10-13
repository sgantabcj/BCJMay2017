package com.bcj.sampleproject.test;

public class ComparableDemo implements Comparable<ComparableDemo> {
	private String userName;
	private String userId;
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public int compareTo(ComparableDemo o) {
		return this.userName.compareTo(o.getUserName());
	}
	
}
