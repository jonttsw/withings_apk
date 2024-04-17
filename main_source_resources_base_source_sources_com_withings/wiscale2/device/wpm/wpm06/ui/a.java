package com.withings.wiscale2.device.wpm.wpm06.ui;

import com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.Wpm05TutorialActivity;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wpm06PostInstallActivity.kt */
/* loaded from: classes5.dex */
final class a extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm06PostInstallActivity f55962a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Wpm06PostInstallActivity wpm06PostInstallActivity) {
        super(0);
        this.f55962a = wpm06PostInstallActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        int i11 = Wpm06PostInstallActivity.f55960b;
        Wpm06PostInstallActivity wpm06PostInstallActivity = this.f55962a;
        wpm06PostInstallActivity.getClass();
        Wpm05TutorialActivity.f55925c.getClass();
        wpm06PostInstallActivity.startActivityForResult(Wpm05TutorialActivity.a.a(wpm06PostInstallActivity, true), 1111);
        return y.f85009a;
    }
}
