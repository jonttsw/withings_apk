package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.internal.v1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.comm.wpp.generated.object.CartridgeState;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.devicesetup.Setup;
import com.withings.wiscale2.device.wpa.wpa02.model.WppCartridgeDeviceException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import se0.a;
/* compiled from: ToiletDeviceViewModel.kt */
/* loaded from: classes5.dex */
public final class k extends g1 implements me0.c {

    /* renamed from: a  reason: collision with root package name */
    private final ej.w f55404a;

    /* renamed from: b  reason: collision with root package name */
    private final o60.g f55405b;

    /* renamed from: c  reason: collision with root package name */
    private final Device f55406c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f55407d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f55408e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f55409f;

    /* renamed from: g  reason: collision with root package name */
    private final com.withings.wiscale2.device.wpa.wpa02.conversation.c f55410g;

    /* renamed from: h  reason: collision with root package name */
    private ne0.b f55411h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableStateFlow<se0.a> f55412i;

    /* renamed from: j  reason: collision with root package name */
    private final StateFlow<se0.a> f55413j;

    /* renamed from: k  reason: collision with root package name */
    private final Handler f55414k;

    /* compiled from: ToiletDeviceViewModel.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            k.this.f55412i.setValue(a.b.g.f96919a);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ToiletDeviceViewModel.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<fl.o> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fl.p f55416a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f55417b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(fl.p pVar, k kVar) {
            super(0);
            this.f55416a = pVar;
            this.f55417b = kVar;
        }

        @Override // ym0.a
        public final fl.o invoke() {
            return this.f55416a.g(this.f55417b.f55406c);
        }
    }

    /* compiled from: ToiletDeviceViewModel.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Setup> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Setup invoke() {
            k kVar = k.this;
            return k.i0(kVar).e0(new DeviceModel(k.i0(kVar).a(), null));
        }
    }

    /* compiled from: ToiletDeviceViewModel.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            k kVar = k.this;
            BuildersKt__Builders_commonKt.launch$default(h1.a(kVar), Dispatchers.getIO(), null, new n(kVar, null), 2, null);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ToiletDeviceViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.ToiletDeviceViewModel$onCartridgeInfoReceived$2", f = "ToiletDeviceViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            k kVar = k.this;
            se0.a aVar = (se0.a) kVar.f55412i.getValue();
            if (kotlin.jvm.internal.u.e(aVar, a.c.f96923a) || (aVar instanceof a.d)) {
                if (!kVar.f55411h.d()) {
                    kVar.f55412i.setValue(a.b.j.f96922a);
                } else if (kVar.f55411h.e()) {
                    kVar.f55412i.setValue(a.C1615a.f96912a);
                    k.q0(kVar);
                } else {
                    kVar.f55412i.setValue(a.e.f96925a);
                }
            } else if (kotlin.jvm.internal.u.e(aVar, a.C1615a.f96912a)) {
                if (!kVar.f55411h.d()) {
                    kVar.f55412i.setValue(a.b.j.f96922a);
                } else if (!kVar.f55411h.e()) {
                    kVar.f55412i.setValue(a.e.f96925a);
                }
            } else if (!(aVar instanceof a.b)) {
                kotlin.jvm.internal.u.e(aVar, a.e.f96925a);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ToiletDeviceViewModel.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<yi.d> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f55422b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context) {
            super(0);
            this.f55422b = context;
        }

        @Override // ym0.a
        public final yi.d invoke() {
            Setup j02 = k.j0(k.this);
            if (j02 != null) {
                return j02.x(this.f55422b);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletDeviceViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.ToiletDeviceViewModel$startConversing$1", f = "ToiletDeviceViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
        g(qm0.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new g(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            k.this.f55410g.f();
            return nm0.y.f85009a;
        }
    }

    public k(Context context, ej.w wVar, fl.p pVar, o60.g setupTutorialRepository, Device device) {
        kotlin.jvm.internal.u.j(setupTutorialRepository, "setupTutorialRepository");
        kotlin.jvm.internal.u.j(device, "device");
        this.f55404a = wVar;
        this.f55405b = setupTutorialRepository;
        this.f55406c = device;
        this.f55407d = nm0.h.b(new b(pVar, this));
        nm0.g b10 = nm0.h.b(new c());
        this.f55408e = b10;
        nm0.g b11 = nm0.h.b(new f(context));
        this.f55409f = b11;
        this.f55410g = new com.withings.wiscale2.device.wpa.wpa02.conversation.c(device, wVar, null, this, null, 20);
        this.f55411h = new ne0.b(0);
        MutableStateFlow<se0.a> MutableStateFlow = StateFlowKt.MutableStateFlow(a.c.f96923a);
        this.f55412i = MutableStateFlow;
        this.f55413j = FlowKt.asStateFlow(MutableStateFlow);
        this.f55414k = new Handler(Looper.getMainLooper());
        yi.d dVar = (yi.d) b11.getValue();
        if (dVar != null && v1.Z(dVar)) {
            t0();
            return;
        }
        Setup setup = (Setup) b10.getValue();
        if (setup != null) {
            MutableStateFlow.setValue(new a.d(setup));
            nm0.y yVar = nm0.y.f85009a;
            return;
        }
        new a();
    }

    public static final fl.o i0(k kVar) {
        return (fl.o) kVar.f55407d.getValue();
    }

    public static final Setup j0(k kVar) {
        return (Setup) kVar.f55408e.getValue();
    }

    public static final void q0(k kVar) {
        Handler handler = kVar.f55414k;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new x.p0(new m(kVar), 5), 7000L);
    }

    private final void t0() {
        yi.d dVar = (yi.d) this.f55409f.getValue();
        if (dVar != null && v1.Z(dVar) && !this.f55410g.h()) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new g(null), 2, null);
        }
    }

    @Override // me0.c
    public final void I(ne0.b bVar) {
        ne0.b bVar2 = this.f55411h;
        x70.b.b(this, "Cartridge info received " + bVar + " (previous was " + bVar2 + ")", new Object[0]);
        Handler handler = this.f55414k;
        handler.removeCallbacksAndMessages(null);
        if (bVar.e()) {
            handler.postDelayed(new x.p0(new d(), 5), 7000L);
        }
        if (!kotlin.jvm.internal.u.e(bVar, this.f55411h)) {
            this.f55411h = bVar;
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new e(null), 2, null);
        }
    }

    @Override // me0.c
    public final void f() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new o(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f55404a.s(this.f55406c.getMacAddress());
        super.onCleared();
    }

    @Override // me0.c
    public final void q(Throwable exception) {
        se0.a aVar;
        kotlin.jvm.internal.u.j(exception, "exception");
        if (this.f55411h.c() == null) {
            CartridgeState cartridgeState = new CartridgeState();
            cartridgeState.setState(Short.MIN_VALUE);
            Short c11 = this.f55411h.c();
            if (c11 == null || cartridgeState.state != c11.shortValue()) {
                this.f55411h = ne0.b.a(this.f55411h, Short.valueOf(cartridgeState.state));
            }
        }
        if (kotlin.jvm.internal.u.e(exception, WppCartridgeDeviceException.UnreadableException.f55086c)) {
            aVar = a.b.d.f96916a;
        } else if (kotlin.jvm.internal.u.e(exception, WppCartridgeDeviceException.InvalidException.f55079c)) {
            aVar = a.b.C1617b.f96914a;
        } else if (kotlin.jvm.internal.u.e(exception, WppCartridgeDeviceException.NotActivated.f55082c)) {
            aVar = a.b.c.f96915a;
        } else if (kotlin.jvm.internal.u.e(exception, WppCartridgeDeviceException.BeingActivated.f55077c)) {
            aVar = a.b.C1616a.f96913a;
        } else if (kotlin.jvm.internal.u.e(exception, WppCartridgeDeviceException.LowBatteryError.f55080c)) {
            aVar = a.b.h.f96920a;
        } else if (kotlin.jvm.internal.u.e(exception, WppCartridgeDeviceException.MeasureInProgressError.f55081c)) {
            aVar = a.b.i.f96921a;
        } else if (kotlin.jvm.internal.u.e(exception, WppCartridgeDeviceException.CleansingInProgressError.f55078c)) {
            aVar = a.b.e.f96917a;
        } else {
            aVar = a.b.f.f96918a;
        }
        this.f55412i.setValue(aVar);
    }

    public final StateFlow<se0.a> r0() {
        return this.f55413j;
    }

    public final void y0() {
        t0();
        this.f55412i.setValue(a.c.f96923a);
    }
}
