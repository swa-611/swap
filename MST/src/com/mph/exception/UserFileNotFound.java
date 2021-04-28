package com.mph.exception;

import java.io.*;

public class UserFileNotFound extends Exception {
	 public void UserNotFoundException()
	{
		System.out.println(" User Not found Exception constructor");
	}
	public String toString()
	{
		return "UserNotFound. pls check the credentials";
	}
	

}
