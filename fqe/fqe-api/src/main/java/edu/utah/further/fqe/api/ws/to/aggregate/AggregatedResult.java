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
package edu.utah.further.fqe.api.ws.to.aggregate;

import java.util.Set;

import edu.utah.further.core.api.lang.CopyableFrom;
import edu.utah.further.core.api.lang.PubliclyCloneable;
import edu.utah.further.fqe.ds.api.domain.ResultContextKey;

/**
 * A federated query immutable aggregated result set. Serializable to- and from XML. Holds
 * histograms of aggregated counts for multiple demographic categories. Used in
 * interacting with the i2b2 front end demographics plugin.
 * <p>
 * -----------------------------------------------------------------------------------<br>
 * (c) 2008-2013 FURTHeR Project, Health Sciences IT, University of Utah<br>
 * Contact: {@code <further@utah.edu>}<br>
 * Biomedical Informatics, 26 South 2000 East<br>
 * Room 5775 HSEB, Salt Lake City, UT 84112<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 *
 * @author Oren E. Livne {@code <oren.livne@utah.edu>}
 * @version Mar 23, 2011
 */
public interface AggregatedResult extends
		CopyableFrom<AggregatedResult, AggregatedResult>,
		PubliclyCloneable<AggregatedResult>, Comparable<AggregatedResult>
{
	// ========================= METHODS ===================================

	/**
	 * @return
	 */
	int getSize();

	/**
	 * @param key
	 * @param value
	 * @return
	 */
	void addCategory(Category value);

	/**
	 * @return
	 */
	Set<Category> getCategories();

	/**
	 * Return the key property.
	 *
	 * @return the key
	 */
	ResultContextKey getKey();
}