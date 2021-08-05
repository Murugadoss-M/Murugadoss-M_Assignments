package com.mmdoss.Service;

public class UserService {
	public static boolean validate(String name,String password) {
		if(name.equals("mmdoss")&&password.equals("password"))
			return true;
		return false;
	}

}
