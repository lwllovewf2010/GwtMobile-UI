/*
 * Copyright (c) 2010 Zhihua (Dennis) Jiang
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtmobile.ui.client.widgets;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasText;

public class RadioButton extends WidgetBase implements HasText {

	private HTML _html = new HTML();
	private boolean _isSelected;

	public RadioButton() {
		initWidget(_html);
	}

	public void setSelected(boolean selected) {
		_isSelected = selected;
		if (_isSelected) {
			addStyleName("Selected");
		}
		else {
			removeStyleName("Selected");       
		}
	}

	public boolean isSelected() {
		return _isSelected;
	}

	@Override
	public String getText() {
		return _html.getHTML();
	}

	@Override
	public void setText(String text) {
		_html.setHTML(text);
	}

}
