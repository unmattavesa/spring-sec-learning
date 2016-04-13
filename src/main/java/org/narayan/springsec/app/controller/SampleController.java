package org.narayan.springsec.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author unmattavesa
 *
 */
@Controller
@RequestMapping(value = "/sample")
public class SampleController {

	@RequestMapping(method = RequestMethod.GET)
	public String showSamplePage() {
		return "sample";
	}
	
}
