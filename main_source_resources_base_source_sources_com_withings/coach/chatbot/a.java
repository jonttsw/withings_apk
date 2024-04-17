package com.withings.coach.chatbot;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.text.util.Linkify;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
/* compiled from: ChatbotAdapter.kt */
/* loaded from: classes3.dex */
public final class a extends x0 {

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f32964b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f32965c;

    public a(View view) {
        super(view);
        View findViewById = view.findViewById(C1987R.id.chatbot_face);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f32964b = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.chatbot_message);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f32965c = (TextView) findViewById2;
    }

    @Override // com.withings.coach.chatbot.x0
    public final void a(l0 l0Var, Boolean bool) {
        CharSequence g11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence = null;
        boolean z5 = true;
        if (l0Var != null && (g11 = l0Var.g()) != null) {
            if (g11.length() <= 0) {
                g11 = null;
            }
            if (g11 != null) {
                StyleSpan styleSpan = new StyleSpan(1);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(g11);
                spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                kotlin.jvm.internal.u.i(spannableStringBuilder.append('\n'), "append(...)");
            }
        }
        if (l0Var != null) {
            charSequence = l0Var.b();
        }
        spannableStringBuilder.append(charSequence);
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        TextView textView = this.f32965c;
        textView.setText(spannedString);
        Linkify.addLinks(textView, 15);
        textView.setTextColor(androidx.core.content.a.getColor(textView.getContext(), C1987R.color.textSecondary));
        int i11 = 0;
        if (bool != null && bool.booleanValue()) {
            z5 = false;
        }
        if (z5) {
            i11 = 4;
        }
        this.f32964b.setVisibility(i11);
    }
}
