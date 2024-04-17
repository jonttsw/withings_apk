package com.withings.ecg.instruction;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EcgLostConnectionScreenActivity.kt */
/* loaded from: classes3.dex */
final class a extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgLostConnectionScreenActivity f38584a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EcgLostConnectionScreenActivity ecgLostConnectionScreenActivity) {
        super(0);
        this.f38584a = ecgLostConnectionScreenActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f38584a.finish();
        return y.f85009a;
    }
}
