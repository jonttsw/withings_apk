package com.withings.webservices.legacy.common.exception;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.withings.webservices.legacy.common.exception.WrongStatusException;
import com.withings.webservices.legacy.withings.model.WsComeBackLaterResponse;
/* loaded from: classes4.dex */
public class ComeBackLaterException extends WrongStatusException.Runtime {
    private final WsComeBackLaterResponse response;

    public ComeBackLaterException(String str, WrongStatusException.Conversion conversion, WsComeBackLaterResponse wsComeBackLaterResponse) {
        super(str, conversion);
        this.response = wsComeBackLaterResponse;
    }

    public static WrongStatusException.Runtime fromWrongStatusException(String str, WrongStatusException.Conversion conversion) {
        try {
            return new ComeBackLaterException(str, conversion, (WsComeBackLaterResponse) new GsonBuilder().create().fromJson(conversion.getBody(), (Class<Object>) WsComeBackLaterResponse.class));
        } catch (JsonSyntaxException unused) {
            return new WrongStatusException.Runtime(str, conversion);
        }
    }

    public int getSecondsToWait() {
        return this.response.delay;
    }
}
