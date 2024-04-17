package com.withings.wiscale2.device.wam03;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import ax.h;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.conversation.BondingMigrationConversation;
import com.withings.device.Device;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.user.User;
import com.withings.wiscale2.device.common.conversation.GetWorkoutStatusConversation;
import com.withings.wiscale2.device.common.conversation.NotificationInitConversation;
import com.withings.wiscale2.device.common.conversation.SendDistanceUnitConversation;
import com.withings.wiscale2.device.common.conversation.n;
import com.withings.wiscale2.device.wam03.conversation.Wam03SyncConversation;
import dj.j;
import dj.t;
import ej.k;
import ej.w;
import fb0.a;
import fl.e;
import fl.p;
import gl.i0;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import l70.v;
import l70.w;
import m70.i;
import nm0.l;
import nm0.y;
import qm0.d;
import u70.a;
import vi.o;
import wi.a;
/* compiled from: Wam03Connector.kt */
/* loaded from: classes5.dex */
public final class Wam03Connector implements e.c, e.d, a.c, t.a, a.InterfaceC1810a {

    /* renamed from: q  reason: collision with root package name */
    private static final AutoSyncReceiver f54912q = new AutoSyncReceiver();

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f54913r = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Context f54914a;

    /* renamed from: b  reason: collision with root package name */
    private Device f54915b;

    /* renamed from: c  reason: collision with root package name */
    private final kn.e f54916c;

    /* renamed from: d  reason: collision with root package name */
    private final ej0.b f54917d;

    /* renamed from: e  reason: collision with root package name */
    private final i f54918e;

    /* renamed from: f  reason: collision with root package name */
    private final oi0.b f54919f;

    /* renamed from: g  reason: collision with root package name */
    private final w f54920g;

    /* renamed from: h  reason: collision with root package name */
    private final u70.a f54921h;

    /* renamed from: i  reason: collision with root package name */
    private final h f54922i;

    /* renamed from: j  reason: collision with root package name */
    private final l70.w f54923j;

    /* renamed from: k  reason: collision with root package name */
    private final t f54924k;

    /* renamed from: l  reason: collision with root package name */
    private k<?> f54925l;

    /* renamed from: m  reason: collision with root package name */
    private k<?> f54926m;

    /* renamed from: n  reason: collision with root package name */
    private k<?> f54927n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f54928o;

    /* renamed from: p  reason: collision with root package name */
    private CoroutineScope f54929p;

    /* compiled from: Wam03Connector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wam03/Wam03Connector$AutoSyncReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class AutoSyncReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            e eVar;
            u.j(context, "context");
            u.j(intent, "intent");
            if (u70.a.b().d(60000L)) {
                Device f11 = kn.e.c().f(u70.i.b(intent.getLongExtra("EXTRA_MAC_ADDRESS", 0L)));
                if (f11 != null) {
                    eVar = e.f67637h;
                    if (eVar != null) {
                        e.c f12 = eVar.f(f11);
                        if (f12 instanceof Wam03Connector) {
                            ((Wam03Connector) f12).d();
                            return;
                        }
                        return;
                    }
                    u.s("instance");
                    throw null;
                }
                int i11 = Wam03Connector.f54913r;
                a.b(context, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Wam03Connector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wam03/Wam03Connector$BondAndSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class BondAndSyncConversation extends WppDeviceConversation {

        /* renamed from: f  reason: collision with root package name */
        private final gl.t f54930f;

        /* renamed from: g  reason: collision with root package name */
        private final w f54931g;

        /* renamed from: h  reason: collision with root package name */
        private final u70.a f54932h;

        /* renamed from: i  reason: collision with root package name */
        private final Wam03SyncConversation f54933i;

