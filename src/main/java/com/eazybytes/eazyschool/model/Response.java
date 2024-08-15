package com.eazybytes.eazyschool.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor//Generate a constructor with all fields i have
@NoArgsConstructor//Generate a constructor without any input parameter(default values)
public class Response {

    public String statusCode;
    public String statusMsg;
}
