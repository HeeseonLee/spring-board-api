package com.study.springboard.util;

public class MaskingUtil {
    public static String maskingName(String name) {
        String firstNm = name.substring(0, 1);
        String middleNm = "";
        String lastNm = "";

        String rtnNm = "";

        if (name != null && !name.equals("")) {
            if (name.length() == 1) {
                rtnNm = name;
            } else if (name.length() == 2) {
                rtnNm = firstNm + "*";
            } else {
                lastNm = name.substring(name.length() - 1, name.length());
                middleNm = name.substring(1, name.length() - 1);

                String masking = "";
                for (int i = 0; i < middleNm.length(); i++) {
                    masking += "*";
                }

                rtnNm = firstNm + masking + lastNm;
            }
        }
        return rtnNm;
    }
}
