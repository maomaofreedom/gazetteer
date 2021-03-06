package me.osm.gazetter.join.out_handlers;

import org.json.JSONObject;

/**
 * Output raw object
 * 
 * @author dkiselev
 */
public class PrintJoinOutHandler extends SingleWriterJOHBase {
	
	/**
	 * Name of handler for command line
	 */
	public static final String NAME = "out-print";

	@Override
	public void handle(JSONObject object, String stripe) {
		println(object.toString());
	}


}
