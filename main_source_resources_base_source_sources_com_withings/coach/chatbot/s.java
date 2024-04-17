package com.withings.coach.chatbot;

import com.withings.insight.android.entity.Insight;
import java.util.List;
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
final class s extends kotlin.jvm.internal.w implements ym0.l<List<Insight>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity f33115a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ChatbotActivity chatbotActivity) {
        super(1);
        this.f33115a = chatbotActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<Insight> list) {
        List<Insight> list2 = list;
        if (list2 != null) {
            if (list2.size() != 1) {
                list2 = null;
            }
            if (list2 != null) {
                ChatbotActivity.O3(this.f33115a, ((Insight) kotlin.collections.x.I(list2)).getInsightId());
            }
        }
        return nm0.y.f85009a;
    }
}
