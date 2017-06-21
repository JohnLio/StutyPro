package com.zhujunliang.ztree;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractZtree<T> {

	
	public static final String TOP = "0001";
	
	protected String id;
	
	protected String pId;
	
	protected String name;
	
	protected String url;
	
	protected boolean open;
	
	protected boolean isParent;
	
	protected List<T> children =new ArrayList<T>();
	
	public AbstractZtree(){
		
		
	}
	
	
}
