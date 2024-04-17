package com.withings.coach.chatbot;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
public final class i extends RecyclerView.f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f33004a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LinearLayoutManager f33005b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(ChatbotActivity chatbotActivity, LinearLayoutManager linearLayoutManager) {
        this.f33004a = chatbotActivity;
        this.f33005b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void d(int i11, int i12) {
        boolean z5;
        RecyclerView g42;
        j0 j0Var;
        ChatbotActivity chatbotActivity = this.f33004a;
        z5 = chatbotActivity.f32934z;
        if (z5) {
            g42 = chatbotActivity.g4();
            j0Var = chatbotActivity.f32929u;
            this.f33005b.W0(g42, j0Var.getItemCount());
        }
    }
}
