/*package com.codecool.taxicompany;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPhoneNumberRegistry implements MobileNoRegistry {

    private List<String> numbers = new ArrayList<>();


    @Override
    public List<String> getPhoneNumbers() {
        return numbers;

        //multi threaded környezetben copyOf()-ot adunk vissza.
    }

    @Override
    public void registerDriver(String number) {
        numbers.add(number);
    }
}*/
