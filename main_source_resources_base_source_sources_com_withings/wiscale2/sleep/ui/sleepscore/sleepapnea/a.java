package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;
/* compiled from: SleepDisorderGraphFactory.kt */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f61274a;

    /* renamed from: b  reason: collision with root package name */
    private final c50.c f61275b;

    /* renamed from: c  reason: collision with root package name */
    private final c50.c f61276c;

    /* renamed from: d  reason: collision with root package name */
    private final c50.c f61277d;

    public a(boolean z5, c50.c cVar, c50.c cVar2, c50.c cVar3) {
        this.f61274a = z5;
        this.f61275b = cVar;
        this.f61276c = cVar2;
        this.f61277d = cVar3;
    }

    public final c50.c a() {
        return this.f61277d;
    }

    public final c50.c b() {
        return this.f61275b;
    }

    public final c50.c c() {
        return this.f61276c;
    }

    public final boolean d() {
        return this.f61274a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f61274a == aVar.f61274a && kotlin.jvm.internal.u.e(this.f61275b, aVar.f61275b) && kotlin.jvm.internal.u.e(this.f61276c, aVar.f61276c) && kotlin.jvm.internal.u.e(this.f61277d, aVar.f61277d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f61275b.hashCode();
        int hashCode2 = this.f61276c.hashCode();
        return this.f61277d.hashCode() + ((hashCode2 + ((hashCode + (Boolean.hashCode(this.f61274a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GraphStatus(isSleepApnea=" + this.f61274a + ", low=" + this.f61275b + ", moderate=" + this.f61276c + ", high=" + this.f61277d + ")";
    }
}
