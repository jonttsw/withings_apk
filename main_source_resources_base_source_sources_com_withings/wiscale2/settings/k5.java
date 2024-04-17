package com.withings.wiscale2.settings;
/* compiled from: DebugDeeplinkActivity.kt */
/* loaded from: classes5.dex */
public final class k5 extends b0 {

    /* renamed from: b  reason: collision with root package name */
    private final String f60108b;

    public k5(String str) {
        super(str);
        this.f60108b = str;
    }

    @Override // com.withings.wiscale2.settings.b0
    public final String a() {
        return this.f60108b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k5) && kotlin.jvm.internal.u.e(this.f60108b, ((k5) obj).f60108b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f60108b.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.y1.e(new StringBuilder("SimpleDeeplink(deeplink="), this.f60108b, ")");
    }
}
