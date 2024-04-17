package com.withings.design.view;

import android.view.View;
import android.view.animation.Animation;
import java.util.Map;
/* compiled from: SetValueView.java */
/* loaded from: classes3.dex */
final class h implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetValueView f36465a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(SetValueView setValueView) {
        this.f36465a = setValueView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Map map;
        map = this.f36465a.f36380e;
        for (View view : map.keySet()) {
            view.setVisibility(8);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
