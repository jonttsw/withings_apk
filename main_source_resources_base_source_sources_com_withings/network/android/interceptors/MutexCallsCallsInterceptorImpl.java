package com.withings.network.android.interceptors;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Response;
import x70.b;
/* compiled from: MutexCallsInterceptor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/withings/network/android/interceptors/MutexCallsCallsInterceptorImpl;", "Lcom/withings/network/android/interceptors/MutexCallsCallsInterceptor;", "()V", "semaphore", "Ljava/util/concurrent/Semaphore;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MutexCallsCallsInterceptorImpl implements MutexCallsCallsInterceptor {
    public static final Companion Companion = new Companion(null);
    private static final long TIMEOUT_IN_SECONDS = 10;
    private final Semaphore semaphore = new Semaphore(1);

    /* compiled from: MutexCallsInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/network/android/interceptors/MutexCallsCallsInterceptorImpl$Companion;", "", "()V", "TIMEOUT_IN_SECONDS", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        u.j(chain, "chain");
        HttpUrl url = chain.request().url();
        if (this.semaphore.tryAcquire()) {
            b.l(this, "No need to wait for lock for call for call " + url, new Object[0]);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.semaphore.tryAcquire(TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)) {
                b.t(this, "Waited for lock " + (System.currentTimeMillis() - currentTimeMillis) + " ms for call " + url, new Object[0]);
            } else {
                b.l(this, "Lock wasn't released in 10 sec for call " + url, new Object[0]);
                throw new MutexCallException();
            }
        }
        try {
            return chain.proceed(chain.request());
        } finally {
            this.semaphore.release();
        }
    }
}
