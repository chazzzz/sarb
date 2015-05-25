package org.sarb.web.controller;

import org.sarb.props.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chazz on 4/18/2015.
 */
@Controller
@RequestMapping({"/", ""})
public class IndexController {

	@Autowired
	private ApplicationProperties applicationProperties;

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@ModelAttribute("activeEnvironment")
	private String activeEnvironment(){
		return applicationProperties.getActiveEnvironment();
	}
}
