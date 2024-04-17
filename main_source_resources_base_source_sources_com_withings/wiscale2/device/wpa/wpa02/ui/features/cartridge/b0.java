package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.internal.v1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.p0;
import com.withings.comm.wpp.generated.object.CartridgeState;
import com.withings.comm.wpp.generated.object.StripCount;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.devicesetup.Setup;
import com.withings.wiscale2.device.consumable.model.Consumable;
import com.withings.wiscale2.device.consumable.webservices.ConsumableRemoteRepository;
import com.withings.wiscale2.device.wpa.wpa02.model.WppCartridgeDeviceException;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import re0.a;
/* compiled from: Wpa02CartridgeActivationViewModel.kt */
/* loaded from: classes5.dex */
public final class b0 extends g1 implements me0.a {

    /* renamed from: a  reason: collision with root package name */
    private final ej.w f55123a;

    /* renamed from: b  reason: collision with root package name */
    private final fl.p f55124b;

    /* renamed from: c  reason: collision with root package name */
    private final o60.g f55125c;

    /* renamed from: d  reason: collision with root package name */
    private final ConsumableRemoteRepository f55126d;

    /* renamed from: e  reason: collision with root package name */
    private final Device f55127e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f55128f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f55129g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f55130h;

    /* renamed from: i  reason: collision with root package name */
    private final com.withings.wiscale2.device.wpa.wpa02.conversation.c f55131i;

    /* renamed from: j  reason: collision with root package name */
    private ne0.b f55132j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableStateFlow<re0.a> f55133k;

    /* renamed from: l  reason: collision with root package name */
    private final StateFlow<re0.a> f55134l;

    /* renamed from: m  reason: collision with root package name */
    private final Handler f55135m;

    /* renamed from: n  reason: collision with root package name */
    private final MutableStateFlow<Consumable> f55136n;

    /* renamed from: o  reason: collision with root package name */
    private final MutableStateFlow<List<StripCount>> f55137o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f55138p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f55139q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f55140r;

