package com.withings.tutorials.ui.screens.explanations;

import com.withings.tutorials.ui.screens.explanations.ExplanationsActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class v extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExplanationsActivity.d f45265a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ExplanationsActivity.d dVar) {
        super(0);
        this.f45265a = dVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f45265a.f45088b, "EXTRA_KEY_USER_ID"));
    }
}
