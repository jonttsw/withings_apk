package com.withings.wiscale2.settings;
/* compiled from: WithingsAdvertisingViewModel.kt */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f60006a;

    /* renamed from: b  reason: collision with root package name */
    private final String f60007b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f60008c;

    public g() {
        this(0);
    }

    public static g a(g gVar, boolean z5, String str, Boolean bool, int i11) {
        if ((i11 & 1) != 0) {
            z5 = gVar.f60006a;
        }
        if ((i11 & 2) != 0) {
            str = gVar.f60007b;
        }
        if ((i11 & 4) != 0) {
            bool = gVar.f60008c;
        }
        gVar.getClass();
        return new g(z5, str, bool);
    }

    public final boolean b() {
        return this.f60006a;
    }

    public final Boolean c() {
        return this.f60008c;
    }

    public final String d() {
        return this.f60007b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f60006a == gVar.f60006a && kotlin.jvm.internal.u.e(this.f60007b, gVar.f60007b) && kotlin.jvm.internal.u.e(this.f60008c, gVar.f60008c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.f60006a) * 31;
        int i11 = 0;
        String str = this.f60007b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        Boolean bool = this.f60008c;
        if (bool != null) {
            i11 = bool.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "AdvertisingState(loading=" + this.f60006a + ", userEmail=" + this.f60007b + ", personalizedAdvertising=" + this.f60008c + ")";
    }

    public /* synthetic */ g(int i11) {
        this(false, null, null);
    }

    public g(boolean z5, String str, Boolean bool) {
        this.f60006a = z5;
        this.f60007b = str;
        this.f60008c = bool;
    }
}
