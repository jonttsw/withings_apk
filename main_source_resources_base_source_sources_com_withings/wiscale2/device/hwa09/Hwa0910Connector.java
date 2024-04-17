package com.withings.wiscale2.device.hwa09;

import android.content.Context;
import ax.h;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.user.User;
import com.withings.wiscale2.device.common.AutoSyncReceiver;
import com.withings.wiscale2.device.common.conversation.GetWorkoutStatusConversation;
import com.withings.wiscale2.device.common.conversation.NotificationInitConversation;
import com.withings.wiscale2.device.common.conversation.SendDistanceUnitConversation;
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
import m70.i;
import nm0.l;
import nm0.y;
import qm0.d;
import u70.a;
import wi.a;
import x70.b;
/* compiled from: Hwa0910Connector.kt */
/* loaded from: classes5.dex */
public final class Hwa0910Connector implements e.c, e.d, a.c, t.a, a.InterfaceC1810a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54487a;

    /* renamed from: b  reason: collision with root package name */
    private Device f54488b;

    /* renamed from: c  reason: collision with root package name */
    private final w f54489c;

    /* renamed from: d  reason: collision with root package name */
    private final u70.a f54490d;

    /* renamed from: e  reason: collision with root package name */
    private final l70.w f54491e;

    /* renamed from: f  reason: collision with root package name */
    private final AutoSyncReceiver f54492f;

    /* renamed from: g  reason: collision with root package name */
    private final t f54493g;

    /* renamed from: h  reason: collision with root package name */
    private final wi.a f54494h;

    /* renamed from: i  reason: collision with root package name */
    private k<?> f54495i;

    /* renamed from: j  reason: collision with root package name */
    private k<?> f54496j;

    /* renamed from: k  reason: collision with root package name */
    private k<?> f54497k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f54498l;

    /* renamed from: m  reason: collision with root package name */
    private CoroutineScope f54499m;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Hwa0910Connector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/hwa09/Hwa0910Connector$ConnectionInitialisationConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public final class ConnectionInitialisationConversation extends WppDeviceConversation {

        /* renamed from: f  reason: collision with root package name */
        private final h f54500f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Hwa0910Connector f54501g;

        /* compiled from: Hwa0910Connector.kt */
        /* loaded from: classes5.dex */
        public static final class a implements GetWorkoutStatusConversation.b {
            a() {
            }

            @Override // com.withings.wiscale2.device.common.conversation.GetWorkoutStatusConversation.b
            public final void a(LiveWorkout liveWorkout) {
                ConnectionInitialisationConversation.this.f54500f.m(liveWorkout);
            }
        }

        public ConnectionInitialisationConversation(Hwa0910Connector hwa0910Connector) {
            h hVar = h.f19725i;
            if (hVar != null) {
                this.f54501g = hwa0910Connector;
                this.f54500f = hVar;
                return;
            }
            u.s("instance");
            throw null;
        }

        @Override // com.withings.comm.remote.conversation.WppDeviceConversation
        public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
            User user;
            Hwa0910Connector hwa0910Connector = this.f54501g;
            Long userId = hwa0910Connector.f().getUserId();
            if (userId != null) {
                user = i.b().i(userId.longValue());
            } else {
                user = null;
            }
            p.a aVar = p.f67672b;
            o g11 = aVar.a().g(hwa0910Connector.f());
            u.h(g11, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceWithNotifications");
            E(new NotificationInitConversation((i0) g11));
            if (user != null) {
                E(new GetWorkoutStatusConversation(aVar.a(), new a()));
            }
        }
    }

    /* compiled from: Hwa0910Connector.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.hwa09.Hwa0910Connector$start$1", f = "Hwa0910Connector.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<v, d<? super y>, Object> {
        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(v vVar, d<? super y> dVar) {
            return ((a) create(vVar, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            Hwa0910Connector.e(Hwa0910Connector.this);
            return y.f85009a;
        }
    }

    public Hwa0910Connector(Context context, Device device, String syncActionIntent, int i11) {
        wi.a aVar;
        syncActionIntent = (i11 & 4) != 0 ? "com.withings.wiscale2.device.hwa09.autosync" : syncActionIntent;
        w w11 = w.w();
        u.i(w11, "get(...)");
        u70.a b10 = u70.a.b();
        u.i(b10, "get(...)");
        l70.w a11 = w.a.a();
        u.j(context, "context");
        u.j(device, "device");
        u.j(syncActionIntent, "syncActionIntent");
        this.f54487a = context;
        this.f54488b = device;
        this.f54489c = w11;
        this.f54490d = b10;
        this.f54491e = a11;
        this.f54492f = new AutoSyncReceiver(syncActionIntent);
        this.f54493g = ej.w.w().E(this.f54488b.getMacAddress());
        aVar = wi.a.f105219d;
        if (aVar == null) {
            Context applicationContext = context.getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            aVar = new wi.a(applicationContext);
            wi.a.f105219d = aVar;
        }
        this.f54494h = aVar;
    }

    public static final void e(Hwa0910Connector hwa0910Connector) {
        k<?> kVar = hwa0910Connector.f54497k;
        if (kVar != null) {
            kVar.k();
        }
        cj.d b10 = jl.a.b(hwa0910Connector.f54488b);
        SendDistanceUnitConversation sendDistanceUnitConversation = new SendDistanceUnitConversation();
        ej.w wVar = hwa0910Connector.f54489c;
        wVar.getClass();
        k<?> u11 = wVar.u(b10, sendDistanceUnitConversation, SendDistanceUnitConversation.class);
        hwa0910Connector.f54497k = u11;
        u11.r();
    }

    private final void g() {
        k<?> kVar = this.f54495i;
        if (kVar != null) {
            kVar.k();
        }
        ConnectionInitialisationConversation connectionInitialisationConversation = new ConnectionInitialisationConversation(this);
        cj.d b10 = jl.a.b(this.f54488b);
        ej.w wVar = this.f54489c;
        wVar.getClass();
        k<?> u11 = wVar.u(b10, connectionInitialisationConversation, ConnectionInitialisationConversation.class);
        this.f54495i = u11;
        u11.r();
        b.c(this, this.f54488b.getMacAddress(), "Submitting connection", new Object[0]);
    }

    @Override // dj.t.a
    public final void D(t lifecycle, dj.u event) {
        u.j(lifecycle, "lifecycle");
        u.j(event, "event");
        if (event instanceof j) {
            b.c(this, this.f54488b.getMacAddress(), "Connection succeeded", new Object[0]);
        } else if (event instanceof dj.b) {
            b.c(this, this.f54488b.getMacAddress(), "Connection closed", new Object[0]);
            g();
        } else if (event instanceof dj.d) {
            b.c(this, this.f54488b.getMacAddress(), "Connection failed", new Object[0]);
        }
    }

    @Override // u70.a.c
    public final long H() {
        return 5000L;
    }

    @Override // fl.e.c
    public final boolean a(Device device) {
        u.j(device, "device");
        return u.e(this.f54488b, device);
    }

    @Override // fl.e.c
    public final void b(Device newDevice) {
        u.j(newDevice, "newDevice");
        this.f54488b = newDevice;
    }

    @Override // wi.a.InterfaceC1810a
    public final void c(boolean z5) {
        u70.i macAddress = this.f54488b.getMacAddress();
        b.c(this, macAddress, "Bluetooth state changed : " + z5, new Object[0]);
        if (z5) {
            g();
        }
    }

    @Override // fl.e.d
    public final void d() {
        o g11 = p.f67672b.a().g(this.f54488b);
        u.h(g11, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceModelWithSync");
        WppDeviceConversation j02 = ((gl.j) g11).j0(null);
        k<?> kVar = this.f54496j;
        if (kVar != null) {
            kVar.k();
        }
        cj.d b10 = jl.a.b(this.f54488b);
        ej.w wVar = this.f54489c;
        wVar.getClass();
        k<?> u11 = wVar.u(b10, j02, j02.getClass());
        this.f54496j = u11;
        u11.r();
        b.c(this, this.f54488b.getMacAddress(), "Submitting synchronisation", new Object[0]);
    }

    public final Device f() {
        return this.f54488b;
    }

    @Override // u70.a.c
    public final void f2(long j5) {
        b.c(this, this.f54488b.getMacAddress(), "App enters foreground", new Object[0]);
        d();
    }

    @Override // fl.e.a
    public final void start() {
        b.r(this, "start()", new Object[0]);
        if (this.f54498l) {
            b.r(this, "Already started !", new Object[0]);
            return;
        }
        this.f54493g.d(this);
        this.f54494h.g(this);
        this.f54490d.a(this);
        u70.i macAddress = this.f54488b.getMacAddress();
        u.i(macAddress, "getMacAddress(...)");
        AutoSyncReceiver autoSyncReceiver = this.f54492f;
        Context context = this.f54487a;
        autoSyncReceiver.b(context, macAddress);
        this.f54498l = true;
        g();
        d();
        int i11 = fb0.a.f66901p;
        a.C0918a.a(context).s();
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()));
        this.f54499m = CoroutineScope;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(this.f54491e.get()), new a(null)), CoroutineScope);
    }

    @Override // fl.e.a
    public final void stop() {
        b.r(this, "stop()", new Object[0]);
        k<?> kVar = this.f54495i;
        if (kVar != null) {
            kVar.k();
        }
        this.f54495i = null;
        k<?> kVar2 = this.f54496j;
        if (kVar2 != null) {
            kVar2.k();
        }
        this.f54496j = null;
        k<?> kVar3 = this.f54497k;
        if (kVar3 != null) {
            kVar3.k();
        }
        this.f54497k = null;
        b.c(this, this.f54488b.getMacAddress(), "Cancel conversation submission", new Object[0]);
        this.f54493g.f(this);
        this.f54489c.s(this.f54488b.getMacAddress());
        this.f54490d.h(this);
        this.f54494h.h(this);
        this.f54492f.c(this.f54487a, this.f54488b.getMacAddress());
        CoroutineScope coroutineScope = this.f54499m;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.f54498l = false;
    }

    @Override // u70.a.c
    public final void Q2() {
    }
}
