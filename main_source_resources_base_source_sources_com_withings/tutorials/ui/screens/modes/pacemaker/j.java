package com.withings.tutorials.ui.screens.modes.pacemaker;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: PacemakerModeActivity.kt */
/* loaded from: classes4.dex */
final class j extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PacemakerModeActivity f45768a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PacemakerModeActivity pacemakerModeActivity) {
        super(0);
        this.f45768a = pacemakerModeActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f45768a.onBackPressed();
        return y.f85009a;
    }
}
