package com.withings.coach.chatbot;

import androidx.constraintlayout.motion.widget.MotionLayout;
import com.withings.wiscale2.C1987R;
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
public final class b0 implements MotionLayout.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f32974a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(ChatbotActivity chatbotActivity) {
        this.f32974a = chatbotActivity;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public final void a(int i11) {
        MotionLayout k42;
        ChatbotActivity chatbotActivity = this.f32974a;
        if (i11 == C1987R.id.suggestion_shown) {
            ChatbotActivity.a4(chatbotActivity);
        } else if (i11 == C1987R.id.fader_hidden) {
            k42 = chatbotActivity.k4();
            k42.l0(C1987R.id.suggestion_shown);
        }
    }
}
