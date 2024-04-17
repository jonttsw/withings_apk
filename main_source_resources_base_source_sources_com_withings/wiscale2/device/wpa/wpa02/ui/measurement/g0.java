package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;

import androidx.compose.material.c5;
import com.withings.common.compose.component.y3;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import k1.r0;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity f55548a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f55549b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<ne0.c> f55550c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c5 f55551d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, CoroutineScope coroutineScope, r0<ne0.c> r0Var, c5 c5Var) {
        super(3);
        this.f55548a = wpa02LaunchMeasurementActivity;
        this.f55549b = coroutineScope;
        this.f55550c = r0Var;
        this.f55551d = c5Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h GuidedPresentationWithBottomSheet = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(GuidedPresentationWithBottomSheet, "$this$GuidedPresentationWithBottomSheet");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            String u11 = ay.b.u(C1987R.string.TestSelection_Title, aVar2);
            String u12 = ay.b.u(C1987R.string.TestSelection_Subtitle, aVar2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : Wpa02LaunchMeasurementActivity.Q3(this.f55548a).i0()) {
                if (!((ne0.d) obj).a().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(s1.b.b(aVar2, 1533865870, new f0(this.f55548a, (ne0.d) it.next(), this.f55549b, this.f55550c, this.f55551d)));
            }
            y3.b(arrayList2, null, 0.0f, null, u12, u11, 0L, aVar2, 8, 78);
        }
        return nm0.y.f85009a;
    }
}
