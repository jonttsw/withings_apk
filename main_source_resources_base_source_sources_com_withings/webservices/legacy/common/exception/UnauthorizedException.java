package com.withings.webservices.legacy.common.exception;

import com.withings.webservices.legacy.common.exception.WrongStatusException;
/* loaded from: classes4.dex */
public class UnauthorizedException extends WrongStatusException.Checked {
    public UnauthorizedException(String str, WrongStatusException.Conversion conversion) {
        super(str, conversion);
    }
}
