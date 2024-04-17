package com.withings.webservices.legacy.common;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.receipts.DeliveryReceiptRequest;
import retrofit.RequestInterceptor;
/* compiled from: AppQueryParamInterceptor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/withings/webservices/legacy/common/AppQueryParamInterceptor;", "Lretrofit/RequestInterceptor;", "Lretrofit/RequestInterceptor$RequestFacade;", DeliveryReceiptRequest.ELEMENT, "Lnm0/y;", "intercept", "(Lretrofit/RequestInterceptor$RequestFacade;)V", "", "lng", "Ljava/lang/String;", "appName", "", "appVersion", "I", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AppQueryParamInterceptor implements RequestInterceptor {
    private final String appName;
    private final int appVersion;
    private final String lng;

    public AppQueryParamInterceptor(String lng, String appName, int i11) {
        u.j(lng, "lng");
        u.j(appName, "appName");
        this.lng = lng;
        this.appName = appName;
        this.appVersion = i11;
    }

    @Override // retrofit.RequestInterceptor
    public void intercept(RequestInterceptor.RequestFacade request) {
        u.j(request, "request");
        request.addQueryParam(com.withings.network.android.interceptors.AppQueryParamInterceptor.KEY_APP_PFM, "android");
        request.addQueryParam(com.withings.network.android.interceptors.AppQueryParamInterceptor.KEY_APP_NAME, this.appName);
        request.addQueryParam(com.withings.network.android.interceptors.AppQueryParamInterceptor.KEY_APP_VERSION, String.valueOf(this.appVersion));
    }
}
