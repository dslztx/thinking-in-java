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

import java.io.File;
import java.io.IOException;

/**
 * 处理文件工具
 * <p>
 * We can create a tool that will walk directories  and
 * process the files within them according to
 * a Strategy object (this is another example of the  Strategy design pattern)
 *
 * @anthor Lucky Yang
 * @Date 2012-11-18
 * @since 1.0.0
 */
public class ProcessFiles {

  public interface Strategy {

    void process(File file);
  }

  private Strategy strategy;
  private String ext; // 文件扩展名

  public ProcessFiles(Strategy strategy, String ext) {
    super();
    this.strategy = strategy;
    this.ext = ext;
  }

  public void start(String[] args) {
    try {
      if (args.length == 0) {
        processDirectoryTree(new File("."));
      } else {
        for (String arg : args) {
          File fileArg = new File(arg);
          if (fileArg.isDirectory()) {
            processDirectoryTree(fileArg);
          } else {
            // Allow user to leave off extension
            if (!arg.endsWith("." + ext)) {
              arg += "." + ext;
            }
            strategy.process(new File(arg).getCanonicalFile());
          }
        }
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public void processDirectoryTree(File root) throws IOException {
    for (File file : Directory.walk(root.getAbsolutePath(), ".*\\." + ext)) {
      strategy.process(file.getCanonicalFile());
    }
  }

  // Demonstration of how to use it
  public static void main(String[] args) {
    new ProcessFiles(new Strategy() {

      @Override
      public void process(File file) {
        PrintUtils.print(file);

      }

    }, "java").start(args);
  }
}


