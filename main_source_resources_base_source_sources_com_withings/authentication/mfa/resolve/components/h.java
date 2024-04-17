package com.withings.authentication.mfa.resolve.components;

import androidx.camera.camera2.internal.o0;
import androidx.compose.runtime.v;
import com.withings.graph.axis.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.measure.accountmeasure.ui.add.g0;
import ef.r;
import java.util.Arrays;
import p4.p;
import p4.s0;
import p6.k;
import w6.b;
import yk.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements k.a, a.b {
    public /* synthetic */ h(b.a aVar, boolean z5) {
    }

    public static v a(androidx.compose.runtime.b bVar) {
        bVar.J();
        bVar.J();
        bVar.o();
        bVar.J();
        bVar.J();
        return bVar.o0();
    }

    public static r b(String str, String str2, String str3) {
        new r(str);
        new r(str2);
        return new r(str3);
    }

    public static Object d(androidx.compose.runtime.b bVar, int i11, int i12) {
        bVar.s(i11);
        bVar.s(i12);
        return bVar.D(o.g());
    }

    public static nm0.j e(int i11, p pVar) {
        return g0.f(pVar, new s0(i11));
    }

    @Override // com.withings.graph.axis.a.b
    public String c(float f11, float f12) {
        int log10 = (int) Math.log10(f12);
        float f13 = f11 / 1000;
        if (f13 >= 1.0f && log10 > 0) {
            if (f13 >= 1000.0f && log10 >= 4) {
                return String.format(o0.a("%.", 6 - log10, "fm"), Arrays.copyOf(new Object[]{Float.valueOf(f11 / ((float) ConstantsWs.MAX_AGGREGATE_DAILY_DISTANCE))}, 1));
            }
            return String.format(o0.a("%.", 3 - log10, "fk"), Arrays.copyOf(new Object[]{Float.valueOf(f13)}, 1));
        }
        float f14 = 1;
        if (f12 % f14 == 0.0f && f11 % f14 == 0.0f) {
            return String.format("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(f11)}, 1));
        }
        return String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f11)}, 1));
    }

    @Override // p6.k.a
    public void invoke(Object obj) {
        ((w6.b) obj).getClass();
    }
}
