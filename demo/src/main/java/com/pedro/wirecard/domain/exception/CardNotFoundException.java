/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedro.wirecard.domain.exception;

/**
 *
 * @author pedro
 */
public class CardNotFoundException extends Exception{

    public CardNotFoundException() {
    }

    public CardNotFoundException(String message) {
        super(message);
    }
    
}
