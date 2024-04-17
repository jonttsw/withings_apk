package com.withings.nervehealth.ui;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
/* compiled from: NerveHealthMeasureListActivity.kt */
/* loaded from: classes4.dex */
final class a0 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthMeasureListActivity f42487a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(NerveHealthMeasureListActivity nerveHealthMeasureListActivity) {
        super(1);
        this.f42487a = nerveHealthMeasureListActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        int intValue = num.intValue();
        parcelableSnapshotMutableState = this.f42487a.f42393l;
        parcelableSnapshotMutableState.setValue(Integer.valueOf(intValue));
        return nm0.y.f85009a;
    }
}
