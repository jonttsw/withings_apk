package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.library.authentication.api.ConstantsWs;
import gx.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleManualLoggingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel", f = "CycleManualLoggingViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2, ConstantsWs.MEASURE_TYPE_NITRITES, ConstantsWs.MEASURE_TYPE_VASCULAR_AGE, ConstantsWs.MEASURE_TYPE_BLOOD_GLUCOSE}, m = "checkExistingInitialisationAndSave")
/* loaded from: classes4.dex */
public final class x1 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    Object f41397a;

    /* renamed from: b  reason: collision with root package name */
    b.f f41398b;

    /* renamed from: c  reason: collision with root package name */
    long f41399c;

    /* renamed from: d  reason: collision with root package name */
    boolean f41400d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f41401e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ CycleManualLoggingViewModel f41402f;

    /* renamed from: g  reason: collision with root package name */
    int f41403g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(CycleManualLoggingViewModel cycleManualLoggingViewModel, qm0.d<? super x1> dVar) {
        super(dVar);
        this.f41402f = cycleManualLoggingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f41401e = obj;
        this.f41403g |= Integer.MIN_VALUE;
        return CycleManualLoggingViewModel.g0(this.f41402f, 0L, null, false, this);
    }
}
