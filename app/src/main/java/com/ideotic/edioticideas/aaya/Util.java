package com.ideotic.edioticideas.aaya;

import android.support.annotation.Nullable;

/**
 * Created by nayem on 13-01-2018.
 */
public class Util {

    public static String mail(String add){
        String add1 = add.replaceAll("dot", ".").replaceAll("dash","-").replaceAll("underscore", "_")
                .replaceAll("at the rate", "@").replaceAll(" and","&");
        return add1;
    }

    @Nullable
    public static String number (String num)
    {
        String num1;
        for (int i = 0; i<=9;i++ )
            num1 = num.replace(num,num + " ");
        return null;
    }
}
