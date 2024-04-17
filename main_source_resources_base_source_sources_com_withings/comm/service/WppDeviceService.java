package com.withings.comm.service;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.comm.service.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
/* compiled from: WppDeviceService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/comm/service/WppDeviceService;", "Landroid/app/Service;", "<init>", "()V", com.huawei.hms.feature.dynamic.e.b.f28627a, "library_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WppDeviceService extends Service {

    /* renamed from: b  reason: collision with root package name */
    private static final g<Integer> f33158b = h.b(a.f33161a);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f33159c = 0;

    /* renamed from: a  reason: collision with root package name */
    private final a.b f33160a = new a.b();

    /* compiled from: WppDeviceService.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements ym0.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33161a = new w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ Integer invoke() {
            return 16;
        }
    }

    /* compiled from: WppDeviceService.kt */
    /* loaded from: classes3.dex */
    public static final class b extends Binder {

        /* renamed from: a  reason: collision with root package name */
        private final com.withings.comm.service.a f33162a;

        public b(a.b serviceForegroundStateHolder) {
            u.j(serviceForegroundStateHolder, "serviceForegroundStateHolder");
            this.f33162a = serviceForegroundStateHolder;
        }

        public final com.withings.comm.service.a a() {
            return this.f33162a;
        }
    }

    private final void a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(974529, notification, f33158b.getValue().intValue());
        } else {
            startForeground(974529, notification);
        }
        this.f33160a.b(true);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new b(this.f33160a);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f33160a.b(false);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        Notification notification;
        if (intent != null) {
            notification = (Notification) intent.getParcelableExtra(RemoteMessageConst.NOTIFICATION);
        } else {
            notification = null;
        }
        if (notification != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    a(notification);
                    return 3;
                } catch (ForegroundServiceStartNotAllowedException unused) {
                    stopSelf();
                    return 3;
                }
            }
            a(notification);
            return 3;
        }
        stopSelf();
        return 3;
    }
}
