package com.withings.wiscale2.measure.accountmeasure.unknown.ui;

import com.withings.library.measure.MeasuresGroup;
import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: UnknownMeasuresActivity.kt */
/* loaded from: classes5.dex */
final class e extends w implements l<List<? extends MeasuresGroup>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UnknownMeasuresActivity f58349a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(UnknownMeasuresActivity unknownMeasuresActivity) {
        super(1);
        this.f58349a = unknownMeasuresActivity;
    }

    @Override // ym0.l
    public final y invoke(List<? extends MeasuresGroup> list) {
        UnknownMeasuresActivity.E3(this.f58349a, list);
        return y.f85009a;
    }
}
