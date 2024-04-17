package com.withings.coach.chatbot;

import android.content.Context;
/* compiled from: Hilt_ChatbotActivity.java */
/* loaded from: classes3.dex */
final class e1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ChatbotActivity f32987a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(Hilt_ChatbotActivity hilt_ChatbotActivity) {
        this.f32987a = hilt_ChatbotActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f32987a.inject();
    }
}
