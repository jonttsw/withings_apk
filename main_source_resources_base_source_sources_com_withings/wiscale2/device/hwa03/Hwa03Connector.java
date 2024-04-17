package com.withings.wiscale2.device.hwa03;

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
import com.withings.wiscale2.device.hwa03.conversation.Hwa03SyncConversation;
import dj.j;
import dj.t;
import ej.k;
import ej.w;
import fb0.a;
import fl.e;
import fl.o;
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
import nm0.g;
import nm0.l;
import nm0.y;
import qm0.d;
import u70.a;
import u70.i;
import wi.a;
/* compiled from: Hwa03Connector.kt */
/* loaded from: classes5.dex */
public final class Hwa03Connector implements e.c, e.d, a.c, t.a, a.InterfaceC1810a {

    /* renamed from: n  reason: collision with root package name */
    private static final AutoSyncReceiver f54182n = new AutoSyncReceiver();

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f54183o = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Context f54184a;

    /* renamed from: b  reason: collision with root package name */
    private Device f54185b;

    /* renamed from: c  reason: collision with root package name */
    private final w f54186c;

    /* renamed from: d  reason: collision with root package name */
    private final u70.a f54187d;

    /* renamed from: e  reason: collision with root package name */
    private final l70.w f54188e;

    /* renamed from: f  reason: collision with root package name */
    private final t f54189f;

    /* renamed from: g  reason: collision with root package name */
    private final wi.a f54190g;

    /* renamed from: h  reason: collision with root package name */
    private k<?> f54191h;

    /* renamed from: i  reason: collision with root package name */
    private k<?> f54192i;

    /* renamed from: j  reason: collision with root package name */
    private k<?> f54193j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f54194k;

    /* renamed from: l  reason: collision with root package name */
    private final g f54195l;

    /* renamed from: m  reason: collision with root package name */
    private CoroutineScope f54196m;

    /* compiled from: Hwa03Connector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/hwa03/Hwa03Connector$AutoSyncReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
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
                        if (f12 instanceof Hwa03Connector) {
                            ((Hwa03Connector) f12).d();
                            return;
                        }
                        return;
                    }
                    u.s("instance");
                    throw null;
                }
                int i11 = Hwa03Connector.f54183o;
                a.b(context, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Hwa03Connector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/hwa03/Hwa03Connector$BondAndSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class BondAndSyncConversation extends WppDeviceConversation {

        /* renamed from: f  reason: collision with root package name */
        private final o f54197f;

        /* renamed from: g  reason: collision with root package name */
        private final w f54198g;

        /* renamed from: h  reason: collision with root package name */
        private final Hwa03SyncConversation f54199h;

