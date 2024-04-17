package com.withings.weight.ui.limbExplore;

import com.withings.weight.core.model.LimbModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SegmentalLimbExploreGraphModel.kt */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f47694a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f47695b;

    /* renamed from: c  reason: collision with root package name */
    private final LimbModel f47696c;

    public m(ArrayList arrayList, ArrayList arrayList2, LimbModel limbModel) {
        this.f47694a = arrayList;
        this.f47695b = arrayList2;
        this.f47696c = limbModel;
    }

    public final List<c> a() {
        return this.f47694a;
    }

    public final LimbModel b() {
        return this.f47696c;
    }

    public final List<c> c() {
        return this.f47695b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (kotlin.jvm.internal.u.e(this.f47694a, mVar.f47694a) && kotlin.jvm.internal.u.e(this.f47695b, mVar.f47695b) && this.f47696c == mVar.f47696c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47696c.hashCode() + defpackage.e.b(this.f47695b, this.f47694a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SegmentalLimbExploreGraphModel(fatMassModels=" + this.f47694a + ", muscleMassModels=" + this.f47695b + ", limb=" + this.f47696c + ")";
    }
}
