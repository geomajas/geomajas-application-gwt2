/*
 * This is part of Geomajas, a GIS framework, http://www.geomajas.org/.
 *
 * Copyright 2008-2014 Geosparc nv, http://www.geosparc.com/, Belgium.
 *
 * The program is available in open source according to the GNU Affero
 * General Public License. All contributions in this program are covered
 * by the Geomajas Contributors License Agreement. For full licensing
 * details, see LICENSE.txt in the project root.
 */
package org.mypackage.client.feature;

import com.google.gwt.event.shared.EventHandler;
import com.google.web.bindery.event.shared.Event;

/**
 * Interface for handling {@link FeatureClickedEvent}s.
 *
 * @author Oliver May
 * @since 2.1.0
 */
public interface FeatureClickedHandler extends EventHandler {

	/**
	 * The type of the handler.
	 */
	Event.Type<FeatureClickedHandler> TYPE = new Event.Type<FeatureClickedHandler>();

	/**
	 * Called when feature is selected.
	 *
	 * @param event {@link FeatureClickedEvent}
	 */
	void onFeatureClicked(FeatureClickedEvent event);

}
