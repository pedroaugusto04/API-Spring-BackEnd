/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedro.wirecard.domain.exception;

/**
 *
 * @author pedro
 */
public class InvalidCardException extends Exception {

    public InvalidCardException() {
    }

    public InvalidCardException(String message) {
        super(message);
    }
    
}
