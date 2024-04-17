package com.withings.webservices.legacy.common.exception;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.withings.webservices.legacy.common.exception.WrongStatusException;
/* loaded from: classes4.dex */
public class TooManyRequestException extends WrongStatusException.Runtime {
    private final Response response;

    /* loaded from: classes4.dex */
    public static class Response {
        @SerializedName("wait_seconds")
        public Integer timeToWaitInSeconds;
    }

    public TooManyRequestException(String str, WrongStatusException.Conversion conversion, Response response) {
        super(str, conversion);
        this.response = response;
    }

    public static WrongStatusException.Runtime fromWrongStatusException(String str, WrongStatusException.Conversion conversion) {
        try {
            return new TooManyRequestException(str, conversion, (Response) new GsonBuilder().create().fromJson(conversion.getBody(), (Class<Object>) Response.class));
        } catch (JsonSyntaxException unused) {
            return new WrongStatusException.Runtime(str, conversion);
        }
    }

    public Integer getTimeToWaitSeconds() {
        Response response = this.response;
        if (response != null) {
            return response.timeToWaitInSeconds;
        }
        return null;
    }
}
