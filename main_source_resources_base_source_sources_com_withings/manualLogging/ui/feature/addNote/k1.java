package com.withings.manualLogging.ui.feature.addNote;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.joda.time.DateTime;
/* compiled from: AddNotesViewModel.kt */
/* loaded from: classes4.dex */
public final class k1 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f41480a;

    /* renamed from: b  reason: collision with root package name */
    private final long f41481b;

    /* renamed from: c  reason: collision with root package name */
    private final hx.d f41482c;

    /* renamed from: d  reason: collision with root package name */
    private final hx.j f41483d;

    /* renamed from: e  reason: collision with root package name */
    private final hx.i f41484e;

    /* renamed from: f  reason: collision with root package name */
    private final hx.o f41485f;

    /* renamed from: g  reason: collision with root package name */
    private final m70.i f41486g;

    /* renamed from: h  reason: collision with root package name */
    private final vf.c f41487h;

    /* renamed from: i  reason: collision with root package name */
    private final pi.i f41488i;

    /* renamed from: j  reason: collision with root package name */
    private final pi.c f41489j;

    /* renamed from: k  reason: collision with root package name */
    private final pi.b f41490k;

    /* renamed from: l  reason: collision with root package name */
    private final pi.j f41491l;

    /* renamed from: m  reason: collision with root package name */
    private final xw.f f41492m;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.lifecycle.f f41493n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.lifecycle.f f41494o;

    /* renamed from: p  reason: collision with root package name */
    private final androidx.lifecycle.j0 f41495p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.lifecycle.f f41496q;

    /* renamed from: r  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f41497r;

    /* renamed from: s  reason: collision with root package name */
    private final androidx.lifecycle.j0 f41498s;

    /* renamed from: t  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f41499t;

    /* compiled from: AddNotesViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.AddNotesViewModel$saveNoteGroup$1$1", f = "AddNotesViewModel.kt", l = {114, 118}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41500a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ fx.e f41502c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AddNotesViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.AddNotesViewModel$saveNoteGroup$1$1$1", f = "AddNotesViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.manualLogging.ui.feature.addNote.k1$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0554a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k1 f41503a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0554a(k1 k1Var, qm0.d<? super C0554a> dVar) {
                super(2, dVar);
                this.f41503a = k1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new C0554a(this.f41503a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((C0554a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                k1 k1Var = this.f41503a;
                k1Var.f41497r.setValue(Boolean.FALSE);
                k1Var.f41499t.setValue(Boolean.TRUE);
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(fx.e eVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f41502c = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f41502c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f41500a;
            k1 k1Var = k1.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                hx.o oVar = k1Var.f41485f;
                fx.e it = this.f41502c;
                kotlin.jvm.internal.u.i(it, "$it");
                long j5 = k1Var.f41480a;
                this.f41500a = 1;
                DateTime now = DateTime.now();
                kotlin.jvm.internal.u.i(now, "now(...)");
                if (oVar.a(it, j5, now, false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C0554a c0554a = new C0554a(k1Var, null);
            this.f41500a = 2;
            if (BuildersKt.withContext(main, c0554a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    public k1(long j5, long j11, hx.d dVar, ox.e eVar, hx.i iVar, hx.o oVar, m70.i userManager, vf.c accountManager, pi.i iVar2, pi.c cVar, pi.b bVar, pi.j jVar) {
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(accountManager, "accountManager");
        this.f41480a = j5;
        this.f41481b = j11;
        this.f41482c = dVar;
        this.f41483d = eVar;
        this.f41484e = iVar;
        this.f41485f = oVar;
        this.f41486g = userManager;
        this.f41487h = accountManager;
        this.f41488i = iVar2;
        this.f41489j = cVar;
        this.f41490k = bVar;
        this.f41491l = jVar;
        androidx.lifecycle.f a11 = androidx.lifecycle.h.a(Dispatchers.getIO(), new i1(this, null), 2);
        xw.f f11 = xw.d.f(androidx.lifecycle.e1.b(a11, c1.f40742a));
        this.f41492m = f11;
        this.f41493n = androidx.lifecycle.h.a(Dispatchers.getIO(), new n1(this, null), 2);
        this.f41494o = androidx.lifecycle.h.a(Dispatchers.getIO(), new h1(this, null), 2);
        this.f41495p = androidx.lifecycle.e1.b(androidx.lifecycle.h.a(Dispatchers.getIO(), new d1(this, null), 2), m1.f41516a);
        this.f41496q = androidx.lifecycle.h.a(Dispatchers.getIO(), new e1(this, null), 2);
        Boolean bool = Boolean.FALSE;
        androidx.lifecycle.k0<Boolean> k0Var = new androidx.lifecycle.k0<>(bool);
        this.f41497r = k0Var;
        this.f41498s = androidx.lifecycle.e1.b(xw.a.b(new nm0.j(k0Var, androidx.lifecycle.e1.b(xw.a.b(new nm0.j(a11, f11)), g1.f41460a))), j1.f41474a);
        this.f41499t = new androidx.lifecycle.k0<>(bool);
    }

    public final void F0(fx.d note) {
        kotlin.jvm.internal.u.j(note, "note");
        xw.f fVar = this.f41492m;
        fx.e eVar = (fx.e) fVar.getValue();
        if (eVar != null) {
            fVar.setValue(eVar.r(note));
        }
    }

    public final androidx.lifecycle.f G0() {
        return this.f41496q;
    }

    public final androidx.lifecycle.f K0() {
        return this.f41494o;
    }

    public final xw.f M0() {
        return this.f41492m;
    }

    public final androidx.lifecycle.j0 O0() {
        return this.f41498s;
    }

    public final androidx.lifecycle.k0 R0() {
        return this.f41499t;
    }

    public final androidx.lifecycle.j0 T0() {
        return this.f41495p;
    }

    public final androidx.lifecycle.f U0() {
        return this.f41493n;
    }

    public final void V0(fx.d note) {
        kotlin.jvm.internal.u.j(note, "note");
        xw.f fVar = this.f41492m;
        fx.e eVar = (fx.e) fVar.getValue();
        if (eVar != null) {
            fVar.setValue(eVar.p(note));
        }
    }

    public final void W0() {
        fx.e eVar = (fx.e) this.f41492m.getValue();
        if (eVar != null) {
            this.f41497r.setValue(Boolean.TRUE);
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new a(eVar, null), 2, null);
        }
    }
}
