package com.withings.wiscale2.device.wpm.wpm05.ui;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wpm05PostInstallActivity.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm05PostInstallActivity f55945a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Wpm05PostInstallActivity wpm05PostInstallActivity) {
        super(0);
        this.f55945a = wpm05PostInstallActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f55945a.finish();
        return y.f85009a;
    }
}
