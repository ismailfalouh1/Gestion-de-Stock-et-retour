package com.ismail.gestiondestock.controller.api;

import com.ismail.gestiondestock.dto.auth.AuthenticationRequest;
import com.ismail.gestiondestock.dto.auth.AuthenticationResponse;
import com.ismail.gestiondestock.utils.Constants;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Api("authentication")
public interface AuthenticationApi {

  @PostMapping(Constants.AUTHENTICATION_ENDPOINT + "/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request);

}
