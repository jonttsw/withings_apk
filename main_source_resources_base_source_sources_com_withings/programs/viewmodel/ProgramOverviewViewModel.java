package com.withings.programs.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import fl.p;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import nm0.y;
import r30.a;
/* compiled from: ProgramOverviewViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/programs/viewmodel/ProgramOverviewViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ProgramOverviewViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final ni.a f43802a;

    /* renamed from: b  reason: collision with root package name */
    private final p f43803b;

    /* renamed from: c  reason: collision with root package name */
    private final long f43804c;

    /* renamed from: d  reason: collision with root package name */
    private final long f43805d;

    /* renamed from: e  reason: collision with root package name */
    private final StateFlow<r30.a> f43806e;

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Flow<r30.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f43807a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProgramOverviewViewModel f43808b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kn.e f43809c;

        /* compiled from: Emitters.kt */
        /* renamed from: com.withings.programs.viewmodel.ProgramOverviewViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0593a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f43810a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ProgramOverviewViewModel f43811b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ kn.e f43812c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.programs.viewmodel.ProgramOverviewViewModel$special$$inlined$map$1$2", f = "ProgramOverviewViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.programs.viewmodel.ProgramOverviewViewModel$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0594a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f43813a;

                /* renamed from: b  reason: collision with root package name */
                int f43814b;

                public C0594a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f43813a = obj;
                    this.f43814b |= Integer.MIN_VALUE;
                    return C0593a.this.emit(null, this);
                }
            }

            public C0593a(FlowCollector flowCollector, ProgramOverviewViewModel programOverviewViewModel, kn.e eVar) {
                this.f43810a = flowCollector;
                this.f43811b = programOverviewViewModel;
                this.f43812c = eVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r25, qm0.d r26) {
                /*
                    Method dump skipped, instructions count: 289
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.programs.viewmodel.ProgramOverviewViewModel.a.C0593a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public a(x30.i iVar, ProgramOverviewViewModel programOverviewViewModel, kn.e eVar) {
            this.f43807a = iVar;
            this.f43808b = programOverviewViewModel;
            this.f43809c = eVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super r30.a> flowCollector, qm0.d dVar) {
            Object collect = this.f43807a.collect(new C0593a(flowCollector, this.f43808b, this.f43809c), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return y.f85009a;
        }
    }

    @Inject
    public ProgramOverviewViewModel(kn.e deviceManager, x30.j getProgramByIdUseCase, u0 savedStateHandle, ni.a aVar, p pVar) {
        u.j(deviceManager, "deviceManager");
        u.j(getProgramByIdUseCase, "getProgramByIdUseCase");
        u.j(savedStateHandle, "savedStateHandle");
        this.f43802a = aVar;
        this.f43803b = pVar;
        Long l5 = (Long) savedStateHandle.c(NavigationArguments.PROGRAM_ID);
        if (l5 != null) {
            long longValue = l5.longValue();
            this.f43804c = longValue;
            Long l6 = (Long) savedStateHandle.c(NavigationArguments.USER_ID);
            if (l6 != null) {
                long longValue2 = l6.longValue();
                this.f43805d = longValue2;
                this.f43806e = FlowKt.stateIn(new a(getProgramByIdUseCase.a(longValue2, (int) longValue, true), this, deviceManager), h1.a(this), SharingStarted.Companion.getLazily(), a.c.f94516a);
                return;
            }
            throw new Exception("userId shouldn't be null");
        }
        throw new Exception("programId shouldn't be null");
    }

    public final long i0() {
        return this.f43804c;
    }

    public final StateFlow<r30.a> j0() {
        return this.f43806e;
    }

    public final long k0() {
        return this.f43805d;
    }
}
