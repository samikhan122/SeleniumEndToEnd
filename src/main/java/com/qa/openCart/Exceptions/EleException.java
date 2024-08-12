package com.qa.openCart.Exceptions;

import org.openxml4j.document.wordprocessing.Run;

public class EleException extends RuntimeException {
    public EleException(String noSuchElement) {
         super(noSuchElement);
    }
}
