package com.withings.details.height;

import android.content.Context;
import androidx.compose.ui.platform.u0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;
import org.joda.time.DateTime;
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
final class z extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeightListActivity f36649a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(HeightListActivity heightListActivity) {
        super(2);
        this.f36649a = heightListActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            HeightListActivity heightListActivity = this.f36649a;
            List list = (List) t1.d.b(HeightListActivity.J3(heightListActivity).g0(), kotlin.collections.i0.f76187a, aVar2).getValue();
            kotlin.jvm.internal.u.i(list, "invoke$lambda$0(...)");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String n11 = b50.b.n((Context) aVar2.D(u0.d()), new DateTime(((ky.d) obj).c()));
                Object obj2 = linkedHashMap.get(n11);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(n11, obj2);
                }
                ((List) obj2).add(obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(s0.h(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), hy.g.f((List) entry.getValue()));
            }
            HeightListActivity.G3(heightListActivity, linkedHashMap2, aVar2, 72);
        }
        return nm0.y.f85009a;
    }
}
