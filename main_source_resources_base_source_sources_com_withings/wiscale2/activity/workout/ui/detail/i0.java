package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.location.model.GpsLocation;
import com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity;
import java.util.List;
/* compiled from: ListGpsPointActivity.kt */
/* loaded from: classes4.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.l<s0.i0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity.b f49232a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity f49233b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ListGpsPointActivity.b bVar, ListGpsPointActivity listGpsPointActivity) {
        super(1);
        this.f49232a = bVar;
        this.f49233b = listGpsPointActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(s0.i0 i0Var) {
        List<GpsLocation> list;
        s0.i0 LazyColumn = i0Var;
        kotlin.jvm.internal.u.j(LazyColumn, "$this$LazyColumn");
        ListGpsPointActivity.b bVar = this.f49232a;
        if (bVar != null) {
            list = bVar.b();
        } else {
            list = null;
        }
        if (list == null) {
            list = kotlin.collections.i0.f76187a;
        }
        LazyColumn.c(list.size(), null, new g0(f0.f49185a, list), new s1.a(true, -632812321, new h0(list, this.f49233b)));
        return nm0.y.f85009a;
    }
}
