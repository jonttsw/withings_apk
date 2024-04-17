package com.withings.wiscale2.locale;

import ah.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import zg0.a;
/* loaded from: classes5.dex */
public abstract class Hilt_LocaleChangedReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f57992a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Object f57993b = new Object();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.f57992a) {
            synchronized (this.f57993b) {
                try {
                    if (!this.f57992a) {
                        ((a) k.i(context)).s((LocaleChangedReceiver) this);
                        this.f57992a = true;
                    }
                } finally {
                }
            }
        }
    }
}
