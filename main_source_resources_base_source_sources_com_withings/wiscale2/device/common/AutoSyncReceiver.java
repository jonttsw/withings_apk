package com.withings.wiscale2.device.common;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import androidx.core.content.a;
import ay.b;
import com.withings.device.Device;
import fl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import u70.i;
/* compiled from: AutoSyncReceiver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/AutoSyncReceiver;", "Landroid/content/BroadcastReceiver;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AutoSyncReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final String f50696a;

    public AutoSyncReceiver(String str) {
        this.f50696a = str;
    }

    public final PendingIntent a(Context context, i iVar) {
        int i11;
        u.j(context, "context");
        Intent intent = new Intent(this.f50696a).setPackage(context.getPackageName());
        u.i(intent, "setPackage(...)");
        if (iVar != null) {
            intent.putExtra("EXTRA_MAC_ADDRESS", iVar.f());
        }
        if (iVar != null) {
            i11 = iVar.hashCode();
        } else {
            i11 = 0;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i11 + 6798, intent, 201326592);
        u.i(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public final void b(Context context, i iVar) {
        u.j(context, "context");
        a.registerReceiver(context, this, new IntentFilter(this.f50696a), 4);
        Object systemService = context.getSystemService("alarm");
        u.h(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).setInexactRepeating(2, SystemClock.elapsedRealtime() + 21600000, 21600000L, a(context, iVar));
    }

    public final void c(Context context, i iVar) {
        u.j(context, "context");
        b.w(context, this);
        Object systemService = context.getSystemService("alarm");
        u.h(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).cancel(a(context, iVar));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        e eVar;
        u.j(context, "context");
        u.j(intent, "intent");
        if (u70.a.b().d(60000L)) {
            i b10 = i.b(intent.getLongExtra("EXTRA_MAC_ADDRESS", 0L));
            Device f11 = kn.e.c().f(b10);
            if (f11 != null) {
                eVar = e.f67637h;
                if (eVar != null) {
                    e.c f12 = eVar.f(f11);
                    if (f12 instanceof e.d) {
                        ((e.d) f12).d();
                        return;
                    }
                    return;
                }
                u.s("instance");
                throw null;
            }
            c(context, b10);
        }
    }
}
