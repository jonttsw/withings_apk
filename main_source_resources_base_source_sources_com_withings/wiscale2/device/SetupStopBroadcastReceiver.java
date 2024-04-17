package com.withings.wiscale2.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SetupBroadcastReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/SetupStopBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SetupStopBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e eVar;
        eVar = e.f67637h;
        if (eVar != null) {
            eVar.g();
        } else {
            u.s("instance");
            throw null;
        }
    }
}
