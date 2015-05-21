package org.sarb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by chazz on 4/18/2015.
 */
@Controller
public class HomeController {

	@RequestMapping(name = "/", method = RequestMethod.GET)
	public String index() {
		return "";
	}
}
