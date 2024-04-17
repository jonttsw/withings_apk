package com.withings.ecg.heartsound;

import android.widget.ImageButton;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: HeartSoundDetailsFragment.kt */
/* loaded from: classes3.dex */
final class f extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f38467a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar) {
        super(1);
        this.f38467a = dVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        boolean z5;
        int i11;
        boolean booleanValue = bool.booleanValue();
        d dVar = this.f38467a;
        ImageButton heartSoundDetailsPlaySound = dVar.D1().f78073e;
        kotlin.jvm.internal.u.i(heartSoundDetailsPlaySound, "heartSoundDetailsPlaySound");
        int i12 = 0;
        if (booleanValue) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i13 = 8;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        heartSoundDetailsPlaySound.setVisibility(i11);
        ImageView heartSoundDetailsPlaySoundBackground = dVar.D1().f78074f;
        kotlin.jvm.internal.u.i(heartSoundDetailsPlaySoundBackground, "heartSoundDetailsPlaySoundBackground");
        if (booleanValue) {
            i13 = 0;
        }
        heartSoundDetailsPlaySoundBackground.setVisibility(i13);
        LottieAnimationView heartSoundNoSignal = dVar.D1().f78075g;
        kotlin.jvm.internal.u.i(heartSoundNoSignal, "heartSoundNoSignal");
        if (booleanValue) {
            i12 = 4;
        }
        heartSoundNoSignal.setVisibility(i12);
        return nm0.y.f85009a;
    }
}
