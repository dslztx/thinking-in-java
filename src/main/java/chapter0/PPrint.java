package chapter0;

/**
 * Copyright (C) 2012 . see<http://mysources.sourceforge.net />
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses />.
 */

import java.util.Arrays;
import java.util.Collection;

/**
 * 集合打印工具
 * <p>
 * Pretty-printer for collections
 *
 * @anthor Lucky Yang
 * @Date 2012-11-17
 * @since 1.0.0
 */
public class PPrint {

  public static String pformat(Collection<?> c) {
    if (c == null || c.size() == 0) {
      return "[]";
    }

    StringBuilder result = new StringBuilder("[");
    for (Object elem : c) {
      if (c.size() != 1) {
        result.append("\n ");
      }
      result.append(elem);
    }

    if (c.size() != 1) {
      result.append("\n");
    }

    result.append("]");
    return result.toString();
  }

  public static void pprint(Collection<?> c) {
    PrintUtils.print(pformat(c));
  }

  public static void pprint(Object[] c) {
    PrintUtils.print(pformat(Arrays.asList(c)));
  }
}

