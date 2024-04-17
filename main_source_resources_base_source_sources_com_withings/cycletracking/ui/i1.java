package com.withings.cycletracking.ui;

import androidx.compose.foundation.layout.e;
import androidx.compose.material.r3;
import androidx.compose.material3.g9;
import androidx.compose.material3.o7;
import androidx.compose.material3.y7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.c5;
import com.withings.common.compose.component.card.FeedbackCard$Status;
import com.withings.common.compose.component.u5;
import com.withings.common.compose.picker.SurveyDateValidator;
import com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel;
import com.withings.cycletracking.ui.viewmodel.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import fk.m;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
/* compiled from: CycleTrackingFactorsScreen.kt */
/* loaded from: classes3.dex */
public final class i1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.CycleTrackingFactorsScreenKt$CycleTrackingEditFactorBottomSheet$1", f = "CycleTrackingFactorsScreen.kt", l = {ConstantsWs.MEASURE_TYPE_NHS_FEET}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.withings.cycletracking.ui.viewmodel.c f35595b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f35596c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.p<Integer, String, nm0.y> f35597d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35598e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CycleTrackingFactorsScreen.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.CycleTrackingFactorsScreenKt$CycleTrackingEditFactorBottomSheet$1$1", f = "CycleTrackingFactorsScreen.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.cycletracking.ui.i1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0472a extends kotlin.coroutines.jvm.internal.i implements ym0.p<com.withings.cycletracking.ui.viewmodel.a, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f35599a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ym0.l<Integer, nm0.y> f35600b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ym0.p<Integer, String, nm0.y> f35601c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ym0.a<nm0.y> f35602d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0472a(ym0.l<? super Integer, nm0.y> lVar, ym0.p<? super Integer, ? super String, nm0.y> pVar, ym0.a<nm0.y> aVar, qm0.d<? super C0472a> dVar) {
                super(2, dVar);
                this.f35600b = lVar;
                this.f35601c = pVar;
                this.f35602d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                C0472a c0472a = new C0472a(this.f35600b, this.f35601c, this.f35602d, dVar);
                c0472a.f35599a = obj;
                return c0472a;
            }

            @Override // ym0.p
            public final Object invoke(com.withings.cycletracking.ui.viewmodel.a aVar, qm0.d<? super nm0.y> dVar) {
                return ((C0472a) create(aVar, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                com.withings.cycletracking.ui.viewmodel.a aVar = (com.withings.cycletracking.ui.viewmodel.a) this.f35599a;
                if (aVar instanceof a.c) {
                    this.f35600b.invoke(new Integer(((a.c) aVar).a()));
                } else if (aVar instanceof a.b) {
                    a.b bVar = (a.b) aVar;
                    this.f35601c.invoke(new Integer(bVar.b()), bVar.a());
                } else {
                    this.f35602d.invoke();
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(com.withings.cycletracking.ui.viewmodel.c cVar, ym0.l<? super Integer, nm0.y> lVar, ym0.p<? super Integer, ? super String, nm0.y> pVar, ym0.a<nm0.y> aVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f35595b = cVar;
            this.f35596c = lVar;
            this.f35597d = pVar;
            this.f35598e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f35595b, this.f35596c, this.f35597d, this.f35598e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35594a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                SharedFlow<com.withings.cycletracking.ui.viewmodel.a> q02 = this.f35595b.q0();
                C0472a c0472a = new C0472a(this.f35596c, this.f35597d, this.f35598e, null);
                this.f35594a = 1;
                if (FlowKt.collectLatest(q02, c0472a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f35603a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35604b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f35605c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f35606d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LocalDate f35607e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.l<LocalDate, nm0.y> f35608f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SurveyDateValidator f35609g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LocalDate f35610h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.l<LocalDate, nm0.y> f35611i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ SurveyDateValidator f35612j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Integer f35613k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(k1.r0<Boolean> r0Var, ym0.a<nm0.y> aVar, String str, boolean z5, LocalDate localDate, ym0.l<? super LocalDate, nm0.y> lVar, SurveyDateValidator surveyDateValidator, LocalDate localDate2, ym0.l<? super LocalDate, nm0.y> lVar2, SurveyDateValidator surveyDateValidator2, Integer num) {
            super(3);
            this.f35603a = r0Var;
            this.f35604b = aVar;
            this.f35605c = str;
            this.f35606d = z5;
            this.f35607e = localDate;
            this.f35608f = lVar;
            this.f35609g = surveyDateValidator;
            this.f35610h = localDate2;
            this.f35611i = lVar2;
            this.f35612j = surveyDateValidator2;
            this.f35613k = num;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            e.a aVar2;
            androidx.compose.runtime.a aVar3;
            DateTime dateTime;
            DateTime dateTime2;
            Integer num2;
            int i11;
            r0.w padding = wVar;
            androidx.compose.runtime.a aVar4 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(padding, "padding");
            if ((intValue & 14) == 0) {
                if (aVar4.K(padding)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar4.h()) {
                aVar4.C();
            } else {
                e.a aVar5 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e g11 = androidx.compose.foundation.layout.x0.g(androidx.compose.foundation.layout.x0.e(aVar5, padding), yk.h.o(), yk.h.B());
                int i12 = androidx.compose.foundation.layout.e.f4229i;
                e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.a());
                aVar4.s(-483455358);
                androidx.compose.ui.layout.l0 b10 = com.withings.authentication.n.b(o11, aVar4, -1323940314);
                int G = aVar4.G();
                k1.v0 l5 = aVar4.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(g11);
                if (aVar4.i() instanceof k1.d) {
                    aVar4.A();
                    if (aVar4.e()) {
                        aVar4.F(a11);
                    } else {
                        aVar4.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar4, b10, aVar4, l5);
                    if (aVar4.e() || !kotlin.jvm.internal.u.e(aVar4.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar4, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar4), aVar4, 2058660585);
                    aVar4.s(290389389);
                    k1.r0<Boolean> r0Var = this.f35603a;
                    if (!r0Var.getValue().booleanValue()) {
                        aVar4.s(290389509);
                        Object t11 = aVar4.t();
                        if (t11 == a.C0060a.a()) {
                            t11 = new j1(r0Var);
                            aVar4.n(t11);
                        }
                        ym0.a aVar6 = (ym0.a) t11;
                        aVar4.J();
                        String u11 = ay.b.u(C1987R.string.account_are_you_sure, aVar4);
                        String u12 = ay.b.u(C1987R.string._DELETE_YES_, aVar4);
                        String u13 = ay.b.u(C1987R.string._CANCEL_, aVar4);
                        aVar4.s(290389883);
                        Object t12 = aVar4.t();
                        if (t12 == a.C0060a.a()) {
                            t12 = new k1(r0Var);
                            aVar4.n(t12);
                        }
                        aVar4.J();
                        aVar2 = aVar5;
                        aVar3 = aVar4;
                        wk.p.a(aVar6, null, u11, u12, 0L, this.f35604b, u13, 0L, (ym0.a) t12, aVar4, 100663302, ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2);
                    } else {
                        aVar2 = aVar5;
                        aVar3 = aVar4;
                    }
                    aVar3.J();
                    nk.a0.f(0, 0, 29, 0L, aVar3, null, null, this.f35605c);
                    nk.a.a(null, ay.b.u(C1987R.string.cycle_tracking_factors_edit, aVar3), 0, 0L, 0, 0, null, null, aVar3, 0, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED);
                    e.a aVar7 = aVar2;
                    r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar7, yk.h.c()), aVar3);
                    boolean z5 = this.f35606d;
                    androidx.compose.ui.e c13 = u5.c(aVar7, z5);
                    LocalDate localDate = this.f35607e;
                    if (localDate != null) {
                        dateTime = localDate.toDateTimeAtStartOfDay();
                    } else {
                        dateTime = null;
                    }
                    String u14 = ay.b.u(C1987R.string.cycle_tracking_factors_edit_startDate, aVar3);
                    aVar3.s(290390508);
                    ym0.l<LocalDate, nm0.y> lVar = this.f35608f;
                    boolean K = aVar3.K(lVar);
                    Object t13 = aVar3.t();
                    if (K || t13 == a.C0060a.a()) {
                        t13 = new l1(lVar);
                        aVar3.n(t13);
                    }
                    aVar3.J();
                    fk.l.a(u14, new m.a((ym0.l) t13), c13, dateTime, null, null, false, this.f35609g, aVar3, 4096, 112);
                    r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar7, yk.h.c()), aVar3);
                    androidx.compose.ui.e c14 = u5.c(aVar7, z5);
                    LocalDate localDate2 = this.f35610h;
                    if (localDate2 != null) {
                        dateTime2 = localDate2.toDateTimeAtStartOfDay();
                    } else {
                        dateTime2 = null;
                    }
                    String u15 = ay.b.u(C1987R.string.cycle_tracking_factors_edit_endDate, aVar3);
                    aVar3.s(290391055);
                    ym0.l<LocalDate, nm0.y> lVar2 = this.f35611i;
                    boolean K2 = aVar3.K(lVar2);
                    Object t14 = aVar3.t();
                    if (K2 || t14 == a.C0060a.a()) {
                        t14 = new m1(lVar2);
                        aVar3.n(t14);
                    }
                    aVar3.J();
                    fk.l.a(u15, new m.a((ym0.l) t14), c14, dateTime2, null, null, false, this.f35612j, aVar3, 4096, 112);
                    r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar7, yk.h.c()), aVar3);
                    if (!z5) {
                        num2 = this.f35613k;
                    } else {
                        num2 = null;
                    }
                    i1.f(num2, aVar3, 0);
                    aVar3.J();
                    aVar3.o();
                    aVar3.J();
                    aVar3.J();
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f35614a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35615b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f35616c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LocalDate f35617d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LocalDate f35618e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ SurveyDateValidator f35619f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SurveyDateValidator f35620g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.l<LocalDate, nm0.y> f35621h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.l<LocalDate, nm0.y> f35622i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35623j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35624k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35625l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f35626m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f35627n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z5, String str, Integer num, LocalDate localDate, LocalDate localDate2, SurveyDateValidator surveyDateValidator, SurveyDateValidator surveyDateValidator2, ym0.l<? super LocalDate, nm0.y> lVar, ym0.l<? super LocalDate, nm0.y> lVar2, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11, int i12) {
            super(2);
            this.f35614a = z5;
            this.f35615b = str;
            this.f35616c = num;
            this.f35617d = localDate;
            this.f35618e = localDate2;
            this.f35619f = surveyDateValidator;
            this.f35620g = surveyDateValidator2;
            this.f35621h = lVar;
            this.f35622i = lVar2;
            this.f35623j = aVar;
            this.f35624k = aVar2;
            this.f35625l = aVar3;
            this.f35626m = i11;
            this.f35627n = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f35626m | 1);
            int g12 = ah.o.g(this.f35627n);
            ym0.a<nm0.y> aVar2 = this.f35624k;
            ym0.a<nm0.y> aVar3 = this.f35625l;
            i1.b(this.f35614a, this.f35615b, this.f35616c, this.f35617d, this.f35618e, this.f35619f, this.f35620g, this.f35621h, this.f35622i, this.f35623j, aVar2, aVar3, aVar, g11, g12);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class d extends kotlin.jvm.internal.s implements ym0.l<LocalDate, nm0.y> {
        d(com.withings.cycletracking.ui.viewmodel.c cVar) {
            super(1, cVar, com.withings.cycletracking.ui.viewmodel.c.class, "onStartDateChanged", "onStartDateChanged$ui_release(Lorg/joda/time/LocalDate;)V", 0);
        }

        @Override // ym0.l
        public final nm0.y invoke(LocalDate localDate) {
            LocalDate p02 = localDate;
            kotlin.jvm.internal.u.j(p02, "p0");
            ((com.withings.cycletracking.ui.viewmodel.c) this.receiver).F0(p02);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class e extends kotlin.jvm.internal.s implements ym0.l<LocalDate, nm0.y> {
        e(com.withings.cycletracking.ui.viewmodel.c cVar) {
            super(1, cVar, com.withings.cycletracking.ui.viewmodel.c.class, "onEndDateChanged", "onEndDateChanged$ui_release(Lorg/joda/time/LocalDate;)V", 0);
        }

        @Override // ym0.l
        public final nm0.y invoke(LocalDate localDate) {
            LocalDate p02 = localDate;
            kotlin.jvm.internal.u.j(p02, "p0");
            ((com.withings.cycletracking.ui.viewmodel.c) this.receiver).A0(p02);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.o1<en.g> f35628a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.withings.cycletracking.ui.viewmodel.c f35629b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k1.o1<en.g> o1Var, com.withings.cycletracking.ui.viewmodel.c cVar) {
            super(0);
            this.f35628a = o1Var;
            this.f35629b = cVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            fr.a c11;
            en.g value = this.f35628a.getValue();
            if (value != null && (c11 = value.c()) != null) {
                this.f35629b.B0(c11);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.o1<en.g> f35630a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.withings.cycletracking.ui.viewmodel.c f35631b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k1.o1<en.g> o1Var, com.withings.cycletracking.ui.viewmodel.c cVar) {
            super(0);
            this.f35630a = o1Var;
            this.f35631b = cVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            fr.a c11;
            en.g value = this.f35630a.getValue();
            if (value != null && (c11 = value.c()) != null) {
                this.f35631b.z0(c11);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f35633b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<Integer, String, nm0.y> f35634c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.withings.cycletracking.ui.viewmodel.c f35635d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f35636e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f35637f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(ym0.a<nm0.y> aVar, ym0.l<? super Integer, nm0.y> lVar, ym0.p<? super Integer, ? super String, nm0.y> pVar, com.withings.cycletracking.ui.viewmodel.c cVar, int i11, int i12) {
            super(2);
            this.f35632a = aVar;
            this.f35633b = lVar;
            this.f35634c = pVar;
            this.f35635d = cVar;
            this.f35636e = i11;
            this.f35637f = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f35636e | 1);
            ym0.p<Integer, String, nm0.y> pVar = this.f35634c;
            com.withings.cycletracking.ui.viewmodel.c cVar = this.f35635d;
            i1.a(this.f35632a, this.f35633b, pVar, cVar, aVar, g11, this.f35637f);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35638a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ym0.a<nm0.y> aVar) {
            super(2);
            this.f35638a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                c5.a(0L, 0L, ay.b.u(C1987R.string.cycle_tracking_cycleFactor_name, aVar2), true, b1.a.a(), null, null, null, false, this.f35638a, aVar2, 3072, 483);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f35639a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35640b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f35641c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z5, ym0.a<nm0.y> aVar, k1.r0<Boolean> r0Var) {
            super(2);
            this.f35639a = z5;
            this.f35640b = aVar;
            this.f35641c = r0Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                ym0.a<nm0.y> aVar3 = this.f35640b;
                boolean z5 = this.f35639a;
                wk.i.a(null, true, s1.b.b(aVar2, -1491374204, new n1(aVar3, z5)), s1.b.b(aVar2, -857075195, new p1(this.f35641c, z5)), aVar2, 3504, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.a<en.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.o1<Object> f35642a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(k1.r0 r0Var) {
            super(0);
            this.f35642a = r0Var;
        }

        @Override // ym0.a
        public final en.g invoke() {
            Object value = this.f35642a.getValue();
            if (value instanceof en.g) {
                return (en.g) value;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.CycleTrackingFactorsScreenKt$CycleTrackingFactorsScreen$1", f = "CycleTrackingFactorsScreen.kt", l = {74}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35643a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CycleTrackingFactorsViewModel f35644b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35645c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35646d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35647e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CycleTrackingFactorsScreen.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.CycleTrackingFactorsScreenKt$CycleTrackingFactorsScreen$1$1", f = "CycleTrackingFactorsScreen.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CycleTrackingFactorsViewModel.Event, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f35648a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ym0.a<nm0.y> f35649b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ym0.a<nm0.y> f35650c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ym0.a<nm0.y> f35651d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f35649b = aVar;
                this.f35650c = aVar2;
                this.f35651d = aVar3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                a aVar = new a(this.f35649b, this.f35650c, this.f35651d, dVar);
                aVar.f35648a = obj;
                return aVar;
            }

            @Override // ym0.p
            public final Object invoke(CycleTrackingFactorsViewModel.Event event, qm0.d<? super nm0.y> dVar) {
                return ((a) create(event, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                int ordinal = ((CycleTrackingFactorsViewModel.Event) this.f35648a).ordinal();
                if (ordinal != 0) {
                    ym0.a<nm0.y> aVar = this.f35649b;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                aVar.invoke();
                            }
                        } else {
                            this.f35650c.invoke();
                        }
                    } else {
                        aVar.invoke();
                    }
                } else {
                    this.f35651d.invoke();
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(CycleTrackingFactorsViewModel cycleTrackingFactorsViewModel, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, qm0.d<? super l> dVar) {
            super(2, dVar);
            this.f35644b = cycleTrackingFactorsViewModel;
            this.f35645c = aVar;
            this.f35646d = aVar2;
            this.f35647e = aVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new l(this.f35644b, this.f35645c, this.f35646d, this.f35647e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((l) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35643a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                SharedFlow<CycleTrackingFactorsViewModel.Event> m02 = this.f35644b.m0();
                a aVar = new a(this.f35645c, this.f35646d, this.f35647e, null);
                this.f35643a = 1;
                if (FlowKt.collectLatest(m02, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.CycleTrackingFactorsScreenKt$CycleTrackingFactorsScreen$2", f = "CycleTrackingFactorsScreen.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CycleTrackingFactorsViewModel f35652a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(CycleTrackingFactorsViewModel cycleTrackingFactorsViewModel, qm0.d<? super m> dVar) {
            super(2, dVar);
            this.f35652a = cycleTrackingFactorsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new m(this.f35652a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((m) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f35652a.k0();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class n extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
        n(CycleTrackingFactorsViewModel cycleTrackingFactorsViewModel) {
            super(0, cycleTrackingFactorsViewModel, CycleTrackingFactorsViewModel.class, "onBackClick", "onBackClick$ui_release()V", 0);
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            ((CycleTrackingFactorsViewModel) this.receiver).r0();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class o extends kotlin.jvm.internal.w implements ym0.l<fr.a, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CycleTrackingFactorsViewModel f35653a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(CycleTrackingFactorsViewModel cycleTrackingFactorsViewModel) {
            super(1);
            this.f35653a = cycleTrackingFactorsViewModel;
        }

        @Override // ym0.l
        public final nm0.y invoke(fr.a aVar) {
            fr.a id2 = aVar;
            kotlin.jvm.internal.u.j(id2, "id");
            this.f35653a.t0(id2);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class p extends kotlin.jvm.internal.w implements ym0.l<fr.a, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Long, nm0.y> f35654a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(ym0.l<? super Long, nm0.y> lVar) {
            super(1);
            this.f35654a = lVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(fr.a aVar) {
            fr.a factor = aVar;
            kotlin.jvm.internal.u.j(factor, "factor");
            Long d11 = factor.d();
            if (d11 != null) {
                this.f35654a.invoke(Long.valueOf(d11.longValue()));
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class q extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35655a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35656b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35657c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35658d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<Long, nm0.y> f35659e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ CycleTrackingFactorsViewModel f35660f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f35661g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f35662h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, ym0.l<? super Long, nm0.y> lVar, CycleTrackingFactorsViewModel cycleTrackingFactorsViewModel, int i11, int i12) {
            super(2);
            this.f35655a = aVar;
            this.f35656b = aVar2;
            this.f35657c = aVar3;
            this.f35658d = aVar4;
            this.f35659e = lVar;
            this.f35660f = cycleTrackingFactorsViewModel;
            this.f35661g = i11;
            this.f35662h = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f35661g | 1);
            ym0.l<Long, nm0.y> lVar = this.f35659e;
            CycleTrackingFactorsViewModel cycleTrackingFactorsViewModel = this.f35660f;
            i1.d(this.f35655a, this.f35656b, this.f35657c, this.f35658d, lVar, cycleTrackingFactorsViewModel, aVar, g11, this.f35662h);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35663a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(ym0.a<nm0.y> aVar) {
            super(2);
            this.f35663a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                wk.i.a(null, true, s1.b.b(aVar2, -111367554, new q1(this.f35663a)), null, aVar2, 432, 9);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class s extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ en.j f35664a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<fr.a, nm0.y> f35665b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35666c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.r0<fr.a> f35667d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<fr.a, nm0.y> f35668e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(en.j jVar, ym0.l<? super fr.a, nm0.y> lVar, ym0.a<nm0.y> aVar, k1.r0<fr.a> r0Var, ym0.l<? super fr.a, nm0.y> lVar2) {
            super(3);
            this.f35664a = jVar;
            this.f35665b = lVar;
            this.f35666c = aVar;
            this.f35667d = r0Var;
            this.f35668e = lVar2;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            r0.w anonymous$parameter$0$ = wVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(anonymous$parameter$0$, "$anonymous$parameter$0$");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string.cycle_tracking_cycleFactor_name, aVar2);
                kotlin.collections.i0 i0Var = kotlin.collections.i0.f76187a;
                List<hk.k<fr.a>> a11 = this.f35664a.a();
                aVar2.s(796613145);
                Object t11 = aVar2.t();
                a.C0060a.C0061a a12 = a.C0060a.a();
                k1.r0<fr.a> r0Var = this.f35667d;
                if (t11 == a12) {
                    t11 = new r1(r0Var);
                    aVar2.n(t11);
                }
                aVar2.J();
                hk.b.b(false, u11, i0Var, a11, this.f35665b, this.f35666c, (ym0.l) t11, aVar2, 1577344, 1);
                if (r0Var.getValue() != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                l0.g.e(z5, null, null, null, null, s1.b.b(aVar2, 2121024013, new v1(r0Var, this.f35668e)), aVar2, 196608, 30);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class t extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ en.j f35669a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35670b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35671c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<fr.a, nm0.y> f35672d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<fr.a, nm0.y> f35673e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f35674f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(en.j jVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.l<? super fr.a, nm0.y> lVar, ym0.l<? super fr.a, nm0.y> lVar2, int i11) {
            super(2);
            this.f35669a = jVar;
            this.f35670b = aVar;
            this.f35671c = aVar2;
            this.f35672d = lVar;
            this.f35673e = lVar2;
            this.f35674f = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f35674f | 1);
            ym0.l<fr.a, nm0.y> lVar = this.f35672d;
            ym0.l<fr.a, nm0.y> lVar2 = this.f35673e;
            i1.c(this.f35669a, this.f35670b, this.f35671c, lVar, lVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class u extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f35675a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(int i11) {
            super(2);
            this.f35675a = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            i1.e(aVar, ah.o.g(this.f35675a | 1));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class v extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Integer f35676a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(Integer num) {
            super(3);
            this.f35676a = num;
        }

        @Override // ym0.q
        public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
            String u11;
            l0.i AnimatedVisibility = iVar;
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
            FeedbackCard$Status feedbackCard$Status = FeedbackCard$Status.f33622a;
            aVar2.s(1167328591);
            Integer num2 = this.f35676a;
            if (num2 == null) {
                u11 = null;
            } else {
                u11 = ay.b.u(num2.intValue(), aVar2);
            }
            aVar2.J();
            if (u11 == null) {
                u11 = "";
            }
            uj.o.a(feedbackCard$Status, u11, ay.b.u(C1987R.string.cycle_tracking_factors_contraceptive_pauseOvulation_title, aVar2), null, 0, aVar2, 24582, 8);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorsScreen.kt */
    /* loaded from: classes3.dex */
    public static final class w extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Integer f35677a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f35678b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(int i11, Integer num) {
            super(2);
            this.f35677a = num;
            this.f35678b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f35678b | 1);
            i1.f(this.f35677a, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(ym0.a<nm0.y> r20, ym0.l<? super java.lang.Integer, nm0.y> r21, ym0.p<? super java.lang.Integer, ? super java.lang.String, nm0.y> r22, com.withings.cycletracking.ui.viewmodel.c r23, androidx.compose.runtime.a r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.ui.i1.a(ym0.a, ym0.l, ym0.p, com.withings.cycletracking.ui.viewmodel.c, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z5, String str, Integer num, LocalDate localDate, LocalDate localDate2, SurveyDateValidator surveyDateValidator, SurveyDateValidator surveyDateValidator2, ym0.l<? super LocalDate, nm0.y> lVar, ym0.l<? super LocalDate, nm0.y> lVar2, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, androidx.compose.runtime.a aVar4, int i11, int i12) {
        androidx.compose.runtime.b g11 = aVar4.g(-461359906);
        g11.s(-419318253);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.TRUE, androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        g11.J();
        y7.b(null, s1.b.b(g11, -96185950, new i(aVar3)), s1.b.b(g11, -490589789, new j(z5, aVar, r0Var)), null, null, 0, ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).O(), 0L, null, s1.b.b(g11, 23885421, new b(r0Var, aVar2, str, z5, localDate, lVar, surveyDateValidator, localDate2, lVar2, surveyDateValidator2, num)), g11, 805306800, 441);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(z5, str, num, localDate, localDate2, surveyDateValidator, surveyDateValidator2, lVar, lVar2, aVar, aVar2, aVar3, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(en.j jVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.l<? super fr.a, nm0.y> lVar, ym0.l<? super fr.a, nm0.y> lVar2, androidx.compose.runtime.a aVar3, int i11) {
        androidx.compose.runtime.b g11 = aVar3.g(-1658948252);
        g11.s(-457926152);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        g11.J();
        y7.b(null, null, s1.b.b(g11, -1963118657, new r(aVar2)), null, null, 0, 0L, 0L, null, s1.b.b(g11, 896164149, new s(jVar, lVar2, aVar, (k1.r0) t11, lVar)), g11, 805306752, 507);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new t(jVar, aVar, aVar2, lVar, lVar2, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(ym0.a<nm0.y> r22, ym0.a<nm0.y> r23, ym0.a<nm0.y> r24, ym0.a<nm0.y> r25, ym0.l<? super java.lang.Long, nm0.y> r26, com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel r27, androidx.compose.runtime.a r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.ui.i1.d(ym0.a, ym0.a, ym0.a, ym0.a, ym0.l, com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorsViewModel, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-2146826652);
        if (i11 == 0 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a);
            androidx.compose.ui.layout.l0 a11 = r3.a(g11, 733328855, false, g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                o7.a(0.0f, 0, 0, 31, 0L, 0L, g11, null);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new u(i11));
        }
    }

    public static final void f(Integer num, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        boolean z5;
        int i13;
        androidx.compose.runtime.b g11 = aVar.g(1511499998);
        if ((i11 & 14) == 0) {
            if (g11.K(num)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            if (num != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            l0.g.e(z5, null, androidx.compose.animation.p.h(null, 0.0f, 3), androidx.compose.animation.p.i(null, 3), null, s1.b.b(g11, -1281550586, new v(num)), g11, 200064, 18);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new w(i11, num));
        }
    }
}
