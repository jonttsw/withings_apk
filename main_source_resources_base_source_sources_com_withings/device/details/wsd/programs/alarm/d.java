package com.withings.device.details.wsd.programs.alarm;

import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.withings.alarm.ui.AlarmRepeatView;
import kotlin.jvm.internal.u;
/* compiled from: WsdSetAlarmFragment.kt */
/* loaded from: classes3.dex */
public final class d implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LinearLayout f37159a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WsdSetAlarmFragment f37160b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(LinearLayout linearLayout, WsdSetAlarmFragment wsdSetAlarmFragment) {
        this.f37159a = linearLayout;
        this.f37160b = wsdSetAlarmFragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        tn.g gVar;
        AlarmRepeatView alarmRepeatView;
        u.j(animation, "animation");
        this.f37159a.setVisibility(8);
        gVar = this.f37160b.f37147c;
        if (gVar != null && (alarmRepeatView = gVar.f100327f) != null) {
            alarmRepeatView.d();
        }
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
