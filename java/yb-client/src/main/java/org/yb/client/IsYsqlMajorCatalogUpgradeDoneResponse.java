// Copyright (c) YugaByte, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
// in compliance with the License.  You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software distributed under the License
// is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
// or implied.  See the License for the specific language governing permissions and limitations
// under the License.
//

package org.yb.client;

import org.yb.annotations.InterfaceAudience;
import org.yb.master.MasterTypes;

@InterfaceAudience.Public
public class IsYsqlMajorCatalogUpgradeDoneResponse extends YRpcResponse {

  private final MasterTypes.MasterErrorPB serverError;
  private final boolean done;

  public IsYsqlMajorCatalogUpgradeDoneResponse(
      long elapsedMillis, String masterUUID, MasterTypes.MasterErrorPB serverError, boolean done) {
    super(elapsedMillis, masterUUID);
    this.serverError = serverError;
    this.done = done;
  }

  public boolean isDone() {
    return done;
  }

  public MasterTypes.MasterErrorPB getServerError() {
    return serverError;
  }

  public boolean hasError() {
    return serverError != null;
  }

  public String errorMessage() {
    if (serverError == null) {
      return "";
    }

    return serverError.getStatus().getMessage();
  }
}
