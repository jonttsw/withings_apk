package com.withings.nervehealth.ui.usecases;

import com.withings.nervehealth.core.model.MeasureCategory;
import com.withings.periodsbar.Period;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetAllNerveHealthMeasureListSections.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.usecases.GetAllNerveHealthMeasureListSections", f = "GetAllNerveHealthMeasureListSections.kt", l = {25}, m = "getMeasureListSections")
/* loaded from: classes4.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    f f42780a;

    /* renamed from: b  reason: collision with root package name */
    MeasureCategory f42781b;

    /* renamed from: c  reason: collision with root package name */
    Period f42782c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f42783d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ f f42784e;

    /* renamed from: f  reason: collision with root package name */
    int f42785f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, qm0.d<? super c> dVar) {
        super(dVar);
        this.f42784e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f42783d = obj;
        this.f42785f |= Integer.MIN_VALUE;
        return this.f42784e.a(0L, null, null, this);
    }
}
