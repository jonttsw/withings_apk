package com.withings.coach.chatbot;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
/* compiled from: ChatbotAdapter.kt */
/* loaded from: classes3.dex */
public final class b extends x0 {

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f32970b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f32971c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f32972d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f32973e;

    public b(View view) {
        super(view);
        View findViewById = view.findViewById(C1987R.id.chatbot_face);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f32970b = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.challenge_title);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f32971c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.challenge_description);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f32972d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.challenge_icon);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f32973e = (TextView) findViewById4;
    }

    @Override // com.withings.coach.chatbot.x0
    public final void a(l0 l0Var, Boolean bool) {
        CharSequence charSequence;
        String c11;
        CharSequence charSequence2 = null;
        if (l0Var != null) {
            charSequence = l0Var.b();
        } else {
            charSequence = null;
        }
        this.f32972d.setText(charSequence);
        if (l0Var != null) {
            charSequence2 = l0Var.g();
        }
        this.f32971c.setText(charSequence2);
        if (l0Var != null && (c11 = l0Var.c()) != null) {
            Context context = this.itemView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            this.f32973e.setText(wq.a.f(context, c11));
        }
        int i11 = 0;
        boolean z5 = true;
        if (bool != null && bool.booleanValue()) {
            z5 = false;
        }
        if (z5) {
            i11 = 4;
        }
        this.f32970b.setVisibility(i11);
    }
}
