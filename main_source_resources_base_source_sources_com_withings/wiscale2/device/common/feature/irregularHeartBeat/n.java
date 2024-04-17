package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: IrregularHeartBeatSettingsActivity.kt */
/* loaded from: classes5.dex */
final class n extends w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IrregularHeartBeatSettingsActivity f52371a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(IrregularHeartBeatSettingsActivity irregularHeartBeatSettingsActivity) {
        super(1);
        this.f52371a = irregularHeartBeatSettingsActivity;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        IrregularHeartBeatSettingsActivity.A3(this.f52371a, bool.booleanValue());
        return y.f85009a;
    }
}
