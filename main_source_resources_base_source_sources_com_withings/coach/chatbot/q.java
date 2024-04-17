package com.withings.coach.chatbot;

import com.withings.insight.android.entity.Conversation;
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
final class q extends kotlin.jvm.internal.w implements ym0.l<Conversation, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f33100a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ChatbotActivity chatbotActivity) {
        super(1);
        this.f33100a = chatbotActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Conversation conversation) {
        Conversation conversation2 = conversation;
        kotlin.jvm.internal.u.g(conversation2);
        ChatbotActivity.Z3(this.f33100a, conversation2);
        return nm0.y.f85009a;
    }
}
