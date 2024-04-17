package com.withings.network.android.interceptors;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: BlockBackgroundCallsInterceptor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/withings/network/android/interceptors/BlockMetaData;", "", "url", "", "errorCode", "", "timestamp", "", "duration", "(Ljava/lang/String;IJJ)V", "getDuration", "()J", "getErrorCode", "()I", "getTimestamp", "getUrl", "()Ljava/lang/String;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BlockMetaData {
    private final long duration;
    private final int errorCode;
    private final long timestamp;
    private final String url;

    public BlockMetaData(String url, int i11, long j5, long j11) {
        u.j(url, "url");
        this.url = url;
        this.errorCode = i11;
        this.timestamp = j5;
        this.duration = j11;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getUrl() {
        return this.url;
    }
}
