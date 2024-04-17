package com.withings.coach.chatbot;

import android.view.View;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
/* compiled from: ChatbotAdapter.kt */
/* loaded from: classes3.dex */
public final class d1 extends x0 {

    /* renamed from: b  reason: collision with root package name */
    private final TextView f32984b;

    public d1(View view) {
        super(view);
        View findViewById = view.findViewById(C1987R.id.chatbot_message);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f32984b = (TextView) findViewById;
    }

    @Override // com.withings.coach.chatbot.x0
    public final void a(l0 l0Var, Boolean bool) {
        CharSequence charSequence;
        if (l0Var != null) {
            charSequence = l0Var.b();
        } else {
            charSequence = null;
        }
        this.f32984b.setText(charSequence);
    }
}
