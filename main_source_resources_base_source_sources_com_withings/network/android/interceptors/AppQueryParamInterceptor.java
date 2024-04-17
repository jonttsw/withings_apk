package com.withings.network.android.interceptors;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jivesoftware.smackx.receipts.DeliveryReceiptRequest;
import retrofit.RequestInterceptor;
/* compiled from: AppQueryParamInterceptor.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/withings/network/android/interceptors/AppQueryParamInterceptor;", "Lretrofit/RequestInterceptor;", "Lokhttp3/Interceptor;", "Lretrofit/RequestInterceptor$RequestFacade;", DeliveryReceiptRequest.ELEMENT, "Lnm0/y;", "intercept", "(Lretrofit/RequestInterceptor$RequestFacade;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "", "appName", "Ljava/lang/String;", "", "appVersion", "I", "<init>", "(Ljava/lang/String;I)V", "Companion", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AppQueryParamInterceptor implements RequestInterceptor, Interceptor {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String KEY_APP_NAME = "appname";
    @Deprecated
    public static final String KEY_APP_PFM = "apppfm";
    @Deprecated
    public static final String KEY_APP_VERSION = "appliver";
    @Deprecated
    public static final String VALUE_APP_PFM = "android";
    private final String appName;
    private final int appVersion;

    /* compiled from: AppQueryParamInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/withings/network/android/interceptors/AppQueryParamInterceptor$Companion;", "", "()V", "KEY_APP_NAME", "", "KEY_APP_PFM", "KEY_APP_VERSION", "VALUE_APP_PFM", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public AppQueryParamInterceptor(String appName, int i11) {
        u.j(appName, "appName");
        this.appName = appName;
        this.appVersion = i11;
    }

    @Override // retrofit.RequestInterceptor
    public void intercept(RequestInterceptor.RequestFacade request) {
        u.j(request, "request");
        request.addQueryParam(KEY_APP_PFM, "android");
        request.addQueryParam(KEY_APP_NAME, this.appName);
        request.addQueryParam(KEY_APP_VERSION, String.valueOf(this.appVersion));
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        u.j(chain, "chain");
        Request request = chain.request();
        return chain.proceed(request.newBuilder().url(request.url().newBuilder().addQueryParameter(KEY_APP_PFM, "android").addQueryParameter(KEY_APP_NAME, this.appName).addQueryParameter(KEY_APP_VERSION, String.valueOf(this.appVersion)).build()).build());
    }
}
