package com.withings.network.android.interceptors;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.common.exception.MissingCallContextException;
import dp0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jivesoftware.smackx.receipts.DeliveryReceiptRequest;
import retrofit.RequestInterceptor;
import u70.a;
import w6.o;
import x70.b;
/* compiled from: CallContextInterceptor.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B#\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/withings/network/android/interceptors/CallContextInterceptor;", "Lretrofit/RequestInterceptor;", "Lokhttp3/Interceptor;", "", "getContextParam", "()Ljava/lang/String;", "Lretrofit/RequestInterceptor$RequestFacade;", DeliveryReceiptRequest.ELEMENT, "Lnm0/y;", "intercept", "(Lretrofit/RequestInterceptor$RequestFacade;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lu70/a;", "backgroundManager", "Lu70/a;", "syncContext", "Ljava/lang/String;", "", "shouldWarnIfContextNotSet", "Z", "<init>", "(Lu70/a;Ljava/lang/String;Z)V", "Companion", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CallContextInterceptor implements RequestInterceptor, Interceptor {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final int DELAY_CONSIDER_FOREGROUND = 120000;
    @Deprecated
    public static final String KEY_CTX = "callctx";
    private final a backgroundManager;
    private final boolean shouldWarnIfContextNotSet;
    private final String syncContext;

    /* compiled from: CallContextInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/network/android/interceptors/CallContextInterceptor$Companion;", "", "()V", "DELAY_CONSIDER_FOREGROUND", "", "KEY_CTX", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public CallContextInterceptor(a backgroundManager, String str, boolean z5) {
        u.j(backgroundManager, "backgroundManager");
        this.backgroundManager = backgroundManager;
        this.syncContext = str;
        this.shouldWarnIfContextNotSet = z5;
    }

    private final String getContextParam() {
        String str;
        if (this.backgroundManager.d(120000L)) {
            str = ConstantsWs.CALLCTX_BACKGROUND;
        } else {
            str = ConstantsWs.CALLCTX_FOREGROUND;
        }
        String str2 = this.syncContext;
        if (str2 != null && !j.D(str2)) {
            return o.a(str, ",", this.syncContext);
        }
        if (this.shouldWarnIfContextNotSet) {
            b.e(this, new MissingCallContextException());
            return str;
        }
        return str;
    }

    @Override // retrofit.RequestInterceptor
    public void intercept(RequestInterceptor.RequestFacade request) {
        u.j(request, "request");
        request.addQueryParam(KEY_CTX, getContextParam());
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        u.j(chain, "chain");
        Request request = chain.request();
        return chain.proceed(request.newBuilder().url(request.url().newBuilder().addQueryParameter(KEY_CTX, getContextParam()).build()).build());
    }

    public /* synthetic */ CallContextInterceptor(a aVar, String str, boolean z5, int i11, m mVar) {
        this(aVar, str, (i11 & 4) != 0 ? false : z5);
    }
}
