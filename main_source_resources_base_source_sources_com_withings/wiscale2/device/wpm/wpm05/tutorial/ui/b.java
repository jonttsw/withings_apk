package com.withings.wiscale2.device.wpm.wpm05.tutorial.ui;

import com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.Wpm05TutorialActivity;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wpm05TutorialActivity.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm05TutorialActivity f55932a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Wpm05TutorialActivity wpm05TutorialActivity) {
        super(0);
        this.f55932a = wpm05TutorialActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        Wpm05TutorialActivity.a aVar = Wpm05TutorialActivity.f55925c;
        Wpm05TutorialActivity wpm05TutorialActivity = this.f55932a;
        wpm05TutorialActivity.setResult(-1);
        wpm05TutorialActivity.finish();
        return y.f85009a;
    }
}
