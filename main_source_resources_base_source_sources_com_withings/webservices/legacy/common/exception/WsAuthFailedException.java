package com.withings.webservices.legacy.common.exception;

import com.withings.webservices.legacy.common.exception.WrongStatusException;
/* loaded from: classes4.dex */
public class WsAuthFailedException extends WrongStatusException.Checked {

    /* loaded from: classes4.dex */
    public static class Runtime extends WrongStatusException.Runtime {
        public Runtime(WsAuthFailedException wsAuthFailedException) {
            super(wsAuthFailedException.getStatus(), wsAuthFailedException.getError(), wsAuthFailedException.getBody());
        }
    }

    public WsAuthFailedException(String str, WrongStatusException.Conversion conversion) {
        super(str, conversion);
    }

    public WsAuthFailedException(String str) {
        super(str);
    }
}
