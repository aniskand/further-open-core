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
package edu.utah.further.core.api.math;

import edu.utah.further.core.api.context.Api;

/**
 * An object that can be compared with another object up to a finite tolerance, measured
 * in ULPS. This is an improvement upon the ad-hoc {@link TolerantlyComparable} that I
 * developed.
 * <p>
 * commons-math 2.0+'s <code>MathUtils</code> has a utility for ULPS-based equality that
 * can be used to implement this interface.
 * -----------------------------------------------------------------------------------<br>
 * (c) 2008-2013 FURTHeR Project, Health Sciences IT, University of Utah<br>
 * Contact: {@code <further@utah.edu>}<br>
 * Biomedical Informatics, 26 South 2000 East<br>
 * Room 5775 HSEB, Salt Lake City, UT 84112<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 * 
 * @author Oren E. Livne {@code <oren.livne@utah.edu>}</code>
 * @version Dec 24, 2009
 * @see http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm
 */
@Api
public interface TolerantlyEquals<T extends TolerantlyEquals<T>>
{
	// ========================= CONSTANTS =================================

	// ========================= ABSTRACT METHODS ==========================

	/**
	 * Returns true iff this instance and the first argument are equal or within the range
	 * of allowed error (inclusive). Adapted from <a
	 * href="http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm">
	 * Bruce Dawson</a>
	 * 
	 * @param other
	 *            another object to compare this with
	 * @param maxUlps
	 *            {@code (maxUlps - 1)} is the number of floating point values between
	 *            {@code x} and {@code y}.
	 * @return {@code true} if there are less than {@code maxUlps} floating point values
	 *         between {@code this} and {@code other}
	 */
	boolean tolerantlyEquals(T other, int maxUlps);
}