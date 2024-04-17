package com.withings.coach.chatbot;

import com.withings.insight.android.entity.Insight;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatbotViewModel.kt */
/* loaded from: classes3.dex */
public final class s0 extends kotlin.jvm.internal.w implements ym0.p<Long, Insight, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p0 f33116a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(p0 p0Var) {
        super(2);
        this.f33116a = p0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(Long l5, Insight insight) {
        long longValue = l5.longValue();
        Insight insightNotNull = insight;
        kotlin.jvm.internal.u.j(insightNotNull, "insightNotNull");
        insightNotNull.setRead(true);
        p0 p0Var = this.f33116a;
        p0Var.f33048a.i(longValue);
        if (insightNotNull.isToday()) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(p0Var), Dispatchers.getIO(), null, new r0(p0Var, null), 2, null);
            String insightId = insightNotNull.getCrmId();
            kotlin.jvm.internal.u.j(insightId, "insightId");
            Map i11 = kotlin.collections.s0.i(new nm0.j("insight_id", insightId));
            ri.a aVar = ri.a.f95046a;
            x70.b.l(aVar, "ended_conversation " + i11, new Object[0]);
        }
        return nm0.y.f85009a;
    }
}
