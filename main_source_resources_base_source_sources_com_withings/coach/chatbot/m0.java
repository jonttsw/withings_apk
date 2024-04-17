package com.withings.coach.chatbot;

import com.withings.insight.android.entity.Action;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatbotViewModel.kt */
/* loaded from: classes3.dex */
public final class m0 extends kotlin.jvm.internal.w implements ym0.l<Action, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final m0 f33030a = new kotlin.jvm.internal.w(1);

    @Override // ym0.l
    public final Boolean invoke(Action action) {
        Action it = action;
        kotlin.jvm.internal.u.j(it, "it");
        Map<String, String> conditions = it.getConditions();
        boolean z5 = false;
        if ((conditions == null || conditions.isEmpty()) && dp0.j.r(it.getAction(), "next", false)) {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }
}
