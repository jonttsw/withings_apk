package com.withings.wiscale2.measure.accountmeasure.unknown.ui;

import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: UnknownMeasuresActivity.kt */
/* loaded from: classes5.dex */
final class c extends w implements l<List<? extends Object>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UnknownMeasuresActivity f58347a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UnknownMeasuresActivity unknownMeasuresActivity) {
        super(1);
        this.f58347a = unknownMeasuresActivity;
    }

    @Override // ym0.l
    public final y invoke(List<? extends Object> list) {
        UnknownMeasuresActivity.D3(this.f58347a).submitList(list);
        return y.f85009a;
    }
}
