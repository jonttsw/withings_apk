package com.withings.wiscale2.device.common.feature.respiratoryscan;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: RespiratoryScanActivationActivity.kt */
/* loaded from: classes5.dex */
final class c extends w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RespiratoryScanActivationActivity f52447a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RespiratoryScanActivationActivity respiratoryScanActivationActivity) {
        super(1);
        this.f52447a = respiratoryScanActivationActivity;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        RespiratoryScanActivationActivity.D3(this.f52447a, bool.booleanValue());
        return y.f85009a;
    }
}
