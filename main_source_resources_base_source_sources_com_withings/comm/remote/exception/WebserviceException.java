package com.withings.comm.remote.exception;

import com.withings.comm.remote.conversation.ConversationException;
/* loaded from: classes3.dex */
public class WebserviceException extends ConversationException {
    public WebserviceException() {
        super("Error contacting web services");
    }
}
