/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.thmarx.nashorn;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class CommonJSExample {

	public static void main(String... args) throws Throwable {
		ScriptEngineManager engineManager
				= new ScriptEngineManager();
		ScriptEngine engine
				= engineManager.getEngineByName("nashorn");

		
		InputStreamReader reader = new InputStreamReader(CommonJSExample.class.getResourceAsStream("jvm-npm.js"), Charset.forName("UTF-8"));
		engine.eval(reader);
		engine.eval("var mod1 = require('modules/mod1.js');");
		engine.eval("mod1.hello('Thorsten');");
	}
}
