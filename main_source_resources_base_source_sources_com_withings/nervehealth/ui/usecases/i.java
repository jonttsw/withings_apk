package com.withings.nervehealth.ui.usecases;

import com.withings.nervehealth.core.model.MeasureCategory;
import com.withings.periodsbar.Period;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetGuidedScanMeasureListSections.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.usecases.GetGuidedScanMeasureListSections", f = "GetGuidedScanMeasureListSections.kt", l = {28}, m = "getMeasureListSections")
/* loaded from: classes4.dex */
public final class i extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    l f42792a;

    /* renamed from: b  reason: collision with root package name */
    MeasureCategory f42793b;

    /* renamed from: c  reason: collision with root package name */
    Period f42794c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f42795d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l f42796e;

    /* renamed from: f  reason: collision with root package name */
    int f42797f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, qm0.d<? super i> dVar) {
        super(dVar);
        this.f42796e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f42795d = obj;
        this.f42797f |= Integer.MIN_VALUE;
        return this.f42796e.a(0L, null, null, this);
    }
}
