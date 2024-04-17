package com.withings.wiscale2.user.ui.profile;

import aa0.a;
import aa0.c;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.common.compose.component.bottomSheet.PictureOption;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import com.withings.webservices.legacy.common.exception.EmailExistsException;
import com.withings.webservices.legacy.common.exception.UnauthorizedException;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: EditProfileViewModel.kt */
/* loaded from: classes5.dex */
public final class s0 extends g1 {
    private final androidx.lifecycle.f A;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f62040a;

    /* renamed from: b  reason: collision with root package name */
    private final va0.d f62041b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f62042c;

    /* renamed from: d  reason: collision with root package name */
    private final vf.c f62043d;

    /* renamed from: e  reason: collision with root package name */
    private final AccountSessionRepository f62044e;

    /* renamed from: f  reason: collision with root package name */
    private final rf.a f62045f;

    /* renamed from: g  reason: collision with root package name */
    private final aa0.c f62046g;

    /* renamed from: h  reason: collision with root package name */
    private final aa0.a f62047h;

    /* renamed from: i  reason: collision with root package name */
    private final r70.b f62048i;

    /* renamed from: j  reason: collision with root package name */
    private final q70.j f62049j;

    /* renamed from: k  reason: collision with root package name */
    private final q70.d f62050k;

    /* renamed from: l  reason: collision with root package name */
    private final l70.w f62051l;

    /* renamed from: m  reason: collision with root package name */
    private final r70.a f62052m;

    /* renamed from: n  reason: collision with root package name */
    private final ej0.c f62053n;

    /* renamed from: o  reason: collision with root package name */
    private final MutableStateFlow<c.a> f62054o;

    /* renamed from: p  reason: collision with root package name */
    private final MutableStateFlow<a.AbstractC0006a> f62055p;

    /* renamed from: q  reason: collision with root package name */
    private final SharedFlow<User> f62056q;

    /* renamed from: r  reason: collision with root package name */
    private final Flow<l70.v> f62057r;

    /* renamed from: s  reason: collision with root package name */
    private final SharedFlow<Double> f62058s;

    /* renamed from: t  reason: collision with root package name */
    private final SharedFlow<Double> f62059t;

    /* renamed from: u  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f62060u;

    /* renamed from: v  reason: collision with root package name */
    private final MutableSharedFlow<Integer> f62061v;

    /* renamed from: w  reason: collision with root package name */
    private final MutableSharedFlow<Integer> f62062w;

    /* renamed from: x  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f62063x;

    /* renamed from: y  reason: collision with root package name */
    private final Flow<m70.m> f62064y;

