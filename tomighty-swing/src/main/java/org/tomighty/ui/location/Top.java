/*
 * Copyright (c) 2010-2012 Célio Cidral Junior.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package org.tomighty.ui.location;

import java.awt.Dimension;
import java.awt.Point;

public class Top extends LocationSupport {

	public Top(Point mouse) {
		super(mouse);
	}

	@Override
	protected int x(Dimension windowSize) {
		return mouse.x - windowSize.width / 2;
	}
	
	@Override
	protected int y(Dimension windowSize) {
		return screenSize().y + MARGIN;
	}

	@Override
	public int distanceFromScreenSide() {
		return mouse.y;
	}

}
