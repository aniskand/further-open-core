/**
 * Copyright (C) [2013] [The FURTHeR Project]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.utah.further.ds.i2b2.model.api.to;

import edu.utah.further.core.api.lang.PubliclyCloneable;
import edu.utah.further.ds.i2b2.model.api.domain.ProviderDimensionId;

/**
 * ...
 * <p>
 * -----------------------------------------------------------------------------------<br>
 * (c) 2008-2013 FURTHeR Project, Health Sciences IT, University of Utah<br>
 * Contact: {@code <further@utah.edu>}<br>
 * Biomedical Informatics, 26 South 2000 East<br>
 * Room 5775 HSEB, Salt Lake City, UT 84112<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 * 
 * @author N. Dustin Schultz {@code <dustin.schultz@utah.edu>}
 * @version Apr 19, 2010
 */
public interface ProviderDimensionIdTo extends PubliclyCloneable<ProviderDimensionId>
{

	/**
	 * Gets the value of the providerId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	String getProviderId();

	/**
	 * Sets the value of the providerId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	void setProviderId(String value);

	/**
	 * Gets the value of the providerPath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	String getProviderPath();

	/**
	 * Sets the value of the providerPath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	void setProviderPath(String value);

}