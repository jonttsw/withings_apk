package com.withings.programs.ui.activity;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: TutorialProxyActivity.kt */
/* loaded from: classes4.dex */
final class i extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TutorialProxyActivity f43767a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TutorialProxyActivity tutorialProxyActivity) {
        super(0);
        this.f43767a = tutorialProxyActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f43767a.finish();
        return y.f85009a;
    }
}
