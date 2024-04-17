package com.withings.wiscale2.activity.ui;

import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.vasistas.model.Vasistas;
import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VasistasInfoActivity.kt */
/* loaded from: classes4.dex */
public final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VasistasInfoActivity f48621a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f48622b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ActivityAggregate f48623c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<Vasistas> f48624d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f48625e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(VasistasInfoActivity vasistasInfoActivity, androidx.compose.ui.e eVar, ActivityAggregate activityAggregate, List<Vasistas> list, int i11) {
        super(2);
        this.f48621a = vasistasInfoActivity;
        this.f48622b = eVar;
        this.f48623c = activityAggregate;
        this.f48624d = list;
        this.f48625e = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f48625e | 1);
        ActivityAggregate activityAggregate = this.f48623c;
        List<Vasistas> list = this.f48624d;
        VasistasInfoActivity.Q3(this.f48621a, this.f48622b, activityAggregate, list, aVar, g11);
        return y.f85009a;
    }
}
