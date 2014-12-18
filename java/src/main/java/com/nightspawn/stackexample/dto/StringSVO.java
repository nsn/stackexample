package com.nightspawn.stackexample.dto;

/**
 * helps prevent boilerplate since we oftentimes need String-
 * {@link SimpleValueObject} instances
 * 
 * @author nsn
 * 
 */
public class StringSVO extends SimpleValueObject<String> {
    private static final long serialVersionUID = 5994640650219342409L;
    private String value;

    public StringSVO(String value) {
        super();
        this.value = value;
    }

    /**
     * just returns the value string since {@link String} is final anyways
     */
    @Override
    public String value() {
        return value;
    }

}
