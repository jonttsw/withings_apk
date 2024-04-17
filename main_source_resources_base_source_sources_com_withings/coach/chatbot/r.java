package com.withings.coach.chatbot;

import com.withings.insight.android.entity.Conversation;
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
final class r extends kotlin.jvm.internal.w implements ym0.l<Conversation, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f33112a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ChatbotActivity chatbotActivity) {
        super(1);
        this.f33112a = chatbotActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Conversation conversation) {
        Conversation conversation2 = conversation;
        kotlin.jvm.internal.u.g(conversation2);
        ChatbotActivity.W3(this.f33112a, conversation2);
        return nm0.y.f85009a;
    }
}
