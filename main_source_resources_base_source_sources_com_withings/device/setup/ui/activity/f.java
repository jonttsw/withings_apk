package com.withings.device.setup.ui.activity;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: SetupActivity.kt */
/* loaded from: classes3.dex */
final class f extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupActivity f37520a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SetupActivity setupActivity) {
        super(0);
        this.f37520a = setupActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f37520a.finish();
        return y.f85009a;
    }
}
