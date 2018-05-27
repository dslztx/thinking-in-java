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

import static chapter0.PrintUtils.print;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 目录实用工具
 * <p>
 * Produce a sequence of File objects that match a regular expression
 * in either a local directory, or by walking a directory tree.
 *
 * @anthor Lucky Yang
 * @Date 2012-11-17
 * @since 1.0.0
 */
public final class Directory {

  public static File[] local(File dir, final String regex) {
    return dir.listFiles(new FilenameFilter() {
      private Pattern pattern = Pattern.compile(regex);

      @Override
      public boolean accept(File dir, String name) {
        return pattern.matcher(new File(name).getName()).matches();
      }

    });
  }

  // Overloaded
  public static File[] local(String path, final String regex) {
    return local(new File(path), regex);
  }

  // A two-tuple for returning a pare of objects
  public static class TreeInfo implements Iterable<File> {

    public List<File> files = new ArrayList<File>();
    public List<File> dirs = new ArrayList<File>();

    @Override
    public Iterator<File> iterator() {
      return files.iterator();
    }

    public void addAll(TreeInfo other) {
      files.addAll(other.files);
      dirs.addAll(other.dirs);
    }

    @Override
    public String toString() {
      return "dirs: " + PPrint.pformat(dirs) +
          "\n\nfiles: " + PPrint.pformat(files);
    }
  }

  // Begin recursion
  public static TreeInfo walk(String start, String regex) {
    return recurseDirs(new File(start), regex);
  }

  public static TreeInfo walk(File start, String regex) {
    return recurseDirs(start, regex);
  }

  // Everything
  public static TreeInfo walk(File start) {
    return recurseDirs(start, ".*");
  }

  public static TreeInfo walk(String start) {
    return recurseDirs(new File(start), ".*");
  }

  public static TreeInfo recurseDirs(File startDir, String regex) {
    TreeInfo result = new TreeInfo();
    for (File item : startDir.listFiles()) {
      if (item.isDirectory()) {
        result.dirs.add(item);
        result.addAll(recurseDirs(item, regex));
      } else { // Regular file
        if (item.getName().matches(regex)) {
          result.files.add(item);
        }
      }
    }

    return result;
  }

  // Simple validation test
  public static void main(String[] args) {
    if (args.length == 0) {
      print(walk("."));
    } else {
      for (String arg : args) {
        print(walk(arg));
      }
    }
  }
}

