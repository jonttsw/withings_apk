package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PregnancyModeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel", f = "PregnancyModeViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX}, m = "joinPregnancyProgram")
/* loaded from: classes4.dex */
public final class q1 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    PregnancyModeViewModel f46115a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f46116b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PregnancyModeViewModel f46117c;

    /* renamed from: d  reason: collision with root package name */
    int f46118d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(PregnancyModeViewModel pregnancyModeViewModel, qm0.d<? super q1> dVar) {
        super(dVar);
        this.f46117c = pregnancyModeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f46116b = obj;
        this.f46118d |= Integer.MIN_VALUE;
        return PregnancyModeViewModel.F0(this.f46117c, this);
    }
}
