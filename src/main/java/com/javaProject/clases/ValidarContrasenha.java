package com.javaProject.clases;

import java.util.Scanner;

public class ValidarContrasenha {

    private String newPassword;

    public ValidarContrasenha(String newPassword){
        this.newPassword = newPassword;
    }
    public Boolean validatePassword(String password){
        if (this.newPassword.equals(password)) {
            return true;
        }else {
            return false;
        }
    }
}


