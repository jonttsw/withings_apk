package com.withings.wiscale2.device.wpm.wpm06.ui;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wpm06PostInstallActivity.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm06PostInstallActivity f55963a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Wpm06PostInstallActivity wpm06PostInstallActivity) {
        super(0);
        this.f55963a = wpm06PostInstallActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f55963a.finish();
        return y.f85009a;
    }
}
