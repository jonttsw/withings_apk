package com.withings.wiscale2.device.common.handcalibration;

import android.view.View;
import android.view.animation.Animation;
import com.withings.views.view.WheelView;
import nm0.y;
/* compiled from: HandCalibrationFragment.kt */
/* loaded from: classes5.dex */
public final class c implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f52692a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f52693b = false;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f52694c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(WheelView wheelView, ym0.a aVar) {
        this.f52692a = wheelView;
        this.f52694c = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i11;
        if (this.f52693b) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        this.f52692a.setVisibility(i11);
        this.f52694c.invoke();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