        public BondAndSyncConversation(gl.t tVar, w wppDeviceManager, u70.a backgroundManager, Wam03SyncConversation wam03SyncConversation) {
            u.j(wppDeviceManager, "wppDeviceManager");
            u.j(backgroundManager, "backgroundManager");
            this.f54930f = tVar;
            this.f54931g = wppDeviceManager;
            this.f54932h = backgroundManager;
            this.f54933i = wam03SyncConversation;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.withings.common.device.conversation.a] */
        @Override // com.withings.comm.remote.conversation.WppDeviceConversation
        public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
            xi.b j5 = x().j();
            u.h(j5, "null cannot be cast to non-null type com.withings.comm.network.ble.BleRemoteDevice");
            int d11 = ((o) j5).d();
            w wVar = this.f54931g;
            if (d11 != 12 && this.f54932h.e()) {
                long j11 = x().i().softVersion;
                gl.t tVar = this.f54930f;
                if (tVar.o(j11)) {
                    wVar.O(x(), new BondingMigrationConversation(tVar, new Object()), BondingMigrationConversation.class);
                }
            }
            wVar.O(x(), this.f54933i, Wam03SyncConversation.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Wam03Connector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wam03/Wam03Connector$ConnectionInitialisationConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public final class ConnectionInitialisationConversation extends WppDeviceConversation {

        /* renamed from: f  reason: collision with root package name */
        private final h f54934f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Wam03Connector f54935g;

        /* compiled from: Wam03Connector.kt */
        /* loaded from: classes5.dex */
        public static final class a implements GetWorkoutStatusConversation.b {
            a() {
            }

            @Override // com.withings.wiscale2.device.common.conversation.GetWorkoutStatusConversation.b
            public final void a(LiveWorkout liveWorkout) {
                ConnectionInitialisationConversation.this.f54934f.m(liveWorkout);
            }
        }

        public ConnectionInitialisationConversation(Wam03Connector wam03Connector, h liveWorkoutManager) {
            u.j(liveWorkoutManager, "liveWorkoutManager");
            this.f54935g = wam03Connector;
            this.f54934f = liveWorkoutManager;
        }

        @Override // com.withings.comm.remote.conversation.WppDeviceConversation
        public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
            User user;
            Wam03Connector wam03Connector = this.f54935g;
            Long userId = wam03Connector.g().getUserId();
            if (userId != null) {
                user = i.b().i(userId.longValue());
            } else {
                user = null;
            }
            p.a aVar = p.f67672b;
            fl.o g11 = aVar.a().g(wam03Connector.g());
            u.h(g11, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceWithNotifications");
            E(new NotificationInitConversation((i0) g11));
            if (user != null) {
                E(new GetWorkoutStatusConversation(aVar.a(), new a()));
            }
        }
    }

    /* compiled from: Wam03Connector.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static final void a(Context context, u70.i iVar) {
            int i11 = Wam03Connector.f54913r;
            androidx.core.content.a.registerReceiver(context, Wam03Connector.f54912q, new IntentFilter("com.withings.wiscale2.device.wam03.autosync"), 4);
            Object systemService = context.getSystemService("alarm");
            u.h(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            ((AlarmManager) systemService).setInexactRepeating(2, SystemClock.elapsedRealtime() + 21600000, 21600000L, c(context, iVar));
        }

        public static final void b(Context context, u70.i iVar) {
            int i11 = Wam03Connector.f54913r;
            ay.b.w(context, Wam03Connector.f54912q);
            Object systemService = context.getSystemService("alarm");
            u.h(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            ((AlarmManager) systemService).cancel(c(context, iVar));
        }

        private static PendingIntent c(Context context, u70.i iVar) {
            int i11;
            Intent intent = new Intent("com.withings.wiscale2.device.wam03.autosync").setPackage(context.getPackageName());
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
    }

    /* compiled from: Wam03Connector.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wam03.Wam03Connector$start$1", f = "Wam03Connector.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<v, d<? super y>, Object> {
        b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(v vVar, d<? super y> dVar) {
            return ((b) create(vVar, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            Wam03Connector.f(Wam03Connector.this);
            return y.f85009a;
        }
    }

    public Wam03Connector(Context context, Device device) {
        kn.e c11 = kn.e.c();
        u.i(c11, "get(...)");
        ej0.b e11 = ej0.b.e();
        u.i(e11, "get(...)");
        i b10 = i.b();
        u.i(b10, "get(...)");
        oi0.b h11 = oi0.b.h();
        u.i(h11, "get(...)");
        w w11 = w.w();
        u.i(w11, "get(...)");
        u70.a b11 = u70.a.b();
        u.i(b11, "get(...)");
        h hVar = h.f19725i;
        if (hVar != null) {
            l70.w a11 = w.a.a();
            u.j(context, "context");
            u.j(device, "device");
            this.f54914a = context;
            this.f54915b = device;
            this.f54916c = c11;
            this.f54917d = e11;
            this.f54918e = b10;
            this.f54919f = h11;
            this.f54920g = w11;
            this.f54921h = b11;
            this.f54922i = hVar;
            this.f54923j = a11;
            this.f54924k = ej.w.w().E(this.f54915b.getMacAddress());
            return;
        }
        u.s("instance");
        throw null;
    }

    public static final void f(Wam03Connector wam03Connector) {
        k<?> kVar = wam03Connector.f54927n;
        if (kVar != null) {
            kVar.k();
        }
        cj.d b10 = jl.a.b(wam03Connector.f54915b);
        SendDistanceUnitConversation sendDistanceUnitConversation = new SendDistanceUnitConversation();
        ej.w wVar = wam03Connector.f54920g;
        wVar.getClass();
        k<?> u11 = wVar.u(b10, sendDistanceUnitConversation, SendDistanceUnitConversation.class);
        wam03Connector.f54927n = u11;
        u11.r();
    }

    private final void h() {
        k<?> kVar = this.f54925l;
        if (kVar != null) {
            kVar.k();
        }
        ConnectionInitialisationConversation connectionInitialisationConversation = new ConnectionInitialisationConversation(this, this.f54922i);
        cj.d b10 = jl.a.b(this.f54915b);
        ej.w wVar = this.f54920g;
        wVar.getClass();
        k<?> u11 = wVar.u(b10, connectionInitialisationConversation, connectionInitialisationConversation.getClass());
        this.f54925l = u11;
        u11.r();
        x70.b.c(this, this.f54915b.getMacAddress(), "Submitting connection", new Object[0]);
    }

    @Override // dj.t.a
    public final void D(t tVar, dj.u uVar) {
        if (uVar instanceof j) {
            x70.b.c(this, this.f54915b.getMacAddress(), "Connection succeeded", new Object[0]);
        } else if (uVar instanceof dj.b) {
            x70.b.c(this, this.f54915b.getMacAddress(), "Connection closed", new Object[0]);
            h();
        } else if (uVar instanceof dj.d) {
            x70.b.c(this, this.f54915b.getMacAddress(), "Connection failed", new Object[0]);
        }
    }

    @Override // u70.a.c
    public final long H() {
        return 5000L;
    }

    @Override // fl.e.c
    public final boolean a(Device device) {
        u.j(device, "device");
        return u.e(this.f54915b, device);
    }

    @Override // fl.e.c
    public final void b(Device newDevice) {
        u.j(newDevice, "newDevice");
        this.f54915b = newDevice;
    }

    @Override // wi.a.InterfaceC1810a
    public final void c(boolean z5) {
        u70.i macAddress = this.f54915b.getMacAddress();
        x70.b.c(this, macAddress, "Bluetooth state changed : " + z5, new Object[0]);
        if (z5) {
            h();
        }
    }

    @Override // fl.e.d
    public final void d() {
        n nVar = new n();
        Wam03SyncConversation wam03SyncConversation = new Wam03SyncConversation(this.f54916c, this.f54918e, nVar, this.f54919f, this.f54917d);
        fl.o g11 = p.f67672b.a().g(this.f54915b);
        u.h(g11, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceWithBonding");
        ej.w wVar = this.f54920g;
        BondAndSyncConversation bondAndSyncConversation = new BondAndSyncConversation((gl.t) g11, wVar, this.f54921h, wam03SyncConversation);
        k<?> kVar = this.f54926m;
        if (kVar != null) {
            kVar.k();
        }
        k<?> u11 = wVar.u(jl.a.b(this.f54915b), bondAndSyncConversation, BondAndSyncConversation.class);
        this.f54926m = u11;
        u11.r();
        x70.b.c(this, this.f54915b.getMacAddress(), "Submitting synchronisation", new Object[0]);
    }

    @Override // u70.a.c
    public final void f2(long j5) {
        x70.b.c(this, this.f54915b.getMacAddress(), "App enters foreground", new Object[0]);
        d();
    }

    public final Device g() {
        return this.f54915b;
    }

    @Override // fl.e.a
    public final void start() {
        x70.b.r(this, "start()", new Object[0]);
        if (this.f54928o) {
            x70.b.r(this, "Already started !", new Object[0]);
            return;
        }
        this.f54924k.d(this);
        this.f54921h.a(this);
        u70.i macAddress = this.f54915b.getMacAddress();
        u.i(macAddress, "getMacAddress(...)");
        Context context = this.f54914a;
        a.a(context, macAddress);
        this.f54928o = true;
        h();
        d();
        int i11 = fb0.a.f66901p;
        a.C0918a.a(context).s();
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()));
        this.f54929p = CoroutineScope;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(this.f54923j.get()), new b(null)), CoroutineScope);
    }

    @Override // fl.e.a
    public final void stop() {
        x70.b.r(this, "stop()", new Object[0]);
        k<?> kVar = this.f54925l;
        if (kVar != null) {
            kVar.k();
            this.f54925l = null;
        }
        k<?> kVar2 = this.f54926m;
        if (kVar2 != null) {
            kVar2.k();
            this.f54926m = null;
        }
        k<?> kVar3 = this.f54927n;
        if (kVar3 != null) {
            kVar3.k();
            this.f54927n = null;
        }
        x70.b.c(this, this.f54915b.getMacAddress(), "Cancel conversation submission", new Object[0]);
        this.f54924k.f(this);
        this.f54920g.s(this.f54915b.getMacAddress());
        this.f54921h.h(this);
        a.b(this.f54914a, this.f54915b.getMacAddress());
        this.f54928o = false;
    }

    @Override // u70.a.c
    public final void Q2() {
    }
}
