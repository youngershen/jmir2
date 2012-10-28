/**
 * author : younger.shen 
 * email  : younger.x.shen@gmail.com
 * blog   : http://www.youngershen.com
 * 2012-10-27
 * TODO
 */
package com.youngershen.common.utils.json;

import java.io.Serializable;

/**
 * @author youngershen
 * this class to analytic the json file and you will got a java plain object
 */

public class JsonBuilder  {

	/**
	 * do nothing yet
	 */
	private JsonBuilder(){
		
	}

	/**
	 * 
	 * @param filepath
	 * @return Json
	 * 
	 * read from a file return the plain tree-like object
	 */
	public static Json build(String filepath){
		
		return new Json();
	}
	/**
	 * 
	 * @return Json
	 * 
	 * create a temp Json object and you can  set the json object at last
	 * you can serialize the object to a json file
	 */
	public static Json build(){
		
		return new Json();
	}
}
