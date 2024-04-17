package com.withings.cycletracking.ui.viewmodel;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import org.joda.time.LocalDate;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalCalendarPeriodLogViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel", f = "VerticalCalendarPeriodLogViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_HR_STATE, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN}, m = "onDateClick")
/* loaded from: classes3.dex */
public final class y extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    VerticalCalendarPeriodLogViewModel f35968a;

    /* renamed from: b  reason: collision with root package name */
    List f35969b;

    /* renamed from: c  reason: collision with root package name */
    LocalDate f35970c;

    /* renamed from: d  reason: collision with root package name */
    List f35971d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f35972e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ VerticalCalendarPeriodLogViewModel f35973f;

    /* renamed from: g  reason: collision with root package name */
    int f35974g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(VerticalCalendarPeriodLogViewModel verticalCalendarPeriodLogViewModel, qm0.d<? super y> dVar) {
        super(dVar);
        this.f35973f = verticalCalendarPeriodLogViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f35972e = obj;
        this.f35974g |= Integer.MIN_VALUE;
        return VerticalCalendarPeriodLogViewModel.m0(this.f35973f, null, null, null, this);
    }
}
