package com.withings.coach.chatbot;

import android.widget.EditText;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.coach.chatbot.ChatbotActivity;
import com.withings.coach.chatbot.p1;
import com.withings.insight.android.entity.Conversation;
import com.withings.insight.android.entity.Suggestion;
import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
public final class h implements p1.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f32999a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Conversation f33000b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ChatbotActivity chatbotActivity, Conversation conversation) {
        this.f32999a = chatbotActivity;
        this.f33000b = conversation;
    }

    @Override // com.withings.coach.chatbot.p1.a
    public final void a(String str) {
        ChatbotActivity.a aVar = ChatbotActivity.G;
        ChatbotActivity chatbotActivity = this.f32999a;
        chatbotActivity.getClass();
        qc.b bVar = new qc.b(chatbotActivity);
        bVar.A("OK", null);
        bVar.v(str);
        bVar.s();
    }

    @Override // com.withings.coach.chatbot.p1.a
    public final void onSuccess() {
        p0 p0Var;
        EditText j42;
        ChatbotActivity chatbotActivity = this.f32999a;
        p0Var = chatbotActivity.f32932x;
        if (p0Var != null) {
            j42 = chatbotActivity.j4();
            p0Var.M0(this.f33000b, kotlin.collections.x.V(new Suggestion(HealthConstants.FoodIntake.UNIT_TYPE_NOT_DEFINED, j42.getText().toString(), null, null, null, false, null, null, ConstantsWs.MEASURE_TYPE_VASISTAS_TYPE_WALKING_ASYMETRY, null)));
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
