package com.withings.device.details.wsd.programs.alarm;

import android.view.animation.Animation;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.u;
/* compiled from: WsdSetAlarmFragment.kt */
/* loaded from: classes3.dex */
public final class j implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WsdSetAlarmFragment f37166a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(WsdSetAlarmFragment wsdSetAlarmFragment) {
        this.f37166a = wsdSetAlarmFragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        tn.g gVar;
        RelativeLayout relativeLayout;
        u.j(animation, "animation");
        gVar = this.f37166a.f37147c;
        if (gVar != null) {
            relativeLayout = gVar.f100332k;
        } else {
            relativeLayout = null;
        }
        u.g(relativeLayout);
        relativeLayout.setVisibility(8);
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
