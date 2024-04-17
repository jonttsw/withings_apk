package com.withings.coach.chatbot;

import androidx.recyclerview.widget.m;
/* compiled from: ChatbotAdapter.kt */
/* loaded from: classes3.dex */
public final class k0 extends m.f<l0> {
    @Override // androidx.recyclerview.widget.m.f
    public final boolean areContentsTheSame(l0 l0Var, l0 l0Var2) {
        l0 oldItem = l0Var;
        l0 newItem = l0Var2;
        kotlin.jvm.internal.u.j(oldItem, "oldItem");
        kotlin.jvm.internal.u.j(newItem, "newItem");
        return kotlin.jvm.internal.u.e(oldItem.d(), newItem.d());
    }

    @Override // androidx.recyclerview.widget.m.f
    public final boolean areItemsTheSame(l0 l0Var, l0 l0Var2) {
        l0 oldItem = l0Var;
        l0 newItem = l0Var2;
        kotlin.jvm.internal.u.j(oldItem, "oldItem");
        kotlin.jvm.internal.u.j(newItem, "newItem");
        return kotlin.jvm.internal.u.e(oldItem, newItem);
    }
}
