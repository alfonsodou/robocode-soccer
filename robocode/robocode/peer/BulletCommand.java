/*******************************************************************************
 * Copyright (c) 2001, 2008 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/cpl-v10.html
 *
 * Contributors:
 *     Pavel Savara
 *     - Initial implementation
 *******************************************************************************/
package robocode.peer;


import robocode.Bullet;

import java.io.Serializable;


/**
 * @author Pavel Savara (original)
 */
public class BulletCommand implements Serializable {
	private static final long serialVersionUID = 1L;

	public BulletCommand(Bullet bullet, boolean fireAssistValid, double fireAssistAngle, int bulletId) {
		this.bullet = bullet;
		this.fireAssistValid = fireAssistValid;
		this.fireAssistAngle = fireAssistAngle;
		this.bulletId = bulletId;
	}

	private Bullet bullet;
	private boolean fireAssistValid;
	private double fireAssistAngle;
	private int bulletId;

	public boolean isFireAssistValid() {
		return fireAssistValid;
	}

	public Bullet getBullet() {
		return bullet;
	}

	public int getBulletId() {
		return bulletId;
	}

	public double getFireAssistAngle() {
		return fireAssistAngle;
	}
}
