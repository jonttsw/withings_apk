package com.withings.details.height;

import com.withings.library.measure.MeasuresGroup;
import java.util.List;
import java.util.Map;
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
final class m extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeightListActivity f36620a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map<String, List<MeasuresGroup>> f36621b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(HeightListActivity heightListActivity, Map<String, ? extends List<? extends MeasuresGroup>> map) {
        super(0);
        this.f36620a = heightListActivity;
        this.f36621b = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2.f36621b.size() > 1) goto L5;
     */
    @Override // ym0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r2 = this;
            com.withings.details.height.HeightListActivity r0 = r2.f36620a
            com.withings.user.User r0 = com.withings.details.height.HeightListActivity.I3(r0)
            boolean r0 = r0.D()
            if (r0 != 0) goto L16
            java.util.Map<java.lang.String, java.util.List<com.withings.library.measure.MeasuresGroup>> r0 = r2.f36621b
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.details.height.m.invoke():java.lang.Object");
    }
}