    /* renamed from: z  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f62065z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$tryToSaveChangesAndLeave$2", f = "EditProfileViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_FAT_FREE_MASS_SEGMENT}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f62066a;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f62066a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                MutableSharedFlow<Integer> U0 = s0.this.U0();
                Integer num = new Integer(0);
                this.f62066a = 1;
                if (U0.emit(num, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    public s0(long j5, boolean z5, va0.d dVar, Context context, vf.c accountManager, AccountSessionRepository accountSessionRepository, eg.a aVar, aa0.c cVar, aa0.a aVar2, p70.a aVar3, q70.j jVar, q70.d dVar2, fl.p pVar, fl.i deviceModelRepository, r70.c userRepository, l70.w unitPreferencesRepository, iy.e measuresGroupRepositoryV2, ky.c measureListenerManagerInterface, r70.a mainUserUseCase, ej0.c cVar2) {
        ParcelableSnapshotMutableState f11;
        ParcelableSnapshotMutableState f12;
        kotlin.jvm.internal.u.j(accountManager, "accountManager");
        kotlin.jvm.internal.u.j(accountSessionRepository, "accountSessionRepository");
        kotlin.jvm.internal.u.j(deviceModelRepository, "deviceModelRepository");
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        kotlin.jvm.internal.u.j(unitPreferencesRepository, "unitPreferencesRepository");
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        kotlin.jvm.internal.u.j(measureListenerManagerInterface, "measureListenerManagerInterface");
        kotlin.jvm.internal.u.j(mainUserUseCase, "mainUserUseCase");
        this.f62040a = z5;
        this.f62041b = dVar;
        this.f62042c = context;
        this.f62043d = accountManager;
        this.f62044e = accountSessionRepository;
        this.f62045f = aVar;
        this.f62046g = cVar;
        this.f62047h = aVar2;
        this.f62048i = aVar3;
        this.f62049j = jVar;
        this.f62050k = dVar2;
        this.f62051l = unitPreferencesRepository;
        this.f62052m = mainUserUseCase;
        this.f62053n = cVar2;
        this.f62054o = StateFlowKt.MutableStateFlow(c.a.C0008a.f431a);
        this.f62055p = StateFlowKt.MutableStateFlow(a.AbstractC0006a.C0007a.f418a);
        Flow<User> g11 = userRepository.g(j5);
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<User> shareIn = FlowKt.shareIn(g11, a11, companion.getLazily(), 1);
        this.f62056q = shareIn;
        Flow<l70.v> flow = unitPreferencesRepository.get();
        this.f62057r = flow;
        SharedFlow<Double> shareIn2 = FlowKt.shareIn(new q0(iy.a.f(measuresGroupRepositoryV2, measureListenerManagerInterface, j5, 4, null, null, false, 1016)), h1.a(this), companion.getLazily(), 1);
        this.f62058s = shareIn2;
        SharedFlow<Double> shareIn3 = FlowKt.shareIn(new r0(iy.a.f(measuresGroupRepositoryV2, measureListenerManagerInterface, j5, 1, null, null, false, 1016)), h1.a(this), companion.getLazily(), 1);
        this.f62059t = shareIn3;
        Boolean bool = Boolean.FALSE;
        f11 = androidx.compose.runtime.l0.f(bool, androidx.compose.runtime.v0.f8878a);
        this.f62060u = f11;
        this.f62061v = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f62062w = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        f12 = androidx.compose.runtime.l0.f(bool, androidx.compose.runtime.v0.f8878a);
        this.f62063x = f12;
        this.f62064y = FlowKt.combine(FlowKt.filterNotNull(shareIn), flow, shareIn2, shareIn3, new n0(this, null));
        this.f62065z = StateFlowKt.MutableStateFlow(bool);
        this.A = androidx.lifecycle.h.a(Dispatchers.getIO(), new p0(deviceModelRepository, pVar, null), 2);
        dVar.g(new g0(this));
    }

    public static final void G0(s0 s0Var, com.withings.user.User user, User.Images images) {
        s0Var.f62060u.setValue(Boolean.FALSE);
        BuildersKt__Builders_commonKt.launch$default(h1.a(s0Var), null, null, new l0(s0Var, user, images, null), 3, null);
    }

    public static final void K0(s0 s0Var, com.withings.user.User user, m70.f fVar, Throwable th2) {
        s0Var.f62060u.setValue(Boolean.FALSE);
        if (th2 instanceof EmailExistsException) {
            fVar.t();
        } else if (!(th2 instanceof UnauthorizedException)) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(s0Var), null, null, new m0(s0Var, null), 3, null);
        } else {
            fVar.s();
            BuildersKt__Builders_commonKt.launch$default(h1.a(s0Var), Dispatchers.getIO(), null, new o0(user, fVar, s0Var, null), 2, null);
        }
    }

    public static final void M0(s0 s0Var, com.withings.user.User user, File file) {
        s0Var.f62060u.setValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(h1.a(s0Var), null, null, new x0(s0Var, user, file, null), 3, null);
    }

    public final void O0(m70.l formState) {
        kotlin.jvm.internal.u.j(formState, "formState");
        if (!formState.a()) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new j0(this, null), 3, null);
            return;
        }
        this.f62063x.setValue(Boolean.TRUE);
    }

    public final MutableStateFlow<c.a> R0() {
        return this.f62054o;
    }

    public final MutableStateFlow<a.AbstractC0006a> T0() {
        return this.f62055p;
    }

    public final MutableSharedFlow<Integer> U0() {
        return this.f62061v;
    }

    public final ParcelableSnapshotMutableState V0() {
        return this.f62060u;
    }

    public final ParcelableSnapshotMutableState W0() {
        return this.f62063x;
    }

    public final MutableStateFlow<Boolean> X0() {
        return this.f62065z;
    }

    public final Flow<m70.m> Y0() {
        return this.f62064y;
    }

    public final androidx.lifecycle.f Z0() {
        return this.A;
    }

    public final MutableSharedFlow<Integer> a1() {
        return this.f62062w;
    }

    public final SharedFlow<User> c1() {
        return this.f62056q;
    }

    public final void d1(int i11, int i12, Intent intent) {
        this.f62041b.b(i11, i12, intent);
    }

    public final void e1(int i11, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.u.j(permissions, "permissions");
        kotlin.jvm.internal.u.j(grantResults, "grantResults");
        this.f62041b.c(i11, permissions, grantResults);
    }

    public final void g1(PictureOption option) {
        kotlin.jvm.internal.u.j(option, "option");
        int ordinal = option.ordinal();
        va0.d dVar = this.f62041b;
        if (ordinal != 0) {
            if (ordinal == 1) {
                dVar.h();
                return;
            }
            return;
        }
        dVar.j();
    }

    public final void i1(m70.l formState) {
        kotlin.jvm.internal.u.j(formState, "formState");
        if (!formState.a()) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new a(null), 3, null);
        } else if (formState.d()) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getMain(), null, new u0(this, formState, null), 2, null);
            m70.k c11 = formState.c();
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new t0(this, c11.c(), c11.f(), null), 2, null);
        }
    }
}
