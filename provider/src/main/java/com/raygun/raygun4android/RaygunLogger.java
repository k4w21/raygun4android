package com.raygun.raygun4android;

import android.util.Log;

public class RaygunLogger {

    private static String TAG = "Raygun4Android";

    public static void d(String string) {
        if (string != null) {
            Log.d(TAG, string);
        }
    }

    public static void i(String string) {
        if (string != null) {
            Log.i(TAG, string);
        }
    }

    public static void w(String string) {
        if (string != null) {
            Log.w(TAG, string);
        }
    }

    public static void e(String string) {
        if (string != null) {
            Log.e(TAG, string);
        }
    }

    public static void v(String string) {
        if (string != null) {
            Log.v(TAG, string);
        }
    }

    public static void responseCode(int responseCode) {
        switch (responseCode) {
            case RaygunSettings.RESPONSE_CODE_ACCEPTED:
                d("Request succeeded");
                break;
            case RaygunSettings.RESPONSE_CODE_BAD_MESSAGE:
                e("Bad message - could not parse the provided JSON. Check all fields are present, especially both occurredOn (ISO 8601 DateTime) and details { } at the top level");
                break;
            case RaygunSettings.RESPONSE_CODE_INVALID_API_KEY:
                e("Invalid API Key - The value specified in the header X-ApiKey did not match with an application in Raygun");
                break;
            case RaygunSettings.RESPONSE_CODE_LARGE_PAYLOAD:
                e("Request entity too large - The maximum size of a JSON payload is 128KB");
                break;
            case RaygunSettings.RESPONSE_CODE_RATE_LIMITED:
                e("Too Many Requests - Plan limit exceeded for month or plan expired");
                break;
            default:
                d("Response status code: " + responseCode);

        }
    }

}