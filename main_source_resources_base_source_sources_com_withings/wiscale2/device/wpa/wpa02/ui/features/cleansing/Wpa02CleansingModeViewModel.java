package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.v0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.devicesetup.Setup;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
/* compiled from: Wpa02CleansingModeViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/ui/features/cleansing/Wpa02CleansingModeViewModel;", "Landroidx/lifecycle/g1;", "Lme0/d;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02CleansingModeViewModel extends g1 implements me0.d {

    /* renamed from: a  reason: collision with root package name */
    private final ej.w f55228a;

    /* renamed from: b  reason: collision with root package name */
    private final xw.b f55229b;

    /* renamed from: c  reason: collision with root package name */
    private final Device f55230c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f55231d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f55232e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f55233f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f55234g;

    /* renamed from: h  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f55235h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableSharedFlow<com.withings.wiscale2.device.wpa.wpa02.conversation.a> f55236i;

    /* renamed from: j  reason: collision with root package name */
    private final SharedFlow<com.withings.wiscale2.device.wpa.wpa02.conversation.a> f55237j;

    /* renamed from: k  reason: collision with root package name */
    private MutableSharedFlow<Boolean> f55238k;

    /* renamed from: l  reason: collision with root package name */
    private final SharedFlow<Boolean> f55239l;

    /* compiled from: Wpa02CleansingModeViewModel.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<fl.o> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fl.p f55240a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Wpa02CleansingModeViewModel f55241b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(fl.p pVar, Wpa02CleansingModeViewModel wpa02CleansingModeViewModel) {
            super(0);
            this.f55240a = pVar;
            this.f55241b = wpa02CleansingModeViewModel;
        }

        @Override // ym0.a
        public final fl.o invoke() {
            return this.f55240a.g(this.f55241b.f55230c);
        }
    }

    /* compiled from: Wpa02CleansingModeViewModel.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Setup> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Setup invoke() {
            Wpa02CleansingModeViewModel wpa02CleansingModeViewModel = Wpa02CleansingModeViewModel.this;
            return Wpa02CleansingModeViewModel.g0(wpa02CleansingModeViewModel).e0(new DeviceModel(Wpa02CleansingModeViewModel.g0(wpa02CleansingModeViewModel).a(), null));
        }
    }

    /* compiled from: Wpa02CleansingModeViewModel.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<com.withings.wiscale2.device.wpa.wpa02.conversation.c> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.device.wpa.wpa02.conversation.c invoke() {
            Wpa02CleansingModeViewModel wpa02CleansingModeViewModel = Wpa02CleansingModeViewModel.this;
            return new com.withings.wiscale2.device.wpa.wpa02.conversation.c(wpa02CleansingModeViewModel.f55230c, wpa02CleansingModeViewModel.f55228a, null, null, Wpa02CleansingModeViewModel.this, 12);
        }
    }

    /* compiled from: Wpa02CleansingModeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing.Wpa02CleansingModeViewModel$onCleansingInteractionFailed$1", f = "Wpa02CleansingModeViewModel.kt", l = {60}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f55244a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.withings.wiscale2.device.wpa.wpa02.conversation.a f55246c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.withings.wiscale2.device.wpa.wpa02.conversation.a aVar, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f55246c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f55246c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f55244a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                MutableSharedFlow mutableSharedFlow = Wpa02CleansingModeViewModel.this.f55236i;
                this.f55244a = 1;
                if (mutableSharedFlow.emit(this.f55246c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Wpa02CleansingModeViewModel.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<yi.d> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f55248b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context) {
            super(0);
            this.f55248b = context;
        }

        @Override // ym0.a
        public final yi.d invoke() {
            Setup q02 = Wpa02CleansingModeViewModel.this.q0();
            if (q02 != null) {
                return q02.x(this.f55248b);
            }
            return null;
        }
    }

    @Inject
    public Wpa02CleansingModeViewModel(Context context, ej.w wVar, fl.p pVar, u0 savedStateHandle, xw.b dispatchers) {
        ParcelableSnapshotMutableState f11;
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.u.j(dispatchers, "dispatchers");
        this.f55228a = wVar;
        this.f55229b = dispatchers;
        Object c11 = savedStateHandle.c("device");
        kotlin.jvm.internal.u.g(c11);
        this.f55230c = (Device) c11;
        this.f55231d = nm0.h.b(new a(pVar, this));
        this.f55232e = nm0.h.b(new b());
        this.f55233f = nm0.h.b(new e(context));
        this.f55234g = nm0.h.b(new c());
        f11 = androidx.compose.runtime.l0.f(Boolean.FALSE, v0.f8878a);
        this.f55235h = f11;
        MutableSharedFlow<com.withings.wiscale2.device.wpa.wpa02.conversation.a> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f55236i = MutableSharedFlow$default;
        this.f55237j = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<Boolean> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f55238k = MutableSharedFlow$default2;
        this.f55239l = FlowKt.asSharedFlow(MutableSharedFlow$default2);
    }

    public static final fl.o g0(Wpa02CleansingModeViewModel wpa02CleansingModeViewModel) {
        return (fl.o) wpa02CleansingModeViewModel.f55231d.getValue();
    }

    public static final com.withings.wiscale2.device.wpa.wpa02.conversation.c i0(Wpa02CleansingModeViewModel wpa02CleansingModeViewModel) {
        return (com.withings.wiscale2.device.wpa.wpa02.conversation.c) wpa02CleansingModeViewModel.f55234g.getValue();
    }

    @Override // me0.d
    public final void Q() {
        this.f55235h.setValue(Boolean.TRUE);
    }

    @Override // me0.d
    public final void f() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f55229b.a(), null, new o0(this, null), 2, null);
    }

    @Override // me0.d
    public final void o(com.withings.wiscale2.device.wpa.wpa02.conversation.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f55229b.a(), null, new d(aVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        p0();
        super.onCleared();
    }

    public final void p0() {
        ((com.withings.wiscale2.device.wpa.wpa02.conversation.c) this.f55234g.getValue()).b();
    }

    public final Setup q0() {
        return (Setup) this.f55232e.getValue();
    }

    public final SharedFlow<com.withings.wiscale2.device.wpa.wpa02.conversation.a> r0() {
        return this.f55237j;
    }

    public final SharedFlow<Boolean> t0() {
        return this.f55239l;
    }

    public final yi.d y0() {
        return (yi.d) this.f55233f.getValue();
    }

    public final ParcelableSnapshotMutableState z0() {
        return this.f55235h;
    }
}
