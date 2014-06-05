/*
 * @(#)Shape.java     1.0  13.09.2012
 *
 * Copyright (c) 2012 Dmitry Tsechoev.
 * Moscow, Russia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Dmitry Tsechoev. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Dmitry.
 *
 * Би-сми-Лляхи-р-рахмани-р-рахим...
 */
package org.itmuslim.science.mathematics.geometry.stereometry.shape;

/**
 * Фигура в пространстве.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  13.09.2012
 */
public interface Shape {
    double lateralSurfaceSquare();

    double totalSurfaceSquare();

    double volume();
}
