package com.test.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooster")
public class RoosterController {
	
	Map<String, String> languages = new HashMap<String,String>();
	
	@PostConstruct
	public void init() {
		languages.put("Danish", "kykyliky");
		languages.put("Dutch", "kukeleku");
		languages.put("Finnish", "kukko kiekuu");
		languages.put("French", "cocorico");
		languages.put("German", "kikeriki");
		languages.put("Greek", "kikiriki");
		languages.put("Hebrew", "coo-koo-ri-koo");
		languages.put("Hungarian", "kukuriku");
		languages.put("Italian", "chicchirichi");
		languages.put("Japanese", "ko-ke-kok-ko-o");
		languages.put("Portuguese", "cucurucu");
		languages.put("Russian", "kukareku");
		languages.put("Swedish", "kuckeliku");
		languages.put("Turkish", "kuk-kurri-kuuu");
		languages.put("Urdu", "kuklooku");
		languages.put("Sinhala", "kukukukuuu");
	}
	
	@GetMapping
	public String get() {
		return "test";
	}
	
	@RequestMapping(value="/language/{language}" , method=RequestMethod.GET)
	public String singByLanguage(@PathVariable String language) {
		
		

		return languages.get(language);	
	}
	
	

}
