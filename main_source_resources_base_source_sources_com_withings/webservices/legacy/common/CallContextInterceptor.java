package com.withings.webservices.legacy.common;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.common.exception.MissingCallContextException;
import dp0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.receipts.DeliveryReceiptRequest;
import retrofit.RequestInterceptor;
import u70.a;
import w6.o;
import x70.b;
/* compiled from: CallContextInterceptor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B#\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/withings/webservices/legacy/common/CallContextInterceptor;", "Lretrofit/RequestInterceptor;", "Lretrofit/RequestInterceptor$RequestFacade;", DeliveryReceiptRequest.ELEMENT, "Lnm0/y;", "intercept", "(Lretrofit/RequestInterceptor$RequestFacade;)V", "Lu70/a;", "backgroundManager", "Lu70/a;", "", "syncContext", "Ljava/lang/String;", "", "shouldFailOnSimpleCallContext", "Z", "<init>", "(Lu70/a;Ljava/lang/String;Z)V", "Companion", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CallContextInterceptor implements RequestInterceptor {
    public static final Companion Companion = new Companion(null);
    private static final int DELAY_CONSIDER_FOREGROUND = 120000;
    private final a backgroundManager;
    private final boolean shouldFailOnSimpleCallContext;
    private final String syncContext;

    /* compiled from: CallContextInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/webservices/legacy/common/CallContextInterceptor$Companion;", "", "()V", "DELAY_CONSIDER_FOREGROUND", "", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
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
        this.shouldFailOnSimpleCallContext = z5;
    }

    @Override // retrofit.RequestInterceptor
    public void intercept(RequestInterceptor.RequestFacade request) {
        String str;
        u.j(request, "request");
        if (this.backgroundManager.d(120000L)) {
            str = ConstantsWs.CALLCTX_BACKGROUND;
        } else {
            str = ConstantsWs.CALLCTX_FOREGROUND;
        }
        String str2 = this.syncContext;
        if (str2 != null && !j.D(str2)) {
            str = o.a(str, ",", this.syncContext);
        } else if (this.shouldFailOnSimpleCallContext) {
            b.e(this, new MissingCallContextException());
        }
        request.addQueryParam(com.withings.network.android.interceptors.CallContextInterceptor.KEY_CTX, str);
    }

    public /* synthetic */ CallContextInterceptor(a aVar, String str, boolean z5, int i11, m mVar) {
        this(aVar, str, (i11 & 4) != 0 ? false : z5);
    }
}
