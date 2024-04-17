package com.withings.wiscale2.push;

import com.google.firebase.messaging.FirebaseMessagingService;
import dagger.hilt.android.internal.managers.h;
/* loaded from: classes5.dex */
public abstract class Hilt_HMFirebaseMessagingService extends FirebaseMessagingService implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private volatile h f59552a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f59553b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private boolean f59554c = false;

    @Override // ik0.b
    public final Object generatedComponent() {
        if (this.f59552a == null) {
            synchronized (this.f59553b) {
                try {
                    if (this.f59552a == null) {
                        this.f59552a = new h(this);
                    }
                } finally {
                }
            }
        }
        return this.f59552a.generatedComponent();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.f59554c) {
            this.f59554c = true;
            ((c) generatedComponent()).b((HMFirebaseMessagingService) this);
        }
        super.onCreate();
    }
}
