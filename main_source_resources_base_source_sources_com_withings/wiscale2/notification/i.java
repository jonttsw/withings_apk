package com.withings.wiscale2.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.collection.m;
import androidx.core.app.r;
import androidx.core.app.u;
import androidx.core.app.y;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import ej.w;
import fl.o;
import fl.p;
import gl.j;
import jm.a;
import org.joda.time.DateTime;
/* compiled from: WithingsNotificationManager.java */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static m<a> f58763a = new m<>(1);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WithingsNotificationManager.java */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f58764a;

        /* synthetic */ a(int i11) {
            this();
        }

        private a() {
            this.f58764a = 0L;
        }
    }

    public static void a() {
        w.w().r(-222222);
    }

    public static void b(Device device) {
        f58763a.i(device.getId());
        w.w().r(((int) device.getId()) + 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r c(Context context, String str) {
        r rVar = new r(context, str);
        rVar.e(true);
        rVar.h(androidx.core.content.a.getColor(context, C1987R.color.statusInfo));
        rVar.B(2131231550);
        rVar.k(PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), 67108864));
        return rVar;
    }

    private static r d(Context context, a aVar, int i11, String str) {
        r c11 = c(context, "devices_channel_communication");
        c11.e(true);
        c11.u(true);
        int G = ((j) p.f67672b.a().d(i11)).G(str);
        c11.y(-2);
        c11.I(aVar.f58764a);
        c11.m(context.getString(G));
        return c11;
    }

    public static void e(int i11, Context context, int i12) {
        if (i11 < i12) {
            return;
        }
        r c11 = c(context, "motivational_channel_activity_goal");
        String b10 = a.d.a(context).b(i12, 36);
        c11.m(context.getString(C1987R.string._GLOBAL_OBJECTIVE_ACHIEVED_TITLE_));
        c11.l(context.getString(C1987R.string._STEPS_GOAL_REACHED_NOTIFICATION_, b10));
        y.c(context).e(null, -444444, c11.c());
    }

    public static void f(Context context, Device device) {
        x70.b.r("i", "sendUpgradeNotification()", new Object[0]);
        String string = context.getString(C1987R.string._UPDATE_PULSE_AVAILABLE_);
        r c11 = c(context, "devices_channel_communication");
        DeviceModel model = device.getModel();
        o d11 = p.f67672b.a().d(device.getModelId());
        c11.E(context.getString(C1987R.string._UPDATE_PULSE_AVAILABLE_));
        c11.m(context.getString(d11.I(model.a())));
        c11.l(string);
        c11.e(true);
        y.c(context).e(null, -111111, c11.c());
    }

    public static void g(int i11, Context context) {
        x70.b.r("i", "sendWamLowBatteryNotification(int)", new Object[0]);
        String format = String.format(context.getString(C1987R.string._WAM_NOTIFICATION_LOW_BATTERY_CONTENT_), String.valueOf(i11));
        r c11 = c(context, "devices_channel_communication");
        c11.E(context.getString(C1987R.string._WAM_NOTIFICATION_LOW_BATTERY_TICKER_));
        c11.u(true);
        c11.m(context.getString(C1987R.string._WAM_NOTIFICATION_LOW_BATTERY_TITLE_));
        c11.l(format);
        y.c(context).e(null, -333333, c11.c());
    }

    public static void h(Context context, Device device) {
        long id2 = device.getId();
        m<a> mVar = f58763a;
        a d11 = mVar.d(id2);
        if (d11 == null) {
            d11 = new a(0);
            mVar.h(device.getId(), d11);
        }
        d11.f58764a = DateTime.now().getMillis();
        r d12 = d(context, d11, device.getModelId(), device.getColor());
        d12.j("0%");
        d12.z(0);
        d12.u(true);
        w.w().M(((int) device.getId()) + 32, d12.c());
    }

    public static void i(Context context, Device device, float f11) {
        long id2 = device.getId();
        m<a> mVar = f58763a;
        a d11 = mVar.d(id2);
        if (d11 == null) {
            d11 = new a(0);
            mVar.h(device.getId(), d11);
        }
        r d12 = d(context, d11, device.getModelId(), device.getColor());
        float f12 = f11 * 100.0f;
        d12.z((int) f12);
        d12.j(String.format("%.0f", Float.valueOf(f12)).concat("%"));
        d12.u(true);
        w.w().M(((int) device.getId()) + 32, d12.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.core.app.u, androidx.core.app.q] */
    public static void j(Context context, String str) {
        r c11 = c(context, "devices_channel_communication");
        c11.u(true);
        c11.w();
        c11.e(false);
        c11.y(-2);
        ?? uVar = new u();
        uVar.f(str);
        c11.D(uVar);
        c11.l(str);
        c11.m(context.getString(C1987R.string._ANDROID_STICKY_SERVICE_TITLE_));
        if (!TextUtils.isEmpty(null)) {
            c11.E(null);
        }
        w.w().M(-222222, c11.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.core.app.u, androidx.core.app.q] */
    public static void k(Context context, String str, String str2, Intent intent) {
        r c11 = c(context, "devices_channel_communication");
        c11.m(str);
        c11.l(str2);
        c11.e(true);
        c11.y(1);
        ?? uVar = new u();
        uVar.f(str2);
        c11.D(uVar);
        c11.k(PendingIntent.getActivity(context, 0, intent, 67108864));
        w.w().M(-222222, c11.c());
    }
}
