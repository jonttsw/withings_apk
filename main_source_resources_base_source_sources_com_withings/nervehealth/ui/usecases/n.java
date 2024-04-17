package com.withings.nervehealth.ui.usecases;

import com.withings.nervehealth.core.model.MeasureCategory;
import com.withings.periodsbar.Period;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetNeuropathyDiagnosticMeasureListSections.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.usecases.GetNeuropathyDiagnosticMeasureListSections", f = "GetNeuropathyDiagnosticMeasureListSections.kt", l = {25}, m = "getMeasureListSections")
/* loaded from: classes4.dex */
public final class n extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    q f42803a;

    /* renamed from: b  reason: collision with root package name */
    MeasureCategory f42804b;

    /* renamed from: c  reason: collision with root package name */
    Period f42805c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f42806d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q f42807e;

    /* renamed from: f  reason: collision with root package name */
    int f42808f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, qm0.d<? super n> dVar) {
        super(dVar);
        this.f42807e = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f42806d = obj;
        this.f42808f |= Integer.MIN_VALUE;
        return this.f42807e.a(0L, null, null, this);
    }
}
