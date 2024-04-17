package com.withings.views.view;

import android.animation.ValueAnimator;
import com.withings.views.view.InkPageIndicator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InkPageIndicator.java */
/* loaded from: classes4.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InkPageIndicator f46760a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(InkPageIndicator inkPageIndicator) {
        this.f46760a = inkPageIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        InkPageIndicator.c cVar;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        InkPageIndicator inkPageIndicator = this.f46760a;
        inkPageIndicator.f46652p = floatValue;
        cVar = inkPageIndicator.P;
        cVar.a(inkPageIndicator.f46652p);
        inkPageIndicator.postInvalidateOnAnimation();
    }
}
