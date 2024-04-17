package com.withings.coach.chatbot;

import android.content.Intent;
import com.withings.coach.chatbot.ChatbotActivity;
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
final class j extends kotlin.jvm.internal.w implements ym0.l<Intent, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f33010a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ChatbotActivity chatbotActivity) {
        super(1);
        this.f33010a = chatbotActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Intent intent) {
        Intent intent2 = intent;
        if (intent2 != null) {
            ChatbotActivity.a aVar = ChatbotActivity.G;
            ChatbotActivity chatbotActivity = this.f33010a;
            chatbotActivity.getClass();
            if (wq.b.a(chatbotActivity, intent2)) {
                intent2.setFlags(67141632);
                chatbotActivity.startActivity(intent2);
            }
        }
        return nm0.y.f85009a;
    }
}
