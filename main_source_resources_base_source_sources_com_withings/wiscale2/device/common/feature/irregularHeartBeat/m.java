package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: IrregularHeartBeatSettingsActivity.kt */
/* loaded from: classes5.dex */
final class m extends w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IrregularHeartBeatSettingsActivity f52370a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(IrregularHeartBeatSettingsActivity irregularHeartBeatSettingsActivity) {
        super(1);
        this.f52370a = irregularHeartBeatSettingsActivity;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        IrregularHeartBeatSettingsActivity.B3(this.f52370a, bool.booleanValue());
        return y.f85009a;
    }
}
