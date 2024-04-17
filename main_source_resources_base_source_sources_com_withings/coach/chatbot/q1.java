package com.withings.coach.chatbot;

import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.withings.wiscale2.C1987R;
/* compiled from: ChatbotAdapter.kt */
/* loaded from: classes3.dex */
public final class q1 extends x0 {

    /* renamed from: b  reason: collision with root package name */
    private final LottieAnimationView f33110b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageView f33111c;

    public q1(View view) {
        super(view);
        View findViewById = view.findViewById(C1987R.id.lottie_animation);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f33110b = (LottieAnimationView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.chatbot_face);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f33111c = (ImageView) findViewById2;
    }

    @Override // com.withings.coach.chatbot.x0
    public final void a(l0 l0Var, Boolean bool) {
        LottieAnimationView lottieAnimationView = this.f33110b;
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setAnimation("lottie/chatbot_writing.json");
        lottieAnimationView.m();
        this.f33111c.setVisibility(0);
    }
}
