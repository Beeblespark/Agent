/*******************************************************************************
 * Copyright (c) 2018 Edgeworx, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Saeid Baghbidi
 * Kilton Hopkins
 *  Ashita Nagar
 *******************************************************************************/
package org.eclipse.iofog.field_agent;

import org.eclipse.iofog.utils.Constants;
import org.eclipse.iofog.utils.Constants.ControllerStatus;

/**
 * represents Field Agent status
 * 
 * @author saeid
 *
 */
public class FieldAgentStatus {

	private Constants.ControllerStatus contollerStatus;
	private long lastCommandTime;
	private boolean controllerVerified;

	public FieldAgentStatus() {
		contollerStatus = ControllerStatus.BROKEN;
	}
	
	public Constants.ControllerStatus getControllerStatus() {
		return contollerStatus;
	}

	public void setControllerStatus(Constants.ControllerStatus contollerStatus) {
		this.contollerStatus = contollerStatus;
	}

	public long getLastCommandTime() {
		return lastCommandTime;
	}

	public void setLastCommandTime(long lastCommandTime) {
		this.lastCommandTime = lastCommandTime;
	}

	public boolean isControllerVerified() {
		return controllerVerified;
	}

	public void setControllerVerified(boolean controllerVerified) {
		this.controllerVerified = controllerVerified;
	}

}
