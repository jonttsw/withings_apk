package com.withings.wiscale2.device.common.feature.spo2;

import android.os.Bundle;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.wiscale2.C1987R;
/* compiled from: SpO2IntroFragmentDirections.kt */
/* loaded from: classes5.dex */
final class d implements r8.l {

    /* renamed from: a  reason: collision with root package name */
    private final int f52524a = C1987R.string.please_review_these_instructions;

    /* renamed from: b  reason: collision with root package name */
    private final int f52525b = C1987R.string.tap_see_more;

    /* renamed from: c  reason: collision with root package name */
    private final int f52526c;

    public d(int i11) {
        this.f52526c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f52524a == dVar.f52524a && this.f52525b == dVar.f52525b && this.f52526c == dVar.f52526c) {
            return true;
        }
        return false;
    }

    @Override // r8.l
    public final int getActionId() {
        return C1987R.id.action_intro_to_document;
    }

    @Override // r8.l
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("title", this.f52524a);
        bundle.putInt(HealthConstants.FoodInfo.DESCRIPTION, this.f52525b);
        bundle.putInt("url", this.f52526c);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52526c) + androidx.appcompat.app.h.a(this.f52525b, Integer.hashCode(this.f52524a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionIntroToDocument(title=");
        sb2.append(this.f52524a);
        sb2.append(", description=");
        sb2.append(this.f52525b);
        sb2.append(", url=");
        return androidx.camera.camera2.internal.e.c(sb2, this.f52526c, ")");
    }
}
