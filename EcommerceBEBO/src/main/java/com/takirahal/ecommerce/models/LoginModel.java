package com.takirahal.ecommerce.models;

import com.takirahal.ecommerce.service.dto.UserDTO;
import org.springframework.http.HttpHeaders;

public class LoginModel {

    HttpHeaders httpHeaders;
    UserDTO userDTO;

    public HttpHeaders getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(HttpHeaders httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