        public BondAndSyncConversation(o deviceModel, w wppDeviceManager, Hwa03SyncConversation hwa03SyncConversation) {
            u.j(deviceModel, "deviceModel");
            u.j(wppDeviceManager, "wppDeviceManager");
            this.f54197f = deviceModel;
            this.f54198g = wppDeviceManager;
            this.f54199h = hwa03SyncConversation;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.withings.common.device.conversation.a] */
        @Override // com.withings.comm.remote.conversation.WppDeviceConversation
        public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
            o oVar = this.f54197f;
            u.h(oVar, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceWithBonding");
            E(new BondingMigrationConversation((gl.t) oVar, new Object()));
            E(new NotificationInitConversation((i0) oVar));
            this.f54198g.O(x(), this.f54199h, Hwa03SyncConversation.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Hwa03Connector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/hwa03/Hwa03Connector$ConnectionInitialisationConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public final class ConnectionInitialisationConversation extends WppDeviceConversation {

        /* renamed from: f  reason: collision with root package name */
        private final h f54200f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Hwa03Connector f54201g;

        /* compiled from: Hwa03Connector.kt */
        /* loaded from: classes5.dex */
        public static final class a implements GetWorkoutStatusConversation.b {
            a() {
            }

            @Override // com.withings.wiscale2.device.common.conversation.GetWorkoutStatusConversation.b
            public final void a(LiveWorkout liveWorkout) {
                ConnectionInitialisationConversation.this.f54200f.m(liveWorkout);
            }
        }

        public ConnectionInitialisationConversation(Hwa03Connector hwa03Connector) {
            h hVar = h.f19725i;
            if (hVar != null) {
                this.f54201g = hwa03Connector;
                this.f54200f = hVar;
                return;
            }
            u.s("instance");
            throw null;
        }

        @Override // com.withings.comm.remote.conversation.WppDeviceConversation
        public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
            User user;
            Hwa03Connector hwa03Connector = this.f54201g;
            Long userId = hwa03Connector.g().getUserId();
            if (userId != null) {
                user = m70.i.b().i(userId.longValue());
            } else {
                user = null;
            }
            p.a aVar = p.f67672b;
            o g11 = aVar.a().g(hwa03Connector.g());
            u.h(g11, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceWithNotifications");
            E(new NotificationInitConversation((i0) g11));
            if (user != null) {
                E(new GetWorkoutStatusConversation(aVar.a(), new a()));
            }
        }
    }

    /* compiled from: Hwa03Connector.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static final void a(Context context, i iVar) {
            int i11 = Hwa03Connector.f54183o;
            androidx.core.content.a.registerReceiver(context, Hwa03Connector.f54182n, new IntentFilter("com.withings.wiscale2.device.hwa03.autosync"), 4);
            Object systemService = context.getSystemService("alarm");
            u.h(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            ((AlarmManager) systemService).setInexactRepeating(2, SystemClock.elapsedRealtime() + 21600000, 21600000L, c(context, iVar));
        }

        public static final void b(Context context, i iVar) {
            int i11 = Hwa03Connector.f54183o;
            ay.b.w(context, Hwa03Connector.f54182n);
            Object systemService = context.getSystemService("alarm");
            u.h(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            ((AlarmManager) systemService).cancel(c(context, iVar));
        }

        private static PendingIntent c(Context context, i iVar) {
            int i11;
            Intent intent = new Intent("com.withings.wiscale2.device.hwa03.autosync").setPackage(context.getPackageName());
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

    /* compiled from: Hwa03Connector.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.hwa03.Hwa03Connector$start$1", f = "Hwa03Connector.kt", l = {}, m = "invokeSuspend")
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
            Hwa03Connector.f(Hwa03Connector.this);
            return y.f85009a;
        }
    }

    public Hwa03Connector(Context context, Device device) {
        wi.a aVar;
        w w11 = w.w();
        u.i(w11, "get(...)");
        u70.a b10 = u70.a.b();
        u.i(b10, "get(...)");
        l70.w a11 = w.a.a();
        u.j(context, "context");
        u.j(device, "device");
        this.f54184a = context;
        this.f54185b = device;
        this.f54186c = w11;
        this.f54187d = b10;
        this.f54188e = a11;
        this.f54189f = ej.w.w().E(this.f54185b.getMacAddress());
        aVar = wi.a.f105219d;
        if (aVar == null) {
            Context applicationContext = context.getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            aVar = new wi.a(applicationContext);
            wi.a.f105219d = aVar;
        }
        this.f54190g = aVar;
        this.f54195l = nm0.h.b(new com.withings.wiscale2.device.hwa03.a(this));
    }

    public static final void f(Hwa03Connector hwa03Connector) {
        k<?> kVar = hwa03Connector.f54193j;
        if (kVar != null) {
            kVar.k();
        }
        cj.d b10 = jl.a.b(hwa03Connector.f54185b);
        SendDistanceUnitConversation sendDistanceUnitConversation = new SendDistanceUnitConversation();
        ej.w wVar = hwa03Connector.f54186c;
        wVar.getClass();
        k<?> u11 = wVar.u(b10, sendDistanceUnitConversation, SendDistanceUnitConversation.class);
        hwa03Connector.f54193j = u11;
        u11.r();
    }

    private final void h() {
        k<?> kVar = this.f54191h;
        if (kVar != null) {
            kVar.k();
        }
        ConnectionInitialisationConversation connectionInitialisationConversation = new ConnectionInitialisationConversation(this);
        cj.d b10 = jl.a.b(this.f54185b);
        ej.w wVar = this.f54186c;
        wVar.getClass();
        k<?> u11 = wVar.u(b10, connectionInitialisationConversation, ConnectionInitialisationConversation.class);
        this.f54191h = u11;
        u11.r();
        x70.b.c(this, this.f54185b.getMacAddress(), "Submitting connection", new Object[0]);
    }

    @Override // dj.t.a
    public final void D(t lifecycle, dj.u event) {
        u.j(lifecycle, "lifecycle");
        u.j(event, "event");
        if (event instanceof j) {
            x70.b.c(this, this.f54185b.getMacAddress(), "Connection succeeded", new Object[0]);
        } else if (event instanceof dj.b) {
            x70.b.c(this, this.f54185b.getMacAddress(), "Connection closed", new Object[0]);
            h();
        } else if (event instanceof dj.d) {
            x70.b.c(this, this.f54185b.getMacAddress(), "Connection failed", new Object[0]);
        }
    }

    @Override // u70.a.c
    public final long H() {
        return 5000L;
    }

    @Override // fl.e.c
    public final boolean a(Device device) {
        u.j(device, "device");
        return u.e(this.f54185b, device);
    }

    @Override // fl.e.c
    public final void b(Device newDevice) {
        u.j(newDevice, "newDevice");
        this.f54185b = newDevice;
    }

    @Override // wi.a.InterfaceC1810a
    public final void c(boolean z5) {
        i macAddress = this.f54185b.getMacAddress();
        x70.b.c(this, macAddress, "Bluetooth state changed : " + z5, new Object[0]);
        if (z5) {
            h();
        }
    }

    @Override // fl.e.d
    public final void d() {
        o g11 = p.f67672b.a().g(this.f54185b);
        u.h(g11, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceModelWithSync");
        WppDeviceConversation j02 = ((gl.j) g11).j0(null);
        ej.w wVar = this.f54186c;
        BondAndSyncConversation bondAndSyncConversation = new BondAndSyncConversation((o) this.f54195l.getValue(), wVar, (Hwa03SyncConversation) j02);
        k<?> kVar = this.f54192i;
        if (kVar != null) {
            kVar.k();
        }
        k<?> u11 = wVar.u(jl.a.b(this.f54185b), bondAndSyncConversation, BondAndSyncConversation.class);
        this.f54192i = u11;
        u11.r();
        x70.b.c(this, this.f54185b.getMacAddress(), "Submitting synchronisation", new Object[0]);
    }

    @Override // u70.a.c
    public final void f2(long j5) {
        x70.b.c(this, this.f54185b.getMacAddress(), "App enters foreground", new Object[0]);
        d();
    }

    public final Device g() {
        return this.f54185b;
    }

    @Override // fl.e.a
    public final void start() {
        x70.b.r(this, "start()", new Object[0]);
        if (this.f54194k) {
            x70.b.r(this, "Already started !", new Object[0]);
            return;
        }
        this.f54189f.d(this);
        this.f54190g.g(this);
        this.f54187d.a(this);
        i macAddress = this.f54185b.getMacAddress();
        u.i(macAddress, "getMacAddress(...)");
        Context context = this.f54184a;
        a.a(context, macAddress);
        this.f54194k = true;
        h();
        d();
        int i11 = fb0.a.f66901p;
        a.C0918a.a(context).s();
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()));
        this.f54196m = CoroutineScope;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(this.f54188e.get()), new b(null)), CoroutineScope);
    }

    @Override // fl.e.a
    public final void stop() {
        x70.b.r(this, "stop()", new Object[0]);
        k<?> kVar = this.f54191h;
        if (kVar != null) {
            kVar.k();
        }
        this.f54191h = null;
        k<?> kVar2 = this.f54192i;
        if (kVar2 != null) {
            kVar2.k();
        }
        this.f54192i = null;
        k<?> kVar3 = this.f54193j;
        if (kVar3 != null) {
            kVar3.k();
            this.f54193j = null;
        }
        x70.b.c(this, this.f54185b.getMacAddress(), "Cancel conversation submission", new Object[0]);
        this.f54189f.f(this);
        this.f54186c.s(this.f54185b.getMacAddress());
        this.f54187d.h(this);
        this.f54190g.h(this);
        a.b(this.f54184a, this.f54185b.getMacAddress());
        CoroutineScope coroutineScope = this.f54196m;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.f54194k = false;
    }

    @Override // u70.a.c
    public final void Q2() {
    }
}
