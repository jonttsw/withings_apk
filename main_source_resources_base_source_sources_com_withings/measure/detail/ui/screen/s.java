package com.withings.measure.detail.ui.screen;

import com.withings.library.measure.MeasuresGroup;
import org.joda.time.DateTime;
/* compiled from: MeasureDetailViewModel.kt */
/* loaded from: classes4.dex */
final class s extends kotlin.jvm.internal.w implements ym0.l<MeasuresGroup, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DateTime f41794a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(DateTime dateTime) {
        super(1);
        this.f41794a = dateTime;
    }

    @Override // ym0.l
    public final Boolean invoke(MeasuresGroup measuresGroup) {
        boolean z5;
        MeasuresGroup it = measuresGroup;
        kotlin.jvm.internal.u.j(it, "it");
        if (it.getDate().getTime() == this.f41794a.getMillis()) {
            z5 = true;
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
