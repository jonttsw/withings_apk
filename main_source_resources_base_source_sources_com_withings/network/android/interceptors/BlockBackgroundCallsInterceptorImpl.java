package com.withings.network.android.interceptors;

import androidx.glance.appwidget.protobuf.g;
import com.withings.webservices.legacy.common.exception.BlockedCallException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.j;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jivesoftware.smackx.receipts.DeliveryReceiptRequest;
import org.joda.time.DateTime;
import retrofit.RequestInterceptor;
import retrofit.RetrofitError;
import u70.a;
import x70.b;
/* compiled from: BlockBackgroundCallsInterceptor.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u000e\u0010\u0013J!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001f¨\u0006#"}, d2 = {"Lcom/withings/network/android/interceptors/BlockBackgroundCallsInterceptorImpl;", "Lcom/withings/network/android/interceptors/BlockBackgroundCallsInterceptor;", "Lnm0/y;", "checkIfCallsAreBlocked", "()V", "", "callBlocked", "Lcom/withings/network/android/interceptors/BlockMetaData;", "metaData", "", "getBlockedCallErrorMessage", "(ZLcom/withings/network/android/interceptors/BlockMetaData;)Ljava/lang/String;", "Lretrofit/RequestInterceptor$RequestFacade;", DeliveryReceiptRequest.ELEMENT, "intercept", "(Lretrofit/RequestInterceptor$RequestFacade;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "", "seconds", "blockCallsForSeconds", "(ILcom/withings/network/android/interceptors/BlockMetaData;)V", "stopBlockingCalls", "Lu70/a;", "backgroundManager", "Lu70/a;", "Lorg/joda/time/DateTime;", "blockCallsEndDate", "Lorg/joda/time/DateTime;", "Lcom/withings/network/android/interceptors/BlockMetaData;", "<init>", "(Lu70/a;)V", "Companion", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BlockBackgroundCallsInterceptorImpl implements BlockBackgroundCallsInterceptor {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_BLOCK_DURATION_SECONDS = 14400;
    private final a backgroundManager;
    private DateTime blockCallsEndDate;
    private BlockMetaData metaData;

    /* compiled from: BlockBackgroundCallsInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/network/android/interceptors/BlockBackgroundCallsInterceptorImpl$Companion;", "", "()V", "MAX_BLOCK_DURATION_SECONDS", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public BlockBackgroundCallsInterceptorImpl(a backgroundManager) {
        u.j(backgroundManager, "backgroundManager");
        this.backgroundManager = backgroundManager;
    }

    private final void checkIfCallsAreBlocked() {
        if (this.blockCallsEndDate != null && DateTime.now().isBefore(this.blockCallsEndDate)) {
            boolean d11 = this.backgroundManager.d(0L);
            String blockedCallErrorMessage = getBlockedCallErrorMessage(d11, this.metaData);
            if (!d11) {
                b.n(new BlockedCallException(blockedCallErrorMessage));
                return;
            }
            RetrofitError unexpectedError = RetrofitError.unexpectedError(blockedCallErrorMessage, new BlockedCallException(blockedCallErrorMessage));
            u.i(unexpectedError, "unexpectedError(...)");
            throw unexpectedError;
        }
    }

    private final String getBlockedCallErrorMessage(boolean z5, BlockMetaData blockMetaData) {
        j jVar;
        if (z5) {
            jVar = new j("is", "are");
        } else {
            jVar = new j("would be", "would be");
        }
        String str = (String) jVar.a();
        String str2 = (String) jVar.b();
        if (blockMetaData != null) {
            int errorCode = blockMetaData.getErrorCode();
            String url = blockMetaData.getUrl();
            long timestamp = blockMetaData.getTimestamp();
            long duration = blockMetaData.getDuration();
            StringBuilder b10 = g.b("Call ", str, " blocked because we received a ", errorCode, " on the call ");
            b10.append(url);
            b10.append(" at ");
            b10.append(timestamp);
            b10.append(" for a duration of ");
            b10.append(duration);
            b10.append("s");
            String sb2 = b10.toString();
            if (sb2 != null) {
                return sb2;
            }
        }
        DateTime dateTime = this.blockCallsEndDate;
        return "Calls " + str2 + " blocked in background on demand of platform until " + dateTime;
    }

    @Override // com.withings.network.android.interceptors.BlockBackgroundCallsInterceptor
    public void blockCallsForSeconds(int i11, BlockMetaData blockMetaData) {
        DateTime now = DateTime.now();
        if (i11 > MAX_BLOCK_DURATION_SECONDS) {
            i11 = MAX_BLOCK_DURATION_SECONDS;
        }
        this.blockCallsEndDate = now.plusSeconds(i11);
        this.metaData = blockMetaData;
    }

    @Override // retrofit.RequestInterceptor
    public void intercept(RequestInterceptor.RequestFacade request) {
        u.j(request, "request");
        checkIfCallsAreBlocked();
    }

    @Override // com.withings.network.android.interceptors.BlockBackgroundCallsInterceptor
    public void stopBlockingCalls() {
        this.blockCallsEndDate = null;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        u.j(chain, "chain");
        checkIfCallsAreBlocked();
        return chain.proceed(chain.request());
    }
}
