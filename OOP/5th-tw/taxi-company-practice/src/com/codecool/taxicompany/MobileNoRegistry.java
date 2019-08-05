package com.codecool.taxicompany;

import java.util.List;

public interface MobileNoRegistry {

    List<String> getPhoneNumbers();

    void registerDriver(String number);

}

