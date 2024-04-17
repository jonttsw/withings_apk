package com.withings.tutorials.ui.screens.modes.eyesclosed;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EyesClosedModeActivity.kt */
/* loaded from: classes4.dex */
final class i extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EyesClosedModeActivity f45684a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(EyesClosedModeActivity eyesClosedModeActivity) {
        super(0);
        this.f45684a = eyesClosedModeActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f45684a.onBackPressed();
        return y.f85009a;
    }
}
