package com.withings.wiscale2.device.wpm.wpm05.tutorial.ui;

import androidx.fragment.app.m0;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpm.wpm05.tutorial.Wpm05TutorialScreen;
import com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.Wpm05TutorialActivity;
import kotlin.jvm.internal.w;
import nm0.j;
import nm0.y;
import ym0.l;
/* compiled from: Wpm05TutorialActivity.kt */
/* loaded from: classes5.dex */
final class a extends w implements l<Wpm05TutorialScreen, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm05TutorialActivity f55931a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Wpm05TutorialActivity wpm05TutorialActivity) {
        super(1);
        this.f55931a = wpm05TutorialActivity;
    }

    @Override // ym0.l
    public final y invoke(Wpm05TutorialScreen wpm05TutorialScreen) {
        Wpm05TutorialScreen wpm05TutorialScreen2 = wpm05TutorialScreen;
        if (wpm05TutorialScreen2 != null) {
            Wpm05TutorialActivity.a aVar = Wpm05TutorialActivity.f55925c;
            Wpm05TutorialActivity wpm05TutorialActivity = this.f55931a;
            wpm05TutorialActivity.getClass();
            e.f55935e.getClass();
            e eVar = new e();
            eVar.setArguments(androidx.core.os.e.a(new j("arg_screen", wpm05TutorialScreen2)));
            e.t1(eVar, wpm05TutorialActivity);
            m0 m11 = wpm05TutorialActivity.getSupportFragmentManager().m();
            m11.l(C1987R.id.content, eVar, null);
            m11.e(null);
            m11.f();
        }
        return y.f85009a;
    }
}
