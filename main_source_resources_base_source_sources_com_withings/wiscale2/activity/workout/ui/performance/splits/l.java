package com.withings.wiscale2.activity.workout.ui.performance.splits;

import androidx.activity.a0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import jm.a;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class l extends w implements ym0.r<s0.b, Integer, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f50023a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WorkoutSplitsActivity f50024b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, WorkoutSplitsActivity workoutSplitsActivity) {
        super(4);
        this.f50023a = list;
        this.f50024b = workoutSplitsActivity;
    }

    @Override // ym0.r
    public final y invoke(s0.b bVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i11;
        String str;
        int i12;
        int i13;
        s0.b bVar2 = bVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 14) == 0) {
            if (aVar2.K(bVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            if (aVar2.c(intValue)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && aVar2.h()) {
            aVar2.C();
        } else {
            int i14 = (i11 & 112) | (i11 & 14);
            b bVar3 = (b) this.f50023a.get(intValue);
            aVar2.s(1818190138);
            Double c11 = bVar3.c();
            if (c11 != null) {
                double doubleValue = c11.doubleValue();
                int i15 = (doubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : (doubleValue == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 0 : -1));
                WorkoutSplitsActivity workoutSplitsActivity = this.f50024b;
                if (i15 < 0) {
                    str = a0.b("-", a.d.a(workoutSplitsActivity).b(-doubleValue, 126));
                } else {
                    str = a0.b("+", a.d.a(workoutSplitsActivity).b(doubleValue, 126));
                }
            } else {
                str = null;
            }
            String str2 = str;
            if (intValue != 0) {
                aVar2.s(1818190641);
                WorkoutSplitsActivity.C3(this.f50024b, intValue, bVar3, str2, true, aVar2, ((i14 >> 3) & 14) | 35840);
                aVar2.J();
            } else {
                aVar2.s(1818190763);
                WorkoutSplitsActivity.C3(this.f50024b, intValue, bVar3, str2, false, aVar2, ((i14 >> 3) & 14) | 35840);
                aVar2.J();
            }
            aVar2.J();
        }
        return y.f85009a;
    }
}
