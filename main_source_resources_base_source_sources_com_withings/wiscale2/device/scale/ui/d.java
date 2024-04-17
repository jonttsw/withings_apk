package com.withings.wiscale2.device.scale.ui;

import com.withings.target.WeightGoal;
import kotlin.coroutines.jvm.internal.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WeightGoalResultFragment.kt */
@e(c = "com.withings.wiscale2.device.scale.ui.WeightGoalResultFragment", f = "WeightGoalResultFragment.kt", l = {79}, m = "setViews")
/* loaded from: classes5.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    c f54710a;

    /* renamed from: b  reason: collision with root package name */
    WeightGoal f54711b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f54712c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c f54713d;

    /* renamed from: e  reason: collision with root package name */
    int f54714e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, qm0.d<? super d> dVar) {
        super(dVar);
        this.f54713d = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f54712c = obj;
        this.f54714e |= Integer.MIN_VALUE;
        return c.u1(this.f54713d, null, this);
    }
}
