package com.withings.webservices.legacy.common.exception;

import com.withings.webservices.legacy.common.exception.WrongStatusException;
/* loaded from: classes4.dex */
public class TooBigException extends WrongStatusException.Checked {
    public TooBigException(String str, WrongStatusException.Conversion conversion) {
        super(str, conversion);
    }
}
