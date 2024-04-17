package com.withings.wiscale2.device.wpm.wpm05.ui;

import com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.Wpm05TutorialActivity;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wpm05PostInstallActivity.kt */
/* loaded from: classes5.dex */
final class a extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm05PostInstallActivity f55944a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Wpm05PostInstallActivity wpm05PostInstallActivity) {
        super(0);
        this.f55944a = wpm05PostInstallActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        int i11 = Wpm05PostInstallActivity.f55942b;
        Wpm05PostInstallActivity wpm05PostInstallActivity = this.f55944a;
        wpm05PostInstallActivity.getClass();
        Wpm05TutorialActivity.f55925c.getClass();
        wpm05PostInstallActivity.startActivityForResult(Wpm05TutorialActivity.a.a(wpm05PostInstallActivity, true), 1111);
        return y.f85009a;
    }
}
