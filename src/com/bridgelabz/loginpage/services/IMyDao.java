package com.bridgelabz.loginpage.services;

public interface IMyDao {
	public int register(String name, String username, String password);

	public String login(String username, String password);

}
