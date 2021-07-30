package com.example.kotlinmvvmpratice.bigchicken.utils;

import org.json.JSONObject;

public class ErrorUtils {

    public static ApiError parseError(String mjson) {
        try {
            JSONObject json = new JSONObject(mjson);
            ApiError error = new ApiError(
                    json.optString("error", ""),
                    json.optString("error_description", "")
            );
            return error;
        }catch (Exception ex){
            return new ApiError("", "401");
        }
    }

    public static ApiError parseError(Throwable t) {
        try {
            return new ApiError(t.getMessage(), t.getLocalizedMessage());
        }catch (Exception ex){
            ex.printStackTrace();
            return new ApiError(t.getMessage(), t.getLocalizedMessage());
        }
    }
}
