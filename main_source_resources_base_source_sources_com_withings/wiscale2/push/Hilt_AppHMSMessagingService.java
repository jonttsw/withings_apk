package com.withings.wiscale2.push;

import com.huawei.hms.push.HmsMessageService;
import dagger.hilt.android.internal.managers.h;
/* loaded from: classes5.dex */
public abstract class Hilt_AppHMSMessagingService extends HmsMessageService implements ik0.b {

    /* renamed from: b  reason: collision with root package name */
    private volatile h f59549b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f59550c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f59551d = false;

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f59549b == null) {
            synchronized (this.f59550c) {
                try {
                    if (this.f59549b == null) {
                        this.f59549b = new h(this);
                    }
                } finally {
                }
            }
        }
        return this.f59549b.generatedComponent();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.f59551d) {
            this.f59551d = true;
            ((a) generatedComponent()).a((AppHMSMessagingService) this);
        }
        super.onCreate();
    }
}
