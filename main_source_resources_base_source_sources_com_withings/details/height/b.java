package com.withings.details.height;

import com.withings.graph.axis.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f36577a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f36578b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f36577a = i11;
        this.f36578b = obj;
    }

    @Override // com.withings.graph.axis.a.b
    public final String c(float f11, float f12) {
        int i11 = this.f36577a;
        Object obj = this.f36578b;
        switch (i11) {
            case 0:
                return d.u((d) obj, f11);
            default:
                return com.withings.weight.presentation.ui.u.d((com.withings.weight.presentation.ui.u) obj, f11, f12);
        }
    }
}
