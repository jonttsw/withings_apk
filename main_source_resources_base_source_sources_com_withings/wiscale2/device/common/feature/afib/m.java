package com.withings.wiscale2.device.common.feature.afib;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: AfibSettingsActivity.kt */
/* loaded from: classes5.dex */
final class m extends w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AfibSettingsActivity f51030a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AfibSettingsActivity afibSettingsActivity) {
        super(1);
        this.f51030a = afibSettingsActivity;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        AfibSettingsActivity.B3(this.f51030a, bool.booleanValue());
        return y.f85009a;
    }
}
