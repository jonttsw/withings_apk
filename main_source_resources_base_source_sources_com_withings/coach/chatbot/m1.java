package com.withings.coach.chatbot;

import androidx.camera.core.y1;
import com.withings.insight.android.entity.Suggestion;
/* compiled from: MultipleChoiceSuggestionsAdapter.kt */
/* loaded from: classes3.dex */
public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    private final Suggestion f33031a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33032b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f33033c;

    public m1(Suggestion suggestion, boolean z5) {
        kotlin.jvm.internal.u.j(suggestion, "suggestion");
        this.f33031a = suggestion;
        this.f33032b = false;
        this.f33033c = z5;
    }

    public final boolean a() {
        return this.f33032b;
    }

    public final boolean b() {
        return this.f33033c;
    }

    public final Suggestion c() {
        return this.f33031a;
    }

    public final void d(boolean z5) {
        this.f33032b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (kotlin.jvm.internal.u.e(this.f33031a, m1Var.f33031a) && this.f33032b == m1Var.f33032b && this.f33033c == m1Var.f33033c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33033c) + y1.a(this.f33032b, this.f33031a.hashCode() * 31, 31);
    }

    public final String toString() {
        boolean z5 = this.f33032b;
        StringBuilder sb2 = new StringBuilder("SuggestionItemData(suggestion=");
        sb2.append(this.f33031a);
        sb2.append(", checked=");
        sb2.append(z5);
        sb2.append(", shouldDisableRefresh=");
        return androidx.appcompat.app.h.d(sb2, this.f33033c, ")");
    }
}
