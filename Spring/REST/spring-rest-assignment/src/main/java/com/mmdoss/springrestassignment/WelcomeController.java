package com.mmdoss.springrestassignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String authenticate(@RequestParam("username") String name, @RequestParam("password") String password) {
		if (name.equals("mmdoss") && password.equals("password"))
			return "Valid User";
		return "Invalid User";
	}

	@RequestMapping("/address")
	public Address findAddress(@RequestParam("zipcode") String zipcode) {
		return AddressService.findByZipcode(zipcode);
	}

	@RequestMapping("/card")
	public String validate(@RequestParam("type") String type, @RequestParam("number") String number) {
		long num = Long.parseLong(number);
		switch (type.toLowerCase()) {
		case "american-express":
			if (number.length() == 16) {
				if (num / Math.pow(10, 10) >= 601100 && num / Math.pow(10, 10) <= 601109)
					return "Valid Card";
				else if (num / Math.pow(10, 10) >= 601120 && num / Math.pow(10, 10) <= 601149)
					return "Valid Card";
				else if (num / Math.pow(10, 10) >= 601177 && num / Math.pow(10, 10) <= 601179)
					return "Valid Card";
				else if (num / Math.pow(10, 10) >= 601186 && num / Math.pow(10, 10) <= 601199)
					return "Valid Card";
				else if (num / Math.pow(10, 10) >= 644000 && num / Math.pow(10, 10) <= 659999)
					return "Valid Card";
				else if (num / Math.pow(10, 10) == 601174)
					return "Valid Card";
			} else
				return "Card not valid";
		case "enroute":
			if (number.length() == 15) {
				if (num / Math.pow(10, 12) == 2014 || num / Math.pow(10, 12) == 2149)
					return "Valid Card";
				else
					return "Card not valid";
			} else
				return "Card not valid";
		case "jcb":
			if (number.length() >= 16 && number.length() <= 19) {
				if (num / Math.pow(10, 12) >= 3528 && num / Math.pow(10, 12) <= 3589)
					return "Valid Card";
				else
					return "Card not valid";
			} else
				return "Card not valid";
		case "master-card":
			if (number.length() == 16) {
				if (num / Math.pow(10, 10) >= 510000 && num / Math.pow(10, 10) <= 559999)
					return "Valid Card";
				else
					return "Card not valid";
			} else
				return "Card not valid";
		case "visa":
			if(number.length()<=19) {
				if (number.startsWith("4"))
					return "Valid Card";
				else
					return "Card not valid";
			}
			else
				return "Card not valid";
		default:
			return "Unrecognised Card Type";
		}
	}

}
