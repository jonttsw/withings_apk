package com.withings.coach.chatbot;

import com.withings.insight.android.entity.Insight;
/* compiled from: ChatbotActivity.kt */
/* loaded from: classes3.dex */
final class t extends kotlin.jvm.internal.w implements ym0.l<Insight, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p0 f33117a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p0 p0Var) {
        super(1);
        this.f33117a = p0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Insight insight) {
        Insight insight2 = insight;
        if (insight2 != null) {
            this.f33117a.r1(insight2);
        }
        return nm0.y.f85009a;
    }
}
