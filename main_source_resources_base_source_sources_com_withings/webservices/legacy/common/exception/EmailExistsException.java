package com.withings.webservices.legacy.common.exception;

import com.withings.webservices.legacy.common.exception.WrongStatusException;
/* loaded from: classes4.dex */
public class EmailExistsException extends WrongStatusException.Checked {
    public EmailExistsException(String str, WrongStatusException.Conversion conversion) {
        super(str, conversion);
    }
}
