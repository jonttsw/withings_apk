package com.withings.device.details.automatic.activity.detection;

import android.content.Context;
import androidx.compose.foundation.layout.x0;
import androidx.compose.ui.platform.u0;
import com.withings.common.compose.component.v0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutomaticActivityDetection.kt */
/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Map<WorkoutCategory, Boolean> f36736a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.p<Long, Boolean, nm0.y> f36737b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AutomaticActivityDetection f36738c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(Map<WorkoutCategory, Boolean> map, ym0.p<? super Long, ? super Boolean, nm0.y> pVar, AutomaticActivityDetection automaticActivityDetection) {
        super(3);
        this.f36736a = map;
        this.f36737b = pVar;
        this.f36738c = automaticActivityDetection;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        v vVar = this;
        r0.h SectionCardColumn = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            Map<WorkoutCategory, Boolean> map = vVar.f36736a;
            int i11 = 0;
            int i12 = 0;
            for (Object obj : map.entrySet()) {
                int i13 = i12 + 1;
                if (i12 >= 0) {
                    Map.Entry entry = (Map.Entry) obj;
                    WorkoutCategory workoutCategory = (WorkoutCategory) entry.getKey();
                    boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                    androidx.compose.ui.e h11 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
                    String name = workoutCategory.getName((Context) aVar2.D(u0.d()));
                    t tVar = new t(vVar.f36737b, workoutCategory);
                    s1.a b10 = s1.b.b(aVar2, 888437375, new u(vVar.f36738c, workoutCategory));
                    kotlin.jvm.internal.u.g(name);
                    int i14 = i12;
                    int i15 = i11;
                    com.withings.common.compose.component.o.l(h11, booleanValue, tVar, b10, name, null, false, false, false, null, aVar2, 3072, ConstantsWs.BLINDCODE_PRO_ERROR);
                    aVar2.s(553638623);
                    if (i14 < map.size() - 1) {
                        v0.b(0.0f, aVar2, i15, 1);
                    }
                    aVar2.J();
                    i11 = i15;
                    i12 = i13;
                    vVar = this;
                } else {
                    kotlin.collections.x.K0();
                    throw null;
                }
            }
        }
        return nm0.y.f85009a;
    }
}
