package com.withings.weight.ui;

import com.withings.weight.android.model.BodyCompositionBundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentalBodyCompositionViewModel.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final ky.d f47610a;

    /* renamed from: b  reason: collision with root package name */
    private final BodyCompositionBundle f47611b;

    /* renamed from: c  reason: collision with root package name */
    private final v90.b f47612c;

    public a(ky.d dVar, BodyCompositionBundle bodyCompositionBundle, v90.b bVar) {
        this.f47610a = dVar;
        this.f47611b = bodyCompositionBundle;
        this.f47612c = bVar;
    }

    public final BodyCompositionBundle a() {
        return this.f47611b;
    }

    public final v90.b b() {
        return this.f47612c;
    }

    public final ky.d c() {
        return this.f47610a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.u.e(this.f47610a, aVar.f47610a) && kotlin.jvm.internal.u.e(this.f47611b, aVar.f47611b) && kotlin.jvm.internal.u.e(this.f47612c, aVar.f47612c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f47611b.hashCode();
        return this.f47612c.hashCode() + ((hashCode + (this.f47610a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BodyComposition(measuresGroup=" + this.f47610a + ", bodyComposition=" + this.f47611b + ", bodyCompositionDescriptionBundle=" + this.f47612c + ")";
    }
}
