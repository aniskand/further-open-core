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
package edu.utah.further.core.api.constant;

import edu.utah.further.core.api.context.Api;

/**
 * Spring bean scopes.
 * <p>
 * -----------------------------------------------------------------------------------<br>
 * (c) 2008-2013 FURTHeR Project, AVP Health Sciences IT Office, University of Utah<br>
 * Contact: {@code <further@utah.edu>}<br>
 * Biomedical Informatics, 26 South 2000 East<br>
 * Room 5775 HSEB, Salt Lake City, UT 84112<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 *
 * @author Oren E. Livne {@code <oren.livne@utah.edu>}
 * @version Jan 5, 2009
 */
@Api
public enum BeanScope
{
	// ========================= ENUMERATED CONSTANTS ======================

	/**
	 * Indicates a singleton bean in Spring annotations.
	 */
	SINGLETON,

	/**
	 * Indicates a prototype bean in Spring annotations.
	 */
	PROTOTYPE,

	/**
	 * Indicates a request-scope backing bean in Spring annotations.
	 */
	REQUEST;

	// ========================= IMPLEMENTATION: Object ====================

	/**
	 * Return the textual representation of a scope enum. Spring follows nice text
	 * conventions in <code>Scope</code> arguments.
	 *
	 * @return enum constant name, converted to lower case
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
