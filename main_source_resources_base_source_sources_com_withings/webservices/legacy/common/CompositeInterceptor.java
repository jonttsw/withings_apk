package com.withings.webservices.legacy.common;

import java.util.ArrayList;
import java.util.List;
import retrofit.RequestInterceptor;
/* loaded from: classes4.dex */
public class CompositeInterceptor implements RequestInterceptor {
    private List<RequestInterceptor> interceptors = new ArrayList();

    public void addInterceptor(RequestInterceptor requestInterceptor) {
        this.interceptors.add(requestInterceptor);
    }

    @Override // retrofit.RequestInterceptor
    public void intercept(RequestInterceptor.RequestFacade requestFacade) {
        for (RequestInterceptor requestInterceptor : this.interceptors) {
            requestInterceptor.intercept(requestFacade);
        }
    }
}
