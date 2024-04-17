package com.withings.webservices.legacy.common.exception;

import com.withings.webservices.legacy.common.exception.WrongStatusException;
/* loaded from: classes4.dex */
public class WrongRelationException extends WrongStatusException.Checked {
    public WrongRelationException(String str, WrongStatusException.Conversion conversion) {
        super(str, conversion);
    }
}
