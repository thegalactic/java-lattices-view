/*
 * SampleDesktopMgr.java
 *
 * Copyright: 2013-2014 Karell Bertet, France
 *
 * License: http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html CeCILL-B license
 *
 * This file is part of java-lattices-view, free package. You can redistribute it and/or modify
 * it under the terms of CeCILL-B license.
 */


package View;

import java.awt.Dimension;
import javax.swing.DefaultDesktopManager;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;



class SampleDesktopMgr extends DefaultDesktopManager {

  // This is called anytime a frame is moved. This
  // implementation keeps the frame from leaving the desktop.
    @Override
  public void dragFrame(JComponent f, int x, int y) {
    if (f instanceof JInternalFrame) { // Deal only w/internal frames
      JInternalFrame frame = (JInternalFrame) f;
      JDesktopPane desk = frame.getDesktopPane();
      Dimension d = desk.getSize();

      // Nothing all that fancy below, just figuring out how to adjust
      // to keep the frame on the desktop.
      if (x < 0) { // too far left?
        x = 0; // flush against the left side
      } else {
        if (x + frame.getWidth() > d.width) { // too far right?
          x = d.width - frame.getWidth(); // flush against right side
        }
      }
      if (y < 0) { // too high?
        y = 0; // flush against the top
      } else {
        if (y + frame.getHeight() > d.height) { // too low?
          y = d.height - frame.getHeight(); // flush against the
                            // bottom
        }
      }
    }

    // Pass along the (possibly cropped) values to the normal drag handler.
    super.dragFrame(f, x, y);
  }
}
