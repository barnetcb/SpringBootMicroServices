package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//Put some stuff more and more more

/**
 *Handle the / start endpoint
 *@return
 */

@Controller
public class PlantPlacesController {
	
	//anything that has /start will map to this method
	@RequestMapping("/start")
	public String start() {
		
		return "start";
	}
	
	/**
	 * Handle the / endpoint
	 *@return
	 */
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
}
