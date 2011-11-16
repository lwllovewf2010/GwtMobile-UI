package com.gwtmobile.ui.client.panels;

import java.beans.Beans;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;



public class TabHeaderPanel extends FlowPanel implements HasWidgets {

	public TabHeaderPanel(){
		setStyleName("gwtm-TabHeaderPanel");
	}
	
    @Override
    public void add(Widget w) {
    
    	if (w instanceof TabHeader) {
    		super.add(w);
    	} else if (Beans.isDesignTime() && w instanceof Label) {
    		// allow Label during designtime
    	} else {
    		assert false : "The TabHeaderPanel can only contain multiple TabHeader elements";
    	}
    	
    }
	
}