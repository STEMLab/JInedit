package net.opengis.indoorgml.core;

import java.io.Serializable;

public abstract class AbstractFeature implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6664125324203036883L;
	private String gmlID;
	private String name;
	
	public String getGmlID() {
		return gmlID;
	}
	public void setGmlID(String gmlID) {
		this.gmlID = gmlID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}