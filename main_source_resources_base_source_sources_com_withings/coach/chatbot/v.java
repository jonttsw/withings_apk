package com.withings.coach.chatbot;
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
final class v extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f33119a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ChatbotActivity chatbotActivity) {
        super(1);
        this.f33119a = chatbotActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        Boolean bool2 = bool;
        kotlin.jvm.internal.u.g(bool2);
        ChatbotActivity.e4(this.f33119a, bool2.booleanValue());
        return nm0.y.f85009a;
    }
}