    /* compiled from: Wpa02CartridgeActivationViewModel.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            b0.this.f55133k.setValue(a.c.j.f94768a);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Wpa02CartridgeActivationViewModel.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<fl.o> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final fl.o invoke() {
            b0 b0Var = b0.this;
            return b0Var.f55124b.g(b0Var.f55127e);
        }
    }

    /* compiled from: Wpa02CartridgeActivationViewModel.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Setup> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Setup invoke() {
            b0 b0Var = b0.this;
            return b0.m0(b0Var).e0(new DeviceModel(b0.m0(b0Var).a(), null));
        }
    }

    /* compiled from: Wpa02CartridgeActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.Wpa02CartridgeActivationViewModel$onCartridgeInfoReceived$1", f = "Wpa02CartridgeActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            b0 b0Var = b0.this;
            b0Var.f55131i.j();
            b0Var.f55140r = false;
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Wpa02CartridgeActivationViewModel.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            b0 b0Var = b0.this;
            BuildersKt__Builders_commonKt.launch$default(h1.a(b0Var), Dispatchers.getIO(), null, new g0(b0Var, null), 2, null);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Wpa02CartridgeActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.Wpa02CartridgeActivationViewModel$onCartridgeInfoReceived$3", f = "Wpa02CartridgeActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ne0.b f55147b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ne0.b bVar, qm0.d<? super f> dVar) {
            super(2, dVar);
            this.f55147b = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new f(this.f55147b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            b0 b0Var = b0.this;
            re0.a aVar = (re0.a) b0Var.f55133k.getValue();
            if (kotlin.jvm.internal.u.e(aVar, a.e.f94772a) || (aVar instanceof a.g)) {
                if (b0Var.f55132j.e()) {
                    b0Var.f55133k.setValue(a.d.f94771a);
                } else {
                    b0Var.f55133k.setValue(a.f.f94773a);
                    b0.z0(b0Var);
                }
            } else if (kotlin.jvm.internal.u.e(aVar, a.f.f94773a)) {
                if (b0Var.f55132j.e()) {
                    b0Var.f55133k.setValue(a.d.f94771a);
                }
            } else if (kotlin.jvm.internal.u.e(aVar, a.d.f94771a)) {
                if (b0Var.f55132j.d()) {
                    b0Var.f55133k.setValue(a.C1576a.f94756a);
                }
            } else if (kotlin.jvm.internal.u.e(aVar, a.C1576a.f94756a)) {
                if (b0Var.f55138p) {
                    ne0.b bVar = b0Var.f55132j;
                    kotlin.jvm.internal.u.j(bVar, "<this>");
                    Short c11 = bVar.c();
                    if (c11 != null && c11.shortValue() == 0 && bVar.d()) {
                        ne0.b bVar2 = b0Var.f55132j;
                        kotlin.jvm.internal.u.j(bVar2, "<this>");
                        if (bVar2.b() != null && bVar2.b().d() > 0) {
                            BuildersKt__Builders_commonKt.launch$default(h1.a(b0Var), Dispatchers.getIO(), null, new d0(this.f55147b.b(), b0Var, null), 2, null);
                            b0Var.f55131i.e();
                        }
                    }
                }
                b0Var.f55133k.setValue(a.c.C1577a.f94759a);
            } else if (!(aVar instanceof a.b)) {
                boolean z5 = aVar instanceof a.c;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Wpa02CartridgeActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.Wpa02CartridgeActivationViewModel$onCartridgeInteractionFailed$2", f = "Wpa02CartridgeActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f55149b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Throwable th2, qm0.d<? super g> dVar) {
            super(2, dVar);
            this.f55149b = th2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new g(this.f55149b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a.c cVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            MutableStateFlow mutableStateFlow = b0.this.f55133k;
            WppCartridgeDeviceException.UnreadableException unreadableException = WppCartridgeDeviceException.UnreadableException.f55086c;
            Throwable th2 = this.f55149b;
            if (kotlin.jvm.internal.u.e(th2, unreadableException)) {
                cVar = a.c.g.f94765a;
            } else if (kotlin.jvm.internal.u.e(th2, WppCartridgeDeviceException.InvalidException.f55079c)) {
                cVar = a.c.C1578c.f94761a;
            } else if (kotlin.jvm.internal.u.e(th2, WppCartridgeDeviceException.NotActivated.f55082c)) {
                cVar = a.c.e.f94763a;
            } else if (kotlin.jvm.internal.u.e(th2, WppCartridgeDeviceException.BeingActivated.f55077c)) {
                cVar = a.c.b.f94760a;
            } else if (kotlin.jvm.internal.u.e(th2, WppCartridgeDeviceException.LowBatteryError.f55080c)) {
                cVar = a.c.k.f94769a;
            } else if (kotlin.jvm.internal.u.e(th2, WppCartridgeDeviceException.MeasureInProgressError.f55081c)) {
                cVar = a.c.l.f94770a;
            } else if (kotlin.jvm.internal.u.e(th2, WppCartridgeDeviceException.CleansingInProgressError.f55078c)) {
                cVar = a.c.h.f94766a;
            } else if (kotlin.jvm.internal.u.e(th2, WppCartridgeDeviceException.UnknownError.f55085c)) {
                cVar = a.c.j.f94768a;
            } else {
                cVar = a.c.i.f94767a;
            }
            mutableStateFlow.setValue(cVar);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Wpa02CartridgeActivationViewModel.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<yi.d> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f55151b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context) {
            super(0);
            this.f55151b = context;
        }

        @Override // ym0.a
        public final yi.d invoke() {
            Setup p02 = b0.p0(b0.this);
            if (p02 != null) {
                return p02.x(this.f55151b);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02CartridgeActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.Wpa02CartridgeActivationViewModel$startConversing$1", f = "Wpa02CartridgeActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
        i(qm0.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new i(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((i) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            b0 b0Var = b0.this;
            b0Var.f55131i.f();
            b0Var.f55140r = true;
            return nm0.y.f85009a;
        }
    }

    public b0(Context context, ej.w wVar, fl.p pVar, o60.g setupTutorialRepository, ConsumableRemoteRepository consumableRemoteRepository, Device device) {
        kotlin.jvm.internal.u.j(setupTutorialRepository, "setupTutorialRepository");
        kotlin.jvm.internal.u.j(consumableRemoteRepository, "consumableRemoteRepository");
        kotlin.jvm.internal.u.j(device, "device");
        this.f55123a = wVar;
        this.f55124b = pVar;
        this.f55125c = setupTutorialRepository;
        this.f55126d = consumableRemoteRepository;
        this.f55127e = device;
        this.f55128f = nm0.h.b(new b());
        nm0.g b10 = nm0.h.b(new c());
        this.f55129g = b10;
        nm0.g b11 = nm0.h.b(new h(context));
        this.f55130h = b11;
        this.f55131i = new com.withings.wiscale2.device.wpa.wpa02.conversation.c(device, wVar, null, this, null, 20);
        this.f55132j = new ne0.b(0);
        MutableStateFlow<re0.a> MutableStateFlow = StateFlowKt.MutableStateFlow(a.e.f94772a);
        this.f55133k = MutableStateFlow;
        this.f55134l = FlowKt.asStateFlow(MutableStateFlow);
        this.f55135m = new Handler(Looper.getMainLooper());
        this.f55136n = StateFlowKt.MutableStateFlow(null);
        this.f55137o = StateFlowKt.MutableStateFlow(kotlin.collections.i0.f76187a);
        yi.d dVar = (yi.d) b11.getValue();
        if (dVar != null && v1.Z(dVar)) {
            G0();
            return;
        }
        Setup setup = (Setup) b10.getValue();
        if (setup != null) {
            MutableStateFlow.setValue(new a.g(setup));
            nm0.y yVar = nm0.y.f85009a;
            return;
        }
        new a();
    }

    private final void G0() {
        yi.d dVar = (yi.d) this.f55130h.getValue();
        if (dVar != null && v1.Z(dVar) && !this.f55131i.h()) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new i(null), 2, null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:10)(2:26|27))(3:28|29|(2:31|32))|11|12|(1:14)|15|(1:17)|18|(2:20|21)(2:23|24)))|35|6|7|(0)(0)|11|12|(0)|15|(0)|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        r6 = nm0.l.a(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j0(u70.i r4, com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.b0 r5, qm0.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.c0
            if (r0 == 0) goto L16
            r0 = r6
            com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.c0 r0 = (com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.c0) r0
            int r1 = r0.f55165c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f55165c = r1
            goto L1b
        L16:
            com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.c0 r0 = new com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.c0
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f55163a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f55165c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            nm0.l.b(r6)     // Catch: java.lang.Throwable -> L2a
            goto L42
        L2a:
            r4 = move-exception
            goto L45
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            nm0.l.b(r6)
            com.withings.wiscale2.device.consumable.webservices.ConsumableRemoteRepository r5 = r5.f55126d     // Catch: java.lang.Throwable -> L2a
            r0.f55165c = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r5.get(r4, r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 != r1) goto L42
            goto L63
        L42:
            com.withings.wiscale2.device.consumable.model.GetConsumableResponse r6 = (com.withings.wiscale2.device.consumable.model.GetConsumableResponse) r6     // Catch: java.lang.Throwable -> L2a
            goto L49
        L45:
            nm0.k$a r6 = nm0.l.a(r4)
        L49:
            java.lang.Throwable r4 = nm0.k.b(r6)
            if (r4 == 0) goto L52
            r4.printStackTrace()
        L52:
            boolean r4 = r6 instanceof nm0.k.a
            r5 = 0
            if (r4 == 0) goto L58
            r6 = r5
        L58:
            com.withings.wiscale2.device.consumable.model.GetConsumableResponse r6 = (com.withings.wiscale2.device.consumable.model.GetConsumableResponse) r6
            if (r6 == 0) goto L62
            com.withings.wiscale2.device.consumable.model.Consumable r4 = r6.getConsumable()
            r1 = r4
            goto L63
        L62:
            r1 = r5
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.b0.j0(u70.i, com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.b0, qm0.d):java.lang.Object");
    }

    public static final fl.o m0(b0 b0Var) {
        return (fl.o) b0Var.f55128f.getValue();
    }

    public static final Setup p0(b0 b0Var) {
        return (Setup) b0Var.f55129g.getValue();
    }

    public static final void z0(b0 b0Var) {
        Handler handler = b0Var.f55135m;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new p0(new f0(b0Var), 6), 7000L);
    }

    public final StateFlow<re0.a> B0() {
        return this.f55134l;
    }

    public final void F0() {
        this.f55139q = true;
    }

    @Override // me0.c
    public final void I(ne0.b bVar) {
        ne0.b bVar2 = this.f55132j;
        x70.b.b(this, "Cartridge info received " + bVar + " (previous was " + bVar2 + ")", new Object[0]);
        if (this.f55140r) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new d(null), 2, null);
        }
        Handler handler = this.f55135m;
        handler.removeCallbacksAndMessages(null);
        if (!bVar.e()) {
            handler.postDelayed(new p0(new e(), 6), 7000L);
        }
        MutableStateFlow<Consumable> mutableStateFlow = this.f55136n;
        if (mutableStateFlow.getValue() != null) {
            MutableStateFlow<List<StripCount>> mutableStateFlow2 = this.f55137o;
            if (!kotlin.jvm.internal.u.e(mutableStateFlow2.getValue(), kotlin.collections.i0.f76187a)) {
                K0();
                this.f55133k.setValue(new a.b(mutableStateFlow.getValue(), mutableStateFlow2.getValue()));
            }
        }
        if (!kotlin.jvm.internal.u.e(bVar, this.f55132j)) {
            this.f55132j = bVar;
            Short c11 = bVar.c();
            if (c11 != null && c11.shortValue() == 5) {
                this.f55138p = true;
            }
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new f(bVar, null), 2, null);
        }
    }

    public final void K0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new i0(this, null), 2, null);
    }

    public final void M0() {
        G0();
        this.f55133k.setValue(a.e.f94772a);
    }

    @Override // me0.a
    public final void e(ArrayList arrayList) {
        this.f55137o.setValue(arrayList);
    }

    @Override // me0.c
    public final void f() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new h0(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        if (!this.f55139q) {
            this.f55123a.s(this.f55127e.getMacAddress());
        }
        super.onCleared();
    }

    @Override // me0.c
    public final void q(Throwable exception) {
        kotlin.jvm.internal.u.j(exception, "exception");
        if (this.f55132j.c() == null) {
            CartridgeState cartridgeState = new CartridgeState();
            cartridgeState.setState(Short.MIN_VALUE);
            Short c11 = this.f55132j.c();
            if (c11 == null || cartridgeState.state != c11.shortValue()) {
                this.f55132j = ne0.b.a(this.f55132j, Short.valueOf(cartridgeState.state));
            }
        }
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new g(exception, null), 2, null);
    }
}
