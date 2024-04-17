package com.withings.wiscale2.partner.ui;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.t;
import com.withings.partner.model.Partner;
import com.withings.partner.model.PartnerAssociationStatusLoader;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit;
import com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import v10.c;
import y10.a;
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
public final class b1 extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final User f58910a;

    /* renamed from: b  reason: collision with root package name */
    private final Partner f58911b;

    /* renamed from: c  reason: collision with root package name */
    private final t10.e f58912c;

    /* renamed from: d  reason: collision with root package name */
    private final t10.c f58913d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.lifecycle.j0 f58914e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.lifecycle.j0 f58915f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.lifecycle.j0 f58916g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.lifecycle.j0 f58917h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f58918i;

    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<Partner, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f58919a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Boolean invoke(Partner partner) {
            boolean z5;
            Partner partner2 = partner;
            kotlin.jvm.internal.u.j(partner2, "partner");
            if (partner2.e() != PartnerAssociationStatusLoader.AssociationStatus.f43515a) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<nm0.j<List<d0>, List<d0>>, LiveData<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f58920a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final LiveData<Boolean> invoke(nm0.j<List<d0>, List<d0>> jVar) {
            nm0.j<List<d0>, List<d0>> jVar2 = jVar;
            return androidx.lifecycle.h.a(null, new c1(jVar2.a(), jVar2.b(), null), 3);
        }
    }

    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<Partner, LiveData<List<d0>>> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<d0>> invoke(Partner partner) {
            Partner partner2 = partner;
            kotlin.jvm.internal.u.j(partner2, "partner");
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new d1(b1.this, partner2, null), 2);
        }
    }

    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<Partner, LiveData<List<d0>>> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<d0>> invoke(Partner partner) {
            Partner partner2 = partner;
            kotlin.jvm.internal.u.j(partner2, "partner");
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new e1(b1.this, partner2, null), 2);
        }
    }

    /* compiled from: PartnerExchangesFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerExchangesViewModel$updatePartnerExchanges$1$1", f = "PartnerExchangesFragment.kt", l = {436}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58923a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u10.u f58924b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b1 f58925c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Partner f58926d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f58927e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(u10.u uVar, b1 b1Var, Partner partner, boolean z5, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f58924b = uVar;
            this.f58925c = b1Var;
            this.f58926d = partner;
            this.f58927e = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f58924b, this.f58925c, this.f58926d, this.f58927e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f58923a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                b1 b1Var = this.f58925c;
                Application application = b1Var.getApplication();
                User user = b1Var.f58910a;
                Partner partner = this.f58926d;
                kotlin.jvm.internal.u.i(partner, "$partner");
                u10.u uVar = this.f58924b;
                boolean z5 = this.f58927e;
                uVar.h(application, user, partner, z5);
                if (uVar instanceof c.p) {
                    b1.k0(b1Var, z5);
                } else if (uVar instanceof a.d) {
                    b1.m0(b1Var, z5);
                }
                t10.e eVar = b1Var.f58912c;
                Application application2 = b1Var.getApplication();
                long q11 = b1Var.f58910a.q();
                this.f58923a = 1;
                if (eVar.j(q11, application2, partner, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Application application, User user, Partner partner, t10.e eVar) {
        super(application);
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(partner, "partner");
        this.f58910a = user;
        this.f58911b = partner;
        this.f58912c = eVar;
        t10.c cVar = new t10.c(androidx.lifecycle.h1.a(this), getApplication(), partner.l(), eVar);
        this.f58913d = cVar;
        this.f58914e = androidx.lifecycle.e1.b(cVar, a.f58919a);
        androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(cVar, new c());
        this.f58915f = c11;
        androidx.lifecycle.j0 c12 = androidx.lifecycle.e1.c(cVar, new d());
        this.f58916g = c12;
        this.f58917h = androidx.lifecycle.e1.c(xw.a.b(new nm0.j(c11, c12)), b.f58920a);
        this.f58918i = new androidx.lifecycle.k0<>();
    }

    public static final int f0(b1 b1Var) {
        int ordinal = b1Var.f58911b.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal == 7) {
                        return C1987R.string.samsungHealth_failedUnregisterPartner;
                    }
                    throw new IllegalStateException("Only samsung and googlefit are InApp partner");
                }
                return C1987R.string.huaweiHealth_failedUnregisterPartner;
            }
            return C1987R.string.authentication_error_generic;
        }
        return C1987R.string.googleFit_failedUnregisterPartner;
    }

    public static final void k0(b1 b1Var, boolean z5) {
        if (z5) {
            androidx.work.impl.n0 n11 = androidx.work.impl.n0.n(b1Var.getApplication());
            kotlin.jvm.internal.u.i(n11, "getInstance(...)");
            n11.d("ImportStepsFromFit", ExistingPeriodicWorkPolicy.f19028c, new t.a(ImportStepsFromFit.class, 1L, TimeUnit.HOURS).b());
            return;
        }
        Application context = b1Var.getApplication();
        kotlin.jvm.internal.u.j(context, "context");
        androidx.work.impl.n0.n(context).i("ImportStepsFromFit");
    }

    public static final void m0(b1 b1Var, boolean z5) {
        if (z5) {
            androidx.work.impl.n0 n11 = androidx.work.impl.n0.n(b1Var.getApplication());
            kotlin.jvm.internal.u.i(n11, "getInstance(...)");
            n11.d("ImportStepsFromSHealth", ExistingPeriodicWorkPolicy.f19028c, new t.a(ImportStepsFromSHealth.class, 1L, TimeUnit.HOURS).b());
            return;
        }
        Application context = b1Var.getApplication();
        kotlin.jvm.internal.u.j(context, "context");
        androidx.work.impl.n0.n(context).i("ImportStepsFromSHealth");
    }

    public final void A0(u10.u exchange, boolean z5) {
        kotlin.jvm.internal.u.j(exchange, "exchange");
        Partner value = this.f58913d.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new e(exchange, this, value, z5, null), 2, null);
        }
    }

    public final androidx.lifecycle.k0<Integer> p0() {
        return this.f58918i;
    }

    public final androidx.lifecycle.j0 q0() {
        return this.f58914e;
    }

    public final androidx.lifecycle.j0 r0() {
        return this.f58915f;
    }

    public final androidx.lifecycle.j0 t0() {
        return this.f58916g;
    }

    public final t10.c y0() {
        return this.f58913d;
    }

    public final androidx.lifecycle.j0 z0() {
        return this.f58917h;
    }
}
