package com.withings.design.view;

import android.animation.ValueAnimator;
import com.withings.design.view.InkPageIndicator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InkPageIndicator.java */
/* loaded from: classes3.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InkPageIndicator f36461a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(InkPageIndicator inkPageIndicator) {
        this.f36461a = inkPageIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        InkPageIndicator.c cVar;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        InkPageIndicator inkPageIndicator = this.f36461a;
        inkPageIndicator.f36326p = floatValue;
        cVar = inkPageIndicator.P;
        cVar.a(inkPageIndicator.f36326p);
        inkPageIndicator.postInvalidateOnAnimation();
    }
}
