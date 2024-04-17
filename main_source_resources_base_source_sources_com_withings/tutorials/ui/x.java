package com.withings.tutorials.ui;
/* compiled from: TutorialActivity.kt */
/* loaded from: classes4.dex */
final class x extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TutorialActivity f46316a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(TutorialActivity tutorialActivity) {
        super(0);
        this.f46316a = tutorialActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f46316a.onBackPressed();
        return nm0.y.f85009a;
    }
}
