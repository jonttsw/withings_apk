package com.withings.wiscale2.vascularage;

import androidx.camera.core.y1;
import com.withings.graph.GraphPeriod;
import com.withings.user.core.models.User;
import java.util.List;
import org.joda.time.Interval;
/* compiled from: VascularAgeActivity.kt */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Interval f62260a;

    /* renamed from: b  reason: collision with root package name */
    private final at.a f62261b;

    /* renamed from: c  reason: collision with root package name */
    private final List<GraphPeriod> f62262c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f62263d;

    /* renamed from: e  reason: collision with root package name */
    private final User.Names f62264e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f62265f;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Interval interval, at.a viewPort, List<? extends GraphPeriod> availablePeriod, boolean z5, User.Names userName, boolean z11) {
        kotlin.jvm.internal.u.j(viewPort, "viewPort");
        kotlin.jvm.internal.u.j(availablePeriod, "availablePeriod");
        kotlin.jvm.internal.u.j(userName, "userName");
        this.f62260a = interval;
        this.f62261b = viewPort;
        this.f62262c = availablePeriod;
        this.f62263d = z5;
        this.f62264e = userName;
        this.f62265f = z11;
    }

    public final List<GraphPeriod> a() {
        return this.f62262c;
    }

    public final boolean b() {
        return this.f62263d;
    }

    public final User.Names c() {
        return this.f62264e;
    }

    public final at.a d() {
        return this.f62261b;
    }

    public final Interval e() {
        return this.f62260a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.u.e(this.f62260a, dVar.f62260a) && kotlin.jvm.internal.u.e(this.f62261b, dVar.f62261b) && kotlin.jvm.internal.u.e(this.f62262c, dVar.f62262c) && this.f62263d == dVar.f62263d && kotlin.jvm.internal.u.e(this.f62264e, dVar.f62264e) && this.f62265f == dVar.f62265f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f62265f;
    }

    public final int hashCode() {
        int hashCode = this.f62261b.hashCode();
        int a11 = y1.a(this.f62263d, defpackage.e.b(this.f62262c, (hashCode + (this.f62260a.hashCode() * 31)) * 31, 31), 31);
        return Boolean.hashCode(this.f62265f) + ((this.f62264e.hashCode() + a11) * 31);
    }

    public final String toString() {
        return "GraphConfiguration(viewPortInterval=" + this.f62260a + ", viewPort=" + this.f62261b + ", availablePeriod=" + this.f62262c + ", normalityZonesEnabled=" + this.f62263d + ", userName=" + this.f62264e + ", isMinimumEfficientUserAgeReached=" + this.f62265f + ")";
    }
}
