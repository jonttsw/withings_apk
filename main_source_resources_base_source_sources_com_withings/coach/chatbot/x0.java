package com.withings.coach.chatbot;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ChatbotAdapter.kt */
/* loaded from: classes3.dex */
public abstract class x0 extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f33125a = 0;

    public static /* synthetic */ void b(x0 x0Var, l0 l0Var, int i11) {
        if ((i11 & 1) != 0) {
            l0Var = null;
        }
        x0Var.a(l0Var, Boolean.FALSE);
    }

    public abstract void a(l0 l0Var, Boolean bool);
}
