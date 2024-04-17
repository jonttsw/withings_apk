package com.withings.tutorials.ui.screens.modes.athlete;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: AthleteModeActivity.kt */
/* loaded from: classes4.dex */
final class i extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AthleteModeActivity f45599a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AthleteModeActivity athleteModeActivity) {
        super(0);
        this.f45599a = athleteModeActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f45599a.onBackPressed();
        return y.f85009a;
    }
}
