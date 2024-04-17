package com.withings.device.details.wsd.programs.alarm;

import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
/* compiled from: WsdSetAlarmFragment.kt */
/* loaded from: classes3.dex */
public final class g implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WsdSetAlarmFragment f37163a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(WsdSetAlarmFragment wsdSetAlarmFragment) {
        this.f37163a = wsdSetAlarmFragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        tn.g gVar;
        RelativeLayout relativeLayout;
        u.j(animation, "animation");
        gVar = this.f37163a.f37147c;
        if (gVar != null) {
            relativeLayout = gVar.f100333l;
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
        View view = this.f37163a.getView();
        u.g(view);
        view.findViewById(C1987R.id.okBar).setVisibility(8);
    }
}
