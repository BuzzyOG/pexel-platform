// @formatter:off
/*
 * Pexel Project - Minecraft minigame server platform. 
 * Copyright (C) 2014 Matej Kormuth <http://www.matejkormuth.eu>
 * 
 * This file is part of Pexel.
 * 
 * Pexel is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * 
 * Pexel is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 *
 */
// @formatter:on
package eu.matejkormuth.pexel.commons;

import java.util.UUID;

/**
 * Factory for creating objects their creation depends on platform.
 */
public abstract class AbstractObjectFactory {
    public abstract Player getPlayer(final Object platformType);
    
    /**
     * Returns {@link Player} object by {@link UUID}.
     * 
     * @param uuid
     *            uuid of player
     * @return player object
     */
    public abstract Player getPlayer(final UUID uuid);
    
    /**
     * Returns {@link ItemStackBuilder} valid for current platform.
     * 
     * @return item stack build object
     */
    public abstract ItemStackBuilder createItemStackBuilder(Material material);
}
