package com.withings.wiscale2.device.hwa;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.withings.device.Device;
import dj.d;
import dj.j;
import dj.t;
import ej.w;
import fl.e;
import java.util.List;
import kotlin.jvm.internal.u;
import u70.a;
import vf.c;
import wi.a;
/* loaded from: classes5.dex */
public final class HwaConnector implements e.c, e.d, a.c, t.a, a.InterfaceC1810a {

    /* renamed from: h  reason: collision with root package name */
    private static AutoSyncReceiver f54156h = new AutoSyncReceiver();

    /* renamed from: a  reason: collision with root package name */
    private t f54157a;

    /* renamed from: b  reason: collision with root package name */
    private Device f54158b;

    /* renamed from: c  reason: collision with root package name */
    private bj.a f54159c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f54160d;

    /* renamed from: e  reason: collision with root package name */
    private int f54161e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f54162f;

    /* renamed from: g  reason: collision with root package name */
    private wi.a f54163g;

    /* loaded from: classes5.dex */
    public static class AutoSyncReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            c cVar;
            e eVar;
            cVar = c.f103617d;
            if (cVar != null) {
                if (!cVar.j()) {
                    HwaConnector.e(context);
                    return;
                } else if (u70.a.b().d(60000L)) {
                    List<Device> g11 = kn.e.c().g(52, 53);
                    if (g11.isEmpty()) {
                        HwaConnector.e(context);
                        return;
                    }
                    for (Device device : g11) {
                        eVar = e.f67637h;
                        if (eVar != null) {
                            e.c f11 = eVar.f(device);
                            if (f11 != null && (f11 instanceof HwaConnector)) {
                                ((HwaConnector) f11).d();
                            }
                        } else {
                            u.s("instance");
                            throw null;
                        }
                    }
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("You must call init before".toString());
        }
    }

    public HwaConnector(Context context, Device device) {
        this.f54162f = context.getApplicationContext();
        this.f54158b = device;
    }

    static void e(Context context) {
        ay.b.w(context, f54156h);
        ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 6798, new Intent("com.withings.wiscale2.device.hwaautosync").setPackage(context.getPackageName()), 201326592));
    }

    @Override // dj.t.a
    public final void D(t tVar, dj.u uVar) {
        bj.a aVar;
        if (uVar instanceof j) {
            if (uVar.a().equals(this.f54158b.getMacAddress())) {
                this.f54161e = 0;
            }
        } else if (uVar instanceof dj.b) {
            if (this.f54158b.getMacAddress().equals(uVar.a()) && u70.a.b().e()) {
                d();
            }
        } else if ((uVar instanceof d) && this.f54158b.getMacAddress().equals(uVar.a()) && u70.a.b().e()) {
            int i11 = this.f54161e + 1;
            this.f54161e = i11;
            if (i11 >= 2 && (aVar = this.f54159c) != null) {
                aVar.a();
                this.f54159c = null;
            }
        }
    }

    @Override // u70.a.c
    public final long H() {
        return 5000L;
    }

    @Override // u70.a.c
    public final void Q2() {
        bj.a aVar = this.f54159c;
        if (aVar != null) {
            aVar.a();
            this.f54159c = null;
        }
        w.w().s(this.f54158b.getMacAddress());
    }

    @Override // fl.e.c
    public final boolean a(Device device) {
        return this.f54158b.equals(device);
    }

    @Override // fl.e.c
    public final void b(Device device) {
        this.f54158b = device;
    }

    @Override // wi.a.InterfaceC1810a
    public final void c(boolean z5) {
        if (z5) {
            this.f54161e = 0;
            d();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.withings.wiscale2.device.hwa.b, java.lang.Object] */
    @Override // fl.e.d
    public final void d() {
        bj.a aVar = this.f54159c;
        if (aVar != null) {
            aVar.a();
        }
        this.f54159c = new bj.a(jl.a.b(this.f54158b), new HwaSyncConversation(new Object()), HwaSyncConversation.class);
        if (u70.a.b().d(0L)) {
            this.f54159c.b();
            this.f54159c.d();
        }
        this.f54159c.e();
    }

    @Override // u70.a.c
    public final void f2(long j5) {
        d();
    }

    @Override // fl.e.a
    public final void start() {
        wi.a aVar;
        x70.b.r(this, "start()", new Object[0]);
        if (this.f54160d) {
            x70.b.r(this, "Already started !", new Object[0]);
            return;
        }
        t E = w.w().E(this.f54158b.getMacAddress());
        this.f54157a = E;
        E.d(this);
        u70.a.b().a(this);
        Context context = this.f54162f;
        u.j(context, "context");
        aVar = wi.a.f105219d;
        if (aVar == null) {
            Context applicationContext = context.getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            aVar = new wi.a(applicationContext);
            wi.a.f105219d = aVar;
        }
        this.f54163g = aVar;
        aVar.g(this);
        androidx.core.content.a.registerReceiver(context, f54156h, new IntentFilter("com.withings.wiscale2.device.hwaautosync"), 4);
        ((AlarmManager) context.getSystemService("alarm")).setInexactRepeating(2, SystemClock.elapsedRealtime() + 3600000, 3600000L, PendingIntent.getBroadcast(context, 6798, new Intent("com.withings.wiscale2.device.hwaautosync").setPackage(context.getPackageName()), 201326592));
        this.f54160d = true;
        d();
    }

    @Override // fl.e.a
    public final void stop() {
        x70.b.r(this, "stop()", new Object[0]);
        t tVar = this.f54157a;
        if (tVar != null) {
            tVar.f(this);
        }
        bj.a aVar = this.f54159c;
        if (aVar != null) {
            aVar.a();
            this.f54159c = null;
        }
        w.w().s(this.f54158b.getMacAddress());
        u70.a.b().h(this);
        this.f54163g.h(this);
        this.f54160d = false;
    }
}
