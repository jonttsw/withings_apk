package com.withings.network.android.interceptors;

import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jivesoftware.smackx.receipts.DeliveryReceiptRequest;
import retrofit.RequestInterceptor;
import retrofit.RetrofitError;
import ym0.a;
/* compiled from: SessionInterceptor.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/withings/network/android/interceptors/SessionInterceptor;", "Lretrofit/RequestInterceptor;", "Lokhttp3/Interceptor;", "Lretrofit/RequestInterceptor$RequestFacade;", DeliveryReceiptRequest.ELEMENT, "Lnm0/y;", "intercept", "(Lretrofit/RequestInterceptor$RequestFacade;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lkotlin/Function0;", "", "sessionIdProvider", "Lym0/a;", "<init>", "(Lym0/a;)V", "Companion", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SessionInterceptor implements RequestInterceptor, Interceptor {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String KEY_SESSION_ID = "Session-Id";
    private final a<String> sessionIdProvider;

    /* compiled from: SessionInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/network/android/interceptors/SessionInterceptor$Companion;", "", "()V", "KEY_SESSION_ID", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public SessionInterceptor(a<String> sessionIdProvider) {
        u.j(sessionIdProvider, "sessionIdProvider");
        this.sessionIdProvider = sessionIdProvider;
    }

    @Override // retrofit.RequestInterceptor
    public void intercept(RequestInterceptor.RequestFacade request) {
        u.j(request, "request");
        try {
            request.addHeader(KEY_SESSION_ID, this.sessionIdProvider.invoke());
        } catch (WsAuthFailedException e11) {
            RetrofitError unexpectedError = RetrofitError.unexpectedError("Unable to get session (wrong password)", e11);
            u.i(unexpectedError, "unexpectedError(...)");
            throw unexpectedError;
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        u.j(chain, "chain");
        Request request = chain.request();
        Headers.Builder newBuilder = request.headers().newBuilder();
        String invoke = this.sessionIdProvider.invoke();
        if (invoke == null) {
            invoke = "";
        }
        return chain.proceed(request.newBuilder().headers(newBuilder.add(KEY_SESSION_ID, invoke).build()).build());
    }
}
