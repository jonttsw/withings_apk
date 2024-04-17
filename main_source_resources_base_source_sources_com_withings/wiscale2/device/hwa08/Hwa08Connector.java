package com.withings.wiscale2.device.hwa08;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import ay.b;
import cj.d;
import com.withings.device.Device;
import dj.t;
import ej.k;
import ej.w;
import fl.e;
import fl.o;
import fl.p;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import u70.a;
import u70.i;
/* compiled from: Hwa08Connector.kt */
/* loaded from: classes5.dex */
public final class Hwa08Connector implements e.c, e.d, a.c, t.a {

    /* renamed from: h  reason: collision with root package name */
    private static final AutoSyncReceiver f54374h = new AutoSyncReceiver();

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f54375i = 0;

    /* renamed from: a  reason: collision with root package name */
    private Device f54376a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f54377b;

    /* renamed from: c  reason: collision with root package name */
    private final u70.a f54378c;

    /* renamed from: d  reason: collision with root package name */
    private final w f54379d;

    /* renamed from: e  reason: collision with root package name */
    private k<?> f54380e;

    /* renamed from: f  reason: collision with root package name */
    private k<?> f54381f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f54382g;

    /* compiled from: Hwa08Connector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/hwa08/Hwa08Connector$AutoSyncReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class AutoSyncReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            e eVar;
            u.j(context, "context");
            u.j(intent, "intent");
            if (u70.a.b().d(60000L)) {
                Device f11 = kn.e.c().f(i.b(intent.getLongExtra("macAddress", 0L)));
                if (f11 != null) {
                    eVar = e.f67637h;
                    if (eVar != null) {
                        e.c f12 = eVar.f(f11);
                        if (f12 instanceof Hwa08Connector) {
                            ((Hwa08Connector) f12).d();
                            return;
                        }
                        return;
                    }
                    u.s("instance");
                    throw null;
                }
                int i11 = Hwa08Connector.f54375i;
                a.b(context, null);
            }
        }
    }

    /* compiled from: Hwa08Connector.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static final void a(Context context, i iVar) {
            int i11 = Hwa08Connector.f54375i;
            androidx.core.content.a.registerReceiver(context, Hwa08Connector.f54374h, new IntentFilter("com.withings.wiscale2.device.hwa08.autosync"), 4);
            Object systemService = context.getSystemService("alarm");
            u.h(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            ((AlarmManager) systemService).setInexactRepeating(2, SystemClock.elapsedRealtime() + 21600000, 21600000L, c(context, iVar));
        }

        public static final void b(Context context, i iVar) {
            int i11 = Hwa08Connector.f54375i;
            b.w(context, Hwa08Connector.f54374h);
            Object systemService = context.getSystemService("alarm");
            u.h(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            ((AlarmManager) systemService).cancel(c(context, iVar));
        }

        private static PendingIntent c(Context context, i iVar) {
            int i11;
            Intent intent = new Intent("com.withings.wiscale2.device.hwa08.autosync").setPackage(context.getPackageName());
            u.i(intent, "setPackage(...)");
            if (iVar != null) {
                intent.putExtra("macAddress", iVar.f());
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
    }

    public Hwa08Connector(Context context, Device device) {
        u70.a b10 = u70.a.b();
        u.i(b10, "get(...)");
        w w11 = w.w();
        u.i(w11, "get(...)");
        u.j(device, "device");
        u.j(context, "context");
        this.f54376a = device;
        this.f54377b = context;
        this.f54378c = b10;
        this.f54379d = w11;
    }

    private final void e() {
        ConnectionInitialisationConversation connectionInitialisationConversation = new ConnectionInitialisationConversation();
        k<?> kVar = this.f54381f;
        if (kVar != null) {
            kVar.k();
        }
        d b10 = jl.a.b(this.f54376a);
        w wVar = this.f54379d;
        wVar.getClass();
        k<?> u11 = wVar.u(b10, connectionInitialisationConversation, ConnectionInitialisationConversation.class);
        this.f54381f = u11;
        u11.r();
        x70.b.c(this, this.f54376a.getMacAddress(), "Submitting connection", new Object[0]);
    }

    @Override // dj.t.a
    public final void D(t lifecycle, dj.u event) {
        u.j(lifecycle, "lifecycle");
        u.j(event, "event");
        if (event instanceof dj.b) {
            e();
        }
    }

    @Override // u70.a.c
    public final long H() {
        return 5000L;
    }

    @Override // fl.e.c
    public final boolean a(Device device) {
        u.j(device, "device");
        return u.e(this.f54376a, device);
    }

    @Override // fl.e.c
    public final void b(Device newDevice) {
        u.j(newDevice, "newDevice");
        this.f54376a = newDevice;
    }

    @Override // fl.e.d
    public final void d() {
        o g11 = p.f67672b.a().g(this.f54376a);
        u.h(g11, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceWithBonding");
        u70.a aVar = this.f54378c;
        w wVar = this.f54379d;
        BondAndSyncConversation bondAndSyncConversation = new BondAndSyncConversation((gl.t) g11, wVar, aVar);
        k<?> kVar = this.f54380e;
        if (kVar != null) {
            kVar.k();
        }
        d b10 = jl.a.b(this.f54376a);
        wVar.getClass();
        k<?> u11 = wVar.u(b10, bondAndSyncConversation, bondAndSyncConversation.getClass());
        this.f54380e = u11;
        u11.r();
        x70.b.c(this, this.f54376a.getMacAddress(), "Submitting synchronisation", new Object[0]);
    }

    @Override // u70.a.c
    public final void f2(long j5) {
        x70.b.c(this, this.f54376a.getMacAddress(), "App enters foreground", new Object[0]);
        d();
    }

    @Override // fl.e.a
    public final void start() {
        x70.b.r(this, "start()", new Object[0]);
        if (this.f54382g) {
            x70.b.r(this, "Already started !", new Object[0]);
            return;
        }
        this.f54378c.a(this);
        i macAddress = this.f54376a.getMacAddress();
        u.i(macAddress, "getMacAddress(...)");
        a.a(this.f54377b, macAddress);
        this.f54379d.E(this.f54376a.getMacAddress()).d(this);
        this.f54382g = true;
        e();
        d();
    }

    @Override // fl.e.a
    public final void stop() {
        x70.b.r(this, "stop()", new Object[0]);
        i macAddress = this.f54376a.getMacAddress();
        w wVar = this.f54379d;
        wVar.s(macAddress);
        this.f54378c.h(this);
        a.b(this.f54377b, this.f54376a.getMacAddress());
        wVar.E(this.f54376a.getMacAddress()).f(this);
        this.f54382g = false;
    }

    @Override // u70.a.c
    public final void Q2() {
    }
}
