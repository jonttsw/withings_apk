package com.withings.wiscale2.device.common.feature.afib;

import com.withings.features.platform.model.PlatformFeature;
import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: AfibSettingsActivity.kt */
/* loaded from: classes5.dex */
final class l extends w implements ym0.l<List<? extends PlatformFeature>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AfibSettingsActivity f51029a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AfibSettingsActivity afibSettingsActivity) {
        super(1);
        this.f51029a = afibSettingsActivity;
    }

    @Override // ym0.l
    public final y invoke(List<? extends PlatformFeature> list) {
        if (list == null) {
            this.f51029a.finish();
        }
        return y.f85009a;
    }
}
