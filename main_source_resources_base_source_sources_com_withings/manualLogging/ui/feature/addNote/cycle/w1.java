package com.withings.manualLogging.ui.feature.addNote.cycle;

import org.joda.time.LocalDate;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleManualLoggingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel", f = "CycleManualLoggingViewModel.kt", l = {215, 217}, m = "addPeriodOnly")
/* loaded from: classes4.dex */
public final class w1 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    CycleManualLoggingViewModel f41382a;

    /* renamed from: b  reason: collision with root package name */
    LocalDate f41383b;

    /* renamed from: c  reason: collision with root package name */
    long f41384c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f41385d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CycleManualLoggingViewModel f41386e;

    /* renamed from: f  reason: collision with root package name */
    int f41387f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(CycleManualLoggingViewModel cycleManualLoggingViewModel, qm0.d<? super w1> dVar) {
        super(dVar);
        this.f41386e = cycleManualLoggingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f41385d = obj;
        this.f41387f |= Integer.MIN_VALUE;
        return CycleManualLoggingViewModel.f0(this.f41386e, 0L, null, this);
    }
}
