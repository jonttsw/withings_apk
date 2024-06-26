package com.withings.network.android.interceptors;

import java.io.IOException;
import kotlin.Metadata;
/* compiled from: MutexCallsInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/network/android/interceptors/MutexCallException;", "Ljava/io/IOException;", "()V", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MutexCallException extends IOException {
    public MutexCallException() {
        super("Semaphore wasn't released in 10 sec");
    }
}
