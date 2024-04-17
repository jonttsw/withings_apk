package com.withings.wiscale2.device.common.feature.respiratoryscan;

import com.withings.features.platform.model.PlatformFeature;
import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: RespiratoryScanActivationActivity.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.l<List<? extends PlatformFeature>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RespiratoryScanActivationActivity f52446a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RespiratoryScanActivationActivity respiratoryScanActivationActivity) {
        super(1);
        this.f52446a = respiratoryScanActivationActivity;
    }

    @Override // ym0.l
    public final y invoke(List<? extends PlatformFeature> list) {
        if (list == null) {
            this.f52446a.finish();
        }
        return y.f85009a;
    }
}
