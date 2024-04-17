package com.withings.tutorials.ui.screens.explanations;
/* compiled from: ExplanationsActivity.kt */
/* loaded from: classes4.dex */
final class p extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExplanationsActivity f45227a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ExplanationsActivity explanationsActivity) {
        super(0);
        this.f45227a = explanationsActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f45227a.onBackPressed();
        return nm0.y.f85009a;
    }
}
