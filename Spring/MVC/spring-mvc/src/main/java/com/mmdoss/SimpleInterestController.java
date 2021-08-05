package com.mmdoss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {
	@RequestMapping(value = "/interest")
	public String viewSIPage() {
		return "simpleInterest";
	}

	@RequestMapping(value = "/calculated", method = RequestMethod.POST)
	public ModelAndView finalResult(@RequestParam("principle") String principle, @RequestParam("rate") String rate,
			@RequestParam("time") String time) {
		ModelAndView model = new ModelAndView();
		double p=Double.parseDouble(principle);
		double r=Double.parseDouble(rate);
		double t=Double.parseDouble(time);
		double result=(p*r*t)/100;
		model.addObject("simpleInterest", result);
		model.setViewName("result");
		return model;
	}
}
