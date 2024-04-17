package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import com.withings.features.platform.model.PlatformFeature;
import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: IrregularHeartBeatSettingsActivity.kt */
/* loaded from: classes5.dex */
final class l extends w implements ym0.l<List<? extends PlatformFeature>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IrregularHeartBeatSettingsActivity f52369a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(IrregularHeartBeatSettingsActivity irregularHeartBeatSettingsActivity) {
        super(1);
        this.f52369a = irregularHeartBeatSettingsActivity;
    }

    @Override // ym0.l
    public final y invoke(List<? extends PlatformFeature> list) {
        if (list == null) {
            this.f52369a.finish();
        }
        return y.f85009a;
    }
}
