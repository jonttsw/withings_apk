package com.withings.cycletracking.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.g6;
import androidx.compose.material.h6;
import androidx.compose.material3.o7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.huawei.hms.analytics.instance.CallBack;
import com.withings.common.compose.component.x4;
import com.withings.common.compose.component.z4;
import com.withings.cycletracking.ui.e2;
import com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel;
import com.withings.cycletracking.ui.viewmodel.PredictionEvent;
import com.withings.graph.GraphPeriod;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.ui.LearnMoreScreensKt;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import dn.b;
import i6.a;
import java.time.MonthDay;
import java.time.YearMonth;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import qk.g9;
import x1.b;
import x1.d;
/* compiled from: CycleTrackingDatavizScreen.kt */
/* loaded from: classes3.dex */
public final class x0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.CycleTrackingDatavizScreenKt$CycleTrackingDatavizScreen$1", f = "CycleTrackingDatavizScreen.kt", l = {ConstantsWs.MEASURE_TYPE_HR_ECG}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CycleTrackingViewModel f35986b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<Throwable, nm0.y> f35987c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CycleTrackingDatavizScreen.kt */
        /* renamed from: com.withings.cycletracking.ui.x0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0476a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ym0.l<Throwable, nm0.y> f35988a;

            /* JADX WARN: Multi-variable type inference failed */
            C0476a(ym0.l<? super Throwable, nm0.y> lVar) {
                this.f35988a = lVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    this.f35988a.invoke(th2);
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(CycleTrackingViewModel cycleTrackingViewModel, ym0.l<? super Throwable, nm0.y> lVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f35986b = cycleTrackingViewModel;
            this.f35987c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f35986b, this.f35987c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35985a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                StateFlow<Throwable> z02 = this.f35986b.z0();
                C0476a c0476a = new C0476a(this.f35987c);
                this.f35985a = 1;
                if (z02.collect(c0476a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at.a f35989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e2.c f35990b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e2.c cVar, at.a aVar) {
            super(2);
            this.f35989a = aVar;
            this.f35990b = cVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                at.a aVar3 = this.f35989a;
                if (aVar3.d() == GraphPeriod.f39502b) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                l0.g.e(z5, null, androidx.compose.animation.p.h(null, 0.0f, 3).c(androidx.compose.animation.p.q(m0.k.d(1000, 0, null, 6), null, 2)), androidx.compose.animation.p.i(null, 3).c(androidx.compose.animation.p.s()), null, s1.b.b(aVar2, 517340922, new z0(this.f35990b, aVar3)), aVar2, 200064, 18);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at.a f35991a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<LocalDate, nm0.y> f35992b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35993c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<LocalDate, nm0.y> f35994d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e2.c f35995e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.p<MonthDay, YearMonth, Boolean> f35996f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k1.o1<Interval> f35997g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(at.a aVar, ym0.l<? super LocalDate, nm0.y> lVar, ym0.a<nm0.y> aVar2, ym0.l<? super LocalDate, nm0.y> lVar2, e2.c cVar, ym0.p<? super MonthDay, ? super YearMonth, Boolean> pVar, k1.o1<Interval> o1Var) {
            super(2);
            this.f35991a = aVar;
            this.f35992b = lVar;
            this.f35993c = aVar2;
            this.f35994d = lVar2;
            this.f35995e = cVar;
            this.f35996f = pVar;
            this.f35997g = o1Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            boolean z11;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                at.a aVar3 = this.f35991a;
                c1 c1Var = new c1(aVar3);
                if (aVar3.d() == GraphPeriod.f39502b) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                l0.g.e(z5, null, androidx.compose.animation.p.h(m0.k.d(1000, 0, null, 6), 0.0f, 2), null, null, s1.b.b(aVar2, 962878233, new a1(this.f35992b, this.f35993c, this.f35994d, this.f35995e, c1Var, this.f35991a)), aVar2, 196992, 26);
                if (aVar3.d() == GraphPeriod.f39504d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                l0.g.e(z11, null, androidx.compose.animation.p.h(m0.k.d(1000, 0, null, 6), 0.0f, 2), androidx.compose.animation.p.i(null, 3), null, s1.b.b(aVar2, -1096952240, new b1(this.f35991a, this.f35995e, c1Var, this.f35996f, this.f35997g)), aVar2, 200064, 18);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e2.c f35998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f35999b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<GraphPeriod, DateTime, nm0.y> f36000c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<LocalDate, nm0.y> f36001d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<MonthDay, YearMonth, Boolean> f36002e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.l<LocalDate, nm0.y> f36003f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36004g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ z4 f36005h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> f36006i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> f36007j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f36008k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f36009l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(e2.c cVar, ym0.a<nm0.y> aVar, ym0.p<? super GraphPeriod, ? super DateTime, nm0.y> pVar, ym0.l<? super LocalDate, nm0.y> lVar, ym0.p<? super MonthDay, ? super YearMonth, Boolean> pVar2, ym0.l<? super LocalDate, nm0.y> lVar2, ym0.a<nm0.y> aVar2, z4 z4Var, ym0.q<? super r0.a0, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar, ym0.q<? super r0.h, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar2, int i11, int i12) {
            super(2);
            this.f35998a = cVar;
            this.f35999b = aVar;
            this.f36000c = pVar;
            this.f36001d = lVar;
            this.f36002e = pVar2;
            this.f36003f = lVar2;
            this.f36004g = aVar2;
            this.f36005h = z4Var;
            this.f36006i = qVar;
            this.f36007j = qVar2;
            this.f36008k = i11;
            this.f36009l = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36008k | 1);
            ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> qVar = this.f36006i;
            ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> qVar2 = this.f36007j;
            x0.a(this.f35998a, this.f35999b, this.f36000c, this.f36001d, this.f36002e, this.f36003f, this.f36004g, this.f36005h, qVar, qVar2, aVar, g11, this.f36009l);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.CycleTrackingDatavizScreenKt$CycleTrackingDatavizScreen$2", f = "CycleTrackingDatavizScreen.kt", l = {ConstantsWs.MEASURE_TYPE_VASISTAS_WALKING_DOUBLE_SUPPORT}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CycleTrackingViewModel f36011b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f36012c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z4 f36013d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f36014e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CycleTrackingDatavizScreen.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoroutineScope f36015a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ z4 f36016b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Context f36017c;

            a(Context context, z4 z4Var, CoroutineScope coroutineScope) {
                this.f36015a = coroutineScope;
                this.f36016b = z4Var;
                this.f36017c = context;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                nm0.y yVar = (nm0.y) obj;
                BuildersKt__Builders_commonKt.launch$default(this.f36015a, null, null, new d1(this.f36016b, this.f36017c, null), 3, null);
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CycleTrackingViewModel cycleTrackingViewModel, CoroutineScope coroutineScope, z4 z4Var, Context context, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f36011b = cycleTrackingViewModel;
            this.f36012c = coroutineScope;
            this.f36013d = z4Var;
            this.f36014e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f36011b, this.f36012c, this.f36013d, this.f36014e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f36010a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                SharedFlow<nm0.y> B0 = this.f36011b.B0();
                a aVar = new a(this.f36014e, this.f36013d, this.f36012c);
                this.f36010a = 1;
                if (B0.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.CycleTrackingDatavizScreenKt$CycleTrackingDatavizScreen$3", f = "CycleTrackingDatavizScreen.kt", l = {ConstantsWs.MEASURE_TYPE_SNORING_INTENSITY}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36018a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CycleTrackingViewModel f36019b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f36020c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z4 f36021d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f36022e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CycleTrackingDatavizScreen.kt */
        /* loaded from: classes3.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoroutineScope f36023a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ z4 f36024b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Context f36025c;

            a(Context context, z4 z4Var, CoroutineScope coroutineScope) {
                this.f36023a = coroutineScope;
                this.f36024b = z4Var;
                this.f36025c = context;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                BuildersKt__Builders_commonKt.launch$default(this.f36023a, null, null, new e1(this.f36024b, (PredictionEvent) obj, this.f36025c, null), 3, null);
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CycleTrackingViewModel cycleTrackingViewModel, CoroutineScope coroutineScope, z4 z4Var, Context context, qm0.d<? super f> dVar) {
            super(2, dVar);
            this.f36019b = cycleTrackingViewModel;
            this.f36020c = coroutineScope;
            this.f36021d = z4Var;
            this.f36022e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new f(this.f36019b, this.f36020c, this.f36021d, this.f36022e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f36018a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                SharedFlow<PredictionEvent> A0 = this.f36019b.A0();
                a aVar = new a(this.f36022e, this.f36021d, this.f36020c);
                this.f36018a = 1;
                if (A0.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class g extends kotlin.jvm.internal.s implements ym0.l<Boolean, nm0.y> {
        g(CycleTrackingViewModel cycleTrackingViewModel) {
            super(1, cycleTrackingViewModel, CycleTrackingViewModel.class, "onSwitchPinOnTop", "onSwitchPinOnTop$ui_release(Z)V", 0);
        }

        @Override // ym0.l
        public final nm0.y invoke(Boolean bool) {
            ((CycleTrackingViewModel) this.receiver).O0(bool.booleanValue());
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class h extends kotlin.jvm.internal.s implements ym0.l<LocalDate, nm0.y> {
        h(CycleTrackingViewModel cycleTrackingViewModel) {
            super(1, cycleTrackingViewModel, CycleTrackingViewModel.class, "addPeriodLogsFromStart", "addPeriodLogsFromStart(Lorg/joda/time/LocalDate;)V", 0);
        }

        @Override // ym0.l
        public final nm0.y invoke(LocalDate localDate) {
            LocalDate p02 = localDate;
            kotlin.jvm.internal.u.j(p02, "p0");
            ((CycleTrackingViewModel) this.receiver).y0(p02);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class i extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
        i(CycleTrackingViewModel cycleTrackingViewModel) {
            super(0, cycleTrackingViewModel, CycleTrackingViewModel.class, "onPressDetected", "onPressDetected()V", 0);
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            ((CycleTrackingViewModel) this.receiver).M0();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class j extends kotlin.jvm.internal.s implements ym0.p<GraphPeriod, DateTime, nm0.y> {
        j(CycleTrackingViewModel cycleTrackingViewModel) {
            super(2, cycleTrackingViewModel, CycleTrackingViewModel.class, "onAfterViewportChanged", "onAfterViewportChanged$ui_release(Lcom/withings/graph/GraphPeriod;Lorg/joda/time/DateTime;)V", 0);
        }

        @Override // ym0.p
        public final nm0.y invoke(GraphPeriod graphPeriod, DateTime dateTime) {
            GraphPeriod p02 = graphPeriod;
            DateTime p12 = dateTime;
            kotlin.jvm.internal.u.j(p02, "p0");
            kotlin.jvm.internal.u.j(p12, "p1");
            ((CycleTrackingViewModel) this.receiver).K0(p02, p12);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CycleTrackingViewModel f36026a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Throwable, nm0.y> f36027b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36028c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36029d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36030e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36031f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36032g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.l<qm0.d<? super nm0.y>, Object> f36033h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36034i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ym0.l<LocalDate, nm0.y> f36035j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36036k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36037l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ym0.l<Long, nm0.y> f36038m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36039n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ ym0.p<MonthDay, YearMonth, Boolean> f36040o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f36041p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f36042q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f36043r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(CycleTrackingViewModel cycleTrackingViewModel, ym0.l<? super Throwable, nm0.y> lVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, ym0.a<nm0.y> aVar5, ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> lVar2, ym0.a<nm0.y> aVar6, ym0.l<? super LocalDate, nm0.y> lVar3, ym0.a<nm0.y> aVar7, ym0.a<nm0.y> aVar8, ym0.l<? super Long, nm0.y> lVar4, ym0.a<nm0.y> aVar9, ym0.p<? super MonthDay, ? super YearMonth, Boolean> pVar, int i11, int i12, int i13) {
            super(2);
            this.f36026a = cycleTrackingViewModel;
            this.f36027b = lVar;
            this.f36028c = aVar;
            this.f36029d = aVar2;
            this.f36030e = aVar3;
            this.f36031f = aVar4;
            this.f36032g = aVar5;
            this.f36033h = lVar2;
            this.f36034i = aVar6;
            this.f36035j = lVar3;
            this.f36036k = aVar7;
            this.f36037l = aVar8;
            this.f36038m = lVar4;
            this.f36039n = aVar9;
            this.f36040o = pVar;
            this.f36041p = i11;
            this.f36042q = i12;
            this.f36043r = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36041p | 1);
            int g12 = ah.o.g(this.f36042q);
            ym0.a<nm0.y> aVar2 = this.f36039n;
            ym0.p<MonthDay, YearMonth, Boolean> pVar = this.f36040o;
            x0.b(this.f36026a, this.f36027b, this.f36028c, this.f36029d, this.f36030e, this.f36031f, this.f36032g, this.f36033h, this.f36034i, this.f36035j, this.f36036k, this.f36037l, this.f36038m, aVar2, pVar, aVar, g11, g12, this.f36043r);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.l<ws.f, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<GraphPeriod, DateTime, nm0.y> f36044a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(ym0.p<? super GraphPeriod, ? super DateTime, nm0.y> pVar) {
            super(1);
            this.f36044a = pVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(ws.f fVar) {
            ws.f timeGraphViewport = fVar;
            kotlin.jvm.internal.u.j(timeGraphViewport, "timeGraphViewport");
            this.f36044a.invoke(timeGraphViewport.b(), timeGraphViewport.a());
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.a<Interval> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e2.c f36045a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(e2.c cVar) {
            super(0);
            this.f36045a = cVar;
        }

        @Override // ym0.a
        public final Interval invoke() {
            e2.c cVar = this.f36045a;
            Iterator<T> it = cVar.a().iterator();
            if (it.hasNext()) {
                LocalDate a11 = ((b.InterfaceC0847b) it.next()).a();
                while (it.hasNext()) {
                    LocalDate a12 = ((b.InterfaceC0847b) it.next()).a();
                    if (a11.compareTo(a12) > 0) {
                        a11 = a12;
                    }
                }
                DateTime dateTimeAtStartOfDay = a11.toDateTimeAtStartOfDay();
                Iterator<T> it2 = cVar.a().iterator();
                if (it2.hasNext()) {
                    LocalDate a13 = ((b.InterfaceC0847b) it2.next()).a();
                    while (it2.hasNext()) {
                        LocalDate a14 = ((b.InterfaceC0847b) it2.next()).a();
                        if (a13.compareTo(a14) < 0) {
                            a13 = a14;
                        }
                    }
                    return new Interval(dateTimeAtStartOfDay, m0.t.B(a13));
                }
                throw new NoSuchElementException();
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36046a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(ym0.a<nm0.y> aVar) {
            super(3);
            this.f36046a = aVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            r0.a0 CycleTrackingDatavizScreen = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(CycleTrackingDatavizScreen, "$this$CycleTrackingDatavizScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                ks.g.d(this.f36046a, g9.f92941a, 0, aVar2, 0, 4);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public static final class o extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e2 f36047a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<qm0.d<? super nm0.y>, Object> f36048b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36049c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f36050d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36051e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36052f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36053g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36054h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36055i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ym0.l<Long, nm0.y> f36056j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36057k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(e2 e2Var, ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> lVar, ym0.a<nm0.y> aVar, ym0.l<? super Boolean, nm0.y> lVar2, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, ym0.a<nm0.y> aVar5, ym0.a<nm0.y> aVar6, ym0.l<? super Long, nm0.y> lVar3, ym0.a<nm0.y> aVar7) {
            super(3);
            this.f36047a = e2Var;
            this.f36048b = lVar;
            this.f36049c = aVar;
            this.f36050d = lVar2;
            this.f36051e = aVar2;
            this.f36052f = aVar3;
            this.f36053g = aVar4;
            this.f36054h = aVar5;
            this.f36055i = aVar6;
            this.f36056j = lVar3;
            this.f36057k = aVar7;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h CycleTrackingDatavizScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(CycleTrackingDatavizScreen, "$this$CycleTrackingDatavizScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                x0.g(this.f36047a, this.f36048b, this.f36049c, this.f36050d, this.f36051e, this.f36052f, this.f36053g, this.f36054h, this.f36055i, this.f36056j, this.f36057k, aVar2, 64, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public static final class p extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e2 f36058a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z4 f36059b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36060c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36061d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36062e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36063f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f36064g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.l<qm0.d<? super nm0.y>, Object> f36065h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36066i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ym0.l<LocalDate, nm0.y> f36067j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36068k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ ym0.l<LocalDate, nm0.y> f36069l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36070m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36071n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36072o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ ym0.l<Long, nm0.y> f36073p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36074q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ ym0.p<GraphPeriod, DateTime, nm0.y> f36075r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ ym0.p<MonthDay, YearMonth, Boolean> f36076s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f36077t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f36078u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f36079v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(e2 e2Var, z4 z4Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, ym0.l<? super Boolean, nm0.y> lVar, ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> lVar2, ym0.a<nm0.y> aVar5, ym0.l<? super LocalDate, nm0.y> lVar3, ym0.a<nm0.y> aVar6, ym0.l<? super LocalDate, nm0.y> lVar4, ym0.a<nm0.y> aVar7, ym0.a<nm0.y> aVar8, ym0.a<nm0.y> aVar9, ym0.l<? super Long, nm0.y> lVar5, ym0.a<nm0.y> aVar10, ym0.p<? super GraphPeriod, ? super DateTime, nm0.y> pVar, ym0.p<? super MonthDay, ? super YearMonth, Boolean> pVar2, int i11, int i12, int i13) {
            super(2);
            this.f36058a = e2Var;
            this.f36059b = z4Var;
            this.f36060c = aVar;
            this.f36061d = aVar2;
            this.f36062e = aVar3;
            this.f36063f = aVar4;
            this.f36064g = lVar;
            this.f36065h = lVar2;
            this.f36066i = aVar5;
            this.f36067j = lVar3;
            this.f36068k = aVar6;
            this.f36069l = lVar4;
            this.f36070m = aVar7;
            this.f36071n = aVar8;
            this.f36072o = aVar9;
            this.f36073p = lVar5;
            this.f36074q = aVar10;
            this.f36075r = pVar;
            this.f36076s = pVar2;
            this.f36077t = i11;
            this.f36078u = i12;
            this.f36079v = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36077t | 1);
            int g12 = ah.o.g(this.f36078u);
            ym0.p<GraphPeriod, DateTime, nm0.y> pVar = this.f36075r;
            ym0.p<MonthDay, YearMonth, Boolean> pVar2 = this.f36076s;
            x0.c(this.f36058a, this.f36059b, this.f36060c, this.f36061d, this.f36062e, this.f36063f, this.f36064g, this.f36065h, this.f36066i, this.f36067j, this.f36068k, this.f36069l, this.f36070m, this.f36071n, this.f36072o, this.f36073p, this.f36074q, pVar, pVar2, aVar, g11, g12, this.f36079v);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.CycleTrackingDatavizScreenKt$LoadingDotItem$1", f = "CycleTrackingDatavizScreen.kt", l = {ConstantsWs.WS_STATUS_OAUTHWRONGTOKEN, ConstantsWs.WS_STATUS_OAUTHWRONGSIGNATURE}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class q extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36080a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36081b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m0.b<Float, m0.m> f36082c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(int i11, m0.b<Float, m0.m> bVar, qm0.d<? super q> dVar) {
            super(2, dVar);
            this.f36081b = i11;
            this.f36082c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new q(this.f36081b, this.f36082c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((q) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f36080a;
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
                this.f36080a = 1;
                if (DelayKt.delay(this.f36081b, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Float f11 = new Float(0.2f);
            m0.k0 a11 = m0.k.a(m0.k.d(600, 0, null, 6), RepeatMode.f3711b, 4);
            this.f36080a = 2;
            if (m0.b.f(this.f36082c, f11, a11, null, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingDatavizScreen.kt */
    /* loaded from: classes3.dex */
    public static final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dn.b f36083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f36084b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36085c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f36086d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(dn.b bVar, androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f36083a = bVar;
            this.f36084b = eVar;
            this.f36085c = i11;
            this.f36086d = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36086d | 1);
            androidx.compose.ui.e eVar = this.f36084b;
            int i11 = this.f36085c;
            x0.d(this.f36083a, eVar, i11, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AutoboxingStateCreation"})
    public static final void a(e2.c cVar, ym0.a<nm0.y> aVar, ym0.p<? super GraphPeriod, ? super DateTime, nm0.y> pVar, ym0.l<? super LocalDate, nm0.y> lVar, ym0.p<? super MonthDay, ? super YearMonth, Boolean> pVar2, ym0.l<? super LocalDate, nm0.y> lVar2, ym0.a<nm0.y> aVar2, z4 z4Var, ym0.q<? super r0.a0, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar, ym0.q<? super r0.h, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar2, androidx.compose.runtime.a aVar3, int i11, int i12) {
        z4 z4Var2;
        int i13;
        boolean z5;
        androidx.compose.runtime.b g11 = aVar3.g(-236060030);
        if ((i12 & 128) != 0) {
            z4Var2 = x4.b(g11);
            i13 = (-29360129) & i11;
        } else {
            z4Var2 = z4Var;
            i13 = i11;
        }
        DateTime withTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        kotlin.jvm.internal.u.i(withTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
        at.a a11 = at.c.a((GraphPeriod) kotlin.collections.x.I(cVar.b()), withTimeAtStartOfDay, g11);
        List<b.InterfaceC0847b> a12 = cVar.a();
        g11.s(-443656512);
        boolean K = g11.K(a12);
        Object t11 = g11.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.e(new m(cVar));
            g11.n(t11);
        }
        k1.o1 o1Var = (k1.o1) t11;
        g11.J();
        e.a aVar4 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e p11 = ah.k.p(androidx.compose.foundation.layout.e1.d(aVar4));
        String u11 = ay.b.u(C1987R.string.Cycle_Tracking_feature_title, g11);
        List<GraphPeriod> b10 = cVar.b();
        Interval interval = (Interval) o1Var.getValue();
        ys.d dVar = new ys.d(new ys.f());
        g11.s(-443655962);
        if ((((i11 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) > 256 && g11.K(pVar)) || (i11 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256) {
            z5 = true;
        } else {
            z5 = false;
        }
        Object t12 = g11.t();
        if (z5 || t12 == a.C0060a.a()) {
            t12 = new l(pVar);
            g11.n(t12);
        }
        g11.J();
        s1.a b11 = s1.b.b(g11, 955919906, new b(cVar, a11));
        s1.a b12 = s1.b.b(g11, 1401457217, new c(a11, lVar2, aVar2, lVar, cVar, pVar2, o1Var));
        s1.a aVar5 = com.withings.cycletracking.ui.a.f35486a;
        int i14 = at.a.f19549d;
        int i15 = i13 >> 21;
        z4 z4Var3 = z4Var2;
        ks.g.b(u11, p11, a11, b10, interval, null, null, null, dVar, null, null, null, aVar, qVar, false, (ym0.l) t12, null, b11, b12, aVar5, null, null, qVar2, g11, 134254592, ((i13 << 3) & ConstantsWs.HWFAILURE_ZERO) | 918552576 | ((i13 >> 15) & 7168), i15 & ConstantsWs.HWFAILURE_ZERO, 3231456);
        androidx.compose.ui.e s11 = ah.k.s(androidx.compose.foundation.layout.e1.e(aVar4, 1.0f));
        g11.s(733328855);
        androidx.compose.ui.layout.l0 d11 = g6.d(false, g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a13 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(s11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a13);
            } else {
                g11.m();
            }
            ym0.p b13 = com.withings.authentication.e.b(g11, d11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b13);
            }
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            x4.a(z4Var3, androidx.compose.foundation.layout.x0.f(androidx.compose.foundation.layout.m.f4307a.g(aVar4, b.a.m()), yk.h.b()), g11, i15 & 14, 0);
            g11.J();
            g11.o();
            g11.J();
            g11.J();
            androidx.compose.runtime.v o02 = g11.o0();
            if (o02 != null) {
                o02.G(new d(cVar, aVar, pVar, lVar, pVar2, lVar2, aVar2, z4Var3, qVar, qVar2, i11, i12));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void b(CycleTrackingViewModel cycleTrackingViewModel, ym0.l<? super Throwable, nm0.y> onError, ym0.a<nm0.y> onBackClick, ym0.a<nm0.y> onAddPeriodFromIcon, ym0.a<nm0.y> onAddPeriodFromSecondaryCard, ym0.a<nm0.y> onAddPeriodFromHistory, ym0.a<nm0.y> onAnalysisHelpClicked, ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> onShareHealthReport, ym0.a<nm0.y> onUpdateInitialization, ym0.l<? super LocalDate, nm0.y> redirectToManualLog, ym0.a<nm0.y> onHistoryClicked, ym0.a<nm0.y> onAddSymptomClicked, ym0.l<? super Long, nm0.y> onEditFactorClicked, ym0.a<nm0.y> onFactorOptionClicked, ym0.p<? super MonthDay, ? super YearMonth, Boolean> shouldApplyHeaderStyleToDotItem, androidx.compose.runtime.a aVar, int i11, int i12, int i13) {
        CycleTrackingViewModel cycleTrackingViewModel2;
        int i14;
        i6.a aVar2;
        kotlin.jvm.internal.u.j(onError, "onError");
        kotlin.jvm.internal.u.j(onBackClick, "onBackClick");
        kotlin.jvm.internal.u.j(onAddPeriodFromIcon, "onAddPeriodFromIcon");
        kotlin.jvm.internal.u.j(onAddPeriodFromSecondaryCard, "onAddPeriodFromSecondaryCard");
        kotlin.jvm.internal.u.j(onAddPeriodFromHistory, "onAddPeriodFromHistory");
        kotlin.jvm.internal.u.j(onAnalysisHelpClicked, "onAnalysisHelpClicked");
        kotlin.jvm.internal.u.j(onShareHealthReport, "onShareHealthReport");
        kotlin.jvm.internal.u.j(onUpdateInitialization, "onUpdateInitialization");
        kotlin.jvm.internal.u.j(redirectToManualLog, "redirectToManualLog");
        kotlin.jvm.internal.u.j(onHistoryClicked, "onHistoryClicked");
        kotlin.jvm.internal.u.j(onAddSymptomClicked, "onAddSymptomClicked");
        kotlin.jvm.internal.u.j(onEditFactorClicked, "onEditFactorClicked");
        kotlin.jvm.internal.u.j(onFactorOptionClicked, "onFactorOptionClicked");
        kotlin.jvm.internal.u.j(shouldApplyHeaderStyleToDotItem, "shouldApplyHeaderStyleToDotItem");
        androidx.compose.runtime.b g11 = aVar.g(578180735);
        if ((i13 & 1) != 0) {
            g11.s(1890788296);
            androidx.lifecycle.n1 a11 = j6.a.a(g11);
            if (a11 != null) {
                fk0.c a12 = e6.a.a(a11, g11);
                g11.s(1729797275);
                if (a11 instanceof androidx.lifecycle.u) {
                    aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C1058a.f71431b;
                }
                androidx.lifecycle.g1 a13 = j6.b.a(CycleTrackingViewModel.class, a11, null, a12, aVar2, g11);
                g11.J();
                g11.J();
                cycleTrackingViewModel2 = (CycleTrackingViewModel) a13;
                i14 = i11 & (-15);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            cycleTrackingViewModel2 = cycleTrackingViewModel;
            i14 = i11;
        }
        k1.r0 a14 = h6.b.a(cycleTrackingViewModel2.F0(), e2.b.f35535a, g11, 56);
        Object c11 = androidx.compose.material.o.c(g11, 773894976, -492369756);
        if (c11 == a.C0060a.a()) {
            c11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a15 = ((androidx.compose.runtime.k) c11).a();
        g11.J();
        k1.y.f("collect-error", new a(cycleTrackingViewModel2, onError, null), g11);
        z4 b10 = x4.b(g11);
        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
        CycleTrackingViewModel cycleTrackingViewModel3 = cycleTrackingViewModel2;
        k1.y.f("pressEvent", new e(cycleTrackingViewModel3, a15, b10, context, null), g11);
        k1.y.f("predictionEvent", new f(cycleTrackingViewModel3, a15, b10, context, null), g11);
        e2 e2Var = (e2) a14.getValue();
        int i15 = i14;
        g gVar = new g(cycleTrackingViewModel2);
        h hVar = new h(cycleTrackingViewModel2);
        i iVar = new i(cycleTrackingViewModel2);
        j jVar = new j(cycleTrackingViewModel2);
        int i16 = (i15 & ConstantsWs.HWFAILURE_ZERO) | 16777216 | (i15 & 7168) | (i15 & 57344) | (i15 & 458752) | (i15 & 234881024);
        int i17 = ((i15 >> 24) & 112) | ((i15 >> 12) & ConstantsWs.HWFAILURE_ZERO);
        int i18 = i12 << 9;
        c(e2Var, b10, onBackClick, onAddPeriodFromIcon, onAddPeriodFromSecondaryCard, onAddPeriodFromHistory, gVar, onShareHealthReport, onUpdateInitialization, hVar, iVar, redirectToManualLog, onAnalysisHelpClicked, onHistoryClicked, onAddSymptomClicked, onEditFactorClicked, onFactorOptionClicked, jVar, shouldApplyHeaderStyleToDotItem, g11, i16, i17 | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (i18 & 3670016) | ((i12 << 12) & 234881024), 0);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new k(cycleTrackingViewModel2, onError, onBackClick, onAddPeriodFromIcon, onAddPeriodFromSecondaryCard, onAddPeriodFromHistory, onAnalysisHelpClicked, onShareHealthReport, onUpdateInitialization, redirectToManualLog, onHistoryClicked, onAddSymptomClicked, onEditFactorClicked, onFactorOptionClicked, shouldApplyHeaderStyleToDotItem, i11, i12, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(e2 e2Var, z4 z4Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, ym0.l<? super Boolean, nm0.y> lVar, ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> lVar2, ym0.a<nm0.y> aVar5, ym0.l<? super LocalDate, nm0.y> lVar3, ym0.a<nm0.y> aVar6, ym0.l<? super LocalDate, nm0.y> lVar4, ym0.a<nm0.y> aVar7, ym0.a<nm0.y> aVar8, ym0.a<nm0.y> aVar9, ym0.l<? super Long, nm0.y> lVar5, ym0.a<nm0.y> aVar10, ym0.p<? super GraphPeriod, ? super DateTime, nm0.y> pVar, ym0.p<? super MonthDay, ? super YearMonth, Boolean> pVar2, androidx.compose.runtime.a aVar11, int i11, int i12, int i13) {
        z4 z4Var2;
        int i14;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b g11 = aVar11.g(-433275884);
        if ((i13 & 2) != 0) {
            z4Var2 = x4.b(g11);
            i14 = i11 & CallBack.OAID_TRACKING_OFF;
        } else {
            z4Var2 = z4Var;
            i14 = i11;
        }
        if (e2Var instanceof e2.c) {
            g11.s(1419328375);
            bVar = g11;
            a((e2.c) e2Var, aVar, pVar, lVar4, pVar2, lVar3, aVar6, z4Var2, s1.b.b(g11, -113575757, new n(aVar2)), s1.b.b(g11, -596714390, new o(e2Var, lVar2, aVar5, lVar, aVar7, aVar3, aVar8, aVar9, aVar4, lVar5, aVar10)), bVar, ((i14 >> 3) & 112) | 905969672 | ((i12 >> 15) & ConstantsWs.HWFAILURE_ZERO) | ((i12 << 6) & 7168) | ((i12 >> 12) & 57344) | (458752 & (i14 >> 12)) | ((i12 << 18) & 3670016) | (29360128 & (i14 << 18)), 0);
            bVar.J();
        } else {
            bVar = g11;
            if (e2Var instanceof e2.b) {
                bVar.s(1419329915);
                androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a);
                e.b b10 = androidx.compose.foundation.layout.e.b();
                d.a g12 = b.a.g();
                bVar.s(-483455358);
                androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(b10, g12, bVar);
                bVar.s(-1323940314);
                int G = bVar.G();
                k1.v0 l5 = bVar.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(d11);
                if (bVar.i() instanceof k1.d) {
                    bVar.A();
                    if (bVar.e()) {
                        bVar.F(a12);
                    } else {
                        bVar.m();
                    }
                    ym0.p b11 = com.withings.authentication.e.b(bVar, a11, bVar, l5);
                    if (bVar.e() || !kotlin.jvm.internal.u.e(bVar.t(), Integer.valueOf(G))) {
                        androidx.camera.camera2.internal.l0.d(G, bVar, G, b11);
                    }
                    dq.x.b(0, c11, k1.j1.a(bVar), bVar, 2058660585);
                    o7.a(0.0f, 0, 0, 31, 0L, 0L, bVar, null);
                    androidx.camera.camera2.internal.l0.e(bVar);
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                bVar.s(1419330154);
                bVar.J();
            }
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new p(e2Var, z4Var2, aVar, aVar2, aVar3, aVar4, lVar, lVar2, aVar5, lVar3, aVar6, lVar4, aVar7, aVar8, aVar9, lVar5, aVar10, pVar, pVar2, i11, i12, i13));
        }
    }

    public static final void d(dn.b item, androidx.compose.ui.e modifier, int i11, androidx.compose.runtime.a aVar, int i12) {
        int i13;
        androidx.compose.ui.e b10;
        int i14;
        int i15;
        int i16;
        kotlin.jvm.internal.u.j(item, "item");
        kotlin.jvm.internal.u.j(modifier, "modifier");
        androidx.compose.runtime.b g11 = aVar.g(-1945905952);
        if ((i12 & 14) == 0) {
            if (g11.K(item)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i13 = i16 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (g11.K(modifier)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.c(i11)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i13 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            g11.s(979558935);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = m0.c.a(1.0f);
                g11.n(t11);
            }
            m0.b bVar = (m0.b) t11;
            g11.J();
            k1.y.f(item.a(), new q(i11, bVar, null), g11);
            long a11 = s2.b.a(item.getColor(), g11);
            b10 = androidx.compose.foundation.c.b(n0.i.c(bj0.d.c(androidx.collection.c.g(modifier, x0.h.e()), ((Number) bVar.l()).floatValue()), yk.h.a(), a11, x0.h.e()), a11, d2.h1.a());
            androidx.compose.foundation.layout.k.a(b10, g11, 0);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new r(item, modifier, i11, i12));
        }
    }

    public static final void g(e2 e2Var, ym0.l lVar, ym0.a aVar, ym0.l lVar2, ym0.a aVar2, ym0.a aVar3, ym0.a aVar4, ym0.a aVar5, ym0.a aVar6, ym0.l lVar3, ym0.a aVar7, androidx.compose.runtime.a aVar8, int i11, int i12) {
        e2.c cVar;
        e2.c.C0470c c0470c;
        boolean z5;
        en.m mVar;
        en.l lVar4;
        List<LearnMoreEntryTranslations> list;
        boolean z11;
        Integer num;
        e2.c.b d11;
        e2.c.b d12;
        e2.c.a c11;
        e2.c.b d13;
        androidx.compose.runtime.b g11 = aVar8.g(214204968);
        g11.s(773894976);
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) t11).a();
        g11.J();
        if (e2Var instanceof e2.c) {
            cVar = (e2.c) e2Var;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            c0470c = cVar.d();
        } else {
            c0470c = null;
        }
        e.a aVar9 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar9, 1.0f);
        int i13 = androidx.compose.foundation.layout.e.f4229i;
        androidx.compose.ui.layout.l0 a12 = com.withings.authentication.e.a(com.withings.authentication.d.b(g11, -483455358), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a13 = g.a.a();
        s1.a c12 = androidx.compose.ui.layout.y.c(e11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a13);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a12, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            dq.x.b(0, c12, k1.j1.a(g11), g11, 2058660585);
            if (c0470c != null && (d13 = c0470c.d()) != null) {
                z5 = d13.c();
            } else {
                z5 = false;
            }
            if (c0470c != null) {
                mVar = c0470c.e();
            } else {
                mVar = null;
            }
            int i14 = i11 >> 9;
            bn.c0.a(z5, mVar, aVar3, lVar3, g11, (i14 & ConstantsWs.HWFAILURE_ZERO) | ((i11 >> 18) & 7168));
            androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(aVar9, 0.0f, yk.h.a(), 0.0f, 0.0f, 13);
            boolean z12 = e2Var instanceof e2.b;
            if (c0470c != null) {
                lVar4 = c0470c.b();
            } else {
                lVar4 = null;
            }
            int i15 = i11 >> 6;
            bn.s.a(z12, lVar4, aVar2, aVar4, aVar6, aVar5, j5, g11, (i15 & ConstantsWs.HWFAILURE_ZERO) | 64 | (i14 & 7168) | ((i11 >> 12) & 57344) | (i15 & 458752), 0);
            String u11 = ay.b.u(C1987R.string.detailView_education_title, g11);
            if (c0470c != null && (c11 = c0470c.c()) != null) {
                list = c11.a();
            } else {
                list = null;
            }
            if (list == null) {
                list = kotlin.collections.i0.f76187a;
            }
            LearnMoreScreensKt.SectionLearnMore(u11, list, g11, 64);
            if (c0470c != null && (d12 = c0470c.d()) != null) {
                z11 = d12.b();
            } else {
                z11 = true;
            }
            boolean z13 = z11;
            if (c0470c != null && (d11 = c0470c.d()) != null) {
                num = d11.a();
            } else {
                num = null;
            }
            bn.t.a(num, z13, lVar2, new g1(e2Var, a11, lVar), aVar, aVar7, g11, ((i11 >> 3) & ConstantsWs.HWFAILURE_ZERO) | ((i11 << 6) & 57344) | ((i12 << 15) & 458752));
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new h1(e2Var, lVar, aVar, lVar2, aVar2, aVar3, aVar4, aVar5, aVar6, lVar3, aVar7, i11, i12));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }
}
