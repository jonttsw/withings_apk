package com.withings.wiscale2.device.common.ui;

import com.withings.features.platform.model.PlatformFeature;
import java.util.List;
/* compiled from: RespiratoryScanSettingsActivity.kt */
/* loaded from: classes5.dex */
final class e2 extends kotlin.jvm.internal.w implements ym0.p<List<? extends PlatformFeature>, Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RespiratoryScanSettingsActivity f53798a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(RespiratoryScanSettingsActivity respiratoryScanSettingsActivity) {
        super(2);
        this.f53798a = respiratoryScanSettingsActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(List<? extends PlatformFeature> list, Boolean bool) {
        List<? extends PlatformFeature> features = list;
        boolean booleanValue = bool.booleanValue();
        kotlin.jvm.internal.u.j(features, "features");
        RespiratoryScanSettingsActivity respiratoryScanSettingsActivity = this.f53798a;
        respiratoryScanSettingsActivity.f53744h = booleanValue;
        RespiratoryScanSettingsActivity.D3(respiratoryScanSettingsActivity, features);
        return nm0.y.f85009a;
    }
}
