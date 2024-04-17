package com.withings.coach.chatbot;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
import ga.f;
/* compiled from: ChatbotAdapter.kt */
/* loaded from: classes3.dex */
public final class j1 extends x0 {

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f33012b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f33013c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f33014d;

    /* renamed from: e  reason: collision with root package name */
    private final ImageView f33015e;

    /* renamed from: f  reason: collision with root package name */
    private final View f33016f;

    public j1(View view) {
        super(view);
        View findViewById = view.findViewById(C1987R.id.chatbot_face);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f33012b = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.title);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f33013c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.description);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f33014d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.image_view);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f33015e = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.loading);
        kotlin.jvm.internal.u.i(findViewById5, "findViewById(...)");
        this.f33016f = findViewById5;
    }

    @Override // com.withings.coach.chatbot.x0
    public final void a(l0 l0Var, Boolean bool) {
        CharSequence charSequence;
        CharSequence b10;
        int i11 = 0;
        CharSequence charSequence2 = null;
        if (l0Var != null) {
            charSequence = l0Var.g();
        } else {
            charSequence = null;
        }
        ImageView imageView = this.f33015e;
        if (charSequence != null && charSequence.length() != 0) {
            View loadingView = this.f33016f;
            kotlin.jvm.internal.u.j(loadingView, "loadingView");
            kotlin.jvm.internal.u.j(imageView, "imageView");
            loadingView.setVisibility(4);
            imageView.setVisibility(0);
        }
        if (l0Var == null || (b10 = l0Var.g()) == null) {
            b10 = zq.b.b(this, C1987R.string.weightCoach_previewTitle_article);
        }
        this.f33013c.setText(b10);
        if (l0Var != null && l0Var.e() != null) {
            String e11 = l0Var.e();
            w9.g a11 = w9.a.a(imageView.getContext());
            f.a aVar = new f.a(imageView.getContext());
            aVar.d(e11);
            aVar.q(imageView);
            aVar.c();
            aVar.k(2131231219);
            aVar.s(new k1());
            a11.d(aVar.b());
        }
        if (l0Var != null) {
            charSequence2 = l0Var.b();
        }
        this.f33014d.setText(charSequence2);
        if (bool == null || !bool.booleanValue()) {
            i11 = 4;
        }
        this.f33012b.setVisibility(i11);
    }
}
