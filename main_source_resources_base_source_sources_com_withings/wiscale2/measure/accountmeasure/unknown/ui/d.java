package com.withings.wiscale2.measure.accountmeasure.unknown.ui;

import java.util.List;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: UnknownMeasuresActivity.kt */
/* loaded from: classes5.dex */
final class d extends w implements l<List<? extends jh0.d>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UnknownMeasuresActivity f58348a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(UnknownMeasuresActivity unknownMeasuresActivity) {
        super(1);
        this.f58348a = unknownMeasuresActivity;
    }

    @Override // ym0.l
    public final y invoke(List<? extends jh0.d> list) {
        List<? extends jh0.d> list2 = list;
        u.g(list2);
        y yVar = null;
        if (!(!list2.isEmpty())) {
            list2 = null;
        }
        UnknownMeasuresActivity unknownMeasuresActivity = this.f58348a;
        if (list2 != null) {
            UnknownMeasuresActivity.C3(unknownMeasuresActivity).submitList(list2);
            yVar = y.f85009a;
        }
        if (yVar == null) {
            unknownMeasuresActivity.finish();
        }
        return y.f85009a;
    }
}
