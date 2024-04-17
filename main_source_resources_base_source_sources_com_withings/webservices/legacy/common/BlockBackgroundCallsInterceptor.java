package com.withings.webservices.legacy.common;

import android.support.v4.media.session.c;
import com.withings.webservices.legacy.common.exception.BlockedCallException;
import org.joda.time.DateTime;
import retrofit.RequestInterceptor;
import retrofit.RetrofitError;
import u70.a;
import x70.b;
/* loaded from: classes4.dex */
public class BlockBackgroundCallsInterceptor implements RequestInterceptor {
    private static final int MAX_BLOCK_DURATION_SECONDS = 14400;
    private final a backgroundManager;
    private DateTime blockCallsEndDate;
    private MetaData metaData;

    /* loaded from: classes4.dex */
    public static class MetaData {
        public final long duration;
        public final int errorCode;
        public final long timestamp;
        public final String url;

        public MetaData(String str, int i11, long j5, long j11) {
            this.url = str;
            this.errorCode = i11;
            this.timestamp = j5;
            this.duration = j11;
        }
    }

    public BlockBackgroundCallsInterceptor(a aVar) {
        this.backgroundManager = aVar;
    }

    public void blockCallsForSeconds(int i11, MetaData metaData) {
        this.blockCallsEndDate = DateTime.now().plusSeconds(Math.min(i11, (int) MAX_BLOCK_DURATION_SECONDS));
        this.metaData = metaData;
    }

    @Override // retrofit.RequestInterceptor
    public void intercept(RequestInterceptor.RequestFacade requestFacade) {
        String str;
        String str2;
        boolean d11 = this.backgroundManager.d(0L);
        if (this.blockCallsEndDate != null && DateTime.now().isBefore(this.blockCallsEndDate)) {
            if (d11) {
                if (this.metaData != null) {
                    StringBuilder sb2 = new StringBuilder("Call is blocked because we received a ");
                    sb2.append(this.metaData.errorCode);
                    sb2.append(" on the call ");
                    sb2.append(this.metaData.url);
                    sb2.append("at ");
                    sb2.append(this.metaData.timestamp);
                    sb2.append(" for a duration of ");
                    str2 = c.c(sb2, this.metaData.duration, " s");
                } else {
                    str2 = "Calls are blocked in background on demand of platform until " + this.blockCallsEndDate;
                }
                throw RetrofitError.unexpectedError(str2, new BlockedCallException(str2));
            }
            if (this.metaData != null) {
                StringBuilder sb3 = new StringBuilder("Call would be blocked because we received a ");
                sb3.append(this.metaData.errorCode);
                sb3.append(" on the call ");
                sb3.append(this.metaData.url);
                sb3.append("at ");
                sb3.append(this.metaData.timestamp);
                sb3.append(" for a duration of ");
                str = c.c(sb3, this.metaData.duration, " s");
            } else {
                str = "Calls would be blocked on demand of platform until " + this.blockCallsEndDate;
            }
            b.n(new BlockedCallException(str));
        }
    }

    public void stopBlockingCalls() {
        this.blockCallsEndDate = null;
    }
}
