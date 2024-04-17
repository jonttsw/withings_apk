package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import android.content.Intent;
import com.withings.coach.chatbot.ChatbotActivity;
import com.withings.insight.android.entity.Insight;
/* compiled from: SleepDisorderDetailsFragment.kt */
/* loaded from: classes5.dex */
final class y extends kotlin.jvm.internal.w implements ym0.l<xw.c<? extends Insight>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f61496a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(s sVar) {
        super(1);
        this.f61496a = sVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(xw.c<? extends Insight> cVar) {
        Insight a11 = cVar.a();
        if (a11 != null) {
            ChatbotActivity.a aVar = ChatbotActivity.G;
            s sVar = this.f61496a;
            Context requireContext = sVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            aVar.getClass();
            Intent putExtra = new Intent(requireContext, ChatbotActivity.class).putExtra("EXTRA_INSIGHT", a11);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            sVar.startActivity(putExtra);
        }
        return nm0.y.f85009a;
    }
}
