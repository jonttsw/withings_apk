package com.withings.wiscale2.device.common.handcalibration;

import android.animation.Animator;
import android.view.animation.AlphaAnimation;
import com.airbnb.lottie.LottieAnimationView;
import com.withings.views.view.WheelView;
import kotlin.jvm.internal.u;
/* compiled from: HandCalibrationFragment.kt */
/* loaded from: classes5.dex */
public final class d implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LottieAnimationView f52695a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f52696b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(LottieAnimationView lottieAnimationView, a aVar) {
        this.f52695a = lottieAnimationView;
        this.f52696b = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p02) {
        u.j(p02, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p02) {
        HandCalibration x12;
        WheelView wheelView;
        u.j(p02, "p0");
        this.f52695a.n();
        a aVar = this.f52696b;
        x12 = aVar.x1();
        if (x12.d()) {
            wheelView = aVar.f52686f;
            if (wheelView != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(500L);
                alphaAnimation.setAnimationListener(new c(wheelView, b.f52691a));
                wheelView.startAnimation(alphaAnimation);
                return;
            }
            u.s("wheel");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator p02) {
        u.j(p02, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator p02) {
        u.j(p02, "p0");
    }
}
