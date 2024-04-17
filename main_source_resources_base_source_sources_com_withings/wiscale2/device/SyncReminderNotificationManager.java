package com.withings.wiscale2.device;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.r;
import androidx.core.app.y;
import androidx.core.content.a;
import com.withings.device.Device;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import fl.p;
import kn.e;
/* loaded from: classes5.dex */
public final class SyncReminderNotificationManager {

    /* loaded from: classes5.dex */
    public static class AlarmReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("com.withings.wiscale2.device.DEVICE_SYNC_CHECK".equals(intent.getAction())) {
                Device d11 = e.c().d(intent.getLongExtra("EXTRA_DEVICE", -1L));
                if (d11 == null) {
                    Fail.j("Error : Device is null");
                    return;
                }
                String string = context.getString(C1987R.string._WITHINGS_DEVICE_SYNC_IMPOSSIBLE_);
                String string2 = context.getString(p.f67672b.a().d(d11.getModelId()).I(d11.getColor()));
                r rVar = new r(context, null);
                rVar.m(string2);
                rVar.l(string);
                long id2 = d11.getId();
                Intent intent2 = new Intent("com.withings.wiscale2.device.DELETE_NO_SYNC_NOTIF");
                intent2.putExtra("EXTRA_DEVICE", id2);
                rVar.o(PendingIntent.getBroadcast(context, 0, intent2, 201326592));
                rVar.e(true);
                rVar.u(true);
                rVar.h(a.getColor(context, C1987R.color.statusInfo));
                rVar.B(2131231550);
                MainActivity.f47950r.getClass();
                rVar.k(PendingIntent.getActivity(context, 0, MainActivity.a.a(context), 201326592));
                y.c(context).e(null, ((int) d11.getId()) + 42, rVar.c());
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class DeleteNotificationReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("com.withings.wiscale2.device.DELETE_NO_SYNC_NOTIF".equals(intent.getAction())) {
                SyncReminderNotificationManager.a(context, intent.getLongExtra("EXTRA_DEVICE", -1L));
            }
        }
    }

    public static void a(Context context, long j5) {
        a.registerReceiver(context, new AlarmReceiver(), new IntentFilter("com.withings.wiscale2.device.DEVICE_SYNC_CHECK"), 4);
        a.registerReceiver(context, new DeleteNotificationReceiver(), new IntentFilter("com.withings.wiscale2.device.DELETE_NO_SYNC_NOTIF"), 4);
        y.c(context).b(((int) j5) + 42, null);
        Intent intent = new Intent("com.withings.wiscale2.device.DEVICE_SYNC_CHECK");
        intent.setPackage(context.getPackageName());
        intent.putExtra("EXTRA_DEVICE", j5);
        ((AlarmManager) context.getSystemService("alarm")).set(0, System.currentTimeMillis() + 172800000, PendingIntent.getBroadcast(context, 0, intent, 201326592));
    }
}
