package com.withings.weight.presentation.viewmodel;

import android.content.Context;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.common.compose.component.m4;
import com.withings.device.Device;
import com.withings.graph.GraphPeriod;
import com.withings.graph.model.NormalityZoneUiModel;
import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.user.core.models.User;
import com.withings.weight.core.model.VisceralFatState;
import com.withings.weight.presentation.entities.BodyCompositionTypes;
import com.withings.weight.presentation.ui.model.SecondaryGraphUnit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import m90.d;
import m90.e;
import o70.a;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import ws.c;
import y80.a;
/* compiled from: BodyCompViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/presentation/viewmodel/BodyCompViewModel;", "Landroidx/lifecycle/g1;", "weight-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BodyCompViewModel extends g1 {
    private final SharedFlow<Device> A;
    private final SharedFlow<Boolean> B;
    private final MutableSharedFlow<Interval> F;
    private final SharedFlow<Interval> G;
    private final SharedFlow<Boolean> M;
    private final SharedFlow<e.b.C1297e> P;
    private final MutableSharedFlow<Interval> Q;
    private final SharedFlow<List<LearnMoreEntryTranslations>> R;
    private final MutableSharedFlow<f90.a> S;
    private final MutableStateFlow<List<String>> T;
    private final Flow<List<String>> W;
    private final SharedFlow<m90.c> X;
    private final SharedFlow<List<ws.c>> Y;
    private final SharedFlow<m4> Z;

    /* renamed from: a  reason: collision with root package name */
    private final xw.b f47323a;

    /* renamed from: b  reason: collision with root package name */
    private final g90.a f47324b;

    /* renamed from: c  reason: collision with root package name */
    private final LearnMoreManager f47325c;

    /* renamed from: d  reason: collision with root package name */
    private final n90.d f47326d;

    /* renamed from: e  reason: collision with root package name */
    private final n90.k f47327e;

    /* renamed from: f  reason: collision with root package name */
    private final n90.i f47328f;

    /* renamed from: g  reason: collision with root package name */
    private final n90.e f47329g;

    /* renamed from: h  reason: collision with root package name */
    private final n90.h f47330h;

    /* renamed from: i  reason: collision with root package name */
    private final n90.l f47331i;

    /* renamed from: j  reason: collision with root package name */
    private final n90.f f47332j;

    /* renamed from: k  reason: collision with root package name */
    private final n90.j f47333k;

    /* renamed from: l  reason: collision with root package name */
    private final cy.a f47334l;

    /* renamed from: l0  reason: collision with root package name */
    private final xw.n<nm0.j<Period, DateTime>> f47335l0;

    /* renamed from: m  reason: collision with root package name */
    private final j90.c f47336m;

    /* renamed from: m0  reason: collision with root package name */
    private final j f47337m0;

    /* renamed from: n  reason: collision with root package name */
    private final com.withings.weight.presentation.ui.b f47338n;

    /* renamed from: n0  reason: collision with root package name */
    private final SharedFlow<m90.h<m90.d>> f47339n0;

    /* renamed from: o  reason: collision with root package name */
    private final n90.r f47340o;

    /* renamed from: o0  reason: collision with root package name */
    private final SharedFlow<NormalityZoneUiModel> f47341o0;

    /* renamed from: p  reason: collision with root package name */
    private final bj0.d f47342p;

    /* renamed from: p0  reason: collision with root package name */
    private final SharedFlow<f90.d> f47343p0;

    /* renamed from: q  reason: collision with root package name */
    private final n90.s f47344q;

    /* renamed from: q0  reason: collision with root package name */
    private final SharedFlow<m90.h<m90.d>> f47345q0;

    /* renamed from: r  reason: collision with root package name */
    private final v90.c f47346r;

    /* renamed from: r0  reason: collision with root package name */
    private final SharedFlow<NormalityZoneUiModel> f47347r0;

    /* renamed from: s  reason: collision with root package name */
    private final ks.t f47348s;

    /* renamed from: s0  reason: collision with root package name */
    private final SharedFlow<f90.d> f47349s0;

    /* renamed from: t  reason: collision with root package name */
    private final q70.j f47350t;

    /* renamed from: t0  reason: collision with root package name */
    private final SharedFlow<m90.h<m90.d>> f47351t0;

    /* renamed from: u  reason: collision with root package name */
    private final User f47352u;

    /* renamed from: u0  reason: collision with root package name */
    private final SharedFlow<NormalityZoneUiModel> f47353u0;

    /* renamed from: v  reason: collision with root package name */
    private final Integer f47354v;

    /* renamed from: v0  reason: collision with root package name */
    private final SharedFlow<f90.d> f47355v0;

    /* renamed from: w  reason: collision with root package name */
    private final boolean f47356w;

    /* renamed from: w0  reason: collision with root package name */
    private final SharedFlow<e.b.d> f47357w0;

    /* renamed from: x  reason: collision with root package name */
    private final l70.u f47358x;

    /* renamed from: x0  reason: collision with root package name */
    private final SharedFlow<e.b.h> f47359x0;

    /* renamed from: y  reason: collision with root package name */
    private final MutableSharedFlow<List<GraphPeriod>> f47360y;

    /* renamed from: z  reason: collision with root package name */
    private final at.a f47361z;

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$1", f = "BodyCompViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGAPPLICATIONTYPE, ConstantsWs.WS_STATUS_WRONGAPPLICATIONCTX, ConstantsWs.WS_STATUS_IPUSHERROR, ConstantsWs.WS_STATUS_TWITTERROR, ConstantsWs.WS_STATUS_WRONGURL}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f47362a;

        /* renamed from: b  reason: collision with root package name */
        Serializable f47363b;

        /* renamed from: c  reason: collision with root package name */
        DateTime f47364c;

        /* renamed from: d  reason: collision with root package name */
        int f47365d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u0 f47366e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ BodyCompViewModel f47367f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v90.g f47368g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ fy.i f47369h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ml.b f47370i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u0 u0Var, BodyCompViewModel bodyCompViewModel, v90.g gVar, fy.i iVar, ml.b bVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f47366e = u0Var;
            this.f47367f = bodyCompViewModel;
            this.f47368g = gVar;
            this.f47369h = iVar;
            this.f47370i = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f47366e, this.f47367f, this.f47368g, this.f47369h, this.f47370i, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x010a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.viewmodel.BodyCompViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$weightDetailLearnMoreEntries$1", f = "BodyCompViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_SNORING_INTENSITY, ConstantsWs.MEASURE_TYPE_SNORING_INTENSITY}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends LearnMoreEntryTranslations>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47371a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f47372b;

        a0(qm0.d<? super a0> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a0 a0Var = new a0(dVar);
            a0Var.f47372b = obj;
            return a0Var;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super List<? extends LearnMoreEntryTranslations>> flowCollector, qm0.d<? super nm0.y> dVar) {
            return ((a0) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            List<LearnMoreEntryTranslations> list;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47371a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.f47372b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                flowCollector = (FlowCollector) this.f47372b;
                LearnMoreManager learnMoreManager = BodyCompViewModel.this.f47325c;
                this.f47372b = flowCollector;
                this.f47371a = 1;
                obj = learnMoreManager.getLearnMoreCategories(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
            if (learnMoreCategories == null || (list = learnMoreCategories.getBodyComp()) == null) {
                list = i0.f76187a;
            }
            this.f47372b = null;
            this.f47371a = 2;
            if (flowCollector.emit(list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$bodyCompScreenState$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.t<Boolean, Boolean, List<? extends GraphPeriod>, Interval, Device, qm0.d<? super e.b.C1297e>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ boolean f47374a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f47375b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ List f47376c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Interval f47377d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Device f47378e;

        b(qm0.d<? super b> dVar) {
            super(6, dVar);
        }

        @Override // ym0.t
        public final Object c(Boolean bool, Boolean bool2, List<? extends GraphPeriod> list, Interval interval, Device device, qm0.d<? super e.b.C1297e> dVar) {
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            b bVar = new b(dVar);
            bVar.f47374a = booleanValue;
            bVar.f47375b = booleanValue2;
            bVar.f47376c = list;
            bVar.f47377d = interval;
            bVar.f47378e = device;
            return bVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            User.BodyModel bodyModel;
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            boolean z5 = this.f47374a;
            boolean z11 = this.f47375b;
            List list = this.f47376c;
            Interval interval = this.f47377d;
            Device device = this.f47378e;
            BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
            com.withings.user.User user = bodyCompViewModel.f47352u;
            l70.u uVar = bodyCompViewModel.f47358x;
            Integer g11 = bodyCompViewModel.f47352u.g();
            if (g11 != null) {
                int intValue = g11.intValue();
                Iterator it = ((kotlin.collections.c) a.C1433a.f86534c).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        User.BodyModel bodyModel2 = (User.BodyModel) obj2;
                        kotlin.jvm.internal.u.j(bodyModel2, "<this>");
                        int i11 = a.b.f86538c[bodyModel2.ordinal()];
                        int i12 = 1;
                        if (i11 != 1) {
                            i12 = 2;
                            if (i11 == 2) {
                                continue;
                            } else if (i11 == 3) {
                                i12 = 0;
                                continue;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        if (i12 == intValue) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                User.BodyModel bodyModel3 = (User.BodyModel) obj2;
                if (bodyModel3 != null) {
                    bodyModel = bodyModel3;
                    return new e.b.C1297e(user, uVar, z11, z5, device, list, interval, bodyCompViewModel.f47361z, bodyModel);
                }
            }
            bodyModel = User.BodyModel.NEUTRAL;
            return new e.b.C1297e(user, uVar, z11, z5, device, list, interval, bodyCompViewModel.f47361z, bodyModel);
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$graphOptions$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.s<f90.a, Interval, List<? extends String>, Boolean, qm0.d<? super List<? extends ws.c>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ f90.a f47380a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Interval f47381b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ List f47382c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f47383d;

        c(qm0.d<? super c> dVar) {
            super(5, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            f90.a aVar = this.f47380a;
            Interval interval = this.f47381b;
            List list = this.f47382c;
            boolean z5 = this.f47383d;
            BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
            n90.r rVar = bodyCompViewModel.f47340o;
            List<ky.d> h11 = aVar.h();
            List<ky.d> c11 = aVar.c();
            l70.u uVar = bodyCompViewModel.f47358x;
            DateTime start = interval.getStart();
            DateTime end = interval.getEnd();
            if (list != null) {
                str = (String) kotlin.collections.x.K(list);
            } else {
                str = null;
            }
            String str2 = str;
            kotlin.jvm.internal.u.g(start);
            kotlin.jvm.internal.u.g(end);
            return rVar.b(h11, c11, z5, uVar, start, end, str2);
        }

        @Override // ym0.s
        public final Object k(f90.a aVar, Interval interval, List<? extends String> list, Boolean bool, qm0.d<? super List<? extends ws.c>> dVar) {
            boolean booleanValue = bool.booleanValue();
            c cVar = new c(dVar);
            cVar.f47380a = aVar;
            cVar.f47381b = interval;
            cVar.f47382c = list;
            cVar.f47383d = booleanValue;
            return cVar.invokeSuspend(nm0.y.f85009a);
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$howToUseScaleDevice$1", f = "BodyCompViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT, 135, ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Device>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        vr.d f47385a;

        /* renamed from: b  reason: collision with root package name */
        Iterator f47386b;

        /* renamed from: c  reason: collision with root package name */
        Device f47387c;

        /* renamed from: d  reason: collision with root package name */
        int f47388d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f47389e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ kn.e f47390f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ vr.d f47391g;

        /* compiled from: Comparisons.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return pm0.a.b(((Device) t11).getLastUseDate(), ((Device) t12).getLastUseDate());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kn.e eVar, vr.d dVar, qm0.d<? super d> dVar2) {
            super(2, dVar2);
            this.f47390f = eVar;
            this.f47391g = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            d dVar2 = new d(this.f47390f, this.f47391g, dVar);
            dVar2.f47389e = obj;
            return dVar2;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super Device> flowCollector, qm0.d<? super nm0.y> dVar) {
            return ((d) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
            r11.f47389e = null;
            r11.f47385a = null;
            r11.f47386b = null;
            r11.f47387c = null;
            r11.f47388d = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
            if (r8.emit(r1, r11) != r0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Comparator] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009b -> B:24:0x009e). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.viewmodel.BodyCompViewModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$leanMassCardUiModel$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.r<m90.h<m90.d>, Interval, Boolean, qm0.d<? super f90.d>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ m90.h f47392a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Interval f47393b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ boolean f47394c;

        e(qm0.d<? super e> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(m90.h<m90.d> hVar, Interval interval, Boolean bool, qm0.d<? super f90.d> dVar) {
            boolean booleanValue = bool.booleanValue();
            e eVar = new e(dVar);
            eVar.f47392a = hVar;
            eVar.f47393b = interval;
            eVar.f47394c = booleanValue;
            return eVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            m90.h hVar = this.f47392a;
            Interval interval = this.f47393b;
            boolean z11 = this.f47394c;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : hVar.a()) {
                if (interval.contains(((m90.d) obj2).a())) {
                    arrayList.add(obj2);
                }
            }
            Duration duration = new Duration(interval.getStart(), interval.getEnd());
            BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
            ArrayList d12 = BodyCompViewModel.d1(bodyCompViewModel, arrayList, duration);
            boolean e12 = BodyCompViewModel.e1(bodyCompViewModel, hVar, interval);
            n90.e eVar = bodyCompViewModel.f47329g;
            boolean Z0 = BodyCompViewModel.Z0(bodyCompViewModel, bodyCompViewModel.f47352u);
            DateTime f11 = bodyCompViewModel.f47352u.f();
            if (hVar.c() == SecondaryGraphUnit.f47267f) {
                z5 = true;
            } else {
                z5 = false;
            }
            kotlin.jvm.internal.u.g(f11);
            return new f90.d(e12, z11, eVar.a(d12, f11, Z0, z5));
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$leanMassNormalityZoneUiModel$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.r<m90.h<m90.d>, Boolean, Interval, qm0.d<? super NormalityZoneUiModel>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ m90.h f47396a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f47397b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Interval f47398c;

        f(qm0.d<? super f> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(m90.h<m90.d> hVar, Boolean bool, Interval interval, qm0.d<? super NormalityZoneUiModel> dVar) {
            boolean booleanValue = bool.booleanValue();
            f fVar = new f(dVar);
            fVar.f47396a = hVar;
            fVar.f47397b = booleanValue;
            fVar.f47398c = interval;
            return fVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            m90.h hVar = this.f47396a;
            boolean z5 = this.f47397b;
            Interval interval = this.f47398c;
            if (z5) {
                boolean z11 = true;
                if (!hVar.a().isEmpty()) {
                    BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
                    n90.f fVar = bodyCompViewModel.f47332j;
                    boolean Z0 = BodyCompViewModel.Z0(bodyCompViewModel, bodyCompViewModel.f47352u);
                    DateTime f11 = bodyCompViewModel.f47352u.f();
                    kotlin.jvm.internal.u.i(f11, "getBirthDate(...)");
                    if (hVar.c() != SecondaryGraphUnit.f47267f) {
                        z11 = false;
                    }
                    boolean z12 = z11;
                    bj0.d dVar = bodyCompViewModel.f47342p;
                    DateTime a11 = ((m90.d) kotlin.collections.x.I(hVar.a())).a();
                    DateTime a12 = ((m90.d) kotlin.collections.x.T(hVar.a())).a();
                    dVar.getClass();
                    Interval h11 = bj0.d.h(a11, a12);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : hVar.a()) {
                        if (interval.contains(((m90.d) obj2).a())) {
                            arrayList.add(obj2);
                        }
                    }
                    return fVar.a(Z0, f11, z12, h11, arrayList);
                }
            }
            return null;
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$leanMassUiModel$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.r<f90.a, Boolean, Interval, qm0.d<? super m90.h<m90.d>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ f90.a f47400a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f47401b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Interval f47402c;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.weight.presentation.viewmodel.BodyCompViewModel$g, kotlin.coroutines.jvm.internal.i] */
        @Override // ym0.r
        public final Object invoke(f90.a aVar, Boolean bool, Interval interval, qm0.d<? super m90.h<m90.d>> dVar) {
            boolean booleanValue = bool.booleanValue();
            ?? iVar = new kotlin.coroutines.jvm.internal.i(4, dVar);
            iVar.f47400a = aVar;
            iVar.f47401b = booleanValue;
            iVar.f47402c = interval;
            return iVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SecondaryGraphUnit secondaryGraphUnit;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            f90.a aVar = this.f47400a;
            boolean z5 = this.f47401b;
            Interval interval = this.f47402c;
            ArrayList arrayList = new ArrayList();
            for (ky.d dVar : aVar.g()) {
                m90.d c11 = d.a.c(dVar);
                if (c11 != null) {
                    arrayList.add(c11);
                }
            }
            if (z5) {
                secondaryGraphUnit = SecondaryGraphUnit.f47267f;
            } else {
                secondaryGraphUnit = SecondaryGraphUnit.f47268g;
            }
            return new m90.h(interval, arrayList, secondaryGraphUnit);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$limbFlow$1$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.i implements ym0.q<Boolean, v90.i, qm0.d<? super e.b.d>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ boolean f47403a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ v90.i f47404b;

        h(qm0.d<? super h> dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(Boolean bool, v90.i iVar, qm0.d<? super e.b.d> dVar) {
            boolean booleanValue = bool.booleanValue();
            h hVar = new h(dVar);
            hVar.f47403a = booleanValue;
            hVar.f47404b = iVar;
            return hVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            boolean z5 = this.f47403a;
            v90.i iVar = this.f47404b;
            BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
            return bodyCompViewModel.f47344q.a(iVar, z5, bodyCompViewModel.f47358x);
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$mainGraphUiModel$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class i extends kotlin.coroutines.jvm.internal.i implements ym0.q<f90.a, Boolean, qm0.d<? super m90.c>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ f90.a f47406a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f47407b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f47409d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Context context, qm0.d<? super i> dVar) {
            super(3, dVar);
            this.f47409d = context;
        }

        @Override // ym0.q
        public final Object invoke(f90.a aVar, Boolean bool, qm0.d<? super m90.c> dVar) {
            boolean booleanValue = bool.booleanValue();
            i iVar = new i(this.f47409d, dVar);
            iVar.f47406a = aVar;
            iVar.f47407b = booleanValue;
            return iVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String i11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            f90.a aVar = this.f47406a;
            boolean z5 = this.f47407b;
            BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
            com.withings.weight.presentation.ui.b bVar = bodyCompViewModel.f47338n;
            if (z5) {
                i11 = "%";
            } else {
                i11 = bodyCompViewModel.f47358x.i(this.f47409d);
            }
            return bVar.a(aVar, z5, i11);
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class j implements ky.b {
        j() {
        }

        @Override // ky.b
        public final void b(long j5, ky.d measuresGroup) {
            kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
            BodyCompViewModel.this.L1();
        }

        @Override // ky.b
        public final void c(long j5, List<ky.d> list) {
            kotlin.jvm.internal.u.j(list, "list");
            BodyCompViewModel.this.L1();
        }

        @Override // ky.b
        public final void d(long j5, ky.d measuresGroup, boolean z5) {
            kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
            BodyCompViewModel.this.L1();
        }

        @Override // ky.b
        public final void g(long j5, ky.d measuresGroup) {
            kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
            BodyCompViewModel.this.L1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$refreshGraphData$1", f = "BodyCompViewModel.kt", l = {ConstantsWs.WS_STATUS_ERROR_LINK_USER_DEVICE}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        MutableSharedFlow f47411a;

        /* renamed from: b  reason: collision with root package name */
        int f47412b;

        k(qm0.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new k(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((k) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MutableSharedFlow mutableSharedFlow;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47412b;
            if (i11 != 0) {
                if (i11 == 1) {
                    mutableSharedFlow = this.f47411a;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
                MutableSharedFlow mutableSharedFlow2 = bodyCompViewModel.S;
                g90.a aVar = bodyCompViewModel.f47324b;
                com.withings.user.User user = bodyCompViewModel.f47352u;
                this.f47411a = mutableSharedFlow2;
                this.f47412b = 1;
                obj = aVar.b(user, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutableSharedFlow = mutableSharedFlow2;
            }
            mutableSharedFlow.tryEmit(obj);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$saveCurrentZoomGranularity$1", f = "BodyCompViewModel.kt", l = {ConstantsWs.WS_STATUS_UNAUTHORIZED_LOCALIZATION}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47414a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BodyCompViewModel.kt */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.jvm.internal.w implements ym0.l<j90.a, j90.a> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GraphPeriod f47416a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GraphPeriod graphPeriod) {
                super(1);
                this.f47416a = graphPeriod;
            }

            @Override // ym0.l
            public final j90.a invoke(j90.a aVar) {
                j90.a it = aVar;
                kotlin.jvm.internal.u.j(it, "it");
                return j90.a.a(it, false, this.f47416a.b(), 1);
            }
        }

        l(qm0.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new l(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((l) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47414a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
                GraphPeriod d11 = bodyCompViewModel.f47361z.d();
                j90.c cVar = bodyCompViewModel.f47336m;
                a aVar = new a(d11);
                this.f47414a = 1;
                if (cVar.d(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$segmentalUiSection$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class m extends kotlin.coroutines.jvm.internal.i implements ym0.q<e.b.d, ky.d, qm0.d<? super e.b.h>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ e.b.d f47417a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ ky.d f47418b;

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.weight.presentation.viewmodel.BodyCompViewModel$m] */
        @Override // ym0.q
        public final Object invoke(e.b.d dVar, ky.d dVar2, qm0.d<? super e.b.h> dVar3) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar3);
            iVar.f47417a = dVar;
            iVar.f47418b = dVar2;
            return iVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            e.b.d dVar = this.f47417a;
            ky.d dVar2 = this.f47418b;
            if (dVar2 != null) {
                return new e.b.h(dVar, new f90.b(dVar2.d(), dVar2.c()));
            }
            return null;
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$selectedGraph$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class n extends kotlin.coroutines.jvm.internal.i implements ym0.q<Boolean, List<? extends String>, qm0.d<? super List<? extends String>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ boolean f47419a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ List f47420b;

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.weight.presentation.viewmodel.BodyCompViewModel$n] */
        @Override // ym0.q
        public final Object invoke(Boolean bool, List<? extends String> list, qm0.d<? super List<? extends String>> dVar) {
            boolean booleanValue = bool.booleanValue();
            ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
            iVar.f47419a = booleanValue;
            iVar.f47420b = list;
            return iVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            boolean z5 = this.f47419a;
            List list = this.f47420b;
            if (!z5) {
                if (list != null && (str = (String) kotlin.collections.x.K(list)) != null) {
                    return kotlin.collections.x.V(str);
                }
                return null;
            }
            return list;
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$special$$inlined$flatMapLatest$1", f = "BodyCompViewModel.kt", l = {193}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super e.b.d>, Interval, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47421a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ FlowCollector f47422b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f47423c;

        public o(qm0.d dVar) {
            super(3, dVar);
        }

        @Override // ym0.q
        public final Object invoke(FlowCollector<? super e.b.d> flowCollector, Interval interval, qm0.d<? super nm0.y> dVar) {
            o oVar = new o(dVar);
            oVar.f47422b = flowCollector;
            oVar.f47423c = interval;
            return oVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47421a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                FlowCollector flowCollector = this.f47422b;
                Interval interval = (Interval) this.f47423c;
                BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
                SharedFlow sharedFlow = bodyCompViewModel.B;
                v90.c cVar = bodyCompViewModel.f47346r;
                long q11 = bodyCompViewModel.f47352u.q();
                DateTime start = interval.getStart();
                kotlin.jvm.internal.u.i(start, "getStart(...)");
                DateTime end = interval.getEnd();
                kotlin.jvm.internal.u.i(end, "getEnd(...)");
                Flow combine = FlowKt.combine(sharedFlow, cVar.b(q11, start, end), new h(null));
                this.f47421a = 1;
                if (FlowKt.emitAll(flowCollector, combine, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class p implements Flow<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f47425a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f47426a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$special$$inlined$map$1$2", f = "BodyCompViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.weight.presentation.viewmodel.BodyCompViewModel$p$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0646a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f47427a;

                /* renamed from: b  reason: collision with root package name */
                int f47428b;

                public C0646a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f47427a = obj;
                    this.f47428b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f47426a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.weight.presentation.viewmodel.BodyCompViewModel.p.a.C0646a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.weight.presentation.viewmodel.BodyCompViewModel$p$a$a r0 = (com.withings.weight.presentation.viewmodel.BodyCompViewModel.p.a.C0646a) r0
                    int r1 = r0.f47428b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f47428b = r1
                    goto L18
                L13:
                    com.withings.weight.presentation.viewmodel.BodyCompViewModel$p$a$a r0 = new com.withings.weight.presentation.viewmodel.BodyCompViewModel$p$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f47427a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f47428b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L47
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    om.a r5 = (om.a) r5
                    boolean r5 = r5.f()
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r0.f47428b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f47426a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.viewmodel.BodyCompViewModel.p.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public p(Flow flow) {
            this.f47425a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Boolean> flowCollector, qm0.d dVar) {
            Object collect = this.f47425a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class q implements Flow<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f47430a;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f47431a;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$special$$inlined$map$2$2", f = "BodyCompViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.weight.presentation.viewmodel.BodyCompViewModel$q$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0647a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f47432a;

                /* renamed from: b  reason: collision with root package name */
                int f47433b;

                public C0647a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f47432a = obj;
                    this.f47433b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f47431a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.weight.presentation.viewmodel.BodyCompViewModel.q.a.C0647a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.weight.presentation.viewmodel.BodyCompViewModel$q$a$a r0 = (com.withings.weight.presentation.viewmodel.BodyCompViewModel.q.a.C0647a) r0
                    int r1 = r0.f47433b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f47433b = r1
                    goto L18
                L13:
                    com.withings.weight.presentation.viewmodel.BodyCompViewModel$q$a$a r0 = new com.withings.weight.presentation.viewmodel.BodyCompViewModel$q$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f47432a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f47433b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L47
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    j90.a r5 = (j90.a) r5
                    boolean r5 = r5.c()
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r0.f47433b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f47431a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.weight.presentation.viewmodel.BodyCompViewModel.q.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public q(j90.d dVar) {
            this.f47430a = dVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super Boolean> flowCollector, qm0.d dVar) {
            Object collect = this.f47430a.collect(new a(flowCollector), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$statusHeaderState$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class r extends kotlin.coroutines.jvm.internal.i implements ym0.s<List<? extends String>, f90.a, Interval, Boolean, qm0.d<? super m4>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f47435a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ f90.a f47436b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Interval f47437c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f47438d;

        r(qm0.d<? super r> dVar) {
            super(5, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a.C1915a c1915a;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            List list = this.f47435a;
            f90.a aVar = this.f47436b;
            Interval interval = this.f47437c;
            boolean z5 = this.f47438d;
            BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
            if (z5) {
                n90.d dVar = bodyCompViewModel.f47326d;
                List<ky.d> c11 = aVar.c();
                List<ky.d> h11 = aVar.h();
                DateTime start = interval.getStart();
                kotlin.jvm.internal.u.i(start, "getStart(...)");
                DateTime end = interval.getEnd();
                kotlin.jvm.internal.u.i(end, "getEnd(...)");
                c1915a = dVar.d(start, end, c11, h11);
            } else {
                n90.d dVar2 = bodyCompViewModel.f47326d;
                List<ky.d> fatMeasuresGroups = aVar.c();
                List<ky.d> muscleMeasuresGroups = aVar.h();
                DateTime start2 = interval.getStart();
                kotlin.jvm.internal.u.i(start2, "getStart(...)");
                DateTime end2 = interval.getEnd();
                kotlin.jvm.internal.u.i(end2, "getEnd(...)");
                dVar2.getClass();
                kotlin.jvm.internal.u.j(fatMeasuresGroups, "fatMeasuresGroups");
                kotlin.jvm.internal.u.j(muscleMeasuresGroups, "muscleMeasuresGroups");
                c1915a = new a.C1915a(dVar2.a(fatMeasuresGroups, 8, start2, end2), dVar2.a(muscleMeasuresGroups, 76, start2, end2));
            }
            float a11 = c1915a.a();
            float b10 = c1915a.b();
            Float f11 = null;
            if (list != null) {
                str = (String) kotlin.collections.x.K(list);
            } else {
                str = null;
            }
            if (kotlin.jvm.internal.u.e(str, BodyCompositionTypes.f47107e.b().b())) {
                f11 = new Float(a11);
            } else if (kotlin.jvm.internal.u.e(str, BodyCompositionTypes.f47108f.b().b())) {
                f11 = new Float(b10);
            }
            List list2 = list;
            if (list2 != null && !list2.isEmpty() && f11 != null) {
                return bodyCompViewModel.f47330h.b(f11.floatValue(), z5);
            }
            if (!z5) {
                n90.d dVar3 = bodyCompViewModel.f47326d;
                List<ky.d> c12 = aVar.c();
                List<ky.d> h12 = aVar.h();
                DateTime start3 = interval.getStart();
                kotlin.jvm.internal.u.i(start3, "getStart(...)");
                DateTime end3 = interval.getEnd();
                kotlin.jvm.internal.u.i(end3, "getEnd(...)");
                a.C1915a d11 = dVar3.d(start3, end3, c12, h12);
                return bodyCompViewModel.f47330h.a(d11.a(), d11.b());
            }
            return bodyCompViewModel.f47330h.a(a11, b10);
        }

        @Override // ym0.s
        public final Object k(List<? extends String> list, f90.a aVar, Interval interval, Boolean bool, qm0.d<? super m4> dVar) {
            boolean booleanValue = bool.booleanValue();
            r rVar = new r(dVar);
            rVar.f47435a = list;
            rVar.f47436b = aVar;
            rVar.f47437c = interval;
            rVar.f47438d = booleanValue;
            return rVar.invokeSuspend(nm0.y.f85009a);
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$toggleNormalityZones$1", f = "BodyCompViewModel.kt", l = {ConstantsWs.WS_STATUS_P4_ERROR_FILE_NOT_READABLE}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class s extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47440a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BodyCompViewModel.kt */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.jvm.internal.w implements ym0.l<j90.a, j90.a> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f47442a = new kotlin.jvm.internal.w(1);

            @Override // ym0.l
            public final j90.a invoke(j90.a aVar) {
                j90.a it = aVar;
                kotlin.jvm.internal.u.j(it, "it");
                return j90.a.a(it, !it.c(), 0, 2);
            }
        }

        s(qm0.d<? super s> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new s(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((s) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47440a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                j90.c cVar = BodyCompViewModel.this.f47336m;
                this.f47440a = 1;
                if (cVar.d(a.f47442a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$updateBodyCompPercent$1", f = "BodyCompViewModel.kt", l = {ConstantsWs.WS_STATUS_BAD_STATE}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class t extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47443a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f47444b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f47446d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(boolean z5, qm0.d<? super t> dVar) {
            super(2, dVar);
            this.f47446d = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            t tVar = new t(this.f47446d, dVar);
            tVar.f47444b = obj;
            return tVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((t) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47443a;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f47444b;
                    BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
                    bodyCompViewModel.f47352u.W(this.f47446d);
                    q70.j jVar = bodyCompViewModel.f47350t;
                    com.withings.user.core.models.User d11 = o70.a.d(bodyCompViewModel.f47352u);
                    this.f47443a = 1;
                    if (jVar.c(d11, "body_comp_update_percent_setting", this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                nm0.y yVar = nm0.y.f85009a;
            } catch (Throwable th2) {
                nm0.l.a(th2);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$visceralFatCardUiModel$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class u extends kotlin.coroutines.jvm.internal.i implements ym0.r<m90.h<m90.d>, Interval, Boolean, qm0.d<? super f90.d>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ m90.h f47447a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Interval f47448b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ boolean f47449c;

        u(qm0.d<? super u> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(m90.h<m90.d> hVar, Interval interval, Boolean bool, qm0.d<? super f90.d> dVar) {
            boolean booleanValue = bool.booleanValue();
            u uVar = new u(dVar);
            uVar.f47447a = hVar;
            uVar.f47448b = interval;
            uVar.f47449c = booleanValue;
            return uVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            m90.h hVar = this.f47447a;
            Interval interval = this.f47448b;
            boolean z5 = this.f47449c;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : hVar.a()) {
                if (interval.contains(((m90.d) obj2).a())) {
                    arrayList.add(obj2);
                }
            }
            Duration duration = new Duration(interval.getStart(), interval.getEnd());
            BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
            return new f90.d(BodyCompViewModel.e1(bodyCompViewModel, hVar, interval), z5, bodyCompViewModel.f47328f.a(BodyCompViewModel.d1(bodyCompViewModel, arrayList, duration)));
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$visceralFatNormalityZoneUiModel$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class v extends kotlin.coroutines.jvm.internal.i implements ym0.r<m90.h<m90.d>, Boolean, Interval, qm0.d<? super NormalityZoneUiModel>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ m90.h f47451a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f47452b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Interval f47453c;

        v(qm0.d<? super v> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(m90.h<m90.d> hVar, Boolean bool, Interval interval, qm0.d<? super NormalityZoneUiModel> dVar) {
            boolean booleanValue = bool.booleanValue();
            v vVar = new v(dVar);
            vVar.f47451a = hVar;
            vVar.f47452b = booleanValue;
            vVar.f47453c = interval;
            return vVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            DateTime now;
            DateTime now2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            m90.h hVar = this.f47451a;
            boolean z5 = this.f47452b;
            Interval interval = this.f47453c;
            if (z5) {
                BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
                n90.j jVar = bodyCompViewModel.f47333k;
                bj0.d dVar = bodyCompViewModel.f47342p;
                m90.d dVar2 = (m90.d) kotlin.collections.x.K(hVar.a());
                if (dVar2 == null || (now = dVar2.a()) == null) {
                    now = DateTime.now();
                }
                kotlin.jvm.internal.u.g(now);
                m90.d dVar3 = (m90.d) kotlin.collections.x.U(hVar.a());
                if (dVar3 == null || (now2 = dVar3.a()) == null) {
                    now2 = DateTime.now();
                }
                kotlin.jvm.internal.u.g(now2);
                dVar.getClass();
                Interval h11 = bj0.d.h(now, now2);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : hVar.a()) {
                    if (interval.contains(((m90.d) obj2).a())) {
                        arrayList.add(obj2);
                    }
                }
                return jVar.a(arrayList, h11);
            }
            return null;
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$visceralFatUiModel$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class w extends kotlin.coroutines.jvm.internal.i implements ym0.q<f90.a, Interval, qm0.d<? super m90.h<m90.d>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ f90.a f47455a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Interval f47456b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.weight.presentation.viewmodel.BodyCompViewModel$w, kotlin.coroutines.jvm.internal.i] */
        @Override // ym0.q
        public final Object invoke(f90.a aVar, Interval interval, qm0.d<? super m90.h<m90.d>> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
            iVar.f47455a = aVar;
            iVar.f47456b = interval;
            return iVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            f90.a aVar = this.f47455a;
            Interval interval = this.f47456b;
            ArrayList arrayList = new ArrayList();
            for (ky.d measuresGroup : aVar.j()) {
                kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
                ky.a e11 = ly.a.e(ConstantsWs.MEASURE_TYPE_VISCERAL_FAT_RATING, measuresGroup);
                m90.d dVar = null;
                if (e11 != null) {
                    double f11 = e11.f();
                    Double valueOf = Double.valueOf(f11);
                    sm0.a<VisceralFatState> aVar2 = d.a.C1295a.f81809a;
                    if (!(aVar2 instanceof Collection) || !((kotlin.collections.a) aVar2).isEmpty()) {
                        Iterator it = ((kotlin.collections.c) aVar2).iterator();
                        while (it.hasNext()) {
                            if (((VisceralFatState) it.next()).a().c(Double.valueOf(f11))) {
                                break;
                            }
                        }
                    }
                    valueOf = null;
                    if (valueOf != null) {
                        float doubleValue = (float) valueOf.doubleValue();
                        dVar = new m90.d(measuresGroup.c(), doubleValue, doubleValue, measuresGroup);
                    }
                }
                if (dVar != null) {
                    arrayList.add(dVar);
                }
            }
            return new m90.h(interval, arrayList, SecondaryGraphUnit.f47265d);
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$waterMassCardUiModel$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class x extends kotlin.coroutines.jvm.internal.i implements ym0.r<m90.h<m90.d>, Interval, Boolean, qm0.d<? super f90.d>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ m90.h f47457a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Interval f47458b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ boolean f47459c;

        x(qm0.d<? super x> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(m90.h<m90.d> hVar, Interval interval, Boolean bool, qm0.d<? super f90.d> dVar) {
            boolean booleanValue = bool.booleanValue();
            x xVar = new x(dVar);
            xVar.f47457a = hVar;
            xVar.f47458b = interval;
            xVar.f47459c = booleanValue;
            return xVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            m90.h hVar = this.f47457a;
            Interval interval = this.f47458b;
            boolean z11 = this.f47459c;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : hVar.a()) {
                if (interval.contains(((m90.d) obj2).a())) {
                    arrayList.add(obj2);
                }
            }
            Duration duration = new Duration(interval.getStart(), interval.getEnd());
            BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
            ArrayList d12 = BodyCompViewModel.d1(bodyCompViewModel, arrayList, duration);
            boolean e12 = BodyCompViewModel.e1(bodyCompViewModel, hVar, interval);
            n90.k kVar = bodyCompViewModel.f47327e;
            boolean Z0 = BodyCompViewModel.Z0(bodyCompViewModel, bodyCompViewModel.f47352u);
            boolean z12 = bodyCompViewModel.f47356w;
            DateTime f11 = bodyCompViewModel.f47352u.f();
            kotlin.jvm.internal.u.i(f11, "getBirthDate(...)");
            if (hVar.c() == SecondaryGraphUnit.f47267f) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new f90.d(e12, z11, kVar.a(Z0, z12, f11, d12, z5));
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$waterMassNormalityZoneUiModel$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class y extends kotlin.coroutines.jvm.internal.i implements ym0.r<m90.h<m90.d>, Boolean, Interval, qm0.d<? super NormalityZoneUiModel>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ m90.h f47461a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f47462b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Interval f47463c;

        y(qm0.d<? super y> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(m90.h<m90.d> hVar, Boolean bool, Interval interval, qm0.d<? super NormalityZoneUiModel> dVar) {
            boolean booleanValue = bool.booleanValue();
            y yVar = new y(dVar);
            yVar.f47461a = hVar;
            yVar.f47462b = booleanValue;
            yVar.f47463c = interval;
            return yVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            m90.h hVar = this.f47461a;
            boolean z5 = this.f47462b;
            Interval interval = this.f47463c;
            if (z5) {
                boolean z11 = true;
                if (!hVar.a().isEmpty()) {
                    BodyCompViewModel bodyCompViewModel = BodyCompViewModel.this;
                    n90.l lVar = bodyCompViewModel.f47331i;
                    boolean Z0 = BodyCompViewModel.Z0(bodyCompViewModel, bodyCompViewModel.f47352u);
                    boolean z12 = bodyCompViewModel.f47356w;
                    DateTime f11 = bodyCompViewModel.f47352u.f();
                    kotlin.jvm.internal.u.i(f11, "getBirthDate(...)");
                    if (hVar.c() != SecondaryGraphUnit.f47267f) {
                        z11 = false;
                    }
                    boolean z13 = z11;
                    bj0.d dVar = bodyCompViewModel.f47342p;
                    DateTime a11 = ((m90.d) kotlin.collections.x.I(hVar.a())).a();
                    DateTime a12 = ((m90.d) kotlin.collections.x.T(hVar.a())).a();
                    dVar.getClass();
                    Interval h11 = bj0.d.h(a11, a12);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : hVar.a()) {
                        if (interval.contains(((m90.d) obj2).a())) {
                            arrayList.add(obj2);
                        }
                    }
                    return lVar.a(Z0, z12, f11, z13, h11, arrayList);
                }
            }
            return null;
        }
    }

    /* compiled from: BodyCompViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.viewmodel.BodyCompViewModel$waterMassUiModel$1", f = "BodyCompViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class z extends kotlin.coroutines.jvm.internal.i implements ym0.r<f90.a, Boolean, Interval, qm0.d<? super m90.h<m90.d>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ f90.a f47465a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f47466b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Interval f47467c;

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.weight.presentation.viewmodel.BodyCompViewModel$z] */
        @Override // ym0.r
        public final Object invoke(f90.a aVar, Boolean bool, Interval interval, qm0.d<? super m90.h<m90.d>> dVar) {
            boolean booleanValue = bool.booleanValue();
            ?? iVar = new kotlin.coroutines.jvm.internal.i(4, dVar);
            iVar.f47465a = aVar;
            iVar.f47466b = booleanValue;
            iVar.f47467c = interval;
            return iVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SecondaryGraphUnit secondaryGraphUnit;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            f90.a aVar = this.f47465a;
            boolean z5 = this.f47466b;
            Interval interval = this.f47467c;
            ArrayList arrayList = new ArrayList();
            for (ky.d dVar : aVar.k()) {
                m90.d f11 = d.a.f(dVar);
                if (f11 != null) {
                    arrayList.add(f11);
                }
            }
            if (z5) {
                secondaryGraphUnit = SecondaryGraphUnit.f47267f;
            } else {
                secondaryGraphUnit = SecondaryGraphUnit.f47268g;
            }
            return new m90.h(interval, arrayList, secondaryGraphUnit);
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.coroutines.jvm.internal.i, ym0.r] */
    /* JADX WARN: Type inference failed for: r1v17, types: [kotlin.coroutines.jvm.internal.i, ym0.r] */
    /* JADX WARN: Type inference failed for: r1v22, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r3v28, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public BodyCompViewModel(Context context, u0 savedStateHandle, ml.b bVar, v90.g gVar, fy.i iVar, xw.b dispatchers, g90.a aVar, LearnMoreManager learnMoreManager, n90.d dVar, n90.k kVar, n90.i iVar2, n90.e eVar, n90.h hVar, n90.l lVar, n90.f fVar, n90.j jVar, cy.a aVar2, m70.i userManager, j90.c bodyCompOptionsRepository, v80.g gVar2, com.withings.weight.presentation.ui.b bVar2, n90.r rVar, bj0.d dVar2, n90.s sVar, v90.c cVar, ks.t tVar, q70.j jVar2, kn.e deviceManager, vr.d featureTagsRepository, jm.a aVar3, l70.w unitPreferencesRepository) {
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.u.j(dispatchers, "dispatchers");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(bodyCompOptionsRepository, "bodyCompOptionsRepository");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(featureTagsRepository, "featureTagsRepository");
        kotlin.jvm.internal.u.j(unitPreferencesRepository, "unitPreferencesRepository");
        this.f47323a = dispatchers;
        this.f47324b = aVar;
        this.f47325c = learnMoreManager;
        this.f47326d = dVar;
        this.f47327e = kVar;
        this.f47328f = iVar2;
        this.f47329g = eVar;
        this.f47330h = hVar;
        this.f47331i = lVar;
        this.f47332j = fVar;
        this.f47333k = jVar;
        this.f47334l = aVar2;
        this.f47336m = bodyCompOptionsRepository;
        this.f47338n = bVar2;
        this.f47340o = rVar;
        this.f47342p = dVar2;
        this.f47344q = sVar;
        this.f47346r = cVar;
        this.f47348s = tVar;
        this.f47350t = jVar2;
        com.withings.user.User user = (com.withings.user.User) savedStateHandle.c(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        if (user == null) {
            user = userManager.e();
            kotlin.jvm.internal.u.i(user, "getMainUser(...)");
        }
        this.f47352u = user;
        this.f47354v = (Integer) savedStateHandle.c("measure_type");
        this.f47356w = user.j() == 4;
        DateTime defaultDate = (DateTime) savedStateHandle.c("date");
        defaultDate = defaultDate == null ? DateTime.now() : defaultDate;
        this.f47358x = aVar3.g(1);
        MutableSharedFlow<List<GraphPeriod>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f47360y = MutableSharedFlow$default;
        GraphPeriod graphPeriod = GraphPeriod.f39504d;
        kotlin.jvm.internal.u.i(defaultDate, "defaultDate");
        this.f47361z = new at.a(graphPeriod, defaultDate);
        Flow flow = FlowKt.flow(new d(deviceManager, featureTagsRepository, null));
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<Device> shareIn = FlowKt.shareIn(flow, a11, companion.getEagerly(), 1);
        this.A = shareIn;
        SharedFlow<Boolean> shareIn2 = FlowKt.shareIn(new p(FlowKt.flowOn(new om.b(context, unitPreferencesRepository, userManager).a(user.q()), dispatchers.a())), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.B = shareIn2;
        MutableSharedFlow<Interval> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.F = MutableSharedFlow$default2;
        SharedFlow<Interval> asSharedFlow = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        this.G = asSharedFlow;
        SharedFlow<Boolean> shareIn3 = FlowKt.shareIn(new q(bodyCompOptionsRepository.c()), h1.a(this), companion.getEagerly(), 1);
        this.M = shareIn3;
        this.P = FlowKt.shareIn(FlowKt.combine(shareIn3, shareIn2, MutableSharedFlow$default, asSharedFlow, shareIn, new b(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        MutableSharedFlow<Interval> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.Q = MutableSharedFlow$default3;
        this.R = FlowKt.shareIn(FlowKt.flowOn(FlowKt.flow(new a0(null)), dispatchers.a()), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        MutableSharedFlow<f90.a> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.S = MutableSharedFlow$default4;
        MutableStateFlow<List<String>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.T = MutableStateFlow;
        this.W = FlowKt.distinctUntilChanged(FlowKt.combine(shareIn3, MutableStateFlow, new kotlin.coroutines.jvm.internal.i(3, null)));
        this.X = FlowKt.shareIn(FlowKt.combine(MutableSharedFlow$default4, shareIn2, new i(context, null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.Y = FlowKt.shareIn(FlowKt.combine(MutableSharedFlow$default4, MutableSharedFlow$default3, MutableStateFlow, shareIn2, new c(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.Z = FlowKt.shareIn(FlowKt.combine(MutableStateFlow, MutableSharedFlow$default4, MutableSharedFlow$default3, shareIn2, new r(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.f47335l0 = new xw.n<>();
        j jVar3 = new j();
        this.f47337m0 = jVar3;
        aVar2.a(jVar3);
        L1();
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new a(savedStateHandle, this, gVar, iVar, bVar, null), 3, null);
        SharedFlow<m90.h<m90.d>> shareIn4 = FlowKt.shareIn(FlowKt.combine(MutableSharedFlow$default4, shareIn2, asSharedFlow, new kotlin.coroutines.jvm.internal.i(4, null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.f47339n0 = shareIn4;
        this.f47341o0 = FlowKt.shareIn(FlowKt.combine(shareIn4, shareIn3, MutableSharedFlow$default3, new y(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.f47343p0 = FlowKt.shareIn(FlowKt.combine(shareIn4, MutableSharedFlow$default3, shareIn3, new x(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        SharedFlow<m90.h<m90.d>> shareIn5 = FlowKt.shareIn(FlowKt.combine(MutableSharedFlow$default4, shareIn2, asSharedFlow, new kotlin.coroutines.jvm.internal.i(4, null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.f47345q0 = shareIn5;
        this.f47347r0 = FlowKt.shareIn(FlowKt.combine(shareIn5, shareIn3, MutableSharedFlow$default3, new f(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.f47349s0 = FlowKt.shareIn(FlowKt.combine(shareIn5, MutableSharedFlow$default3, shareIn3, new e(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        SharedFlow<m90.h<m90.d>> shareIn6 = FlowKt.shareIn(FlowKt.combine(MutableSharedFlow$default4, asSharedFlow, new kotlin.coroutines.jvm.internal.i(3, null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.f47351t0 = shareIn6;
        this.f47353u0 = FlowKt.shareIn(FlowKt.combine(shareIn6, shareIn3, MutableSharedFlow$default3, new v(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.f47355v0 = FlowKt.shareIn(FlowKt.combine(shareIn6, MutableSharedFlow$default3, shareIn3, new u(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        SharedFlow<e.b.d> shareIn7 = FlowKt.shareIn(FlowKt.transformLatest(MutableSharedFlow$default3, new o(null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.f47357w0 = shareIn7;
        this.f47359x0 = FlowKt.shareIn(FlowKt.combine(shareIn7, gVar2.a(user.q()), new kotlin.coroutines.jvm.internal.i(3, null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
    }

    public static final boolean Z0(BodyCompViewModel bodyCompViewModel, com.withings.user.User user) {
        bodyCompViewModel.getClass();
        if (user.p() == 1) {
            return true;
        }
        return false;
    }

    public static final ArrayList d1(BodyCompViewModel bodyCompViewModel, ArrayList arrayList, Duration duration) {
        bodyCompViewModel.getClass();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m90.d dVar = (m90.d) it.next();
            arrayList2.add(new nm0.j(dVar.a(), dVar));
        }
        ArrayList a11 = bodyCompViewModel.f47348s.a(arrayList2, duration);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.x.y(a11, 10));
        Iterator it2 = a11.iterator();
        while (it2.hasNext()) {
            nm0.j jVar = (nm0.j) it2.next();
            DateTime dateTime = (DateTime) jVar.a();
            List list = (List) jVar.b();
            List<m90.d> list2 = list;
            ArrayList arrayList4 = new ArrayList(kotlin.collections.x.y(list2, 10));
            for (m90.d dVar2 : list2) {
                arrayList4.add(Float.valueOf(dVar2.getValue()));
            }
            float v11 = (float) kotlin.collections.x.v(arrayList4);
            ArrayList arrayList5 = new ArrayList(kotlin.collections.x.y(list2, 10));
            for (m90.d dVar3 : list2) {
                arrayList5.add(Float.valueOf(dVar3.b()));
            }
            arrayList3.add(new m90.d(dateTime, v11, (float) kotlin.collections.x.v(arrayList5), ((m90.d) kotlin.collections.x.I(list)).c()));
        }
        return arrayList3;
    }

    public static final boolean e1(BodyCompViewModel bodyCompViewModel, m90.h hVar, Interval interval) {
        bodyCompViewModel.getClass();
        List<m90.d> a11 = hVar.a();
        if ((a11 instanceof Collection) && a11.isEmpty()) {
            return false;
        }
        for (m90.d dVar : a11) {
            if (interval.contains(dVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final SharedFlow<NormalityZoneUiModel> A1() {
        return this.f47341o0;
    }

    public final SharedFlow<m90.h<m90.d>> C1() {
        return this.f47339n0;
    }

    public final SharedFlow<List<LearnMoreEntryTranslations>> F1() {
        return this.R;
    }

    public final void G1(ws.c option, boolean z5) {
        List<String> list;
        kotlin.jvm.internal.u.j(option, "option");
        if (!(option instanceof c.b)) {
            return;
        }
        if (z5) {
            list = ((c.b) option).e();
        } else {
            list = null;
        }
        this.T.setValue(list);
    }

    public final void K1(ws.f viewport) {
        kotlin.jvm.internal.u.j(viewport, "viewport");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new com.withings.weight.presentation.viewmodel.a(this, viewport, null), 3, null);
    }

    public final void L1() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new k(null), 3, null);
    }

    public final void P1() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f47323a.a(), null, new l(null), 2, null);
    }

    public final void Q1() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new s(null), 2, null);
    }

    public final void R1(boolean z5) {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f47323a.a(), null, new t(z5, null), 2, null);
    }

    public final SharedFlow<e.b.C1297e> g1() {
        return this.P;
    }

    public final SharedFlow<Interval> i1() {
        return this.G;
    }

    public final SharedFlow<List<ws.c>> k1() {
        return this.Y;
    }

    public final SharedFlow<f90.d> l1() {
        return this.f47349s0;
    }

    public final SharedFlow<NormalityZoneUiModel> m1() {
        return this.f47347r0;
    }

    public final SharedFlow<m90.h<m90.d>> n1() {
        return this.f47345q0;
    }

    public final SharedFlow<m90.c> o1() {
        return this.X;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f47334l.b(this.f47337m0);
        super.onCleared();
    }

    public final SharedFlow<e.b.h> q1() {
        return this.f47359x0;
    }

    public final Flow<List<String>> r1() {
        return this.W;
    }

    public final xw.n<nm0.j<Period, DateTime>> s1() {
        return this.f47335l0;
    }

    public final SharedFlow<m4> t1() {
        return this.Z;
    }

    public final SharedFlow<f90.d> v1() {
        return this.f47355v0;
    }

    public final SharedFlow<NormalityZoneUiModel> w1() {
        return this.f47353u0;
    }

    public final SharedFlow<m90.h<m90.d>> y1() {
        return this.f47351t0;
    }

    public final SharedFlow<f90.d> z1() {
        return this.f47343p0;
    }
}
