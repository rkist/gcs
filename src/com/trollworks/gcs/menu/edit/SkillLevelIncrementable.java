/*
 * Copyright (c) 1998-2016 by Richard A. Wilkes. All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * version 2.0. If a copy of the MPL was not distributed with this file, You
 * can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * This Source Code Form is "Incompatible With Secondary Licenses", as defined
 * by the Mozilla Public License, version 2.0.
 */

package com.trollworks.gcs.menu.edit;

/**
 * Objects that have their Skill Level change (mainly just skills)
 */
public interface SkillLevelIncrementable {
	/** @return Whether the data can be incremented. */
	boolean canIncrementSkillLevel();

	/** @return Whether the data can be decremented. */
	boolean canDecrementSkillLevel();

	/** Call to increment the data. */
	void incrementSkillLevel();

	/** Call to decrement the data. */
	void decrementSkillLevel();
}
