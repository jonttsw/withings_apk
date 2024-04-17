package com.withings.wiscale2.features;

import dp0.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import k1.r0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: FeatureFlagsActivity.kt */
/* loaded from: classes5.dex */
final class g extends w implements ym0.a<List<? extends xr.a>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FeatureFlagsActivity f56113a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0<String> f56114b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FeatureFlagsActivity featureFlagsActivity, r0<String> r0Var) {
        super(0);
        this.f56113a = featureFlagsActivity;
        this.f56114b = r0Var;
    }

    @Override // ym0.a
    public final List<? extends xr.a> invoke() {
        r0<String> r0Var = this.f56114b;
        int length = r0Var.getValue().length();
        FeatureFlagsActivity featureFlagsActivity = this.f56113a;
        if (length > 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : FeatureFlagsActivity.A3(featureFlagsActivity)) {
                xr.a aVar = (xr.a) obj;
                String title = aVar.getTitle();
                Locale locale = Locale.ROOT;
                String lowerCase = title.toLowerCase(locale);
                u.i(lowerCase, "toLowerCase(...)");
                String lowerCase2 = r0Var.getValue().toLowerCase(locale);
                u.i(lowerCase2, "toLowerCase(...)");
                if (!j.r(lowerCase, lowerCase2, false)) {
                    String lowerCase3 = aVar.b().toLowerCase(locale);
                    u.i(lowerCase3, "toLowerCase(...)");
                    String lowerCase4 = r0Var.getValue().toLowerCase(locale);
                    u.i(lowerCase4, "toLowerCase(...)");
                    if (j.r(lowerCase3, lowerCase4, false)) {
                    }
                }
                arrayList.add(obj);
            }
            return arrayList;
        }
        return FeatureFlagsActivity.A3(featureFlagsActivity);
    }
}
