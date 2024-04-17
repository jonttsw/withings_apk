package com.withings.device.details.wsd.programs.alarm;

import android.view.animation.Animation;
import android.widget.LinearLayout;
import kotlin.jvm.internal.u;
/* compiled from: WsdSetAlarmFragment.kt */
/* loaded from: classes3.dex */
public final class e implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LinearLayout f37161a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(LinearLayout linearLayout) {
        this.f37161a = linearLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        u.j(animation, "animation");
        this.f37161a.setVisibility(8);
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
