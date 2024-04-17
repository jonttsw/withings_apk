package com.withings.wiscale2.device.wpm.wpm04.tutorial.ui;

import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.Wpm04TutorialActivity;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wpm04TutorialActivity.kt */
/* loaded from: classes5.dex */
final class d extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm04TutorialActivity f55860a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Wpm04TutorialActivity wpm04TutorialActivity) {
        super(0);
        this.f55860a = wpm04TutorialActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        Wpm04TutorialActivity.a aVar = Wpm04TutorialActivity.f55848d;
        Wpm04TutorialActivity wpm04TutorialActivity = this.f55860a;
        wpm04TutorialActivity.getClass();
        qc.b bVar = new qc.b(wpm04TutorialActivity);
        bVar.C(C1987R.string.wpm04Installation_leaveTutorialTitle);
        bVar.g(C1987R.string.wpm04Installation_leaveTutorialDescription);
        bVar.z(C1987R.string._YES_, new cq.b(wpm04TutorialActivity, 4)).w(C1987R.string._CANCEL_, new cq.c(2)).s();
        return y.f85009a;
    }
}
