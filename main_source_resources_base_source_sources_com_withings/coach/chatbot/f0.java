package com.withings.coach.chatbot;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.coach.chatbot.ChatbotActivity;
import com.withings.insight.android.entity.Insight;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class f0 extends kotlin.jvm.internal.w implements ym0.a<Insight> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatbotActivity.m f32990a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ChatbotActivity.m mVar) {
        super(0);
        this.f32990a = mVar;
    }

    @Override // ym0.a
    public final Insight invoke() {
        ChatbotActivity.m mVar = this.f32990a;
        mVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Insight.class);
        Activity activity = mVar.f32947b;
        if (isAssignableFrom) {
            return (Insight) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_INSIGHT");
        }
        if (Serializable.class.isAssignableFrom(Insight.class)) {
            return (Insight) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_INSIGHT");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_INSIGHT of class ", kotlin.jvm.internal.q0.b(Insight.class), " is not supported"));
    }
}
