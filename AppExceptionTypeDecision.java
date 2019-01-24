/*
 * (C) Copyright Voxify, Inc. 2001-2005 - All Rights Reserved. PROPRIETARY AND CONFIDENTIAL.
 * This source code and documentation is copyrighted and owned by Voxify, Inc.
 * Use is subject to license terms. May not be distributed without authorization from Voxify, Inc.
 */
package com.voxify.vui.decision;

import com.voxify.ce.model.api.rt.Decision;


public class AppExceptionTypeDecision implements Decision {


  public Event decide() {
    if (isBrowser)
      return Event.Browser;
    else if (isBackend)
      return Event.Backend;
    return Event.Application;
  }

  enum Event {
    Browser,
    Application,
    Backend
  }
  
  @input public boolean isBackend;
  @input public boolean isBrowser;
}
