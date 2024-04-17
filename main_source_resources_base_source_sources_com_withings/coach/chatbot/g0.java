package com.withings.coach.chatbot;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
/* compiled from: View.kt */
/* loaded from: classes3.dex */
public final class g0 implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f32996a;

    public g0(ChatbotActivity chatbotActivity) {
        this.f32996a = chatbotActivity;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        RecyclerView g42;
        FrameLayout h42;
        view.removeOnLayoutChangeListener(this);
        ChatbotActivity chatbotActivity = this.f32996a;
        g42 = chatbotActivity.g4();
        int max = Math.max((g42.getPaddingBottom() - view.getHeight()) - chatbotActivity.getResources().getDimensionPixelSize(C1987R.dimen.layout4), 360);
        h42 = chatbotActivity.h4();
        h42.setPadding(h42.getPaddingLeft(), h42.getPaddingTop(), h42.getPaddingRight(), max);
    }
}
