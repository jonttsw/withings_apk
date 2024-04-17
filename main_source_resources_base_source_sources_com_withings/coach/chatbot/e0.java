package com.withings.coach.chatbot;

import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
public final class e0 extends kotlin.jvm.internal.w implements ym0.l<DateTime, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f32986a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ChatbotActivity chatbotActivity) {
        super(1);
        this.f32986a = chatbotActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(DateTime dateTime) {
        DateTime time = dateTime;
        kotlin.jvm.internal.u.j(time, "time");
        ChatbotActivity.S3(this.f32986a, time);
        return nm0.y.f85009a;
    }
}
