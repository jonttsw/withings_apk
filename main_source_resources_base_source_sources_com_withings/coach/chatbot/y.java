package com.withings.coach.chatbot;

import com.withings.insight.android.entity.Conversation;
import com.withings.insight.android.entity.Suggestion;
import java.util.List;
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
final class y extends kotlin.jvm.internal.w implements ym0.l<nm0.j<? extends Conversation, ? extends List<? extends Suggestion>>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f33126a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ChatbotActivity chatbotActivity) {
        super(1);
        this.f33126a = chatbotActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(nm0.j<? extends Conversation, ? extends List<? extends Suggestion>> jVar) {
        nm0.j<? extends Conversation, ? extends List<? extends Suggestion>> jVar2 = jVar;
        if (jVar2 != null) {
            ChatbotActivity.G3(this.f33126a, jVar2.c(), jVar2.d());
        }
        return nm0.y.f85009a;
    }
}
