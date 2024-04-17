package com.withings.devicesetup.network.ui;

import com.withings.devicesetup.network.ui.d;
import kotlin.jvm.internal.w;
/* compiled from: Fragment.kt */
/* loaded from: classes3.dex */
public final class f extends w implements ym0.a<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d.C0496d f37823a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d.C0496d c0496d) {
        super(0);
        this.f37823a = c0496d;
    }

    @Override // ym0.a
    public final String invoke() {
        return yq.b.f(this.f37823a.f37821b, "wifiPassword");
    }
}
