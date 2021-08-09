package com.takirahal.ecommerce;

import com.takirahal.ecommerce.web.rest.vm.ManagedUserVM;
import org.apache.commons.lang3.StringUtils;

public class Validators {

    public static boolean checkPasswordLength(String password) {
        return !StringUtils.isEmpty(password) &&
            password.length() >= ManagedUserVM.PASSWORD_MIN_LENGTH &&
            password.length() <= ManagedUserVM.PASSWORD_MAX_LENGTH;
    }
}
