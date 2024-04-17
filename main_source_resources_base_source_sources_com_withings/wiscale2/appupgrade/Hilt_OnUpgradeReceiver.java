package com.withings.wiscale2.appupgrade;

import ah.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import lb0.o;
/* loaded from: classes4.dex */
public abstract class Hilt_OnUpgradeReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f50043a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Object f50044b = new Object();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.f50043a) {
            synchronized (this.f50044b) {
                try {
                    if (!this.f50043a) {
                        ((o) k.i(context)).p((OnUpgradeReceiver) this);
                        this.f50043a = true;
                    }
                } finally {
                }
            }
        }
    }
}
