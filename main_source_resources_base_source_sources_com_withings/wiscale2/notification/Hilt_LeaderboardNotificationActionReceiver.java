package com.withings.wiscale2.notification;

import ah.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes5.dex */
public abstract class Hilt_LeaderboardNotificationActionReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f58725a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Object f58726b = new Object();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.f58725a) {
            synchronized (this.f58726b) {
                try {
                    if (!this.f58725a) {
                        ((th0.c) k.i(context)).n((LeaderboardNotificationActionReceiver) this);
                        this.f58725a = true;
                    }
                } finally {
                }
            }
        }
    }
}
