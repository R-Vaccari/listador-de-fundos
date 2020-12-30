package com.rvapp.listadordefundos;

public class FundCategoryNotFoundException extends RuntimeException {
    public FundCategoryNotFoundException(String message) {
        super(message);
    }
}
