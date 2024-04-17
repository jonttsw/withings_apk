package com.withings.measure.detail.ui.screen;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class o implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureDetailActivity f41772a;

    public o(MeasureDetailActivity measureDetailActivity) {
        this.f41772a = measureDetailActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        MeasureDetailActivity measureDetailActivity = this.f41772a;
        long userId = measureDetailActivity.getUserId();
        cy.a aVar = measureDetailActivity.f41735e;
        if (aVar != null) {
            return new q(userId, aVar, measureDetailActivity.M3(), MeasureDetailActivity.B3(measureDetailActivity), MeasureDetailActivity.A3(measureDetailActivity), new n(measureDetailActivity));
        }
        kotlin.jvm.internal.u.s("measureListenerRegisterUseCase");
        throw null;
    }
}
