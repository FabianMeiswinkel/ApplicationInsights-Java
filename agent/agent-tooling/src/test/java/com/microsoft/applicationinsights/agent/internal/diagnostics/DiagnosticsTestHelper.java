// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.applicationinsights.agent.internal.diagnostics;

public class DiagnosticsTestHelper {
  private DiagnosticsTestHelper() {}

  public static void setIsAppSvcAttachForLoggingPurposes(boolean appSvcAttachForLoggingPurposes) {
    DiagnosticsHelper.setAppSvcRpIntegration(appSvcAttachForLoggingPurposes);
  }

  public static void reset() {
    setIsAppSvcAttachForLoggingPurposes(false);
  }
}
