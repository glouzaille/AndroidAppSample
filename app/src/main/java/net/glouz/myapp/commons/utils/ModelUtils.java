package net.glouz.myapp.commons.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by glouzonf on 27/05/2015.
 */
public class ModelUtils {

    private static ModelUtils sModelUtils;
    private ObjectMapper mMapper;

    public static ModelUtils getInstance() {
        if (sModelUtils == null) {
            sModelUtils = new ModelUtils();
        }

        return sModelUtils;
    }

    public ObjectMapper getObjectMapper (){
        if (mMapper == null){
            mMapper = new ObjectMapper();
        }
        return mMapper;
    }
}
