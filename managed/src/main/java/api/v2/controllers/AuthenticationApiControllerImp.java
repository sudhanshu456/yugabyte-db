// Copyright (c) Yugabyte, Inc.

package api.v2.controllers;

import api.v2.handlers.AuthenticationHandler;
import api.v2.models.GroupMappingSpec;
import com.google.inject.Inject;
import java.util.List;
import java.util.UUID;
import play.mvc.Http;

public class AuthenticationApiControllerImp extends AuthenticationApiControllerImpInterface {

  @Inject AuthenticationHandler authHandler;

  @Override
  public List<GroupMappingSpec> listMappings(Http.Request request, UUID cUUID) throws Exception {
    return authHandler.listMappings(cUUID);
  }

  @Override
  public void updateGroupMappings(
      Http.Request request, UUID cUUID, List<GroupMappingSpec> groupMappingSpec) throws Exception {
    authHandler.updateGroupMappings(request, cUUID, groupMappingSpec);
  }

  @Override
  public void deleteGroupMappings(Http.Request request, UUID cUUID, UUID gUUID) throws Exception {
    authHandler.deleteGroupMappings(request, cUUID, gUUID);
  }
}