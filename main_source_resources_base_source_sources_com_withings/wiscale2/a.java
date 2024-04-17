package com.withings.wiscale2;

import android.os.Bundle;
import com.samsung.android.sdk.healthdata.HealthConstants;
/* compiled from: AfibFeatureNavGraphDirections.kt */
/* loaded from: classes4.dex */
final class a implements r8.l {

    /* renamed from: a  reason: collision with root package name */
    private final int f47988a = C1987R.string.please_review_these_instructions;

    /* renamed from: b  reason: collision with root package name */
    private final int f47989b = C1987R.string.tap_see_more;

    /* renamed from: c  reason: collision with root package name */
    private final int f47990c;

    public a(int i11) {
        this.f47990c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f47988a == aVar.f47988a && this.f47989b == aVar.f47989b && this.f47990c == aVar.f47990c) {
            return true;
        }
        return false;
    }

    @Override // r8.l
    public final int getActionId() {
        return C1987R.id.action_to_document;
    }

    @Override // r8.l
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("title", this.f47988a);
        bundle.putInt(HealthConstants.FoodInfo.DESCRIPTION, this.f47989b);
        bundle.putInt("url", this.f47990c);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47990c) + androidx.appcompat.app.h.a(this.f47989b, Integer.hashCode(this.f47988a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionToDocument(title=");
        sb2.append(this.f47988a);
        sb2.append(", description=");
        sb2.append(this.f47989b);
        sb2.append(", url=");
        return androidx.camera.camera2.internal.e.c(sb2, this.f47990c, ")");
    }
}
