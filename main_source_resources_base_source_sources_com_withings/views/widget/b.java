package com.withings.views.widget;

import android.animation.ValueAnimator;
import com.withings.views.widget.InkPageIndicator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InkPageIndicator.java */
/* loaded from: classes4.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InkPageIndicator f46830a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(InkPageIndicator inkPageIndicator) {
        this.f46830a = inkPageIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        InkPageIndicator.c cVar;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        InkPageIndicator inkPageIndicator = this.f46830a;
        inkPageIndicator.f46791p = floatValue;
        cVar = inkPageIndicator.P;
        cVar.a(inkPageIndicator.f46791p);
        inkPageIndicator.postInvalidateOnAnimation();
    }
}
