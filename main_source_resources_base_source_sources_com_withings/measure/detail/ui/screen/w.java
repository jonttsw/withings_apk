package com.withings.measure.detail.ui.screen;

import androidx.lifecycle.g1;
/* compiled from: MeasureDetailViewModel.kt */
/* loaded from: classes4.dex */
public abstract class w extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f41801a;

    /* renamed from: b  reason: collision with root package name */
    private final cy.a f41802b;

    /* renamed from: c  reason: collision with root package name */
    private final MeasureDetailScreen<Double> f41803c;

    public w(long j5, cy.a aVar, MeasureDetailScreen<Double> measureDetailScreen) {
        kotlin.jvm.internal.u.j(measureDetailScreen, "measureDetailScreen");
        this.f41801a = j5;
        this.f41802b = aVar;
        this.f41803c = measureDetailScreen;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MeasureDetailScreen<Double> f0() {
        return this.f41803c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cy.a g0() {
        return this.f41802b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long i0() {
        return this.f41801a;
    }
}
