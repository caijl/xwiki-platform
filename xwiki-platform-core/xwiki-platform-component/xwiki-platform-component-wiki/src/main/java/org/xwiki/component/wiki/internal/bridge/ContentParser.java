/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.component.wiki.internal.bridge;

import org.xwiki.component.annotation.Role;
import org.xwiki.component.wiki.WikiComponentException;
import org.xwiki.rendering.block.XDOM;
import org.xwiki.rendering.syntax.Syntax;

/**
 * A bridge between Wiki Components and the rendering module.
 *
 * @version $Id$
 * @since 4.3M2
 */
@Role
public interface ContentParser
{
    /**
     * Parse content.
     *
     * @param content the content to parse
     * @param syntax the syntax in which the content is written
     * @return the XDOM corresponding to the parsed content
     * @throws WikiComponentException if the content can't be parsed
     */
    XDOM parse(String content, Syntax syntax) throws WikiComponentException;
}
