package com.withings.wiscale2.device.common.feature;

import android.os.Bundle;
import com.samsung.android.sdk.healthdata.HealthConstants;
/* compiled from: FeatureActivationDocumentFragmentArgs.kt */
/* loaded from: classes5.dex */
public final class h implements r8.f {

    /* renamed from: a  reason: collision with root package name */
    private final int f52170a;

    /* renamed from: b  reason: collision with root package name */
    private final int f52171b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52172c;

    public h(int i11, int i12, int i13) {
        this.f52170a = i11;
        this.f52171b = i12;
        this.f52172c = i13;
    }

    public static final h fromBundle(Bundle bundle) {
        kotlin.jvm.internal.u.j(bundle, "bundle");
        bundle.setClassLoader(h.class.getClassLoader());
        if (bundle.containsKey("title")) {
            int i11 = bundle.getInt("title");
            if (bundle.containsKey(HealthConstants.FoodInfo.DESCRIPTION)) {
                int i12 = bundle.getInt(HealthConstants.FoodInfo.DESCRIPTION);
                if (bundle.containsKey("url")) {
                    return new h(i11, i12, bundle.getInt("url"));
                }
                throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Required argument \"description\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
    }

    public final int a() {
        return this.f52171b;
    }

    public final int b() {
        return this.f52170a;
    }

    public final int c() {
        return this.f52172c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f52170a == hVar.f52170a && this.f52171b == hVar.f52171b && this.f52172c == hVar.f52172c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52172c) + androidx.appcompat.app.h.a(this.f52171b, Integer.hashCode(this.f52170a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureActivationDocumentFragmentArgs(title=");
        sb2.append(this.f52170a);
        sb2.append(", description=");
        sb2.append(this.f52171b);
        sb2.append(", url=");
        return androidx.camera.camera2.internal.e.c(sb2, this.f52172c, ")");
    }
}
