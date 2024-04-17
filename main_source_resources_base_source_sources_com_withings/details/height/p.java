package com.withings.details.height;

import com.withings.library.measure.MeasuresGroup;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.w implements ym0.l<s0.i0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Map<String, List<MeasuresGroup>> f36627a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HeightListActivity f36628b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(HeightListActivity heightListActivity, Map map) {
        super(1);
        this.f36627a = map;
        this.f36628b = heightListActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(s0.i0 i0Var) {
        s0.i0 LazyColumn = i0Var;
        kotlin.jvm.internal.u.j(LazyColumn, "$this$LazyColumn");
        Map<String, List<MeasuresGroup>> map = this.f36627a;
        for (Map.Entry<String, List<MeasuresGroup>> entry : map.entrySet()) {
            List<MeasuresGroup> value = entry.getValue();
            s0.i0.f(LazyColumn, null, new s1.a(true, -1692336107, new l(entry.getKey())), 3);
            LazyColumn.c(value.size(), null, new n(value), new s1.a(true, -1091073711, new o(value, this.f36628b, value, map)));
        }
        return nm0.y.f85009a;
    }
}
