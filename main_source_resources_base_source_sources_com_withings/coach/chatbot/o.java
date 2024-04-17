package com.withings.coach.chatbot;

import com.withings.insight.android.entity.Conversation;
import java.util.List;
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
final class o extends kotlin.jvm.internal.w implements ym0.l<nm0.j<? extends Conversation, ? extends List<? extends Integer>>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f33039a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ChatbotActivity chatbotActivity) {
        super(1);
        this.f33039a = chatbotActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(nm0.j<? extends Conversation, ? extends List<? extends Integer>> jVar) {
        nm0.j<? extends Conversation, ? extends List<? extends Integer>> jVar2 = jVar;
        ChatbotActivity.Y3(this.f33039a, jVar2.c(), jVar2.d());
        return nm0.y.f85009a;
    }
}
