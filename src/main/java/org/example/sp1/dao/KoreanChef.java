package org.example.sp1.dao;

import org.springframework.stereotype.Repository;


public class KoreanChef implements Chef {
    @Override
    public String cook() {
        return "Rice";
    }
}
