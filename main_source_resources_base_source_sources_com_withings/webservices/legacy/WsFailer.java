package com.withings.webservices.legacy;

import com.withings.webservices.legacy.common.exception.BlockedCallException;
import com.withings.webservices.legacy.common.exception.ComeBackLaterException;
import com.withings.webservices.legacy.common.exception.TooManyRequestException;
import com.withings.webservices.legacy.common.exception.UnverifiedSessionException;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import java.util.Arrays;
import java.util.List;
import retrofit.RetrofitError;
import vh.a;
import vh.m;
import vh.p;
import x70.b;
/* loaded from: classes4.dex */
public class WsFailer {
    private static List<Class<? extends Exception>> acceptedExceptions = Arrays.asList(TooManyRequestException.class, ComeBackLaterException.class, WsAuthFailedException.class, WsAuthFailedException.Runtime.class, BlockedCallException.class, UnverifiedSessionException.class);

    /* loaded from: classes4.dex */
    public static abstract class ActionCallback implements a.InterfaceC1759a {
        @Override // vh.p
        public void onError(Exception exc) {
            WsFailer.failWithException(exc);
        }

        @Override // vh.a.b
        public abstract /* synthetic */ void onResult();
    }

    /* loaded from: classes4.dex */
    public static abstract class CallCallback<R> implements m.a<R> {
        public void onError(Exception exc) {
            WsFailer.failWithException(exc);
        }

        @Override // vh.m.b
        public abstract /* synthetic */ void onResult(Object obj);
    }

    /* loaded from: classes4.dex */
    public static class ErrorCallback implements p {
        @Override // vh.p
        public void onError(Exception exc) {
            WsFailer.failWithException(exc);
        }
    }

    public static void failWithException(Exception exc) {
        if (!isNetworkException(exc)) {
            b.p(exc);
        }
    }

    public static boolean isNetworkException(Exception exc) {
        for (Class<? extends Exception> cls : acceptedExceptions) {
            if (cls.isInstance(exc)) {
                return true;
            }
        }
        if ((exc instanceof RetrofitError) && ((RetrofitError) exc).getKind() == RetrofitError.Kind.NETWORK) {
            return true;
        }
        return false;
    }

    /* loaded from: classes4.dex */
    public static class DefaultActionCallback extends ActionCallback {
        @Override // com.withings.webservices.legacy.WsFailer.ActionCallback, vh.a.b
        public void onResult() {
        }
    }

    /* loaded from: classes4.dex */
    public static class DefaultCallCallback<R> extends CallCallback<R> {
        @Override // com.withings.webservices.legacy.WsFailer.CallCallback, vh.m.b
        public void onResult(R r7) {
        }
    }
}
