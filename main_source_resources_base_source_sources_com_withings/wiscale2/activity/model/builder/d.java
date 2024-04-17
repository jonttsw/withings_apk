package com.withings.wiscale2.activity.model.builder;

import com.withings.library.authentication.api.ConstantsWs;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecomputeAggregate.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.model.builder.RecomputeAggregate", f = "RecomputeAggregate.kt", l = {ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT}, m = "recomputeAggregateBetweenDates")
/* loaded from: classes4.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    RecomputeAggregate f48520a;

    /* renamed from: b  reason: collision with root package name */
    DateTime f48521b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f48522c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ RecomputeAggregate f48523d;

    /* renamed from: e  reason: collision with root package name */
    int f48524e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RecomputeAggregate recomputeAggregate, qm0.d<? super d> dVar) {
        super(dVar);
        this.f48523d = recomputeAggregate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f48522c = obj;
        this.f48524e |= Integer.MIN_VALUE;
        return RecomputeAggregate.t(this.f48523d, this);
    }
}
