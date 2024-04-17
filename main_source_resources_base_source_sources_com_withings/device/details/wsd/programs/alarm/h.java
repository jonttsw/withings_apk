package com.withings.device.details.wsd.programs.alarm;

import android.view.animation.Animation;
import android.widget.LinearLayout;
import kotlin.jvm.internal.u;
/* compiled from: WsdSetAlarmFragment.kt */
/* loaded from: classes3.dex */
public final class h implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WsdSetAlarmFragment f37164a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(WsdSetAlarmFragment wsdSetAlarmFragment) {
        this.f37164a = wsdSetAlarmFragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        tn.g gVar;
        LinearLayout linearLayout;
        u.j(animation, "animation");
        gVar = this.f37164a.f37147c;
        if (gVar != null) {
            linearLayout = gVar.f100330i;
        } else {
            linearLayout = null;
        }
        u.g(linearLayout);
        linearLayout.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        u.j(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        u.j(animation, "animation");
    }
}
