package com.withings.coach.chatbot;

import java.util.List;
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
final class u extends kotlin.jvm.internal.w implements ym0.l<List<l0>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f33118a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ChatbotActivity chatbotActivity) {
        super(1);
        this.f33118a = chatbotActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<l0> list) {
        List<l0> list2 = list;
        if (list2 != null) {
            ChatbotActivity.b4(this.f33118a, list2);
        }
        return nm0.y.f85009a;
    }
}
